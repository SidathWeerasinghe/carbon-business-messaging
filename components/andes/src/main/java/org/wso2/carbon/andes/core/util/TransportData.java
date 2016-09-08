package org.wso2.carbon.andes.core.util;

public class TransportData {


    public String amqpHost;
    public String amqpPort;



    public TransportData(String amqpHost, String amqpPort) {
        this.amqpHost = amqpHost;
        this.amqpPort = amqpPort;
    }

    public String getAmqpHost() {
        return amqpHost;
    }

    public void setAmqpHost(String amqpHost) {
        this.amqpHost = amqpHost;
    }

    public String getAmqpPort() {
        return amqpPort;
    }

    public void setAmqpPort(String amqpPort) {
        this.amqpPort = amqpPort;
    }

}
