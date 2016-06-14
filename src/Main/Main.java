package Main;


import mvc.Controller;
import mvc.Model;
import mvc.View;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
