package br.com.fiap.produtos;

import br.com.fiap.produtos.Model.Categoria;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;
import br.com.fiap.produtos.view.CategoriaView;
import br.com.fiap.produtos.view.Opcao;
import br.com.fiap.produtos.view.OpcaoView;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Opcao opcao = null;

        do {
            opcao = OpcaoView.select();
            switch(opcao){
                case CADASTRAR_CATEGORIA -> cadastrarCategoria();
                case CADASTRAR_PRODUTO -> cadastrarProduto();
                case CONSULTAR_PRODUTO_POR_ID -> consultarProdutoPorId();
                case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarProdutoPorCategoria();
                case ENCERRAR_SISTEMA -> encerrarSistema();
            }

        }while (opcao != opcao.ENCERRAR_SISTEMA);

        }

    private static void encerrarSistema() {
        System.exit(0);
    }

    private static void consultarProdutoPorCategoria() {


    }

    private static void consultarProdutoPorId() {
    }

    private static void cadastrarProduto() {

    }

    private static void cadastrarCategoria() {

        CategoriaView view = new CategoriaView();
        Categoria categoria = view.form();
        CategoriaCollectionRepository.save(categoria);
        view.sucesso(categoria);


    }

}
