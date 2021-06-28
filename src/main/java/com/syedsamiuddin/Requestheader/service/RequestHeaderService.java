package com.syedsamiuddin.Requestheader.service;

import com.syedsamiuddin.Requestheader.entity.RequestHeader;

import javax.servlet.http.HttpServletRequest;

public interface RequestHeaderService {
    public RequestHeader getRequestHeader(HttpServletRequest request);
}
