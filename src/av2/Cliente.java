package av2;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String endereco;
	private String telefone;
	private String email;

	private Conta conta;

	ArrayList<Cartao> cartoes = new ArrayList<Cartao>();

	public Cliente(String nome, String endereco, String telefone, String email, Conta conta) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void geraCartao(Cartao cartao) {

		cartoes.add(cartao);
	}

	@Override
	public String  toString() {

		StringBuilder str = new StringBuilder();
		str.append("Dados do Cliente");
		str.append("\nNome: "+nome);
		str.append("\nConta: "+conta.getNumero());
		str.append("\nSaldo: "+conta.getSaldo());
		str.append("\nTelefone: "+telefone);
		str.append("\nEmail: "+email);
		str.append("\nEndereco: "+endereco);
		str.append("\n\n");
		str.append("Dados do Cartão");
		
		for(Cartao x:cartoes) {
			str.append("\nNumero: "+x.getNumero());
			str.append("\nCodigo de Validação: "+x.getCodigoValidacao());
			str.append("\nVencimento: "+x.getVencimento());
			str.append("\nSenha: "+x.getSenha());
			str.append("\n");
			str.append("FATURA");
			str.append("");
			str.append("\nvencimento: "+x.getFatura().getDataVencimento());
			str.append("\nPago em: "+x.getFatura().getDataPagamento());
			str.append("\nJuros total: "+x.getFatura().getJuros());
			str.append("\nValor a Pagar: "+ x.getFatura().getValorTotal());
			
		}
		
		return ""+str;
	}

}
