package com.invoiceprocessing.server.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.invoiceprocessing.server.model.Invoice;

@Service
public interface InvoiceService {
	

	public Invoice addInvoice(Invoice invoice);
	
	public Invoice getInvoiceById(Long id);
	
	public List<Invoice> getAllInvoices();
	
	public String deleteById(Long pid);

	
}
