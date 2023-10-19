package com.carttreasure.pearl.repositories;
import com.carttreasure.pearl.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ClientRepository  extends JpaRepository<Client, Integer>{
}
