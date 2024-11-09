package com.studies.api.jwt.service.impl;

import com.studies.api.jwt.entity.Donation;
import com.studies.api.jwt.repository.DonationRepository;
import com.studies.api.jwt.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DonationServiceImpl implements DonationService {

    @Autowired
    private DonationRepository repo;


    @Override
    public Iterable<Donation> getAllDonations() {
        return repo.findAll();
    }

    @Override
    public Iterable<Donation> getAllDonationsByUserId(Long id) {
        return repo.findAllByProjectId(id);
    }

    @Override
    public Iterable<Donation> getAllDonationsByProjectId(Long id) {
        return repo.findAllByUserId(id);
    }

    @Override
    public Donation getDonationById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Donation createDonation(Donation donation) {
        return repo.save(donation);
    }

    @Override
    public Donation updateDonation(Donation donation) {
        return repo.save(donation);
    }

    @Override
    public void deleteDonation(Long id) {
        repo.deleteById(id);
    }
}
