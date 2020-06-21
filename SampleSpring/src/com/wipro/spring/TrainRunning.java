package com.wipro.spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class TrainRunning {
	
		public static void main(String[] args) {
			
			Resource resource = new ClassPathResource("trainbean.xml");
//			BeanFactory fact = new XmlBeanFactory(resource);
			
			ApplicationContext context = new ClassPathXmlApplicationContext("trainbean.xml"); 
			
			TrainBean train1 = (TrainBean) context.getBean("shatabdhi");
			TrainBean train2 = context.getBean("rajdhani", TrainBean.class);
			
			System.out.println("Train1 Details: "+train1);
			System.out.println("Train2 Details: "+train2);
			
			ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
			cxt.close();
		}

}
