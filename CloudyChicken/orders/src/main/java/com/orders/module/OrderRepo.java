package com.orders.module;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository <Order, Long>
{}