package com.eg.yafi;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {

    @WebMethod
    public String tryme() {
        return "aferin la cagardin";
    }
}
