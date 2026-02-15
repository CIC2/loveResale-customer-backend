package com.resale.homeflycustomer.components.auth.dto.otp;

import lombok.Data;

@Data
public class SendOtpRequestDTO {
    private String countryCode;
    private String mobile;
}
