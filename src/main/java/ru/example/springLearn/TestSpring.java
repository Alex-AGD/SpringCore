package ru.example.springLearn;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //ClassPath ислз из depend spring-context pom.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                //name нашего конф файла resources
                "applicationContext.xml"

        );
       TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        //обязательно нужно закрыть вконце после раб с ClassPathXmlApplicationContext
        context.close();
    }
}