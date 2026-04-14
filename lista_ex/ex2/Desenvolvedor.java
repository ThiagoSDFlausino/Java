package lista_ex.ex2;

import java.util.ArrayList;

public class Desenvolvedor extends Funcionario {
    private String linguagem_principal;

    public Desenvolvedor(String linguagem_principal, String nome, double salario, ArrayList<Projeto> projetos) {
        super(nome, salario, projetos);
        this.linguagem_principal = linguagem_principal;
    }

    public String getLinguagem_principal() {
        return linguagem_principal;
    }

    public void setLinguagem_principal(String linguagem_principal) {
        this.linguagem_principal = linguagem_principal;
    }

    @Override
    public double calculaBonus() {
        return this.salario * 0.1;
    }
}
