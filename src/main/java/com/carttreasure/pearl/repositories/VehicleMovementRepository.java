package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {
}
