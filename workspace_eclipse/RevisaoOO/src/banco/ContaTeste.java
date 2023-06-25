package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {

	@Test
	void testarContaCorrente() {
		Double saldoEsperado = 101.0;
				
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100.0);
		contaCorrente.rentabilizar();
		
		assertEquals(saldoEsperado, contaCorrente.saldo);
	}
	
	@Test
	void testarContaPoupanca() {
		Double saldoEsperado = 102.0;
		
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.depositar(100.0);
		poupanca.rentabilizar();
		
		assertEquals(saldoEsperado, poupanca.saldo);
	}
	
	@Test
	void testePolimorfismo() {
		boolean flagContaCorrenteComoDefault = true;
		
		Conta conta = null;
		if (flagContaCorrenteComoDefault) {
			conta = new ContaCorrente();
			
		} else {
			conta = new ContaPoupanca();

		}
		
		conta.depositar(1000.0);
		
		conta.rentabilizar();
		System.out.println(conta.getClass().getName());
		System.out.println(conta.saldo);
	}
	
	@Test
	void testeConta_toString() {
		Conta conta = new ContaCorrente();
		conta.depositar(100.00);
		conta.sacar(10.00);
		
		System.out.println(conta);
	}
}