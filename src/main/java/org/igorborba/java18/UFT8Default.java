package org.igorborba.java18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class UFT8Default {
    public static void main(String[] args){

//        Charset utf8 = StandardCharsets.UTF_8// todo: UTF-8 is default (accepts portugues accents, emojis and ASCII = web uses this format)
//        Charset utf16 = StandardCharsets.UTF_16;// old format (use more bytes compared to the UTF-8. Have not support for ASCII table

        try(FileWriter fw = new FileWriter("src/main/resources/temporary/hello_guys.txt"); // todo: I don't need to pass utf-8 as parameter, because it's default in Java 18
            FileReader fr = new FileReader("src/main/resources/temporary/hello_guys.txt")) { // FileReader fr = new FileReader("src/main/resources/temporary/hello_guys.txt", utf-16)

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("伊戈爾·坎波斯·德·博爾巴");
            bw.flush();
            bw.close();

            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            br.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
