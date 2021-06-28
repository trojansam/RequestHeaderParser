package com.syedsamiuddin.Requestheader.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestHeader {

    private String ipaddress;
    private String language;
    private String software;
}
