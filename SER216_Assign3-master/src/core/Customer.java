/**
 * 
 */
package core;

/** Class that can store and display the information of a particular customer. Requirements for this 
 * class are in Assignmetnt 3, Step 4.
 * 
 * @author cody
 *
 */
public class Customer {
	
	// attributes
	private String name, streetAddress, city, state, zip;
	private int age;
	
	/**Constructor that accepts name and address values and sets the attributes.
	 * 
	 * @param name 				name of the customer	
	 * @param streetAddress		address of the customer
	 * @param city				city of the customer
	 * @param state				state of the customer
	 * @param zip				zip code of the customer
	 * @param age				age of the customer
	 */
	public Customer(String name, String streetAddress, String city, String state, 
			String zip, int age) {
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/** Returns a string that has the complete formatted address with street address, city, 
	 * state, and zip code. The information is displayed over three lines, aligned left.
	 * 
	 * @return	a string of the address information.
	 */
	public String displayAddress() {
		String formattedAddress = "";
		formattedAddress += this.getStreetAddress() + "\n" + this.getCity() 
			+ ", " + this.getState() + "\n" + this.getZip();
		return formattedAddress;
	}
	
	/** Returns the customer's name above the address from displayAddress(). Information is over
	 * four lines and aligned left.
	 * 
	 * @return a string with the name of the customer and their address.
	 */
	public String displayAddressLabel() {
		String formattedAddressLabel = "" + this.getName() + "\n" + this.displayAddress();
		return formattedAddressLabel;
	}

}
