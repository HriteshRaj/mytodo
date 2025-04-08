package com.hritesh.todo.mytodo.repository;


import com.hritesh.todo.mytodo.model.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TodoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(Todo todo){
        entityManager.persist(todo);



    }

    public List<Todo> getAllTodo(){
        TypedQuery<Todo> typedQuery = entityManager.createQuery("from Todo",Todo.class);
        return typedQuery.getResultList();
    }

    @Transactional
    public void updateTodo(Todo todo){
        entityManager.merge(todo);
    }

    public Optional<Todo> findTodoById(Long id){

        Todo todo = entityManager.find(Todo.class,id);
        return Optional.ofNullable(todo);
    }





}
