/**
 *@auther [user} amkoraishi@dmacc.edu
 *CIS175-Fal2022
 *Nov 2, 2022
  */
package dmacc.model;

import javax.persistence.Embeddable;

@Embeddable
public class CampusAddress {
	private String street;
	private String city;
	private String state;

	public CampusAddress() {
 
	}

	public CampusAddress(String street, String city, String state) {

	}

//getters and setters
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
}

