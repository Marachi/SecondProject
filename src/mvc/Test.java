package mvc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by potaychuk on 14.06.2016.
 */
public class Test {

    public static final String LECT_12 = "Lect12.docx";
    public static final Pattern REGEX_SPACE_PATTERN = Pattern.compile("\\s");
    public static final Pattern REGEX_START_SENTENCE = Pattern.compile("[A-zА-я]+(.+)?\\.\\s");
    public static final Pattern REGEX_SENTENCE = Pattern.compile("([^(\\.|!|\\?)]+)((\\.|!|\\?)\\s)");
    public static final Pattern DOT_PATTERN = Pattern.compile("(.+)\\.(?=\\s)");
    static  String  testString = "123123123123123123. asdasdasdasd. ";
    public static void main(String[] args) {
        Matcher matcher = DOT_PATTERN.matcher(testString);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }



}
