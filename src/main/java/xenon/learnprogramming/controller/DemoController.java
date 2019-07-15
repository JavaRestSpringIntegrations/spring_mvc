package xenon.learnprogramming.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import xenon.learnprogramming.service.DemoService;

@Slf4j
@Controller
public class DemoController {

    // == fields ==
    private final DemoService demoService;

    // == constructors ==
    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    // == request methods ==

    // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080/todo-list/welcome
    // prefix + name + suffix
    // /WEB-INF/view/welcome.jsp
    @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("helloMessage",demoService.getHelloMessage("Sunil")); // k,v pair
        log.info("model={}",model);

        return "welcome"; // this is logical view name ( name of the jsp file )
    }

    // == model attributes ==
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage called");
        return demoService.getWelcomeMessage();
    }

    @ModelAttribute("wishMessage")
    public String wishMesssage() {
        log.info("wishMesssage called");
        return "Wish you all success";
    }
}
