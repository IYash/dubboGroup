package com.it.jms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangchangling on 2017/10/25 0025
 */
public class TopicMessageConsumer {
    private static final Log log = LogFactory
            .getLog(TopicMessageConsumer.class);

    //private List<MessageProcesser> processerList = new ArrayList<MessageProcesser>();

    private String destName;

    public void receive(Message m) {
        System.out.println("receive---------------------------->"+m.toString());
    }



   /* public void setProcesserList(List<MessageProcesser> processerList) {
        this.processerList = processerList;
    }*/

    public void setDestName(String destName) {
        this.destName = destName;
    }

}
