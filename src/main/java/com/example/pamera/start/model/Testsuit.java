package com.example.pamera.start.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "testsuit")
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Testsuit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "testsuit_name", unique = true)
    private String testsuitName;

    @Column(name = "testsuit_description", length = 500)
    private String description;
}