/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author SHAH
 */
public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("one.applicationContext.xml");
        students stu = (students) context.getBean("hello");
        stu.setMessage("hello Spring");
        System.out.println(stu.getMessage());
    }
}
