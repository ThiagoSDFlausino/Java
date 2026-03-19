/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;

/**
 *
 * @author aluno
 */
public class Pj extends Pessoa {
    private int cnpj;
    private String razao;

    public Pj() {
    }

    public Pj(int cnpj, String razao, String nome, int idade) {
        super(nome, idade);
        this.cnpj = cnpj;
        this.razao = razao;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }
    
    
}
