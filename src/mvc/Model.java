package mvc;

import textElements.LectText;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class Model {

    LectText lectText = new LectText();



    void disambledText(String text){

//        Matcher matcher = View.REGEX_SENTENCE.matcher(text);
        Matcher matcher = View.REGEX_START_SENTENCE.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
