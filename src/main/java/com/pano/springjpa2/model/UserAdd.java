package com.pano.springjpa2.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAdd {
    private String firstName;
    private String lastName;
    private String emailId;
}
