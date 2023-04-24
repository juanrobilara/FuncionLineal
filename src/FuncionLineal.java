import java.math.*;
public class FuncionLineal {



public Double calcularOrdenada(Double x, Double y, Double m) {
	return (y - (m*x));
}

public Double calcularPendiente(Double x, Double y, Double x1, Double y1) {
	return ((y1 - y)/(x1-x));
}

public Double calcularDistanciaEntreDosPuntos(Double x, Double y, Double x1, Double y1) {
	return Math.sqrt(Math.pow(x1-x, 2) + Math.pow(y1-y, 2));
}


	
}