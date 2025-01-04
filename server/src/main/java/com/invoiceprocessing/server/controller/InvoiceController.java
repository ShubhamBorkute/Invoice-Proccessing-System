package com.invoiceprocessing.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceprocessing.server.model.Invoice;
import com.invoiceprocessing.server.service.InvoiceService;

import jakarta.websocket.server.PathParam;



@RestController
@CrossOrigin
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;

    @PostMapping("/invoice")
    public Invoice addInvoice(@RequestBody Invoice invoice) {
        return invoiceService.addInvoice(invoice);
    }
    
    @GetMapping("/invoice")
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }
    
    @PutMapping("invoice/{id}")
    public String deleteInvoice(@PathVariable("id") Long pid ) {
    	System.out.println("delete call");
       System.out.println(pid);
        return invoiceService.deleteById(pid) ;
    }
    
}
