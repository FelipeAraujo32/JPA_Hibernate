package com.jpa_hibernate.application;

import java.util.Scanner;

import com.jpa_hibernate.repository.PessoaRepository;
import com.jpa_hibernate.repository.PessoaRepositoryImplt;

public class Program {
    public static void main(String[] args) {
        
        PessoaRepository pessoa = new PessoaRepositoryImplt();
        Scanner inputScanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Seja Bem-Vindo ");
            System.out.println("Oque deseja Fazer? ");
            System.out.println("1- Adicionar Dados ");
            System.out.println("2- Buscar Dado pelo ID ");
            System.out.println("3- Exluir Dado pelo ID");
            choice = inputScanner.nextInt();
            if (choice == 1) {
                System.out.println("Qual o Nome? ");  
                String nome = inputScanner.next();
                System.out.println("Qual o email? ");
                String email = inputScanner.next();
                pessoa.adicionar(null, nome, email);
                System.out.println("Dado inserido com sucesso!!!");
                break;}
                
                else if(choice == 2){
                System.out.println("Qual o ID que deseja buscar? ");
                Integer id = inputScanner.nextInt();
                pessoa.BuscaId(id);}

                else if(choice == 3){
                System.out.println("Qual o ID que deseja exluir? ");
                Integer idexcluir = inputScanner.nextInt();
                pessoa.DeleteId(idexcluir);
                System.out.println("Dados excluído com sucesso!!! ");}
            } 
        }
       

    }

