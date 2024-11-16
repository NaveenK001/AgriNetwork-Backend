package com.FieldConnect.AgriNetwork.Service;

import com.FieldConnect.AgriNetwork.Bean.FarmerBean;
import com.FieldConnect.AgriNetwork.Model.AadharDocument;
import com.FieldConnect.AgriNetwork.Model.Farmer;
import com.FieldConnect.AgriNetwork.Model.FarmerImage;
import com.FieldConnect.AgriNetwork.Model.Relation;

import java.util.List;

public interface MainServiceAngular {

    Farmer createFarmer(FarmerBean farmerBean);
    List<Farmer> getFarmerList();
    String deleteFarmerById(int id);
    Farmer getFarmerById(int id);
    Farmer saveRelationUsingFarmerId(int farmerId, Relation relation);
    FarmerImage createFarmerImage(FarmerImage farmerImage);
    List<FarmerImage> getFarmerImageList();
    Farmer getAadharIdByFarmerId(int id);
    AadharDocument saveAadharDocument(AadharDocument aadharDocument);
    AadharDocument getAadharDocumentByAadharDocId(int id);

}
