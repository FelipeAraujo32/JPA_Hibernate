package com.jpa_hibernate.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa_hibernate.entities.Pessoa;

public class PessoaControllersImplt implements PessoaControllers {
    
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-hibernate");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    

    //Métado para adicionar informações ao DB
    @Override
    public void adicionar(Integer id, String nome, String email){
        Pessoa pessoa = new Pessoa(id, nome, email);
        entityManager.getTransaction().begin();
        entityManager.persist(pessoa);
        entityManager.getTransaction().commit();
        
    }

    //Métado para realizar busca por ID
    @Override
    public void BuscaId(Integer id){
        Pessoa pessoa = entityManager.find(Pessoa.class, id);
        System.out.println(pessoa);
    
    }

    //Métado para excluir por ID
    @Override
    public void DeleteId(Integer id){
        entityManager.getTransaction().begin();
        Pessoa pessoa = entityManager.find(Pessoa.class, id);
        entityManager.remove(pessoa);
        entityManager.getTransaction().commit();
        
    }



   

}
