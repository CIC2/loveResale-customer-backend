package com.resale.homeflycustomer.components.auth.dto.otp;

import lombok.Data;

@Data
public class VerifyOtpRequestDTO {
    private String countryCode;
    private String mobile;
    private String otp;
}
