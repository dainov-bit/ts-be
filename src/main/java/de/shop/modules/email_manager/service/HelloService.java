package de.shop.modules.email_manager.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String myname(String name) {
    return "My name "+name;
    }
}
