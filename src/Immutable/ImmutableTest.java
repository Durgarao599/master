package Immutable;

final class ImmutableTest {

    private final String fname;

    private final String lname;

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    private ImmutableTest(String fname, String lname) {
        this.fname =fname;
        this.lname= lname;
    }


    public static void main(String[] args) {
        ImmutableTest obj1=  new ImmutableTest("Durga" ,"Angara");
        System.out.println(obj1.getFname() +" "+obj1.getLname());
    }
}
