package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.ATMImpl;

public class TestSpring {

	public static void main(String[] args) {
		// start SC in Java SE , using xml based instructions(meta data) , placed in run
		// time cls path (eg : src/main/resources)
    try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config.xml")){
    	System.out.println("sc started");
    	ATMImpl bean1 = ctx.getBean("my_atm",ATMImpl.class); 
    	bean1.deposit(2000);
    	
    	ATMImpl bean2 = ctx.getBean("my_atm",ATMImpl.class);
    	System.out.println(bean1=bean2);
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
	}

}
