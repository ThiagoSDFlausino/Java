/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;

/**
 *
 * @author aluno
 */
public class Disciplina {
    private int codigo;
    private String sigla;
    private String nome;
    private boolean eletiva;
    private Curso curso; //atributo associativo

    public Disciplina() {
    }

    public Disciplina(int codigo, String sigla, String nome, boolean eletiva, Curso curso) {
        this.codigo = codigo;
        this.sigla = sigla;
        this.nome = nome;
        this.eletiva = eletiva;
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEletiva() {
        return eletiva;
    }

    public void setEletiva(boolean eletiva) {
        this.eletiva = eletiva;
    }
    
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
