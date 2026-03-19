/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Aula2;

/**
 *
 * @author aluno
 */
public class Prj_aula3_1 {

    public static void main(String[] args) {
        //Curso oCurso = new Curso(10, "BCC", "Exatas");
        //Disciplina oDisciplina = new Disciplina(100, "SLTLIP1", "Linguagem de Programação 1", false, oCurso);        
        //Disciplina oDisciplina = new Disciplina(100, "SLTLIP1", "Linguagem de Programação 1", false, new Curso(10, "ADS", "Exatas"));
        
        Curso oCurso = new Curso();
        Disciplina oDisciplina = new Disciplina();
        
        oDisciplina.setCurso(oCurso);
        
        oDisciplina.setCodigo(100);
        oDisciplina.setSigla("SLTLIP1");
        oDisciplina.setNome("Linguagem de Programação 1");
        oDisciplina.setEletiva(false);
        
        oDisciplina.getCurso().setCodigo(10);
        oDisciplina.getCurso().setNome("ADS");
        oDisciplina.getCurso().setArea("Exatas");
        
        
        
        //oDisciplina.setCurso(oCurso1);
        
        System.out.println("==== DISCIPLINA ====");
        System.out.println("Codigo: " + oDisciplina.getCodigo());
        System.out.println("Sigla: " + oDisciplina.getSigla());
        System.out.println("Nome: " + oDisciplina.getNome());
        
        String ele = ((oDisciplina.isEletiva() == true) ? "Sim" : "Não");
        System.out.println("Eletiva: " + ele);
        
        System.out.println("==== CURSO ====");
        System.out.println("\t Código: " + oDisciplina.getCurso().getCodigo());
        System.out.println("\t Nome: " + oDisciplina.getCurso().getNome());
        System.out.println("\t Área: " + oDisciplina.getCurso().getArea());
    }
}
