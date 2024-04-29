package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

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
