package com.invoiceprocessing.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invoiceprocessing.server.model.Invoice;
@Repository
public interface InvoiceRepository  extends JpaRepository<Invoice, Long>{

}
