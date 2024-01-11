package com.twice.dev.LocalizaCar.repositories;


import com.twice.dev.LocalizaCar.entities.Requester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequesterRepository extends JpaRepository<Requester, Long> {

}
