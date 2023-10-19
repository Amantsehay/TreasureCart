package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository   extends JpaRepository<Contact, Integer> {

}
