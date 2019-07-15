package xenon.learnprogramming.service;

import org.springframework.stereotype.Service;

// Service layers holds the business logic. They provide the business service to other layers

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this demo application";
    }
}
