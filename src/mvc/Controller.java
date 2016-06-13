package mvc;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.*;
import java.util.List;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() throws IOException {
        XWPFDocument doc = model.createDoc(new File(View.LECT_12));
        List<XWPFParagraph> paragraphs = doc.getParagraphs();
        StringBuilder text = new StringBuilder();
        for(XWPFParagraph s: paragraphs){
            text.append(s.getText()).append(" ");
        }
        System.out.println(text);
//        System.out.println(paragraphs.get(25).getText());
//        model.dissambleParagraph(paragraphs.get(25));
    }


}
