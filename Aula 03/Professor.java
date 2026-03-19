/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula3;

/**
 *
 * @author aluno
 */
public class Professor extends Pessoa {
    private double salario;
    private String formacao;
    private String area;

    public Professor() {
    }

    public Professor(double salario, String formacao, String area, String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura); // "instancia" Pessoa
        //this.nome = nome;
        //this.idade = idade;
        //this.peso = peso;
        //this.altura = altura;
        
        this.salario = salario;
        this.formacao = formacao;
        this.area = area;
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
    
}
