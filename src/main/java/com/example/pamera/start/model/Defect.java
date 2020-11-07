package com.example.pamera.start.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "testcase")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Defect implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "defect_name")
    private String defectName;

    @Column(name = "defect_description")
    private String defectDescription;

    @Column(name = "defect_product")
    private String defectProduct;

    @Column(name = "detected_release")
    private String detectedRelease;

    @Column(name = "target_release")
    private String targetRelease;

    @Column(name = "detected_by")
    private String detectedBy;

    @Column(name = "assign_To")
    private String assignTo;
    // Bu alanlar listeli alanlardır. Testcaseden mi geliyor? requiremntdan mı?
    @Column(name = "defect_priority")
    private String defectPriority;

    @Column(name = "defect_severity")
    private String defectSeverity;

    @Column(name = "defect_status")
    private String defectStatus;

    @Column(name = "defect_type")
    private String defectType;

    @Column(name = "defect_category")
    private String defect_category;
    // Bu alanlar listeli alanlardır. Testcaseden mi geliyor? requiremntdan mı?

    @Column(name = "defect_note")
    private String defectNote;
}