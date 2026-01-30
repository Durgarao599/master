package Immutable;

import java.util.Date;

/**
 * Steps for making a class immutable:
 * 1. Declare the class as final
 * 2. Make all its fields final
 * 3. For all mutable fields, class should make a defensive copy and only return the copy to the calling code
 * 4. Do not provide any setter methods.
 */
public final class ImmutableClass {

    /**
     * Integer and String classes are immutable whereas Date class is mutable
     */
    private final Integer immutableInteger;
    private final String immutableString;
    private final Date dob;

    public ImmutableClass(Integer i, String s, Date d) {
        this.immutableInteger = i;
        this.immutableString = s;
        this.dob = new Date(d.getTime());
    }

    public static void main(String[] args) {

        Date date = new Date();
        ImmutableClass ex = new ImmutableClass(34, "Durgarao", date);
        //date.setYear(5000);
        System.out.println(date);

    }


    public String getImmutableString() {
        return immutableString;
    }

    public Integer getImmutableInteger() {
        return immutableInteger;
    }

    public Date getDOB() {
       // return mutableDate;
        return new Date(this.dob.getYear());
    }

    @Override
    public String toString() {
        return immutableInteger + ", " + immutableString + ", " + dob;
    }
}