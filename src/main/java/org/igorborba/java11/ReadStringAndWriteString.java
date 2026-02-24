package org.igorborba.java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadStringAndWriteString {
    public static void main(String[] args) {

        // todo: WRITE and READ string files
        try {
            String path = "src/main/resources/temporary/text-write-string.txt";
            String text = "Igor Campos de Borba. Text created by class Files.writeString() and read by Files.readString()";
            Files.writeString(new File(path).toPath(), text); //todo: create a file (.txt, .json...) through File.writeString

            String result = Files.readString(new File(path).toPath()); // todo: read a file (.txt, .json...) through File.readString
            System.out.println(result);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
