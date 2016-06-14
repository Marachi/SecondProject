package mvc;

import java.util.regex.Pattern;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class View {
    public static final String LECT_12 = "Lect12.docx";
    public static final String REGEX_START_HEADER_WITHOUT_END = "(^[^(\\.|!|\\?\\n)]+(?=(\\n)))";
    public static final String REGEX_HEADER_WITHOUT_END = "((?<=(\\n))+[^(\\.|!|\\?\\n)]+(?=(\\n)))";
    public static final String REGEX_NATURAL_SENT = "((?<=(\\n))+[^(\\.|!|\\?\\n)]+(?=(\\n)))";



    public static final Pattern REGEX_SPACE_PATTERN = Pattern.compile("\\s");
    public static final Pattern REGEX_START_SENTENCE = Pattern.compile("([A-zА-я\\d]+(.+)?\\.\\s)|(^(\\w+\\n))");


    public static final Pattern REGEX_ABST = Pattern.compile("(^[^(\\.|!|\\?\\n)]+(?=(\\n)))");
    public static final Pattern REGEX_ABST2 = Pattern.compile("((?<=(\\n))+[^(\\.|!|\\?\\n)]+(?=(\\n)))");
    public static final Pattern REGEX_ABST_UNION = Pattern.compile(REGEX_START_HEADER_WITHOUT_END+"|"+REGEX_HEADER_WITHOUT_END);



    public static final Pattern REGEX_PAR = Pattern.compile("([^(\\.|!|\\?)]+)((\\.|!|\\?)\\s)");
    public static final Pattern DOT_PATTERN = Pattern.compile("(.+)\\.(?=\\s)");

}
