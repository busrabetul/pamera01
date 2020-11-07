package com.example.pamera.start.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "product_name", unique = true)
    private String productName;

    @Column(name = "project_description", length = 500)
    private String description;
}


