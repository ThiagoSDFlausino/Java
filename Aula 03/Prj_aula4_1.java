/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Aula3;

/**
 *
 * @author aluno
 */
public class Prj_aula4_1 {

    public static void main(String[] args) {
        /*Professor oProfessor = new Professor(1000.90, "ECA","Exatas", "João", 30, 80, 1.80); 
        Aluno oAluno = new Aluno(1000,true, "José", 20, 85, 1.90);
        
        System.out.println("==== PROFESSOR =====");
        System.out.println("Nome: " + oProfessor.getNome());
        System.out.println("Salário: " + oProfessor.getSalario());
        
        System.out.println("==== ALUNO =====");
        System.out.println("Nome: " + oAluno.getNome());
        System.out.println("Matricula: " + oAluno.getMatricula());
        
        String bolsista = ((oAluno.isBolsista() == true) ? "Sim" : "Não");
        System.out.println("Bolsista: " + bolsista);*/
        
        Pessoa oPessoa = new Professor(1000.90, "ECA","Exatas", "João", 30, 80, 1.80); 
        
        oPessoa = new Aluno(1000,true, "José", 20, 85, 1.90);
        
        System.out.println("Nome: " + oPessoa.getNome());
        if (oPessoa instanceof Aluno) {
            // Converte o objeto generico oPessoa para Aluno
            Aluno oAluno = (Aluno)oPessoa;
            System.out.println("==== ALUNO =====");       
            System.out.println("Matricula: " + oAluno.getMatricula());
            //System.out.println("Matricula: " + ((Aluno) oPessoa).getMatricula());
        
            String bolsista = ((oAluno.isBolsista() == true) ? "Sim" : "Não");
            System.out.println("Bolsista: " + bolsista);
        } else {
            // Converte o objeto generico oPessoa para Professor
            Professor oProfessor = (Professor)oPessoa;
            System.out.println("==== PROFESSOR =====");
            System.out.println("Salário: " + oProfessor.getSalario());
        }
        
        
    }
}
