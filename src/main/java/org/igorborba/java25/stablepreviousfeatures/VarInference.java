package org.igorborba.java25.stablepreviousfeatures;

// todo: VAR: infers the datatype in compilation time, final datatype AND hasn't for instance .length for String.
public class VarInference {
    public static void main(String[] args){
        var inferedPrimitiveDataType = 1;
        System.out.println(inferedPrimitiveDataType); // hasn't .getClass to know the data type

        var inferedWrapperClass = Integer.valueOf(1);
        System.out.println("Datatype: " + inferedWrapperClass.getClass() + " with value: " + inferedWrapperClass);
    }
}
