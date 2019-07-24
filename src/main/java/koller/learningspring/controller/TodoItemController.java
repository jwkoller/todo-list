package koller.learningspring.controller;

import koller.learningspring.Model.TodoData;
import koller.learningspring.Service.TodoItemService;
import koller.learningspring.Util.Mappings;
import koller.learningspring.Util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {

    private TodoItemService todoItemService;

    //-- Constructors --
    @Autowired
    public TodoItemController(TodoItemService todoItemService){
        this.todoItemService = todoItemService;
    }

    //-- Model Attribute --
    @ModelAttribute
    public TodoData todoData(){
        return todoItemService.getData();
    }

    //-- Handler methods --
    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
