package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

//    @Bean
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("coco");
//        return p;
//    }

//    method1 direct wiring
//    @Bean
//    Person person() {
//        var p = new Person();
//        p.setName("ella");
//        p.setParrot(parrot());
//        return p;
//    }

    //method2 dependency injection(spring sets a value into a field of an object of the app)
//    @Bean
//    Person person(Parrot parrot) {
//        var p = new Person();
//        p.setName("ella");
//        p.setParrot(parrot);
//        return p;
//    }

//    @Bean
//    @Primary
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("koko");
//        return p;
//    }
//
//    @Bean
//    Parrot parrot2() {
//        var p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//
//    @Bean(name = "hey")
//    String hello() {
//        return "hello there";
//    }
}
