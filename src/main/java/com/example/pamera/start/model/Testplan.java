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
@Table(name = "testplan")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Testplan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "testplan_name")
    private String testplanName;

    @Column(name = "test_description")
    private String testPlanDescription;
    // Bu alanlar listeli alanlardır. Testcaseden mi geliyor? requiremntdan mı?
    @Column(name = "test_type")
    private String testPlanType;

    @Column(name = "test_category")
    private String testPlanCategory;
    // Bu alanlar listeli alanlardır. Testcaseden mi geliyor? requiremntdan mı?
    @Column(name = "note")
    private String testPlanNote;

    @Column(name = "testplan_date")
    @Temporal(TemporalType.DATE)
    private Date testPlanDate;

}
