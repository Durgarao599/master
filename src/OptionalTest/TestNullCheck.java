package OptionalTest;

import java.util.Objects;
import java.util.Optional;

public class TestNullCheck {


    public static void main(String[] args) {
        Optional<String> optionalObject = Optional.ofNullable(null);

        if (optionalObject.isPresent()) {
            String obj = optionalObject.get();
            // handle non-null case

            System.out.println("NOT NULL");
        } else {

            System.out.println("NULL");
        }


        Optional<String> hello = Optional.ofNullable("Hello ");

        if (hello.isPresent()) {
            String obj = hello.get();
            System.out.println("NOT NULL: " + obj);
        } else {
            System.out.println("NULL");
        }



        Optional<String> emptyCheck = Optional.ofNullable(null);

        if(emptyCheck.isEmpty()){
            System.out.println("empty value for isEmpty");
        }else{
            System.out.println("NOT EMPTY value");
        }



        if(Objects.isNull(null)){
            System.out.println("null value isNull");
        }else{
            System.out.println("Not Null for isNull" );
        }


        if(Objects.nonNull(null)){
            System.out.println("null value isNull");
        }else{
            System.out.println("Not Null for nonNull" );
        }
    }
}
