package Cigma.pfe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonApplication.class, args);

	//ApplicationContext context = new
			//ClassPathXmlApplicationContext("spring.xml");

		//ClientController ctrl = (ClientController) context.getBean("controller");
		//Client client1 = new Client("Omar");
		//Client client2 = new Client("Said");
		//Client client3 = new Client("Ahmed");
// Test1 => save 3 Clients
		//client2=ctrl.save(client2);
		//client3=ctrl.save(client3);
// Test2 => getAll Clients before modify and remove
		//ctrl.getAll().stream()
				//.forEach(i-> System.out.println(i));
// Test3 => getOne Client service
		//System.out.println(ctrl.getOne(1));
// Test4 => modify Client service
		//client1.setName("Hassan");
		//ctrl.modify(client1);
// Test5 => remove Client service
		//ctrl.remove(2);
// Test getAll Client after modify and remove
		//ctrl.getAll().stream()
				//.forEach(i-> System.out.println(i));







	}

}
