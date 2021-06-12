package com.example.springposgres.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.springposgres.model.Customer;
import com.example.springposgres.model.CustomerUI;
import com.example.springposgres.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
public class CustomerController {
	@Autowired
	CustomerRepository repository;
	
	@GetMapping("/bulkcreate")
	public String bulkcreate(){
		// save a single Customer
		repository.save(new Customer("Rajesh", "Bhojwani"));
		
		
		return "load details added successfully ";
	}
	@PostMapping("/load")
	public String create(@RequestBody CustomerUI customer){
		// save a single Customer
		repository.save(new Customer(customer.loadingPoint(), customer.unloadingPoint(),customer.productType(),customer.truckType(),customer.noOfTrucks(),
		customer.weight(),customer.optional(),customer.shipperId(),customer.Date()));

		return "load details added successfully";
	}
	@GetMapping("/load")
	public List<CustomerUI> findAll(){

		List<Customer> customers = repository.findAll();
		List<CustomerUI> customerUI = new ArrayList<>();
		
		for (Customer customer : customers) {
			customerUI.add(new CustomerUI(customer.loadingPoint(), customer.unloadingPoint(),customer.productType(),customer.truckType(),customer.noOfTrucks(),
		customer.weight(),customer.optional(),customer.shipperId(),customer.Date()));
		}

		return customerUI;
	}
	
	@RequestMapping("/load/{loadid}")
	public String search(@PathVariable long loadid){
		String customer = "";
		customer = repository.findById(loadid).toString();
		return customer;
	}
}