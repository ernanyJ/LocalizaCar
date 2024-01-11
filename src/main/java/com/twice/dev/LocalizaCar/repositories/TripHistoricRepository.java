package com.twice.dev.LocalizaCar.repositories;

import com.twice.dev.LocalizaCar.entities.TripHistoric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripHistoricRepository extends JpaRepository<TripHistoric, Long> {

}
