package com.carttreasure.pearl.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="_user") // this will tell the hibernate to create a table named _user instead of user which will
// conflict with the user keyword in postgresql

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User {
		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int id;
	private String username;
	private String password;
}
