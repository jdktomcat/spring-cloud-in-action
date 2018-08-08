package com.jdktomcat;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jdktomcat
 * @create 2016/12/11.
 * @blog http://blog.jdktomcat.com
 */
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {

    private String root;
    private Integer interval;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
