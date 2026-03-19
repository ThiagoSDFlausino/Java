/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5;

/**
 *
 * @author aluno
 */
public class Pedido {
    private int codigo;
    private String data_pedido;
    private int quantidade;
    private Produto produto;

    public Pedido() {
    }

    public Pedido(int codigo, String data_pedido, int quantidade, Produto produto) {
        this.codigo = codigo;
        this.data_pedido = data_pedido;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}