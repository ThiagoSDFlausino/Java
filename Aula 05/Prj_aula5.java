package Aula5;

public class Prj_aula5 {

    public static void main(String[] args) {
       
       Produto oProduto1 = new Perecivel("01/10/2028","Campinas",1,"Arroz", 20.70);
       Produto oProduto2 = new Permanente(0.05,true,2,"Lápis",1.80);
       
       Pedido oPedido = new Pedido(100, "24/03/2026",10, oProduto1);
       
       System.out.println("==== PEDIDO ====");
       System.out.println("Código: " + oPedido.getCodigo());
       System.out.println("Data: " + oPedido.getData_pedido());
       System.out.println("Quantidade: " + oPedido.getQuantidade());
       
       System.out.println("=== PRODUTO =====");
       System.out.println("\t Código: " + oPedido.getProduto().getCodigo());
       System.out.println("\t Descrição: " + oPedido.getProduto().getDescricao());
       System.out.println("\t Valor unitário: " + oPedido.getProduto().getValor_unit());
       
       if (oPedido.getProduto() instanceof Perecivel) {
           System.out.println("Data de validade: " + ((Perecivel) oPedido.getProduto()).getData_validade());
           System.out.println("Cidade de origem: " + ((Perecivel) oPedido.getProduto()).getCidade_origem());           
       } else {
           System.out.println("Percentual de desvalorização " + ((Permanente) oPedido.getProduto()).getPerc_desvalorizacao()*100 + "%");   
           
           String escritorio = (((Permanente) oPedido.getProduto()).isEscritorio() == true ? "Sim" : "Não");
           System.out.println("Escritório: " + escritorio);           
       }
       
       
       System.out.println("TOTAL: " + oPedido.calcValorTotal());
    }
}
