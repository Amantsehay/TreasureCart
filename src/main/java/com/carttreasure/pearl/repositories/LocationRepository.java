package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
