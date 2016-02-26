package com.becomejavasenior.mvc.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public enum Role {
    ADMIN("ADMIN"),

    CLIENT("CLIENT"),

    PAYMASTER("PAYMASTER"),

    DEFAULT("DEFAULT");

/*
    URLPATTERN("/Admin","/Client","/Paymaster");
*/

    static final Logger logger = LogManager.getRootLogger();
    private String role;

    Role(String role) {
        this.role = role;
    }

    public static Role fromString(String role) {
        if (role != null) {
            logger.info("Заходим в метод");
            for (Role ro : Role.values()) {

                if (role.equalsIgnoreCase(ro.toString())) {
                    return ro;
                }
                logger.info("Перебираем значения");
            }
        }
          return DEFAULT;
    }

    @Override
    public String toString() {
        return role;
    }

}
