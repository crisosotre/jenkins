package co.edu.icesi.jenkins.test.modelo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import co.edu.icesi.jenkins.modelo.Suma;
import static org.junit.Assert.*;

public class SumaTest {
	
	private static final Logger log = LoggerFactory.getLogger(SumaTest.class);
	
	@Test
	   public void sumaPositivos() {
		log.info("Inició proceso para sumar dos numeros positivos");
	       Suma S = new Suma(2, 3);
	       assertTrue(S.sumar() == 5);
	     log.info("Finalizó proceso para sumar dos numeros positivos");  
	   }

	   @Test
	   public void sumaNegativos() {
		   log.info("Inicio proceso para sumar dos numeros negativos");
	       System.out.println("Sumando dos números negativos ...");
	       Suma S = new Suma(-2, -3);
	       assertTrue(S.sumar() == -5);
	       log.info("Finalizó proceso para sumar dos numeros negativos");
	   }

	   @Test
	   public void sumaPositivoNegativo() {
		   log.info("Inició proceso para sumar dos numeros negativo y positivo");
	       System.out.println("Sumando un número positivo y un número negativo ...");
	       Suma S = new Suma(2, -3);
	       assertTrue(S.sumar() == -1);
	       log.info("Finalizó proceso para sumar dos numeros negativo y positivo");
	   }

}
