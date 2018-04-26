package com.it.jms;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jms.core.JmsTemplate;

import java.util.List;

/**
 * @author huangchangling on 2017/10/25 0025
 */
public class TopicMessageProducer {
    private static final Log log = LogFactory.getLog(TopicMessageProducer.class);
    private JmsTemplate template;
    private String destination;

    public void setDestinationNames(List<String> destinationNames) {
        this.destinationNames = destinationNames;
    }

    List<String> destinationNames;
    public TopicMessageProducer() {
    }

    public void sendMsg(Message msg) {
        log.info(msg);
        System.out.println(destinationNames.get(0));
        String[] queues = MessageProtector.getInstance().getQueues(this.destination);
        String newDestinationQs = queues[0];
        System.out.println("send----------------------->"+msg.toString());
        this.template.convertAndSend(newDestinationQs, msg);
        }
    public void setTemplate(JmsTemplate template) {
        this.template = template;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
