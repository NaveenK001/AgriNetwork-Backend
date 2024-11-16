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
public class AadharDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aadharDocId;

    @Column
    private String aadharDocPath;
}
