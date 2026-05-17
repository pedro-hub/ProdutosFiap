package br.com.fiap.produtos.Model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Produto {

    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    private LocalDate dataCadastro;

    private Categoria categoria;


    public Produto() {
    }

    public Produto(Long id, Categoria categoria, LocalDate dataCadastro, BigDecimal preco, String descricao, String nome) {
        this.setId(id);
        this.setCategoria(categoria);
        this.setDataCadastro(dataCadastro);
        this.setPreco(preco);
        this.setDescricao(descricao);
        this.setNome(nome);
    }

    public Produto(String nome, String descricao, BigDecimal preco, LocalDate dataCadastro, Categoria categoria) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDataCadastro(dataCadastro);
        this.setCategoria(categoria);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return nome.toUpperCase();
    }
}
