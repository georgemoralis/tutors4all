/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials.readpdf;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.IOException;

public class readpdf {

    public static void main(String[] args) {

        try {

            PdfReader reader = new PdfReader("test.pdf");
            System.out.println("This PDF has " + reader.getNumberOfPages() + " pages.");
            System.out.println("Is this document tampered: " + reader.isTampered());
            System.out.println("Is this document encrypted: " + reader.isEncrypted());
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                String page = PdfTextExtractor.getTextFromPage(reader, i);
                System.out.println("Page Content:\n\n" + page + "\n\n");
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
