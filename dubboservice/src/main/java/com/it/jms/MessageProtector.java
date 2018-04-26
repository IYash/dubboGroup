package com.it.jms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huangchangling on 2017/10/25 0025
 */
public class MessageProtector {
    private static final Log log = LogFactory.getLog(MessageProtector.class);
    private static MessageProtector instance;
    private final Map<String, String[]> topicMap = new HashMap();

    public MessageProtector() {
    }

    private void init() {
        String[] activeMqSellPackageDone = new String[]{"ActiveMQ.TEST.test"};
        this.topicMap.put("ActiveMQ.TEST", activeMqSellPackageDone);
    }

    public static MessageProtector getInstance() {
        if(instance == null) {
            MessageProtector protector = new MessageProtector();
            protector.init();
            instance = protector;
        }

        return instance;
    }
    public String[] getQueues(String topic) {
        return (String[])this.topicMap.get(topic);
    }




}
