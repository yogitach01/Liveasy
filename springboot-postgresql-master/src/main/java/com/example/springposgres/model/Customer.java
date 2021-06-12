package com.example.springposgres.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
 
	private static final long serialVersionUID = -2343243243242432341L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
 
	@Column(name = "loadingPoint")
	private String loadingPoint;
 
	@Column(name = "unloadingPoint")
	private String unloadingPoint;
	@Column(name = "productType")
	private String productType;
	@Column(name = "truckType")
	private String truckType;
	
	@Column(name = "noOfTrucks")
	private int noOfTrucks;
	@Column(name = "weight")
	private String weight;
	@Column(name = "optional")
	private String optional;
	
	@Column(name = "shipperId")
	private String shipperId;
	
	@Column(name = "Date")
	private String Date;
	
	
	
	protected Customer() {
	}
 
	public Customer(String loadingpoint, String unloadingpoint ,String Producttype,String truckType,String nooftruck, String weight,String Optional,String shipperid,String Date) {
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
 
	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
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
}