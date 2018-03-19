package co.edu.icesi.jenkins.test.modelo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;
import co.edu.icesi.jenkins.modelo.Resta;

public class RestaTest {

	private static final Logger log = LoggerFactory.getLogger(RestaTest.class);
	
	@Test
	public void restaPositivos() {
		log.info("Inició proceso para restar dos numeros positivos");
		Resta R = new Resta(3,2);
		assertTrue(R.restar() == 1);
		log.info("Finalizó proceso para restar dos numeros positivos");
	}
	
	@Test
	public void restaNegativos() {
		log.info("Inició proceso para restar dos numeros negativos");
		Resta R = new Resta(-5,-3);
		assertTrue(R.restar() == -2);
		log.info("Finalizó proceso para restar dos numeros negativos");
	}
	
	@Test
	public void restaPositivoNegativo() {
		  log.info("Inició proceso para restar dos numeros negativo y positivo");
		  Resta R = new Resta(-5,3);
		  assertTrue(R.restar() == -8);
		  log.info("Finalizó proceso para restar dos numeros negativo y positivo");
	}
}
