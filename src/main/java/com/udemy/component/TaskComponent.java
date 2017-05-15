/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.component;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author AlejandroThalamus
 */
@Component("taskComponent")
public class TaskComponent {
    private static final Log LOG = LogFactory.getLog(TaskComponent.class);
    
//    @Scheduled(fixedDelay = 5000)
//    public void doTasck(){
//        LOG.info("TIME IS: "+ new Date());
//    }
}
