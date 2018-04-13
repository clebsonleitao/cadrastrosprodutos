/** *
 * @author Clebson Leitao
 */
package modelo;

public class Material_construcao {

	private String name;
	private Integer quantidade;
	private Float valor;
	private Float valorTotal;
	
	public Material_construcao (String name, int quantidade, float valor) {
		                  this.name = name;
		                  this.quantidade = quantidade;
		                  this.valor = valor;
		                   this.valorTotal = valor * quantidade;
	}
	
        @Override
	                             public String toString() {
		                      return "Nome: " + name + "; Quantidade.: " + quantidade + "; Preço: "
				       + valor + "; Valor Total: " + valorTotal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		this.valorTotal = quantidade*valor;
	}
	public Float getValor() {
		return valor*quantidade;
	}
	public void setValor(Float valor) {
		this.valor = valor;
		this.valorTotal = quantidade*valor;
	}
	public Float getvalorTotal() {
		return valorTotal;
	}	
}
