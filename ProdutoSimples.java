public class ProdutoSimples implements Produto{
  private String descricao;
  private double preco;
  private int pesoLiquido;
  
  public ProdutoSimples(String umaDescricao,double umPreco,int oPesoLiquido){
      preco = umPreco;
      pesoLiquido = oPesoLiquido;
      descricao = umaDescricao;
  }
  
  public double getPreco(){
      return(preco);
  }
  
  public int getPesoLiquido(){
      return(pesoLiquido);
  }
  
  public String toString(){
      return(descricao+", Preco: "+preco+", Peso: "+pesoLiquido);
  }
}
