package mvc;

import components.CompositeElement;
import components.Element;
import components.FlyWeightFactory;
import components.LectureElement;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class Model {

    /**
     * It's composite of text's sentences
     */
    private CompositeElement sentences;

    /**
     * It's composite of sentence's words
     */
    private CompositeElement words;

    /**
     * It's fly-weight sentanceFactory which prevents LectureElement object's duplication
     */
    private FlyWeightFactory<LectureElement> sentanceFactory;

    /**
     * It's fly-weight wordFactory which prevents LectureElement object's duplication
     */
    private FlyWeightFactory<LectureElement> wordFactory;

    /**
     * Default constructor
     */
    public Model(){
        sentences = new CompositeElement();
        words = new CompositeElement();
        sentanceFactory= new FlyWeightFactory<>();
        wordFactory = new FlyWeightFactory<>();
    }

    /**
     * This method parses text for sentences and sentences for words
     * @param text is text which will be parsed
     */
    public void disambleText(String text){
        Matcher matcher = Pattern.compile(View.SENTENCE_PARSE).matcher(text);
        while (matcher.find()){
            String sentence = matcher.group();
            sentences.add(sentanceFactory.create(sentence));
            disambleForWords(sentence);
        }
    }

    /**
     * This method returns sorted by vowel containing list of words of text
     * @return sorted list
     */
    public List<Element> sortedVowelsWords(){
        List<Element> list = new ArrayList<>();
        for (LectureElement el: wordFactory.getMap().values()){
                   list.add((Element)el );
        }
        Collections.sort(list);
        return list;
    }



    /**
     * This method replace consequences of spaces and tabulation with a single space
     * @param text is text to be modified
     * @return modified text
     */
    public String removeDoubleSpace(String text){
        text= text.replaceAll("\\n", View.END_OF_ROW).  //mark \n
                replaceAll("(\\s+)|\\t", " ").          //replace double spaces and tabulation with a single space
                replaceAll(View.END_OF_ROW, "\n").      //return \n
                replaceAll("\\n\\s", "\n").             //remove necessary spaces at start of rows
                replaceAll("\\n+", "\n");               //remove necessary \n at start of rows
        return text;
    }

    /**
     * This method parses text for words
     * @param text is text which will be parsed
     */
    private void disambleForWords(String text){
        Matcher matcher = Pattern.compile(View.WORD_PARSE).matcher(text);
        while (matcher.find()){
            String word = matcher.group();
            words.add(wordFactory.create(word));
        }
    }

    //getters & setters
    public CompositeElement getSentences() {
        return sentences;
    }

    public void setSentences(CompositeElement sentences) {
        this.sentences = sentences;
    }

    public CompositeElement getWords() {
        return words;
    }

    public void setWords(CompositeElement words) {
        this.words = words;
    }

    public FlyWeightFactory<LectureElement> getSentanceFactory() {
        return sentanceFactory;
    }

    public void setSentanceFactory(FlyWeightFactory<LectureElement> sentanceFactory) {
        this.sentanceFactory = sentanceFactory;
    }

    public FlyWeightFactory<LectureElement> getWordFactory() {
        return wordFactory;
    }

    public void setWordFactory(FlyWeightFactory<LectureElement> wordFactory) {
        this.wordFactory = wordFactory;
    }
}
