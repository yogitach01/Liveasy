package com.example.springposgres.model;

public class CustomerUI  {
 
	private String loadingPoint;
 
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private String weight;
	private String optional;
	private String shipperId;
	private String Date;
	
	
	
	protected Customer() {
	}
 
	public CustomerUI(String loadingpoint, String unloadingpoint ,String Producttype,String truckType,String nooftruck, String weight,String Optional,String shipperid,String Date) {
		this.loadingPoint = loadingpoint;
		this.unloadingPoint = unloadingpoint;
		this.productType=Producttype;
		this.truckType=truckType;
		this.noOfTrucks=nooftruck;
		this.weight=weight;
		this.optional=optional;
		this.shipperId=shipperid;
		this.Date=Date;
		
	}
     protected CustomerUI() {
	}
 

	 public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	
	public String toString() {
		return String.format("Customer[firstName='%s', lastName='%s']", firstName, lastName);
	}
}