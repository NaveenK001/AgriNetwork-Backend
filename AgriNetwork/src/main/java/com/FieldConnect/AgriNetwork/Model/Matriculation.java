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
public class Matriculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricId;

    @Column
    private String matriculationBoard;

    @Column
    private String schoolName;

    @Column
    private String passoutYear;

    @Column
    private String percentageSecured;

    @Column
    private String markSeured;

    @Column
    private String totalMark;

    @Column
    private String markSheetUploadPath;

    @Column
    private String certificateUploadPath;

}
