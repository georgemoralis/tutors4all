/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials.encryptpdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class encryptpdf {

    public static void main(String[] args) {
        try {
            PdfReader reader = new PdfReader("test.pdf");
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("encrypted.pdf"));
            stamper.setEncryption(null, null, PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_256 | PdfWriter.DO_NOT_ENCRYPT_METADATA);
            stamper.close();
            reader.close();
        } catch (IOException | DocumentException ex) {
            ex.printStackTrace();
        }
    }
}
