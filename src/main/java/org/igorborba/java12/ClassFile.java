package org.igorborba.java12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ClassFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src/main/resources/temporary/hello_guys.txt");
        File file2 = new File("src/main/resources/temporary/text2.txt");

        long result = Files.mismatch(file1.toPath(), file2.toPath()); //todo: Class File compare files (their content by bytes) and return -1 if they are identical or the position of the difference
        System.out.println(result);
    }
}
