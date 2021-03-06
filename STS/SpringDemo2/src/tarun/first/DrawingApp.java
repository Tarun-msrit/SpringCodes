package tarun.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Tarun
 *
 */
public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory = new XmlBeanFaactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();
	}

}
