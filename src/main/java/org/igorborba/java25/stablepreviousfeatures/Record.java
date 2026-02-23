package org.igorborba.java25.stablepreviousfeatures;

// todo: RECORD: create automatically get, set, constructor, equals, hashcode, toString. It's an immutable class
record User(int id, String name) {
}

public class Record {
    public static void main(String[] args) {
        User user1 = new User(1, "Igor Borba");
        System.out.println(user1.id()); // get id is created automatically by RECORD
    }
}
