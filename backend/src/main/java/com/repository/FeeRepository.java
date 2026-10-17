package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.Fee;

@Repository
public interface FeeRepository extends JpaRepository<Fee, Integer> {

    // Search by PRN
    List<Fee> findByPrnno(String prnno);

    // Search by Student ID
    List<Fee> findByStudid(Integer studid);

    // Search by Fee Type (Tuition / Hostel / Exam / Bus)
    List<Fee> findByFeeType(String feeType);

    // Search by Status (Paid / Pending / Partial)
    List<Fee> findByStatus(String status);

    // Search by Student Name (Partial match)
    List<Fee> findByFirstnameContainingIgnoreCase(String firstname);
    List<Fee> findByLastnameContainingIgnoreCase(String lastname);

    // Filter by payment mode (Cash / UPI / Bank / Online)
    List<Fee> findByPaymentMode(String paymentMode);
    @Query("SELECT f FROM Fee f WHERE f.remainingAmount > 0")
    List<Fee> findPendingFees();

}
