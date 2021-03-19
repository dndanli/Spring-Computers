/**
 * @author Daniel De Lima - dcdelima
 * CIS 175 - Spring 2021
 * Mar 18, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;

@Configuration
public class BeanConfiguration {

	@Bean
	public Computer computer() {
		Computer computer = new Computer();
//		computer.setComputerName("Surface Laptop");
//		computer.setBrandName("Microsoft");
//		computer.setHasWarranty(true);
//		computer.setPrice(899.99);
		return computer;
	}
}
