/**
 * @author Daniel De Lima - dcdelima
 * CIS 175 - Spring 2021
 * Mar 18, 2021
 */

package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String computerName;
	private boolean hasWarranty;
	private double price;
	private String brandName;
	
	/**
	 * No arguments default constructor
	 */
	public Computer() { super(); }

	/**
	 * 
	 * @param computerName String value represents the name of the computer
	 * @param hasWarranty  Boolean value represents if computer has warranty or not
	 * @param price        Double value represents the  price of the computer
	 * @param brandName	   String value represents the name of the brand that produces the computer
	 */
	public Computer(String computerName, boolean hasWarranty, double price, String brandName) {
		super();
		this.computerName = computerName;
		this.hasWarranty = hasWarranty;
		this.price = price;
		this.brandName = brandName;
	}

	
	/*Getters and setters*/
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComputerName() {
		return computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	public boolean isHasWarranty() {
		return hasWarranty;
	}

	public void setHasWarranty(boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", computerName=" + computerName + ", hasWarranty=" + hasWarranty + ", price="
				+ price + ", brandName=" + brandName + "]";
	}
	
}
