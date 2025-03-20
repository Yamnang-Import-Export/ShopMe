package bt.edu.gcit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        // Alien obj = new Alien();
        // obj.code();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();
        System.out.println(obj.getAge());
        System.out.println(obj.getSalary());
   
        // Laptop obj1 = (Laptop) context.getBean("laptop");
        // obj1.compile();
        
        
    }
}