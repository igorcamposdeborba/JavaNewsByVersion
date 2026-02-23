package org.igorborba.java17;

public class MessageNullPointerException {
    public static void main(String[] args) {
        Costumer costumer1 = null;
        System.out.println(costumer1.getId()); // todo: exception shows the method of the error. Example: NullPointerException: Cannot invoke Costumer.getId() because is null

    }
}

class Costumer {
    private String id;
    private String name;

    public Costumer(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return id;
    }
}