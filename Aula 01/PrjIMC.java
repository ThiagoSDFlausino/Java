/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Aula1;

/**
 *
 * @author aluno
 */
public class PrjIMC {

    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");*/
        /*
        Pessoa oPessoa = new Pessoa("José", 80, 1.80);
        
        System.out.println("Nome: " + oPessoa.getNome());
        System.out.println("Peso: " + oPessoa.getPeso());
        System.out.println("Altura: " + oPessoa.getAltura());
        */
        
        Pessoa oPessoa = new Pessoa();
        //oPessoa.setNome("José");
        oPessoa.setPeso(80);
        oPessoa.setAltura(1.8);
        
        Pessoa oPessoa2 = new Pessoa();
        //oPessoa.setNome("José");
        oPessoa2.setPeso(85);
        oPessoa2.setAltura(1.7);
        
        System.out.println("Peso:" + oPessoa2.getPeso());
        System.out.println("IMC:" + oPessoa2.getIMC());
        
    }
}
