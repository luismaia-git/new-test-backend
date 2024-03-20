package com.luismaia.desafioanotaai.services.aws;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.Topic;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AwsSnsService {
    private final AmazonSNS snsClient;

    @Qualifier("catalogEventsTopic")
    private final Topic catalogTopic;

    /*
    public AwsSnsService(AmazonSNS snsClient, Topic catalogTopic ){
        this.snsClient = snsClient;
        this.catalogTopic = catalogTopic;
    }*/

    public void publish(MessageDTO messageDTO){
        System.out.println(messageDTO.message());
        this.snsClient.publish(catalogTopic.getTopicArn(), messageDTO.message());
    }
}
