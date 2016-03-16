package com.endava.siv5l.userdetails;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by siv5l on 3/16/16.
 */
public class DisplayNameBeanPostProccesor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("in after intiialization method, bean name is " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("in before intiialization method, bean name is " + beanName);
        return bean;
    }
}
