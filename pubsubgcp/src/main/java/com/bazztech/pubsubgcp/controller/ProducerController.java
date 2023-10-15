package com.bazztech.pubsubgcp.controller;

import com.bazztech.pubsubgcp.gateway.OutboundChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bazz
 * Oct 14 2023
 * 23:17
 */

@RequiredArgsConstructor
@RestController
@Slf4j
public class ProducerController {

    private final OutboundChannel messagingGateway;


    @PostMapping("publish-message")
    public String publishMessage(@RequestBody String message){
        log.info("Sending Message....");
        messagingGateway.sendMessageToPubSub(message);
        return "Sent!";
    }
}
