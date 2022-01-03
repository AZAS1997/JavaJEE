package Cigma.pfe;
import Cigma.pfe.controllers.ClientController;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class MonApplication {
	
	public static void main(String[] args) {
	ApplicationContext context = new
				ClassPathXmlApplicationContext("spring.xml");
		//Client client =new Client(1L,"testing");
		//ctrl1.save(client);
		
		ClientController ctrl = (ClientController)
				context.getBean("controller"); 
		
		
		
		}

}
