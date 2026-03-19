/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula3;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa {
    private int matricula;
    private boolean bolsista;

    public Aluno() {
    }

    public Aluno(int matricula, boolean bolsista, String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
        this.matricula = matricula;
        this.bolsista = bolsista;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }
    
    
}
