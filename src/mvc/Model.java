package mvc;

import comosite.CompositeElement;
import comosite.Element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class Model {


    public CompositeElement sentences = new CompositeElement();

    void disambleForSentences(String text){
        System.out.println("START DISAMBLED");
        Matcher matcher = Pattern.compile(View.SENTENCE_PARSE).matcher(text);
        while (matcher.find()){
            sentences.add(new Element(matcher.group()));
        }
    }





    void disambledTextSentTest(String text){
        System.out.println("START DISAMBLED");
        Matcher matcher = Pattern.compile(View.SENTENCE_PARSE).matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println("=================");
        }
    }
}
