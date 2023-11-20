package com.jpa_hibernate.repository;

public interface PessoaRepository {
    public void adicionar(Integer id, String nome, String email);
    public void BuscaId(Integer id);
    public void DeleteId(Integer id);
}
