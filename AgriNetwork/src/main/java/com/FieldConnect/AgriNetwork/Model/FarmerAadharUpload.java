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
public class FarmerAadharUpload {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int farmerAadharId;

    @Column
    private String farmerName;

    @Column
    private String aadharDocUploadPath;


    @ManyToOne
    @JoinColumn(name = "farmerId")
    private Farmer farmerId;

}
