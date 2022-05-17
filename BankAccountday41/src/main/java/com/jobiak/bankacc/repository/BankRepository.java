package com.jobiak.bankacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.bankacc.model.Bank;


@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

}
