package com.ijse.travelpacakge.travelpackageservice.dto;

import com.ijse.travelpacakge.travelpackageservice.embeded.RoomCount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TravelPackageDTO {
    private String travelPackage_Id;
    private String travelPackage_Category;
    private String travelPackage_Areas;
    private String guide_id;
    private String vehicle_id;
    private String hotel_id;
    private String customer_id;
    private double travelPackage_Value;
    private double travelPackage_PaidValue;
    private String travelPackage_NeedGuide;
    private String travelPackage_WithPet;
    private int travelPackage_HeadCount;
    private int travelPackage_No_Child;
    private int travelPackage_No_Adult;
    private RoomCount roomCount;

    private String travelPackage_StartDate;

    private String travelPackage_EndDate;

    private String travelPackage_PacedDate;
}
