package com.example.ifpb.asyncteskjson;

import android.text.Editable;

/**
 * Created by IFPB on 07/10/2016.
 */
public class Pessoa {

    private String nome;
    private String email;
    private String endereco;
    private String cpf;

    public Pessoa(String nome, String email, String endereco, String cpf){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
