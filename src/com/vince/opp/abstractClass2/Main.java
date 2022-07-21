package com.vince.opp.abstractClass2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/output.txt";
        new NumberExtractReport().preparedAndSendReport(path);
        new EmailExtractReport().preparedAndSendReport(path);

//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//            writer.write("This is great");
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
