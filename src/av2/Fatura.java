package av2;

import java.util.Date;

public class Fatura {

	private Date dataVencimento;
	private Date dataPagamento;
	private Double juros;
	private Double valorTotal;
	private ESTADO estado;

	public Fatura(Date dataVencimento, Date dataPagamento, Double juros, Double valorTotal, ESTADO estado) {
		super();
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.juros = juros;
		this.valorTotal = valorTotal;
		this.setEstado(estado);
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double aplicarJuros() {

		valorTotal += juros;

		return valorTotal;

	}

	public ESTADO getEstado() {
		return estado;
	}

	public void setEstado(ESTADO estado) {
		this.estado = estado;
	}

}
