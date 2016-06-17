package mvc;


import components.LectureElement;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class Controller {

    /**
     * Model
     */
    private Model model;

    /**
     * View
     */
    private View view;

    /**
     * Constructor
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     *
     */
    public void processUser() {

        String text = initText(View.LECT_TXT);                  //write txt in String
        text = model.removeDoubleSpace(text);                   //remove unnecessary space symbols
        model.disambleText(text);                               //parsing

//        model.getWords().printToConsol();

        List listOfSortedWords = model.sortedVowelsWords();     //get a list of sorted words
        view.printCollection(listOfSortedWords);                //view sorted words
//        writeText(text,View.LECT_WRITTEN_TXT);                  //write a text to file
    }

    /**
     * This method create a String with text from .txt file
     * @param path is path to .txt file
     * @return a String variable with text of .txt file
     */
    public String initText(String path){
        StringBuilder text = new StringBuilder();
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line =br.readLine())!=null) {
                text = text.append(line).append('\n');
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  text.toString();
    }

    /**
     * This method write a text to file
     * @param text is text which will be written
     * @param path is path of new file
     */
    public void writeText(String text, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(text);
            bw.flush();
            bw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
