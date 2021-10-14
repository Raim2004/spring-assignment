package peaksoft;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog=context.getBean("myDog",Dog.class);
        dog.animalMinus();
        dog.animalPlus();
        System.out.println(dog.getGreed());
        System.out.println(dog.getColor());
        System.out.println(dog.getAge());
        System.out.println("-------------------------------");
        Person person = context.getBean("myPerson",Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();


    }
}
