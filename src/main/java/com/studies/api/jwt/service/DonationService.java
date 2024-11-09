package com.studies.api.jwt.service;

import com.studies.api.jwt.entity.Donation;
import org.springframework.stereotype.Service;

@Service
public interface DonationService{

    Iterable<Donation> getAllDonations();
    Iterable<Donation> getAllDonationsByUserId(Long id);
    Iterable<Donation> getAllDonationsByProjectId(Long id);
    Donation getDonationById(Long id);
    Donation createDonation(Donation donation);
    Donation updateDonation(Donation donation);
    void deleteDonation(Long id);
}
