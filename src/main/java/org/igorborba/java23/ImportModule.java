package org.igorborba.java23;


import module java.base; // todo: Import all modules for the package (java.uti, java.lang, etc)
import java.sql.Date;

public class ImportModule {
    public static void main(String[] args){

        Long now = Instant.now().toEpochMilli();

        Date currentJavaDate = new Date(now); // todo: imported from module

        java.sql.Date currentSqlDate = new java.sql.Date(now); // defined the path to remove ambiguous

        System.out.println(currentJavaDate);
        System.out.println(currentSqlDate);
    }
}
