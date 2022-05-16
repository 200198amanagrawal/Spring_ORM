package com.spring.ORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ORM.dao.StudentDao;
import com.spring.ORM.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ORM/config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        int result=studentDao.insert(new Student(2345,"Aman","VNS"));
        System.out.println("Data insereted : "+result);
    }
}
