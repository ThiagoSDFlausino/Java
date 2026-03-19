/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Aula4;

import java.util.Scanner;

public class Prj_aula4_2 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       Pessoa oPessoa = new Pessoa();  
       
       System.out.println("Informe o tipo da pessoa (0=PJ e 1=PF)");
       int tipo = ler.nextInt();
       
       ler.nextLine();
       if (tipo == 0) {
           Pj oPj = new Pj();
        
           System.out.println("Informe o nome da pessoa");
           oPj.setNome(ler.nextLine());
       
           System.out.println("Informe a idade da pessoa");
           oPj.setIdade(ler.nextInt());
           
           System.out.println("Informe o cnpj");
           oPj.setCnpj(ler.nextInt());
           
           ler.nextLine();
           
           System.out.println("Informe a razão social");
           oPj.setRazao(ler.nextLine());
               
           oPessoa = (Pessoa)oPj; 
       } else {
           Pf oPf = new Pf();
           System.out.println("Informe o nome da pessoa");
           oPf.setNome(ler.nextLine());
       
           System.out.println("Informe a idade da pessoa");
           oPf.setIdade(ler.nextInt());
           
           System.out.println("Informe o cpf da pessoa");
           oPf.setCpf(ler.nextInt());
           
           System.out.println("Informe se e cliente especial (0/1)");
           oPf.setEspecial((ler.nextInt() == 1) ? true : false);
           
           oPessoa = (Pessoa)oPf;           
       }
       
       System.out.println("Informe o numero da conta");
       int numero = ler.nextInt();
       
       ler.nextLine();
       
       System.out.println("Informe o tipo da conta");
       String tipo_conta = ler.nextLine();
       
       System.out.println("Informe o saldo");
       double saldo = ler.nextDouble();
       
       Conta oConta = new Conta(numero,tipo_conta, saldo, oPessoa);
       
       System.out.println("Rendimento: " + oConta.getRendimento());       
       
    }
}
