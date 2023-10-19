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
public class Contact {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="contact_id") // this is the name of the column in the database
	// this is the name of the table in the database
	private int id;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	private String mobile;
	private String remarks;
}
