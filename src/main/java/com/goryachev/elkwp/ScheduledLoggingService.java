package com.goryachev.elkwp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Сервис генерит логи
 * @author Lev Goryachev
 */

@Service
public class ScheduledLoggingService {

    @Scheduled(fixedDelay = 2000)
    public void generateSimpleLogs() throws InterruptedException {

        Logger logger = LoggerFactory.getLogger(ScheduledLoggingService.class);
        logger.info("hello logs - info");
        Thread.sleep(1000);
        logger.debug("hello logs - debug");
        Thread.sleep(1000);
        logger.warn("hello logs - warn!");
        Thread.sleep(1000);
        logger.error("hello logs - error!");
        Thread.sleep(4000);
    }
}
