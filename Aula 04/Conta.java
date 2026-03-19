/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;

/**
 *
 * @author aluno
 */
public class Conta {
    private int numero;
    private String tipo;
    private double saldo;
    private Pessoa pessoa;

    public Conta(int numero, String tipo, double saldo, Pessoa pessoa) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.pessoa = pessoa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    // O rendimento irá variar de acordo com o tipo de pessoa
    // e, para pessoa fisica, se ela é especial
    public double getRendimento() {
        if (this.pessoa instanceof Pj) {
            return 1.1*this.saldo;
        } else {
            Pf opf = (Pf)this.pessoa;
            return ((opf.isEspecial() == true) ? 1.2*this.saldo : 1.05*this.saldo);          
        }
    }
    
    
}
