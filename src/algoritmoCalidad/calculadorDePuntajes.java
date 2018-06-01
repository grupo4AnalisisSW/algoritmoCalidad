package algoritmoCalidad;

public class calculadorDePuntajes {
	
	private static int dosBooleanos(boolean a, boolean b) {
		if(a && b)
			return Evaluacion.BUENA;
		if(!a && !b)
			return Evaluacion.MALA;
		return Evaluacion.REGULAR;
	}

	public static int seguridadAcceso(boolean encriptacion, boolean login) {
		return dosBooleanos(encriptacion, login); 
	}
	
	public static int exactitudResultados(int cant) {
		if(cant == 0)
			return Evaluacion.BUENA;
		if(cant==1)
			return Evaluacion.REGULAR;
		return Evaluacion.MALA;
	}
	
	/**
	 * Recibe la opcion seleccionada de Complejidad Computacional:
	 * 2: menor a n^2
	 * 1: n^2
	 * 0: mayor a n^2
	 */
	public static int utilizacionRecursos(int opcionComplejidadComputacional) {
		return opcionComplejidadComputacional;
	}
	
	public static int comportamientoEnElTiempo (int segundos) {
		if(segundos <= 1)
			return Evaluacion.BUENA;
		if(segundos < 5)
			return Evaluacion.REGULAR;
		return Evaluacion.MALA;
	}
	
	public static int toleranciaAFallos(boolean protegeDatos, boolean log) {
		return dosBooleanos(protegeDatos, log);
	}
	
	/**
	 * Recibe la opcion seleccionada:
	 * 2: reanuda y vuelve al estado
	 * 1: solo reanuda
	 * 0: no se recupera
	 */
	public static int recuperacionErrores(int opcion) {
		return opcion;
	}
	
	/**
	 * Espera un numero entero del 0 al 100 para decir el porcentaje de codigo comentado
	 */
	public static int serAnalizado(int porcentajeComentarios) {
		if(porcentajeComentarios > 30)
			return Evaluacion.BUENA;
		if(porcentajeComentarios > 15)
			return Evaluacion.REGULAR;
		return Evaluacion.MALA;
	}
	
	public static int serCambiado(int complejidadCiclomatica) {
		if(complejidadCiclomatica <=10)
			return Evaluacion.BUENA;
		if(complejidadCiclomatica <= 20)
			return Evaluacion.REGULAR;
		return Evaluacion.MALA;
	}
	
	public static int estabilidad(double promedioFallasXMetodo) {
		if(promedioFallasXMetodo >= 5)
			return Evaluacion.MALA;
		if(promedioFallasXMetodo >= 2)
			return Evaluacion.REGULAR;
		return Evaluacion.BUENA;
	}
	
	public static int serEntendido(boolean ayuda, boolean manual) {
		return dosBooleanos(ayuda, manual);
	}
	
	/**
	 * Recibe las opciones seleccionadas para 5 usuarios. Las opciones posibles son:
	 * 0: requiere consultar a un personal
	 * 1: requiere ayuda y manual
	 * 2: no requiere asistencia
	 */
	public static int serOperado(int usr1, int usr2, int usr3, int usr4, int usr5) {
		double promedio = (usr1+usr2+usr3+usr4+usr5)/5;
		if(promedio <= 0.5)
			return Evaluacion.MALA;
		if(promedio <= 1.5)
			return Evaluacion.REGULAR;
		return Evaluacion.BUENA;
	}
	
	public static int adaptabilidad(int cantSO) {
		if(cantSO >= 3)
			return Evaluacion.BUENA;
		if(cantSO == 2)
			return Evaluacion.REGULAR;
		return Evaluacion.MALA;
	}
	
	public static int instalabilidad(int cantPasos) {
		if(cantPasos < 4)
			return Evaluacion.BUENA;
		if(cantPasos < 7)
			return Evaluacion.REGULAR;
		return Evaluacion.MALA;
	}
}
