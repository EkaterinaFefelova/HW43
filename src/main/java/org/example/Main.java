package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Movable car = context.getBean("car", Movable.class);
        Rotatable wheel = context.getBean("wheel", Rotatable.class);
        Workable engine = context.getBean("engine", Workable.class);
        Workable transmission = context.getBean("transmission", Workable.class);
        car.move();
        wheel.rotate();
        engine.work();
        transmission.work();
    }
}
