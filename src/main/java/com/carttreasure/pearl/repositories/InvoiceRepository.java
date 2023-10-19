package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
