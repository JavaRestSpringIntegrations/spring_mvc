package xenon.learnprogramming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import xenon.learnprogramming.model.TodoData;
import xenon.learnprogramming.util.Mappings;
import xenon.learnprogramming.util.ViewNames;

@Controller
public class TodoItemController {

    // == model attribute section ==
    @ModelAttribute
    public TodoData todoData() {
        return new TodoData();
    }

    // == handler methods ==
    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}
