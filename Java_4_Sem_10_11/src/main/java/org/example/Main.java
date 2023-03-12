package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Magician mag = context.getBean(args[0], Magician.class);
        mag.doMagic();
    }
}