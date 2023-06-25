package esporte;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AtletaTest {
	
	@Test
	void testarConstrutor() {
		
		Pessoa pessoaEdson = new Pessoa ("Edson", 40);
		
		System.out.println(pessoaEdson.nome);
		System.out.println(pessoaEdson.idade);
		
		Atleta atletaEdson = new Atleta("Edson", 40, 90, false);
		System.out.println(atletaEdson.nome);
		System.out.println(atletaEdson.idade);
		System.out.println(atletaEdson.peso);
		System.out.println(atletaEdson.aposentado);
		
	}
	
	@Test
	void testeNadador() {
		Nadador nadador = new Nadador("Gustavo", 30, 80, false);
		nadador.nadar();
		
		nadador.envelhecer();
		System.out.println(nadador.idade);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
		
		assertEquals( nadador.idade, 31);
		nadador.envelhecer();
		assertEquals( nadador.idade, 32);
		assertEquals(nadador.idade, 34);
		
	}
	
	@Test
	void testarCiclista() {
		Ciclista ciclista = new Ciclista("Edson", 44, 85, false);
		assertFalse(ciclista.aposentado);
		
		
		
		System.out.println("Está aposentado?");
		if (ciclista.aposentado) {
			System.out.println("Sim");
			
		} else {
			System.out.println("Não");
		}
		
		
		
		ciclista.pedalar();
		ciclista.envelhecer();
		
		ciclista.aposentar();
		assertTrue(ciclista.aposentado);
		
		System.out.println("Agora já está aposentado?");
		System.out.println(ciclista.aposentado ? "Sim" : "Não");
	}

}