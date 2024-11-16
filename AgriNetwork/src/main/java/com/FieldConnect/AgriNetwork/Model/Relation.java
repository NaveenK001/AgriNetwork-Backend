package com.FieldConnect.AgriNetwork.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Relation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String relationName;

    @Column
    private String name;

    @Column
    private String fathersName;

    @Column
    private int age;

    @Column
    private String gender;

    @Column
    private String mobile;


    @ManyToOne
    @JoinColumn(name = "bankId")
    private Bank bank;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "janAdhaarId")
    private Janadhaar janAdhaar;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "ackId")
    private Acknowledge acknowledge;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adhaarId")
    private Aadhar aadhar;


}
