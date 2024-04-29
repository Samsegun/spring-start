package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var parrot = context.getBean(Parrot.class);
        var eagle = context.getBean(Eagle.class);
        parrot.setName("coco");
        eagle.setName("samba");

        System.out.println(parrot);
        System.out.println(eagle);

/**       var parrot = context.getBean("parrot", Parrot.class);
       var parrot2 = context.getBean("parrot2", Parrot.class);

       System.out.println(parrot.getName());
       System.out.println(parrot2.getName()); */

    }
}
