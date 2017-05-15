/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.component;

import com.udemy.repository.LogRepository;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author AlejandroThalamus
 */
@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    @Qualifier("logRepository")
    private LogRepository logRepository;

    private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);
//primero

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("starTime", System.currentTimeMillis());
        return true;
    }

//segundo
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        long startTime = (long) request.getAttribute("starTime");
        String url = request.getRequestURL().toString();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = "";
        try {
            if (auth != null && auth.isAuthenticated()) {
                username = auth.getName();

            }

            logRepository.save(new com.udemy.entity.Log(new Date(), auth.getDetails().toString(), username, url));
            LOG.info("Url to: '" + url + "' in: '" + (System.currentTimeMillis() - startTime) + "'ms");
        } catch (Exception e) {
            System.out.println(">> afterCompletion: Error");
        }
    }

}
