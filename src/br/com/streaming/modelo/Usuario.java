package br.com.streaming.modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private ArrayList<Conteudo> favoritos;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.favoritos = new ArrayList<>();
    }

    public void adicionarFavorito(Conteudo conteudo) {
        favoritos.add(conteudo);
        System.out.println("Conteúdo adicionado aos favoritos: " + conteudo.getTitulo());
    }

    public void listarFavoritos() {
        System.out.println("Favoritos de " + nome + ":");
        if (favoritos.isEmpty()) {
            System.out.println("Nenhum conteúdo favoritado ainda.");
        } else {
            for (Conteudo conteudo : favoritos) {
                System.out.println("- " + conteudo.getTitulo());
            }
        }
    }

    public void reproduzirConteudo(Conteudo conteudo) {
        if (conteudo.getClassificacaoIndicativa() <= 18) { // Simulando verificação de idade
            conteudo.reproduzir();
        } else {
            System.out.println("Conteúdo não permitido para menores de 18 anos.");
        }
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

    public ArrayList<Conteudo> getFavoritos() { 
        return favoritos; 
    }
}