package com.endava.siv5l.userdetails;

/**
 * Created by siv5l on 3/15/16.
 */
public class UserService implements User{

    private User userOne;
    private User userTwo;


    public User getUserOne() {
        return userOne;
    }

    public void setUserOne(User userOne) {
        this.userOne = userOne;
    }

    public User getUserTwo() {
        return userTwo;
    }

    public void setUserTwo(User userTwo) {
        this.userTwo = userTwo;
    }

    public void showDetails(){
        userOne.showDetails();
        userTwo.showDetails();
    }
}
