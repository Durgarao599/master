package Immutable;

final class Employee {
    private final String name;
    private final Address address;

    public Employee(String name, Address address) {
        this.name = name;

        //Defensive copying means creating a copy of a mutable object before storing it or returning it,
        // so external code can’t change your internal state.
        this.address = new Address(address); // defensive copy
       //  this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address); // defensive copy
        // return address;
    }


    public static void main(String[] args) {

        Address addr = new Address("Bangalore");
        Employee emp = new Employee("Durga", addr);
        addr.setCity("HYD");

        System.out.println(emp.getAddress().getCity());

    }

}