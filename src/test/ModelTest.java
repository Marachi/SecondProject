package test;
import components.*;
import mvc.Controller;
import mvc.Model;
import mvc.View;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by potaychuk on 16.06.2016.
 */
public class ModelTest {

    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model,view);

    @Test
    public void disambleTextTestNotNull() throws Exception {
        model.disambleText(controller.initText(View.LECT_TXT));
        Assert.assertNotNull(model.getSentences());
        Assert.assertNotNull(model.getWords());
    }

    @Test
    public void disambleTextTestNotEmpty() throws Exception {
        model.disambleText(controller.initText(View.LECT_TXT));
        Assert.assertTrue(model.getSentences().getElements().size()>0 && model.getWords().getElements().size()>0);
    }

    @Test
    public void sortedVowelsWords() throws Exception {
        model.disambleText(controller.initText(View.LECT_TXT));
        List modelList = model.sortedVowelsWords();
        List testList = new ArrayList();
        for (LectureElement le: model.getWordFactory().getMap().values()) {
            testList.add(le);
        }
        Collections.sort(testList);
        Assert.assertTrue(testList.equals(modelList));
    }

    @Test
    public void removeDoubleSpace() throws Exception {
        String testString = "text  \n";
        Assert.assertTrue(model.removeDoubleSpace(testString).equals("text \n"));
    }

    @Test
    public void writeTextTest() throws Exception {
        String text1= "";
        String text2= "";

        String testString = "Test. writeTextTest";
        String path1= "writeTextTest1.txt";
        String path2= "writeTextTest2.txt";

        model.writeText(testString, path1);

        BufferedWriter bw = new BufferedWriter(new FileWriter(path2));
        bw.write(testString);
        bw.close();

        String line1 ="";
        BufferedReader br1 = new BufferedReader(new FileReader(path1));
            while ((line1 =br1.readLine())!=null) {
                text1 = text1+line1;
            }
        br1.close();

        String line2 ="";
        BufferedReader br2 = new BufferedReader(new FileReader(path2));
        while ((line2 =br2.readLine())!=null) {
            text2 = text2+line2;
        }
        br2.close();
        Assert.assertEquals(text1,text2);
    }

}