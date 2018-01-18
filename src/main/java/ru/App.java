package ru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dmitry Tkachenko on 1/18/18
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/database.xml");
        String str1 = context.getEnvironment().getProperty("test.one");
        String str2 = context.getEnvironment().getProperty("test.two");
        System.out.println(str1);
        System.out.println(str2);
    }
}
