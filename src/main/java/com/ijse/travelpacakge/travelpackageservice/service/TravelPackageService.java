package com.ijse.travelpacakge.travelpackageservice.service;

import com.ijse.travelpacakge.travelpackageservice.dto.TravelPackageDTO;
import com.ijse.travelpacakge.travelpackageservice.exception.DuplicateException;
import com.ijse.travelpacakge.travelpackageservice.exception.NotFoundException;

import java.util.List;

public interface TravelPackageService {

    void saveTravelPackage(TravelPackageDTO travelPackageDTO) throws DuplicateException;

    void updateTravelPackage(TravelPackageDTO travelPackageDTO) throws NotFoundException;

    TravelPackageDTO findPackageById(String packageId);

    List<TravelPackageDTO> getAllPackages();

    void deletePackage(String packageId) throws NotFoundException;

    String getNextId();

    List<TravelPackageDTO> getDetails(String date);



}
