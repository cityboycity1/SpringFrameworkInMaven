package com.endava.siv5l.userdetails;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by siv5l on 3/15/16.
 */
public class UserAccount implements User{
                                        //implements InitializingBean, DisposableBean
    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void showDetails(){
        System.out.println("firstname: " + firstName + " ,lastName: " + lastName);
    }

    /*public void destroy() throws Exception {
        System.out.println("destroyng bean");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializind a bean");
    } */
}
