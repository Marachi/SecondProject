package mvc;


import java.io.*;
import java.util.List;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() throws IOException {
        String text = initialization("Lect12.txt");
    }

     String initialization(String path){

         String text = "";
         try {
             FileInputStream fis = new FileInputStream(path);
             byte[] str = new byte[fis.available()];
             fis.read(str);
             text = new String(str);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         return text.replaceAll("(\\t+)|(\\s+)", " ");
     }

}
