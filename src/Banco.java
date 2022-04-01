import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	/* Variavel list para guardar os clientes do banco
	 */
	private List<Cliente> listaDeClientes = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	/* Metodo get da lista de cliente
	 * @return lista de clientes atual
	 */
	public List<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	/* Metodo para adicionar clientes na lista
	 @param cliente solicita um cliente para adicionar na lista
	 */
	public void adicionaClienteNaLista (Cliente cliente) {
		this.getListaDeClientes().add(cliente);
	}

	/* Metodo para imprimir lista de clientes*/
	public void imprimeListaClientes(){
		System.out.println("=== Lista de Clientes ===");
		for (Cliente cliente: getListaDeClientes()) {
			System.out.println(cliente);
		}
	}


}
