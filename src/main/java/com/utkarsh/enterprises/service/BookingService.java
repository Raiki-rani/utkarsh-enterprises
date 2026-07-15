package com.utkarsh.enterprises.service;

import com.utkarsh.enterprises.entity.Booking;
import com.utkarsh.enterprises.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // Add Booking
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    // Get All Bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Get Booking By ID
    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    // Update Booking
    public Booking updateBooking(Long id, Booking booking) {

        Booking existingBooking = bookingRepository.findById(id).orElse(null);

        if (existingBooking != null) {

            existingBooking.setTrackingNumber(booking.getTrackingNumber());
            existingBooking.setSenderName(booking.getSenderName());
            existingBooking.setSenderPhone(booking.getSenderPhone());
            existingBooking.setReceiverName(booking.getReceiverName());
            existingBooking.setReceiverPhone(booking.getReceiverPhone());
            existingBooking.setFromCity(booking.getFromCity());
            existingBooking.setToCity(booking.getToCity());
            existingBooking.setParcelType(booking.getParcelType());
            existingBooking.setWeight(booking.getWeight());
            existingBooking.setAmount(booking.getAmount());
            existingBooking.setStatus(booking.getStatus());

            return bookingRepository.save(existingBooking);
        }

        return null;
    }

    // Delete Booking
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

    // Search By Tracking Number
    public Optional<Booking> getBookingByTrackingNumber(String trackingNumber) {
        return bookingRepository.findByTrackingNumber(trackingNumber);
    }

}