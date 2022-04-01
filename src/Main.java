
public class Main {

	public static void main(String[] args) {

		/* Instancia da classe banco para poder incluir clientes na lista */
		Banco banco = new Banco();

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cliente rose = new Cliente();
		rose.setNome("Rose");

		Cliente luis = new Cliente();
		luis.setNome("Luis");

		/* Adicionando os clientes a lista de clientes */
		banco.adicionaClienteNaLista(venilton);
		banco.adicionaClienteNaLista(rose);
		banco.adicionaClienteNaLista(luis);

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		/* Imprimir lista de clientes */
		banco.imprimeListaClientes();


		/* Outra inclusão após lista estar com dados
		  Não deve zerar a lista */
		Cliente claudio = new Cliente();
		claudio.setNome("Claudio");
		banco.adicionaClienteNaLista(claudio);
		banco.imprimeListaClientes();

	}

}
