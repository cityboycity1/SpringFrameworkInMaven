package com.endava.siv5l.userdetails;

/**
 * Created by siv5l on 3/16/16.
 */
public class GuestService implements User {

    private User accountThree;

    public User getUserThree() {
        return accountThree;
    }

    public void setUserThree(User userThree) {
        this.accountThree = userThree;
    }

    public void showDetails() {
       accountThree.showDetails();
    }
}
