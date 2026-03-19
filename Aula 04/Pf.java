/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;

/**
 *
 * @author aluno
 */
public class Pf extends Pessoa {
    private int cpf;
    private boolean especial;

    public Pf() {
    }

    public Pf(int cpf, boolean especial, String nome, int idade) {
        super(nome, idade);
        this.cpf = cpf;
        this.especial = especial;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
    
}
