package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository  extends JpaRepository<VehicleType, Integer> {
}
