package com.carttreasure.pearl.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="clientid") // I think I can use different name for the column here
	private int id;
	
	private String name;
	private String address;
	private String city;
	private String phone;
	private String mobile;
	private String website;
	private String email;
	
	@ManyToOne
	@JoinColumn(name="countryid", insertable=false, updatable=false) // many clients can belong to a country
	private Country country;
	private Integer countryid;
	
	@ManyToOne
	@JoinColumn(name="stateid", insertable=false, updatable=false) // the same as the client to country relationship
	private State state;	
	private Integer stateid;
	private String details;
}
