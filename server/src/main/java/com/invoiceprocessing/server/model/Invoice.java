package com.invoiceprocessing.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long  pid;

    private String vendor;

    private String product;

    private Double amount;

    //private LocalDate date;
    
    private String date;
    
    private String action;
}
