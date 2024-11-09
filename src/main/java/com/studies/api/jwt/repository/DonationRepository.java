package com.studies.api.jwt.repository;

import com.studies.api.jwt.entity.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
    Iterable<Donation> findAllByProjectId(Long id);
    Iterable<Donation> findAllByUserId(Long id);
}
