package modal;

public class Employee {
    private String name;
    private int age;
    private int sal;

    public Employee(String name, int age, int sal, String gender) {
        this.name = name;
        this.age = age;
        this.sal = sal;
        this.gender = gender;
    }

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
