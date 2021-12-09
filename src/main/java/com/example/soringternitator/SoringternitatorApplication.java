package com.example.soringternitator;

import com.example.soringternitator.quoters.Quoter;
import com.example.soringternitator.quoters.TerminatorQuoter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SoringternitatorApplication {

    public static void main(String[] args) throws InterruptedException {
        //SpringApplication.run(SoringternitatorApplication.class, args);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");


            context.getBean(Quoter.class).saeQuot();

    }

}
