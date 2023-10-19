package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusRepository  extends JpaRepository<VehicleStatus, Integer>{
}
