package com.adidyk.client;


import com.adidyk.ws.ServiceMsg;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class WebServiceClient.
 */
public class WebServiceClient {

    /**
     * main - just main.
     * @param arg - arg.
     */
    public static void main(String[] arg) throws MalformedURLException {
        URL url = new URL("http://localhost:1986/ws/service?wsdl");
        QName qName = new QName("http://ws.adidyk.com/", "ServiceMsgImplService");
        Service service = Service.create(url, qName);
        ServiceMsg msg = service.getPort(ServiceMsg.class);
        System.out.println(msg.getMsg("ANDROS"));


    }


}
