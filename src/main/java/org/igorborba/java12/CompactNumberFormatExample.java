package org.igorborba.java12;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatExample {
    public static void main(String[] args) {

        // todo: NumberFormat formats for the language writing it out in full. 5000 -> 50 mil
        NumberFormat numberFormat = CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.LONG);

        System.out.println(numberFormat.format(5000)); // prints 5 mil (in portuguese)


    }
}
