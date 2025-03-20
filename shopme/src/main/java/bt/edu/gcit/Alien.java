
package bt.edu.gcit;

public class Alien {
    // private Laptop laptop;
    private Computer laptop;
    // private Computer desk;
    private int age;
    private int salary;

    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // public Alien(int age, Computer lap, int salary, Computer desk) {
    //     System.out.println("Alien object created");
    //     this.age = age;
    //     this.lap= lap;
    //     this.salary = salary;
    //     this.desk = desk;

    // }
    public void code() {
        System.out.println("I am coding");
        laptop.compile();
        // desk.compile();

    }
    public Computer getLaptop() {
        return laptop;
    }
    public void setLaptop(Computer laptop) {
        this.laptop = laptop;
    }
    
    
}