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
public class Note implements Serializable {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "note_name")
    private String noteName;

    @Column(name = "note",length = 500)
    private String note;


}
