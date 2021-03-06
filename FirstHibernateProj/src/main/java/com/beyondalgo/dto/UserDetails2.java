package com.beyondalgo.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS_2")
public class UserDetails2 {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;

	/*@OneToOne
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;*/

	/*@OneToMany(mappedBy="userDetails2")
	//@JoinTable(name = "USER_VEHICLE", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"))
	private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();*/
	
	// Many to many 
	/*@ManyToMany
	@JoinTable(name="USER_VEHICLES")
	private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();*/
	
	// One to many with cascade type
	@OneToMany(cascade=CascadeType.PERSIST)
	private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/

	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	

}
