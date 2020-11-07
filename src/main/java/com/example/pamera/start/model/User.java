package com.example.pamera.start.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "user_name",unique = true)
    private String userName;
    @Column(name = "user_surname")
    private String userSurname;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_password")
    private String userPassword;



    // Buraya aktif mi pasif noolean tipinde bir veri ekleyebilirsin.

}
