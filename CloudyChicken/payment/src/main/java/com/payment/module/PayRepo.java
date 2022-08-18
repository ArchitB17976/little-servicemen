package com.payment.module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayRepo extends JpaRepository<Payment, Long>
{}
