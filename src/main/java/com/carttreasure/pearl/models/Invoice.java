package com.carttreasure.pearl.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Invoice {	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date invoiceDate;
	
	@ManyToOne
	@JoinColumn(name="invoicestatusid", insertable=false, updatable=false)
	private InvoiceStatus invoiceStatus;
	private Integer invoicestatusid;
	
	@ManyToOne
	@JoinColumn(name="clientid", insertable=false, updatable=false)
	private Client client;
	private Integer clientid;
	
	private String remarks;	
}
