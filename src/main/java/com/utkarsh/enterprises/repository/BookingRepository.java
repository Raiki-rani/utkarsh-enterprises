package com.utkarsh.enterprises.repository;

import com.utkarsh.enterprises.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByTrackingNumber(String trackingNumber);

}