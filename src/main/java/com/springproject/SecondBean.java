package com.springproject;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {
    public String userName() {
        return "username: Ilya";
    }
}
