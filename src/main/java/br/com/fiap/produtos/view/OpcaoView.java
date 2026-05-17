package br.com.fiap.produtos.view;

import javax.swing.*;

public class OpcaoView {

    public static Opcao select(){

        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null, //Componente pai. como não temos sera null
                "Selecione uma opção", //Mensagem
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, //icone
                Opcao.values(), //Numero de Opções
                Opcao.CADASTRAR_PRODUTO);


                return ret != null? ret : Opcao.ENCERRAR_SISTEMA;
    }

}
