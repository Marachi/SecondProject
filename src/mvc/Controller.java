package mvc;


import java.io.*;

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

        String text = initText(View.LECT_TXT);    //write txt in String
        text = model.removeDoubleSpace(text);     //remove unnecessary space symbols
        model.disambleText(text);                 //parsing

        view.printCollection(model.sortedVowelsWords()); //view sorted words
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  text.toString();
    }


    void writeText(String path, String text){
        try {
            FileWriter fos = new FileWriter(path);
            fos.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
