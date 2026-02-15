package com.resale.homeflycustomer.components.profile_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerByIdPurchaseReasonDTO {
    private Integer id;
    private String nameEn;
    private String nameAr;
    private LocalDateTime createdAt;
    private CustomerByIdPurchaseSubReasonDTO subReason;
}
