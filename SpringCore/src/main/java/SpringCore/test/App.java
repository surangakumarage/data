package SpringCore.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringCore.test.domain.Name;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context = new ClassPathXmlApplicationContext(
    				"Spring-Module.xml");

    		Name obj = (Name) context.getBean("myName");
    		obj.printName();
    	
    }
}
