package com.invoiceprocessing.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceprocessing.server.model.Invoice;
import com.invoiceprocessing.server.repository.InvoiceRepository;
@Service
public class InvoiceServiceImpl implements InvoiceService {
	
	@Autowired
	private InvoiceRepository invoiceRepository;

	@Override
	public Invoice addInvoice(Invoice invoice) {
		
		return invoiceRepository.save(invoice);
	}

	@Override
	public Invoice getInvoiceById(Long id) {
		
		return invoiceRepository.getById(id);
	}

	@Override
	public List<Invoice> getAllInvoices() {
		
		return invoiceRepository.findAll();
	}

	@Override
	public String deleteById(Long pid) {
		
		Optional<Invoice> id = invoiceRepository.findById(pid);
		invoiceRepository.deleteById(id.get().getPid());
		return "product deleted with id "+pid;
	}

}
