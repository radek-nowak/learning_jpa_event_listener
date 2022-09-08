package com.example.learning_jpa_event_listener.entitylistener;

import com.example.learning_jpa_event_listener.user.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class UserListener {

    private static Log log = LogFactory.getLog(UserListener.class);

    @PostPersist
    private void beforeUserRegister(User user) {
        log.info(String.format("Registering new user with ID: %d.", user.getId()));
    }

    @PostUpdate
    private void afterUserUpdate(User user) {
        log.info(user.toString());
    }

}
