package com.example.pamera.start.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "workitem")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Workitem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "work_name")
    private String workName;

    @Column(name = "work_description")
    private String wDescription;

    @Column(name = "work_date")
    @Temporal(TemporalType.DATE)
    private Date workDate;

    // Bu alanlar listeli alanlardır. Testcaseden mi geliyor? requiremntdan mı?
    @Column(name = "type")
    private String type;

    @Column(name = "category")
    private String category;

    @Column(name = "state")
    private String state;
    // Bu alanlar listeli alanlardır. Testcaseden mi geliyor? requiremntdan mı?

    @JoinColumn(name = "projectId")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Projects projectId;

    @JoinColumn(name = "taskitemId")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Taskitem> taskitemId;


}

//Burada istenilen proje, İsim(name),açıklama(description),tarihler(date),type,category ve
//state seçilip kaydet(save) butonuna basıldığında yeni workitem oluşturulur