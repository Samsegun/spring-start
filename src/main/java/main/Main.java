package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);

        System.out.println("person's name: " + person.getName());
        System.out.println("person's parrot: " + person.getParrot());


/**       var parrot = context.getBean("parrot", Parrot.class);
       var parrot2 = context.getBean("parrot2", Parrot.class);

       System.out.println(parrot.getName());
       System.out.println(parrot2.getName()); */

    }
}
