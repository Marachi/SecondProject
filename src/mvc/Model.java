package mvc;

import comosite.CompositeElement;
import comosite.Element;
import comosite.FlyWeightFactory;
import comosite.LectureElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class Model {


    public CompositeElement sentences = new CompositeElement();
    public CompositeElement words = new CompositeElement();
    public CompositeElement symbols = new CompositeElement();
    FlyWeightFactory<LectureElement> factory = new FlyWeightFactory<>();

    void disambleForSentences(String text){
        System.out.println("START DISAMBLED SENTENSES");
        Matcher matcher = Pattern.compile(View.SENTENCE_PARSE).matcher(text);
        while (matcher.find()){
            String sentence = matcher.group();
            sentences.add(factory.create(sentence));
            disambleForWords(sentence);
        }
    }
    void disambleForWords(String text){
        Matcher matcher = Pattern.compile(View.WORD_PARSE).matcher(text);
        while (matcher.find()){
            String word = matcher.group();
            words.add(factory.create(word));
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
