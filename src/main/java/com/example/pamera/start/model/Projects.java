package com.example.pamera.start.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "projects")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Projects  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectId;
    @Column(name = "project_name", unique = true)
    private String projectName;
    @Column(name = "project_description", length = 500)
    private String projectDescription;
    @Column(name = "project_date")
    @Temporal(TemporalType.DATE)
    private Date Date;
    @Column(name = "project_memo")
    private String Memo;

    @JoinColumn(name = "workitem_Id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Workitem> workitemId;
}
