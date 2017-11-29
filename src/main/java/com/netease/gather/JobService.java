package com.netease.gather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Description: Created with IntelliJ IDEA.
 * @Author: zhouwen
 * @Date: 2017/11/29 22:07
 */
@Service("jobService")
public class JobService {

    private static final Logger logger = LoggerFactory.getLogger(JobService.class);


    public void processJob() {
        logger.info("start to process job...");
    }
}
