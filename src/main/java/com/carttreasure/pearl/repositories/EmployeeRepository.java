package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
    Employee findByUsername (String un);
}
