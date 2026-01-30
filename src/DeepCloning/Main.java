package DeepCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Hyderabad");
        Person person1 = new Person("John", address);
        Person person2 = (Person) person1.clone();

        person2.address.city = "Bangalore"; // Does NOT affect person1's address
        System.out.println("Original Object: "+person1.address.city); // Output: Hyderabad

        System.out.println("Cloned Object: "+person2.address.city);

        System.out.println("Checking ref: "+ (person1 ==person2));
    }
}
