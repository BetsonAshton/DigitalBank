package modelos;

public class Conta {
	
	float saldo; //float receberá valor fracionado
	String conta; // receberá os caracteres com nome conta, variavel string conta servirá para o programa inteiro
	
	public Conta (String conta) /* a varivel string conta só serve enquento estiver dentro dessas duas { */ {
		saldo = 0;
		this.conta = conta;
	}
	
	public void depositar (float deposito) { /* void para quando um método não retorne nada */
		saldo += deposito; /* saldo vai somar com deposito */
	}
	
	public void sacar (float sacar) {
		if(sacar > saldo) {
			System.out.println("Error");
		}
		else {
			saldo -= sacar;
		}
	}
	
	public String toString () /* o metodo String toString retorna texto ou variavel, alguma coisa*/ { 
		return "Saldo:"+saldo;
	}

}
