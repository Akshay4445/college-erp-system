package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Fee;
import com.repository.FeeRepository;

@Service
public class FeeService {

    @Autowired
    private FeeRepository feeRepository;

    // ============================
    // Add Fee Record
    // ============================
    public Fee addFee(Fee fee) {

        // Auto calculate remaining amount
        double remaining = fee.getTotalFees() - fee.getPaidAmount();
        fee.setRemainingAmount(remaining);

        // Auto set status
        if (remaining == 0) {
            fee.setStatus("Paid");
        } else if (remaining < fee.getTotalFees()) {
            fee.setStatus("Partial");
        } else {
            fee.setStatus("Pending");
        }

        return feeRepository.save(fee);
    }

    // ============================
    // Update Fee Record
    // ============================
    public Fee updateFee(Fee fee) {

        // Auto update remaining amount
        double remaining = fee.getTotalFees() - fee.getPaidAmount();
        fee.setRemainingAmount(remaining);

        // Auto update status
        if (remaining == 0) {
            fee.setStatus("Paid");
        } else if (remaining < fee.getTotalFees()) {
            fee.setStatus("Partial");
        } else {
            fee.setStatus("Pending");
        }

        return feeRepository.save(fee);
    }

    // ============================
    // Get All Fees
    // ============================
    public List<Fee> getAllFees() {
        return feeRepository.findAll();
    }

    // ============================
    // Get Fee by ID
    // ============================
    public Fee getFeeById(Integer feeId) {
        return feeRepository.findById(feeId).orElse(null);
    }

    // ============================
    // Delete Fee
    // ============================
    public String deleteFee(Integer feeId) {
        feeRepository.deleteById(feeId);
        return "Fee Record Deleted";
    }

    // ============================
    // Search Functions
    // ============================
    public List<Fee> getFeesByPRN(String prnno) {
        return feeRepository.findByPrnno(prnno);
    }

    public List<Fee> getFeesByStudentId(Integer studid) {
        return feeRepository.findByStudid(studid);
    }

    public List<Fee> getFeesByStatus(String status) {
        return feeRepository.findByStatus(status);
    }

    public List<Fee> getFeesByFeeType(String feeType) {
        return feeRepository.findByFeeType(feeType);
    }

    public List<Fee> getFeesByName(String firstname) {
        return feeRepository.findByFirstnameContainingIgnoreCase(firstname);
    }
    public List<Fee> getPendingFees() {
        return feeRepository.findPendingFees();
    }

}
