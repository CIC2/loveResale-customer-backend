package com.resale.homeflycustomer.components.profile_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForgetPasswordRequestDTO {
    private String mail;
    private String phone;
}
