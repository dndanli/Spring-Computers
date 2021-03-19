/**
 * @author Daniel De Lima - dcdelima
 * CIS 175 - Spring 2021
 * Mar 18, 2021
 */

package dmacc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}

	@Autowired
	ComputerRepository repo;

	@Override
	public void run(String... args) throws Exception { 
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		
		//First computer
		Computer computer1 = appContext.getBean("computer", Computer.class);
		computer1.setComputerName("LG Gram");
		repo.save(computer1);
		// boolean stored as bit --> 0x00 as false
		
		//Second computer
		Computer computer2 = new Computer("Dell XPS", true, 899.99, "Microsoft");
		repo.save(computer2);
		// boolean stored as bit --> 0x01 as true
		
		
		Computer computer3 = new Computer("ASUS ROG Zephyrus", false, 1300.00, "ASUS");
		repo.save(computer3);
		// boolean stored as bit --> 0x00 as false
	
		
		//List of computers
		List<Computer> allComputers = repo.findAll();
		for(Computer computerObj: allComputers) {
			System.out.println(computerObj.toString());
				
		}
		
		((AbstractApplicationContext) appContext).close();
		
	} 
}
