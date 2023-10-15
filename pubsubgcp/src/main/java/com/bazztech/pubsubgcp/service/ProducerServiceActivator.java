package com.bazztech.pubsubgcp.service;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import com.google.cloud.spring.pubsub.integration.outbound.PubSubMessageHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

/**
 * @author bazz
 * Oct 14 2023
 * 23:35
 */

@Component
public class ProducerServiceActivator {

    @Bean
    @ServiceActivator(inputChannel = "outboundMessageChannel")
    public PubSubMessageHandler messageSender(PubSubTemplate pubSubTemplate){
        return new PubSubMessageHandler(pubSubTemplate,"springboot-producer");
    }
}
