package test;

import mvc.Controller;
import mvc.Model;
import mvc.View;
import org.junit.Test;


/**
 * Created by potaychuk on 16.06.2016.
 */
public class ModelTest {
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model,view);

    @Test
    public void disambleTextTestNonexistentText() throws Exception {
        model.disambleText(controller.initText(""));

    }

    @Test
    public void sortedVowelsWords() throws Exception {

    }

    @Test
    public void removeDoubleSpace() throws Exception {

    }

}