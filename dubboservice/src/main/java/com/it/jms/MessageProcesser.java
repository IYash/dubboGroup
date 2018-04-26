package com.it.jms;

/**
 * @author huangchangling on 2017/10/25 0025
 */
public interface MessageProcesser {
    void process(Message msg);
}
