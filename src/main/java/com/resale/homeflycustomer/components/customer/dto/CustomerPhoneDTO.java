package com.resale.homeflycustomer.components.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerPhoneDTO {
    private Long customerId;
    private String phoneNumber;
}
