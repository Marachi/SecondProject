package components;

import mvc.View;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Potaychuk Sviatoslav on 13.06.2016.
 */
public class FlyWeightFactory<E> {

    /**
     * It's a map of the elements
     */
    private Map<String, Element> map = new HashMap<>();

    /**
     * This method create unique elements or returns already existed
     * @param txt is value of element
     * @return element with txt value
     */
    public LectureElement create(String txt, Element.Type type) {
       if(map.containsKey(txt)){
           return  map.get(txt);
       }else {
           Element el = new Element(txt, type);
           map.put(el.getValue(), el);
           return el;
       }
   }


    //getters & setters
    public Map<String, Element> getMap() {
        return map;
    }

    public void setMap(Map<String, Element> map) {
        this.map = map;
    }
}
