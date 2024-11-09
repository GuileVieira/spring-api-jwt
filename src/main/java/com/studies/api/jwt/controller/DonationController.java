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
        //TODO check if user is admin then return the objects or 404
        return donationService.getAllDonations();
    }
    @GetMapping("/user/{id}")
    public Iterable<Donation> getAllDonationsByUserId(Long id) {
        //TODO check if user exists, check if user is admin or has same id - then return the object or 404
        return donationService.getAllDonationsByUserId(id);
    }
    @GetMapping("/project/{id}")
    public Iterable<Donation> getAllDonationsByProjectId(Long id) {
        //TODO check if project exists, then return the object or 404
        return donationService.getAllDonationsByProjectId(id);
    }
    @GetMapping("/{id}")
    public Donation getDonationById(Long id) {
        //TODO check if donation exists, check if user is admin or has same id -then return the object or 404
        return donationService.getDonationById(id);
    }
    @PostMapping("/create")
    public Donation createDonation(@RequestBody Donation donation) {
        //TODO Create a donation manually
        return donationService.createDonation(donation);
    }
    @PutMapping("/update/{id}")
    public Donation updateDonation(@PathVariable(value = "id") Long id, @RequestBody Donation donation) {
        //TODO UPDATE a donation manually
        return donationService.updateDonation(donation);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteDonation(@PathVariable(value = "id") Long id) {
        //TODO check if donation exists, check if user is admin or has same id -then delete the object or 404
        donationService.deleteDonation(id);
    }
}
