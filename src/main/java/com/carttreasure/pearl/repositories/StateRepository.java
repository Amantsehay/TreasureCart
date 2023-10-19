package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository  extends JpaRepository<State, Integer> {
}
