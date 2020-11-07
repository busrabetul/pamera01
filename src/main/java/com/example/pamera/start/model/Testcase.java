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
@Table(name = "testcase")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Testcase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "test_name")
    private String testName;

    @Column(name = "test_description")
    private String tDescription;

    @Column(name = "designer")
    private String designer;
    // Bu alanlar listeli alanlardır. Testcaseden mi geliyor? requiremntdan mı?
    @Column(name = "test_type")
    private String type;

    @Column(name = "test_state")
    private String state;

    @Column(name = "test_status")
    private String status;

    @Column(name = "test_severity")
    private String severity;

    @Column(name = "test_priority")
    private String priority;

    @Column(name = "test_category")
    private String category;
    // Bu alanlar listeli alanlardır. Testcaseden mi geliyor? requiremntdan mı?

    @Column(name = "note")
    private String note;
/*
    @JoinColumn(name = "taskitem_id",referencedColumnName = "Id")
    private Taskitem taskitemId;*/

}