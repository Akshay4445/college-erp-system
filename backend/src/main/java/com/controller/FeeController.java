package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Fee;
import com.service.FeeService;

@RestController
@CrossOrigin("*")
public class FeeController {

    @Autowired
    private FeeService feeService;

    // ================================
    // Add Fee
    // ================================
    @PostMapping("/addFee")
    public Fee addFee(@RequestBody Fee fee) {
        return feeService.addFee(fee);
    }

    // ================================
    // Update Fee
    // ================================
    @PutMapping("/updateFee")
    public Fee updateFee(@RequestBody Fee fee) {
        return feeService.updateFee(fee);
    }

    // ================================
    // Get Fee by ID
    // ================================
    @GetMapping("/getFeeById")
    public Fee getFeeById(@RequestParam Integer feeId) {
        return feeService.getFeeById(feeId);
    }

    // ================================
    // Get All Fees
    // ================================
    @GetMapping("/getAllFees")
    public List<Fee> getAllFees() {
        return feeService.getAllFees();
    }

    // ================================
    // Delete Fee
    // ================================
    @DeleteMapping("/deleteFee")
    public String deleteFee(@RequestParam Integer feeId) {
        return feeService.deleteFee(feeId);
    }

    // ================================
    // Search by PRN
    // ================================
    @GetMapping("/getFeeByPrn")
    public List<Fee> getFeeByPrn(@RequestParam String prnno) {
        return feeService.getFeesByPRN(prnno);
    }

    // ================================
    // Search by Student ID
    // ================================
    @GetMapping("/getFeeByStudentId")
    public List<Fee> getFeeByStudentId(@RequestParam Integer studid) {
        return feeService.getFeesByStudentId(studid);
    }

    // ================================
    // Search by Fee Type
    // ================================
    @GetMapping("/getFeeByType")
    public List<Fee> getFeeByType(@RequestParam String feeType) {
        return feeService.getFeesByFeeType(feeType);
    }

    // ================================
    // Search by Status
    // ================================
    @GetMapping("/getFeeByStatus")
    public List<Fee> getFeeByStatus(@RequestParam String status) {
        return feeService.getFeesByStatus(status);
    }

    // ================================
    // Search by Student Name
    // ================================
    @GetMapping("/getFeeByName")
    public List<Fee> getFeeByName(@RequestParam String firstname) {
        return feeService.getFeesByName(firstname);
    }
    @GetMapping("/pendingFees")
    public List<Fee> getPendingFees() {
        return feeService.getPendingFees();
    }

}
