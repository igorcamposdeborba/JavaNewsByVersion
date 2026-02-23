package org.igorborba.java25.stablepreviousfeatures;

// todo: RECORD: create automatically get, set, constructor, equals, hashcode, toString. It's an immutable class
record ResultValue(double amount, String currency) {
}
/* Record keep data (is a data carrier), not model object (it is not instantiated/object).
Because of this, it's a value object in DDD. It's immutable, the value matters not the instantiation, keep simple values without complex behavior.
todo: Use Record to simple objects, immutable (value objects in DDD). Example: record Email(String value), Amount(BigDecimal amount, String currency), TaxId

Restrictions:
- can't extends, or be abstract, or implements interface, or have instance variables, because it haven't identity (it not build an object, but a data).
- all attributes are private and final
- we can implements interface
- we can have static methods or normal methods
 */

public class Record {
    public static void main(String[] args) {
        ResultValue totalAmount = new ResultValue(1000, "BLR");
//        totalAmount.setAmount(2000); // haven't setter because it is immutable

        System.out.println(totalAmount.amount()); // get amount is created automatically by RECORD
    }
}
