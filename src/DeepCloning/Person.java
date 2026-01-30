package DeepCloning;

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Deep clonning
        //Person cloned = (Person) super.clone();
        //cloned.address = (Address) address.clone(); // Deep copy of Address
       // return cloned;

        //Sahllow clonning
        return super.clone();
    }
}