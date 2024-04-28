package Assignment7.flyweight;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DocServer {
    private String filename;
    private XWPFDocument document;
    private XWPFParagraph paragraph;

    public DocServer(String filename) {
        try {
            this.filename=filename;
            FileInputStream fis = new FileInputStream(filename);
            document = new XWPFDocument(fis);
            paragraph = document.getLastParagraph();
            System.out.println("Appending a existing document");


        }
        catch (FileNotFoundException e) {
            System.out.println("Making a new document");
            document = new XWPFDocument();
            paragraph = document.createParagraph();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addText(Character character,CharacterProperties c){
        XWPFRun run = paragraph.createRun();
        run.setText(String.valueOf(character));
        run.setFontSize(c.getSize());
        run.setFontFamily(c.getFont());
        run.setColor(c.getColor());
    }
    public String getDocument(){
        return document.getLastParagraph().getText();
    }

    public void saveDocument(){
        // Write the document to a file
        FileOutputStream out;
        try {
            out = new FileOutputStream(String.format("src/main/java/Assignment7/flyweight/%s.docx",filename));
            document.write(out);
            out.close();
            System.out.println("Document created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating document: " + e.getMessage());
        }
    }
}
