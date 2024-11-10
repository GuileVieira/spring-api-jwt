package com.studies.api.jwt.controller;

import com.studies.api.jwt.entity.Donation;
import com.studies.api.jwt.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/donations")
public class DonationController {
    @Autowired
    private DonationService donationService;

    @GetMapping("/all")
    public Iterable<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }
    @GetMapping("/user/{id}")
    public Iterable<Donation> getAllDonationsByUserId(Long id) {
        return donationService.getAllDonationsByUserId(id);
    }
    @GetMapping("/project/{id}")
    public Iterable<Donation> getAllDonationsByProjectId(Long id) {
        return donationService.getAllDonationsByProjectId(id);
    }
    @GetMapping("/{id}")
    public Donation getDonationById(Long id) {
        return donationService.getDonationById(id);
    }
    @PostMapping("/create")
    public Donation createDonation(@RequestBody Donation donation) {
        return donationService.createDonation(donation);
    }
    @PutMapping("/update/{id}")
    public Donation updateDonation(@PathVariable(value = "id") Long id, @RequestBody Donation donation) {
        return donationService.updateDonation(donation);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteDonation(@PathVariable(value = "id") Long id) {
        donationService.deleteDonation(id);
    }
}
