package com.syedsamiuddin.Requestheader.controller;

import com.syedsamiuddin.Requestheader.entity.RequestHeader;
import com.syedsamiuddin.Requestheader.service.RequestHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RequestHeaderController {

    @Autowired
    private RequestHeaderService requestHeaderService;

    @GetMapping("/api/whoami")
    public RequestHeader getRequestHeader(HttpServletRequest request){
        return requestHeaderService.getRequestHeader(request);
    }
}
