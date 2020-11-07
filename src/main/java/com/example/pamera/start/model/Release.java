package com.example.pamera.start.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "release")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Release implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "release_name", unique = true)
    private String releaseName;

    @Column(name = "release_description", length = 500)
    private String releaseDescription;

    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "finish_date")
    @Temporal(TemporalType.DATE)
    private Date finishDate;

    @JoinColumn(name = "productId")
    @ManyToOne(optional = false)
    private Projects projectId;
}

