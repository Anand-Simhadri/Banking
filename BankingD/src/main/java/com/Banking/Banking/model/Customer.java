package com.Banking.Banking.model;


public class Customer {

    private String address;
    
    private int age;
      
    private String emailId;
    
    private String firstName;
    
    private String gender;
    
    private String lastName;
    
    private String panNumber;
    
    private String phoneNumber;
    
    private String userName;
    
    private String password;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String address, int age, String emailId, String firstName, String gender, String lastName,
			String panNumber, String phoneNumber, String userName, String password) {
		super();
		this.address = address;
		this.age = age;
		this.emailId = emailId;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
		this.panNumber = panNumber;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [address=" + address + ", age=" + age + ", emailId=" + emailId + ", firstName=" + firstName
				+ ", gender=" + gender + ", lastName=" + lastName + ", panNumber=" + panNumber + ", phoneNumber="
				+ phoneNumber + ", userName=" + userName + ", password=" + password + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
    
}
