package com.resale.homeflycustomer.components.profile_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResetPasswordRequestDTO {
    private String identifier; // phone or email
    private String countryCode;
    }


