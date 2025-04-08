package com.hritesh.todo.mytodo.repository;


import com.hritesh.todo.mytodo.model.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(Todo todo){
        entityManager.persist(todo);



    }






}
