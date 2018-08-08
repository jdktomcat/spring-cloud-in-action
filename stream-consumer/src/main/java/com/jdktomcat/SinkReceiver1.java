package com.jdktomcat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 快速入门
 *
 * @author jdktomcat
 * @create 2016/11/8.
 * @blog http://blog.jdktomcat.com
 */
//@EnableBinding(value = {Sink.class})
public class SinkReceiver1 {

    private static Logger logger = LoggerFactory.getLogger(HelloApplication.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("Received: " + payload);
    }

}
