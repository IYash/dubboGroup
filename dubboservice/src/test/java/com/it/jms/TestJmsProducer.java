package com.it.jms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author huangchangling on 2017/10/25 0025
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJmsProducer {
    @Autowired
    private TopicMessageProducer testMessageProducer;
    @Test
    public void testProduce(){
        Message message = new Message(1l,"hello-jms","world-jms");
        testMessageProducer.sendMsg(message);
    }
}
