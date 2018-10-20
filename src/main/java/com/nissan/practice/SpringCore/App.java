package com.nissan.practice.SpringCore;

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
        
        
//        IVehicle obj = (IVehicle)context.getBean("car");
//        obj.drive();
        
// bean property
        
/*        Tyre t = (Tyre)context.getBean("tyre");
        System.out.println(t);*/


// AutoWired Annotation
        Car c = (Car)context.getBean("car");
        c.drive();
    }	
}
