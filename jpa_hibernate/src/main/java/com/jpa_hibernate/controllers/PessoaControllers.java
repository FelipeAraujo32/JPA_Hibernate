package com.jpa_hibernate.controllers;

public interface PessoaControllers {
    public void adicionar(Integer id, String nome, String email);
    public void BuscaId(Integer id);
    public void DeleteId(Integer id);
}
