package com.twice.dev.LocalizaCar.repositories;

import com.twice.dev.LocalizaCar.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

}
