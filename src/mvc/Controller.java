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

    public void processUser() {
      String text = initialization2("Lect12.txt");
      System.out.println(text);
        model.disambledText(text);
    }


    /**
     * This method create a String with text
     * @param path is path to .txt file
     * @return a String variable with text of .txt file
     */
     String initialization(String path){
         String text = "";
         try {
             FileInputStream fis = new FileInputStream(path);
             BufferedInputStream bis = new BufferedInputStream(fis);
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

    String initialization2(String path){
        StringBuilder text = new StringBuilder();
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line =br.readLine())!=null) {
                text = text.append(line + '\n');
//                System.out.println(line);
//                System.out.println("=================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  new String(text);
    }
    void writeText(String path, String text){
        try {
            FileWriter fos = new FileWriter(path);
            fos.write(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
