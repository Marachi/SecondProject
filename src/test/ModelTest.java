package test;
import components.*;
import mvc.Controller;
import mvc.Model;
import mvc.View;
import org.junit.Assert;
import org.junit.Test;

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

}