package com.resale.homeflycustomer.components.profile_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerByIdPurchaseSubReasonDTO {
        private Integer id;
        private String nameEn;
        private String nameAr;
}
