package mvc;

import java.util.regex.Pattern;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class View {
    public static final String END_OF_ROW = "END_OF_ROW";

    public static final String SENTENCE = "(((?<=\n)\\d\\. )?[А-Я](([^\\.])+(([A-Za-z()]*\\.[A-Za-z()]+)|([0-9]+\\.[0-9]*))*)+(([^\\.])+(([A-Za-z()]+\\.[A-Za-z()]+)|([0-9]+\\.[0-9]+))*)(([^\\.])+(([A-Za-z()]+\\.[A-Za-z()]+)|([0-9]+\\.[0-9]+))*)((\\.|!|\\?)(?!\\S[А-Я])))";
    public static final String HEADERS = "(.?(Лекция(.+))|(Тема(.+))|(Таблица(.+))|((\\d\\.){2,}.+))(?=\n)";
    public static final String AFTER_NODOT_SENTENCE = "(?<=(\\s))([А-Я]([^\\.])+(?=(\n[А-Я])))";
    public static final String SENTENCE_PARSE =  SENTENCE +"|"+HEADERS +"|"+AFTER_NODOT_SENTENCE;



}
