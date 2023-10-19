package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository  extends JpaRepository<InvoiceStatus, Integer> {
}
