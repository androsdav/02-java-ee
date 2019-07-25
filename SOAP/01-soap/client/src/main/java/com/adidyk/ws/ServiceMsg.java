package com.adidyk.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Interface Service.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ServiceMsg {

    /**
     * getMsg - returns message.
     * @param name - name message.
     * @return - returns string message.
     */
    @WebMethod
    String getMsg(String name);

}