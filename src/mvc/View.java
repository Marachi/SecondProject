package mvc;

import java.util.regex.Pattern;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class View {
    public static final String LECT_12 = "Lect12.docx";
    public static final String REGEX_START_HEADER_WITHOUT_END = "(^[^(\\.|!|\\?\\n)]+(?=(\\n)))";
    public static final String END_OF_ROW = "END_OF_ROW";
    public static final String REGEX_HEADER_WITHOUT_END = "((?<=(\\n))+[^(\\.|!|\\?\\n)]+(?=(\\n)))";
    public static final String REGEX_THEME_NAME = "( (Тема)(\\s)?[\\d\\.]+)";
    public static final String REGEX_TO_END = "( ?<=((\\n)|\\.\\s)([А-Я])[^(\\.|!|\\?\\n)]+?=(\\n))";

    public static final String SYMBOL_KYRULIC = "[A-Яа-я]";



    public static final String ROW = "(?<=\n).*(?=\n)";
    public static final String SIMPLE_SENTANCE = "([А-Я]([^\\.])+((\\.)(?!\\S)))";
    public static final String HEADER = "(.?(Лекция(.+))|(Тема(.+))|((\\d\\.){2,}.+))(?=\n)";
    public static final String STEPS = "((?<=\n)\\d\\. [А-Я]([^\\.])+((\\.)(?!\\S)))";
    public static final String NODOT = "([А-Я]([^\\.])+(?=(\n[А-Я])))";
    public static final String AFTER_NODOT_SENTENCE = "(?<=(\\s))([А-Я]([^\\.])+(?=(\n[А-Я])))";
    public static final String CODE_SENTENCE = "([А-Я]([^\\.])*([A-Za-z]+\\.[A-Za-z]+)([^\\.])*((\\.)(?!\\S)))";

    public static final String SENTANCE2 = CODE_SENTENCE;
    public static final String SENTANCE = SIMPLE_SENTANCE+"|"+HEADER+"|"+NODOT+"|"+AFTER_NODOT_SENTENCE+"|"+CODE_SENTENCE;
///[А-Я](.)+(\.|!|\?)
//(\n) )([А-Я]([^(\.|!|\?)]+)((\.|!|\?)\s) ) )";


    public static final Pattern REGEX_SPACE_PATTERN = Pattern.compile("\\s");
    public static final Pattern REGEX_START_SENTENCE = Pattern.compile("([A-zА-я\\d]+(.+)?\\.\\s)|(^(\\w+\\n))");


    public static final Pattern REGEX_ABST = Pattern.compile("(^[^(\\.|!|\\?\\n)]+(?=(\\n)))");
    public static final Pattern REGEX_ABST2 = Pattern.compile("((?<=(\\n))+[^(\\.|!|\\?\\n)]+(?=(\\n)))");
    public static final Pattern REGEX_ABST_UNION =
            Pattern.compile(REGEX_START_HEADER_WITHOUT_END+"|"+REGEX_HEADER_WITHOUT_END+
                            "|" + REGEX_THEME_NAME+"|"+REGEX_TO_END);



    public static final Pattern REGEX_PAR = Pattern.compile("([^(\\.|!|\\?)]+)((\\.|!|\\?)\\s)");
    public static final Pattern DOT_PATTERN = Pattern.compile(HEADER+"|"+ SIMPLE_SENTANCE);

}
