package org.igorborba.java11;

import java.util.stream.Collectors;

public class StringExample {
    public static void main(String[] args) {

        String string1 = "  ";
        System.out.println(string1.isBlank()); // verifies if has empty spaces or ""
        System.out.println(string1.isEmpty()); // verifies if has not content or ""

        String string2 = "Igor\n"+
                "Campos de \n"+
                "Borba";
        System.out.println(string2.lines().collect(Collectors.toList())); // split in a array

        String string3 = "Igor Borba";
        System.out.println(string3.repeat(3)); // repeat string
    }
}
