package com.endava.siv5l.spring.netexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        //Square square = (Square) context.getBean("square");
        //square.draw();

        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
        Triangle trianglee = (Triangle) context.getBean("triangle");
        trianglee.draw();
        Point point = (Point) context.getBean("zeroPoint");
        point.setX(100);
        triangle.setPointA(point);
        System.out.println("primu");
        triangle.draw();
        System.out.println("doi");
        trianglee.draw();

    }
}
