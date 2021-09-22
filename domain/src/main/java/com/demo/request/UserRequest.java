package com.demo.request;


import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class UserRequest {

    private String userName;
    private String mobileNumber;


}
