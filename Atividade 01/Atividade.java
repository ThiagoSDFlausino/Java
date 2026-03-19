/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Aula5;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Atividade {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      Produto oProduto = new Produto();
      
      System.out.println("Informe o tipo de Produto: ");
      int tipo = ler.nextInt();
      
       ler.nextLine();
       if (tipo == 0) {
           Perecivel oPerecivel = new Perecivel();
        
           System.out.println("Informe o nome da pessoa");
           oPerecivel.setData_validade(ler.nextLine());
       
           System.out.println("Informe a idade da pessoa");
           oPerecivel.setCidade_origem(ler.nextLine());
           
           ler.nextLine();
               
           oProduto = (Produto)oPerecivel; 
       } else {
           Permanente oPermanente = new Permanente();
        
           System.out.println("Informe o percentual de desvalorização ");
           oPermanente.setPerc_desvalorizacao(ler.nextDouble());
       
           System.out.println("ta no escritorio");
           oPermanente.setEscritorio((ler.nextInt()==1) ? true : false);
           
           ler.nextLine();     
               
           oProduto = (Produto)oPermanente;

        System.out.println("\n===== DADOS DA CONTA =====");
        System.out.println("Número: " + oConta.getNumero());
        System.out.println("Tipo: " + oConta.getTipo());
        System.out.println("Saldo: " + oConta.getSaldo());

        System.out.println("\n===== DADOS DO TITULAR =====");
        System.out.println("Nome: " + oPessoa.getNome());
        System.out.println("Idade: " + oPessoa.getIdade());

        if (oPessoa instanceof Pj) {
            Pj pj = (Pj) oPessoa;
            System.out.println("CNPJ: " + pj.getCnpj());
            System.out.println("Razão Social: " + pj.getRazao());
        } else {
            Pf pf = (Pf) oPessoa;
            System.out.println("CPF: " + pf.getCpf());
            System.out.println("Especial: " + pf.isEspecial());
        }
       }
    }
}