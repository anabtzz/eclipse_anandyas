package conta_corrente_etim_azul;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ContaCorrenteTest {

	final double VARIACAO = 0.1; //FINAL = CONSTANTE 
	//TESTE
	@Test
	public void testDepositar() {
		//CENÁRIO 
		ContaCorrente cc = new ContaCorrente(0);
		
		cc.depositar(100);
		assertEquals(100, cc.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
		cc.depositar(100);
		assertEquals(200, cc.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
	
		cc.depositar(100);
		assertEquals(300, cc.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
		
	}
		//VALOR ESPERADO 
		// VAI VERIFICAR SOZINHO SE ESTA CERTO, CHECK VERDE 
		// PORQUE DEU RISCADO = FOI CRIADO UM METODO MELHOR E VAI DAR OUTRAS OPÇOES 
	
	
	@Test
	public void testSacarSaldoSuficiente() {
		
		//CENÁRIO 
		ContaCorrente cc = new ContaCorrente("Ana", 300);
		
		//acão
		cc.sacar(50);
		//verificação 
		assertEquals(250, cc.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
		
		
	}
		
		@Test
		public void testSacarSaldoInsuficiente() {
			
			//CENÁRIO = NÃO PRECISA DO SALDO, SALDO = 0
			ContaCorrente cc2 = new ContaCorrente("Ana", 0);
			//acão
			cc2.sacar(60);
			 
			//verificação 
			assertEquals(0, cc2.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
		
		}
			
			@Test
			public void testTransferir(){
			
				//CENÁRIO 
				ContaCorrente conta1 = new ContaCorrente("Gama", 0);
				ContaCorrente conta2 = new ContaCorrente("Ana", 0);
				
				conta1.depositar(200);
				
				//Ação
				
				conta1.tranferir(50, conta2);
				assertEquals(150, conta1.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS	
				assertEquals(50, conta2.saldo, VARIACAO); // SE TIVER UMA DIFERENÇA DE 0.1 VÃO SER IGUAIS 
			
				
	}
}


// 