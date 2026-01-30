package String;

public class StrigEx {
    public static void main(String[] args) {
        var abc = 100;
        var str = new String("Durgaa");
        String str1 = new String("Durgaa");
        var str2 = "Durgaa";
        String str3 = "Durgaa";
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());

 int a= abc + 200;
     //   System.out.println("str2 instanceof String:  "  + (abc instanceof int) );

        System.out.println("str2 instanceof String:  "  + (str2 instanceof String) );

        if (str == str1) System.out.println("str == str1 :: Yes");
        else System.out.println("str == str1 :: No");

        if (str2 == str1) System.out.println("str2 == str1 :: Yes");
        else System.out.println("str2 == str1 :: No");

        if (str2 == str3) System.out.println("str2 == str3 :: Yes");
        else System.out.println("str2 == str3 :: No");

        System.out.println("str2 Before Modify :: " +str2.hashCode());

        str2="Jashwin";

        System.out.println("str2 After Modify :: " + str2.hashCode());

    }
}
