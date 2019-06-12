import java.util.*;

public class ProdutoComposto implements Produto{
  private ArrayList<Produto> produtos;
  private String descricao;
  
  public ProdutoComposto(String umaDescricao,Produto umProduto){
      produtos = new ArrayList<Produto>();
      produtos.add(umProduto);
      descricao = umaDescricao;
  }
  
  public void add(Produto umProduto){
      produtos.add(umProduto);
  }
  
  public double getPreco(){
      double preco = 0;
      for(Produto p: produtos){
          preco += p.getPreco();
      }
      return(preco*0.9);
  }
  
  public int getPesoLiquido(){
      int peso = 0;
      for(Produto p:produtos){
          peso += p.getPesoLiquido();
      }
      return(peso);
  }
  
  public String toString(){
      String aux;
      aux = descricao+", Preco: "+getPreco()+", Peso: "+getPesoLiquido()+"\n";
      for(Produto p:produtos){
          aux += "    "+p + "\n";
      }
      return(aux);
  }
}
