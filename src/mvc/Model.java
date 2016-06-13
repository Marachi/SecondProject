package mvc;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import textElements.LectText;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by potaychuk on 13.06.2016.
 */
public class Model {

    LectText lectText = new LectText();


    XWPFDocument createDoc(File file){
        try {
            return new XWPFDocument(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    List<XWPFParagraph> makeParagraphsList(XWPFDocument xwpfDocument){
        return xwpfDocument.getParagraphs();
    }


    public void dissambleParagraph(XWPFParagraph paragraph) {
//        lectText.getParagraphs().get(1).getSentenses().get(1).getWords().get(1).setSymbolses();

        StringBuilder sb = new StringBuilder(paragraph.getText());

        String regex = "[A-Z]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(sb);
        while (m.find()) {
            System.out.println(m.group());
            System.out.println("--------");
        }

    }



}
