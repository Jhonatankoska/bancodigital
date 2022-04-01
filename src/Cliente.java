import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;

	public String getNome() { return nome; }

	public void setNome(String nome) {
		this.nome = nome;
	}

	/* Sobreescrever o metodo toString() para exibir os nomes dos clientes
	 * @return
	 */
	@Override
	public String toString() {
		return nome;
	}
}
