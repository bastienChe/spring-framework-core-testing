package spring.framework.core.Testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	Using context to retrieve an implementation (the goal is to use the implementation "bike")
//    	Vehicule obj = (Vehicule)context.getBean("bike");
//    	obj.drive();
    	
    	Tyre t = (Tyre)context.getBean("tyre");
    	System.out.println(t.toString());
    }
}
