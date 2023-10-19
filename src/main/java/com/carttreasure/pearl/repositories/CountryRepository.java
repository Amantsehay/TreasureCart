package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
