package com.example.AddressBookApp.dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;

}