package av2;

public class Conta {

	private Integer numero;
	private Double  Saldo;
	
	public Conta(Integer numero, Double saldo) {
		super();
		this.numero = numero;
		Saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return Saldo;
	}

	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}
	
	
}
