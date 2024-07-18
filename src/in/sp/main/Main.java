package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.StudentC;

public class Main {
	public static <Studentc> void main(String[]args) {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("in/sp/config/applicationContext.xml");
		StudentC s1=(StudentC) cxt.getBean("banglore1");
		s1.show();
		
		StudentC s2 = (StudentC) cxt.getBean("chennai2");
		s2.show();
	}

}
