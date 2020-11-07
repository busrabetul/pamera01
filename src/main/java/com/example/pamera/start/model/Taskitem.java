package com.example.pamera.start.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "taskitem")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Taskitem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "task_description")
    private String taskDescription;

    @Column(name = "responsible")
    private String responsible;

    @Column(name = "taskitem_type")
    private String taskitemType;

    @Column(name = "taskitem_category")
    private String taskitemCategory;

    @Column(name = "taskitem_state")
    private String taskitemState;

    @Column(name = "point")
    private String point;

    @Column(name = "due_date")
    @Temporal(TemporalType.DATE)
    private Date deuDate;

    @Column(name = "expected_date")
    @Temporal(TemporalType.DATE)
    private Date expectedDate;

    @Column(name = "actual_date")
    @Temporal(TemporalType.DATE)
    private Date actualDate;

    @JoinColumn(name = "workitem_id")
    @ManyToOne(optional = false)
    private Workitem workitemId;
}
