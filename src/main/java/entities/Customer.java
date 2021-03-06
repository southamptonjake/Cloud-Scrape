package entities;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Customer {
	public String mobile,firstName,lastName,company,addr1,addr2,city,country,state,zip;
	@Id public String phone;
	public Customer(String phone, String mobile, String firstName, String lastName, String company,
			String addr1, String addr2, String city, String country,String state, String zip) {
		super();
		
		this.phone = phone;
		this.mobile = mobile;
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zip = zip;
	}
	public Customer() {}
	

}
