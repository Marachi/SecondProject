package mvc;

import java.util.Collection;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class View {


    public static final String LECT_TXT = "C:\\Users\\Kate\\IdeaProjects\\WordConnect2\\src\\txt\\Lect12.txt";
    public static final String LECT_WRITTEN_TXT = "C:\\Users\\Kate\\IdeaProjects\\WordConnect2\\src\\txt\\1.txt";

    public static final String END_OF_ROW = "END_OF_ROW";
    public static final String VOWELS_SYMBOLS = "[АУОЫИЭЕІауоыиэеіAEIOUaeiou]";
    public static final String SENTENCE = "(((?<=\n)\\d\\. )?[А-Я](([^\\.])+?(([A-Za-z()]*\\.[A-Za-z()]+)|([0-9]+\\.[0-9]*))*)+((\\.|!|\\?)(?!\\S[А-Я])))";
    public static final String HEADERS = "(.?(Лекция(.+))|(Тема(.+))|(Таблица(.+))|((\\d\\.){2,}.+))(?=\n)";
    public static final String AFTER_NODOT_SENTENCE = "(?<=(\\s))([А-Я]([^\\.])+(?=(\n[А-Я])))";
    public static final String WORD_PARSE =  "(([А-Яа-яA-Za-zЏаЁўҐвёэЭєЄ]+)([-][А-Яа-яA-Za-z]+)*)";
    public static final String NO_WORD_PARSE =  "[\\W_0-9]";
    public static final String COMB_WORDS =  WORD_PARSE+"|"+NO_WORD_PARSE;
    public static final String SENTENCE_PARSE =  HEADERS +"|"+SENTENCE +"|"+AFTER_NODOT_SENTENCE;
    /**
     * This method prints collection
     * @param collection is collection  witch will be printed
     */
    void printCollection(Collection collection){
        for (Object le: collection){
            System.out.println(le);
        }
    }
}
