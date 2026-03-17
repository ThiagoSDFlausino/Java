/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula1;



/**
 *
 * @author aluno
 */
public class Pessoa {
    //atributos
    private String nome;
    private double peso;
    private double altura;
    
    
    // Métodos construtores
    public Pessoa() {
        
    }
    
    public Pessoa(String pNome, double pPeso, double pAltura) {
        this.nome = pNome;
        this.peso = pPeso;
        this.altura = pAltura;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String pNome) {
       this.nome = pNome; 
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(double pPeso) {
        this.peso = pPeso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método customizado
    public double getIMC() {
        double imc = this.peso/(this.altura*this.altura);
        
        return imc;
    }
}
