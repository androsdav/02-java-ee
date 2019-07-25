package com.adidyk.ws;

import javax.jws.WebService;

/**
 * Class ServiceImpl.
 */
@WebService(endpointInterface = "com.adidyk.ws.ServiceMsg")
public class ServiceMsgImpl implements ServiceMsg {

    /**
     * getMsg - returns message.
     * @param name - name message.
     * @return - returns string message.
     */
    @Override
    public String getMsg(String name) {
        return "Returns message name: " + name;
    }
}
