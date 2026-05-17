package br.com.fiap.produtos.view;

import br.com.fiap.produtos.Model.Categoria;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;
import javax.swing.*;

public class CategoriaView {

    static CategoriaCollectionRepository repository;

    public static Categoria select(Categoria categoria){
        //@formater:off
        Categoria ret = (Categoria) JOptionPane.showInputDialog(
                null,
                "Selecione a categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                repository.findAll().toArray(),
                categoria == null ? 1: categoria);
        return ret;
        //@formater:on


    }
        public void sucesso(){
            JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!");
        }

        public void sucesso(Categoria categoria){
        JOptionPane.showMessageDialog(null, "Categoria " +categoria.getNome() +" cadastrada com sucesso!");
    }

        public static Categoria form (){
        String nome = JOptionPane.showInputDialog(null,"Informe o nome da Categoria");
        return new Categoria(nome);
        }

    }
