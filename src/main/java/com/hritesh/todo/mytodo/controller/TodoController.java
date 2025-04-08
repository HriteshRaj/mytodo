package com.hritesh.todo.mytodo.controller;


import com.hritesh.todo.mytodo.model.Todo;
import com.hritesh.todo.mytodo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    private final TodoService todoService;
    //constructor injection
    public TodoController(TodoService todoService){
        this.todoService= todoService;
    }
    @RequestMapping(value = "/addtodo",method = RequestMethod.POST)
    public String createTodo(@ModelAttribute Todo todo){
        todoService.createTodo(todo);
        return "redirect:/";

    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage() {
        return "todohomepage"; // must match the name of your HTML file (without `.html`)
    }












}
