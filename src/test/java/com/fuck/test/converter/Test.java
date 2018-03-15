package com.fuck.test.converter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.StreamOpenOfficeDocumentConverter;

import java.io.File;
import java.io.IOException;

/**
 * DESCRIPTION:
 *
 * @author zouyan
 * @create 2018-03-12 上午11:29
 * created by fuck~
 **/
public class Test {

    /*public static void main(String[] args) throws Exception {
        createPdf();
    }*/

    public static  void createPdf() throws IOException {
         File inputFile = new File("/Users/fuck/Desktop/test.doc");
      //  File inputFile = new File("/Users/fuck/Desktop/工1.xlsx");
        // File inputFile = new File("/Users/fuck/Desktop/test.png");
        File outputFile = new File("/Users/fuck/Desktop/test.pdf");

        // connect to an OpenOffice.org instance running on port 8100
        OpenOfficeConnection connection = new SocketOpenOfficeConnection("192.168.7.42", 8100);

        connection.connect();

        // convert
     //   DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
        StreamOpenOfficeDocumentConverter converter = new StreamOpenOfficeDocumentConverter(connection);
        converter.convert(inputFile, outputFile);

        // close the connection
        connection.disconnect();
       // outputFile.delete();
    }
}
