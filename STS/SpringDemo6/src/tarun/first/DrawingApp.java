package tarun.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Tarun
 *
 */
public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFaactory(new FileSystemResource("spring.xml"));
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();

		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}

}
