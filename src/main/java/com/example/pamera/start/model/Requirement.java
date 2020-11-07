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
public class Requirement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "req_description")
    private String reqDescription;

    @Column(name = "code")
    private String code;

    @Column(name = "req_type")
    private String reqType;

    @Column(name = "req_priority")
    private String reqPriority;

    @Column(name = "req_category")
    private String reqCategory;

    @Column(name = "req_status")
    private String reqStatus;

    @Column(name = "req_author")
    private String reqAuthor;

    @Column(name = "reviewed")
    private String reviewed;

    @Column(name = "req_memo")
    private String reqMemo;

    @Column(name = "req_note")
    private String reqNote;


}
