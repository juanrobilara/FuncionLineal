import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaFuncionLineal {

	@Test
	public void queSePuedaInstanciarUnaFuncionLineal() {
		FuncionLineal fl = new FuncionLineal();
		
		assertNotNull(fl);
	}
	
	@Test
	public void queFuncioneElMetodoCalcularPendiente() {
		Double x = 1.0, y = 2.0, x1 = -3.0, y1 = 5.0;
		
		FuncionLineal fl = new FuncionLineal();
		
		Double valorObtenido = fl.calcularPendiente(x, y, x1, y1);
		Double valorEsperado = -0.75;
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queFuncioneElMetodoCalcularOrdenada() {
		Double x = 1.0, y = 2.0, x1 = 3.0, y1 = 5.0;
		
		FuncionLineal fl = new FuncionLineal();
		
		Double valorObtenido = fl.calcularOrdenada(x, y, fl.calcularPendiente(x, y, x1, y1));
		Double valorEsperado = 0.5;
		
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queFuncioneElMetodoCalcularDistanciaEntreDosPuntosDeLaFuncion() {
		Double x = 1.0, y = 2.0, x1 = 3.0, y1 = 5.0;
		
		FuncionLineal fl = new FuncionLineal();
		
		Double valorObtenido = fl.calcularDistanciaEntreDosPuntos(x, y, x1, y1);
		Double valorEsperado = Math.sqrt(13);
		
		assertEquals(valorEsperado, valorObtenido);
	}
}
