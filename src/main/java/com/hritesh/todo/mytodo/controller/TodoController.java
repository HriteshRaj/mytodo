package com.hritesh.todo.mytodo.controller;


import com.hritesh.todo.mytodo.model.Todo;
import com.hritesh.todo.mytodo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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


    @RequestMapping(value = "/",method=RequestMethod.GET)
    public String getAllTodo(Model model){
       List<Todo> todoList = todoService.getAllTodo();
        model.addAttribute("todoList",todoList);

        return "todohomepage";

    }


    @RequestMapping(value = "/updatetodo/{id}",method = RequestMethod.POST)

    public String updateTodo(@PathVariable("id")Long id,@ModelAttribute Todo todo){
        todoService.updateTodo(id,todo);
        return "redirect:/";

    }

    @RequestMapping("/deletetodo/{id}")
    public String deleteTodo(@PathVariable("id")Long id){
        todoService.deleteTodo(id);
        return "redirect:/";
    }












}
