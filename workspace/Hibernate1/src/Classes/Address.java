package Classes;

import javax.persistence.Embeddable;
//Q10 Create a class Address for Author with instance variables streetNumber, location, State.
@Embeddable
public class Address {
	private int streetNumber;
	private String location;
	private String State;
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	
	

}
