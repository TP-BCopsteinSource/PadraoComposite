import java.util.*;

public class AppProdutos{
    public static void main(String args[]){
        List<Produto> lst = new ArrayList<Produto>();
        
        // Cria um produto composto
        ProdutoSimples  p1 = new ProdutoSimples("Detergente",1.8,250);
        ProdutoSimples  p2 = new ProdutoSimples("Desengordurante",2.90,300);
        ProdutoSimples  p4 = new ProdutoSimples("Limpa Vidros",4.80,280);
        ProdutoComposto p3 = new ProdutoComposto("Cesta de limpeza",p1);
        p3.add(p2);
        p3.add(p4);
        
        // Adiciona produtos simples e compostos na lista
        lst.add(new ProdutoSimples("Cerveja",2.5,600));
        lst.add(p3);
        lst.add(new ProdutoSimples("Refrigerante",3.8,2000));
        
        ProdutoComposto p5 = new ProdutoComposto("Kit doido",p3);
        p5.add(new ProdutoSimples("Bombril",1.2,300));
        lst.add(p5);
        // Exibe a lista
        for(Produto p:lst){
            System.out.println(p);
        }
    }
}
