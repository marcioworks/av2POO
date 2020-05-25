package av2;

import java.util.Date;

public class Cartao {

	private String numero;
	private Integer codigoValidacao;
	private Date vencimento;
	private Integer senha;
	
	private Fatura fatura;

	
	public Cartao(String numero, Integer codigoValidacao, Date vencimento, Integer senha, Fatura fatura) {
		
		this.numero = numero;
		this.codigoValidacao = codigoValidacao;
		this.vencimento = vencimento;
		this.senha = senha;
		this.fatura = fatura;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getCodigoValidacao() {
		return codigoValidacao;
	}

	public void setCodigoValidacao(Integer codigoValidacao) {
		this.codigoValidacao = codigoValidacao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
}
