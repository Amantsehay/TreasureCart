package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
