package av2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Fatura f1 = new Fatura(sdf.parse("25/05/2020"), sdf.parse("22/05/2020"), 0.0, 400.00, ESTADO.PAGO);
		Fatura f2 = new Fatura(sdf.parse("22/05/2020"), sdf.parse("25/05/2020"), 40.00, 440.00, ESTADO.PAGO);
		Fatura f3 = new Fatura(sdf.parse("02/03/2020"), sdf.parse("22/05/2020"), 100.0, 800.00, ESTADO.PAGO);
		
		f1.aplicarJuros();
		f2.aplicarJuros();
		f3.aplicarJuros();
		
		Cartao ct1 = new Cartao("9099213356785443", 123, sdf.parse("25/05/2021"), 123456, f1);
		Cartao ct2 = new Cartao("6019344556785879", 321, sdf.parse("30/05/2022"), 987652, f2);
		Cartao ct3 = new Cartao("5672543286290463", 456, sdf.parse("25/05/2023"), 143895, f3);
		
		Conta c1 = new Conta(123456, 1000.00);
		Conta c2 = new Conta(345616, 3000.00);
		Conta c3 = new Conta(987456, 4000.00);
		
		Cliente cl1 = new Cliente("João", "travessa perdida,235", "995845364", "joao@gmail.com", c1);
		Cliente cl2 = new Cliente("Maria", "rua central,100", "987563312", "maria@gmail.com", c2);
		Cliente cl3 = new Cliente("Antonio", "rua irineu,90", "997864543", "antonio@gmail.com", c3);
		
		cl1.geraCartao(ct1);
		cl2.geraCartao(ct2);
		cl3.geraCartao(ct3);
		
		
		System.out.println(cl1);
		System.out.println(cl2);
		System.out.println(cl3);
		
		
	}

}
