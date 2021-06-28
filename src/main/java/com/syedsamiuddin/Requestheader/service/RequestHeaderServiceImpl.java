package com.syedsamiuddin.Requestheader.service;

import com.syedsamiuddin.Requestheader.entity.RequestHeader;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;


@Service
public class RequestHeaderServiceImpl implements RequestHeaderService{



    @Override
    public RequestHeader getRequestHeader(HttpServletRequest request) {

        String language = request.getHeader("Accept-Language");
        String userAgent = request.getHeader("User-Agent");

        String ip = request.getHeader("X-FORWARDED-FOR");
        if(ip == null || ip.isEmpty()){
            ip = request.getRemoteAddr();
        }

        return new RequestHeader(ip,language, userAgent);

    }
}
