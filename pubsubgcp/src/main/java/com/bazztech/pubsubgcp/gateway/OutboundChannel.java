package com.bazztech.pubsubgcp.gateway;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;

/**
 * @author bazz
 * Oct 14 2023
 * 23:19
 */

@MessagingGateway(name = "myPubSubGateWay", defaultRequestChannel = "outboundMessageChannel")
public interface OutboundChannel {

    void sendMessageToPubSub(String msg);
}
