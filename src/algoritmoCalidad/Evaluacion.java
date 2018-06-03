package algoritmoCalidad;

public class Evaluacion {

	//Puntajes
	public static final int BUENA = 2;
	public static final int REGULAR = 1;
	public static final int MALA = 0;
	private double pesos[] = {1.5, 1, 1.5, 1, 1, 1};
	
	//Resultados
	private boolean satisfaccion = true;
	private double caracs[];
	private int subcaracs[];
	private double calidad;

	//Indices de caracteristicas
	public static final int FUNCIONALIDAD = 0;
	public static final int EFICIENCIA = 1;
	public static final int FIABILIDAD = 2;
	public static final int MANTENIBILIDAD = 3;
	public static final int USABILIDAD = 4;
	public static final int PORTABILIDAD = 5;
	
	//Indices de subcaracteristicas
	public static final int EXACTITUD_RESULTADOS = 0;
	public static final int TOLERANCIA_FALLOS = 1;
	
	/**
	 * Evaluacion se crea especificando los valores de cada subcaracteristica. Para ello,
	 * puntuarlas con las constantes BUENA, MALA o REGULAR, segun corresponda.
	 */
	public Evaluacion(int seguridadDeAcceso, int exactitudDeResultados, //Funcionalidad
			int utiluzacionDeRecursos, int comportamientoEnElTiempo, //Eficiencia
			int toleranciaAFallos, int capacidadDeRecuperacionDeErrores, //Fiabilidad
			int facilidadDeAnalizarCodigo, int facilidadDeCambiarCodigo, int estabilidad, //Mantenibilidad
			int capacidadDeSerEntendido, int capacidadDeSerOperado, //Usabilidad
			int adaptabilidad, int instalabilidad) //Portabilidad
	{
		calcular(seguridadDeAcceso, exactitudDeResultados, utiluzacionDeRecursos, comportamientoEnElTiempo,
				toleranciaAFallos, capacidadDeRecuperacionDeErrores, facilidadDeAnalizarCodigo,
				facilidadDeCambiarCodigo, estabilidad, capacidadDeSerEntendido, capacidadDeSerOperado, adaptabilidad,
				instalabilidad);
	}

	/**
	 * Calcula todos los resultados necesarios de la evaluacion. Recibe por parametro los 
	 * valores de todas las subcaracteristicas.
	 */
	private void calcular(int segAcceso, int exactitudRes, //Funcionalidad
			int utilRecursos, int compEnTiempo, //Eficiencia
			int toleranciaFallos, int capacidadRecuperacionErr, //Fiabilidad
			int analizarCod, int cambiarCod, int estabilidad, //Mantenibilidad
			int serEntendido, int serOperado, //Usabilidad
			int adaptabilidad, int instalabilidad) //Portabilidad 
	{
		caracs = new double[6];
		subcaracs = new int[2];
		
		subcaracs[EXACTITUD_RESULTADOS] = exactitudRes;
		subcaracs[TOLERANCIA_FALLOS] = toleranciaFallos;
		
		inicializarCaracs(segAcceso, exactitudRes, utilRecursos, compEnTiempo, toleranciaFallos,
				capacidadRecuperacionErr, analizarCod, cambiarCod, estabilidad, serEntendido, serOperado, adaptabilidad,
				instalabilidad);
		calidad = calcularCalidad();
		
		//Filtros
		//Si alguna caracteristica esta en 0 o 
		//exactitud de resultados o tolerancia a fallos son MALA o
		//la calidad es menor al 50%: no puede ser satisfactorio
		if(chequearCaracs() || exactitudRes == MALA || toleranciaFallos == MALA || calidad < 0.5)
			satisfaccion = false;
	}

	/**
	 * Pondera los valores de las caracteristicas y calcula el porcentaje de calidad.
	 * @return porcentaje de calidad (numero entre 0 y 1)
	 */
	private double calcularCalidad() { //me tomo la libertad de redise�ar esto, porque no funciona as�(y tampoco entiendo que se busc� calcular)
		//Pondero el resultado
		double numerador = 0;
		double denominador = 0;
		for(int i=0; i<6; i++) {
			numerador += (caracs[i] * pesos[i]);
			denominador += pesos[i];
		}
		double ponderacion = numerador/denominador;
		
		//Calculo el porcentaje
		return ponderacion;// / 2; //Ponderacion puede valer entre 0 y 2, segun las constantes BUENA, REGULAR y MALA //no hace falta dividirlo por 2
	}

	/**
	 * Chequea si hay alguna caracteristica en 0 y 
	 */
	private boolean chequearCaracs() {
		//Si alguna caracteristica esta en 0, no puede ser satisfactorio
		for(double carac : caracs)
			if(carac == 0)
				return true;
		return false;
	}

	/**
	 * Calcula los valores de cada caracteristica en base al promedio de sus subcaracteristicas
	 */
	private void inicializarCaracs(int segAcceso, int exactitudRes, int utilRecursos, int compEnTiempo,
			int toleranciaFallos, int capacidadRecuperacionErr, int analizarCod, int cambiarCod, int estabilidad,
			int serEntendido, int serOperado, int adaptabilidad, int instalabilidad) {
		
		//Calculo las caracteristicas a partir de los promedios
		caracs[FUNCIONALIDAD] = ((double)segAcceso + exactitudRes)/4; //mas temas de tipo de dato
		caracs[EFICIENCIA] = ((double)utilRecursos + compEnTiempo)/4; //ademas, se deb�an dividir por el total posible, arreglado
		caracs[FIABILIDAD] = ((double)toleranciaFallos + capacidadRecuperacionErr)/4;
		caracs[MANTENIBILIDAD] = ((double)analizarCod + cambiarCod + estabilidad)/6;
		caracs[USABILIDAD] = ((double)serEntendido + serOperado)/4;
		caracs[PORTABILIDAD] = ((double)adaptabilidad + instalabilidad)/4;
	}
	
	public boolean esSatisfactorio() {
		return satisfaccion;
	}
	
	public double getCalidad() {
		return calidad;
	}
	
	/**
	 * Arma un array booleano que se accede con las constantes de las caracteristicas como indices
	 * y por cada una dice si est� en 0 o no.
	 * @return
	 */
	public boolean[] getCaracsEn0() {
		boolean[] resultado = new boolean[6];
		for(int i=0; i<6; i++)
			if(caracs[i] == 0)
				resultado[i]=true;
			else resultado[i]=false;
		return resultado;
	}
	
	/**
	 * Arma un array booleano que se accede con las constantes de las subcaracteristicas como indices
	 * y por cada una dice si est� en 0 o no.
	 * @return
	 */
	public boolean[] getSubcaracsEn0() {
		boolean[] resultado = new boolean[2];
		for(int i=0; i<2; i++)
			if(subcaracs[i] == 0)
				resultado[i]=true;
			else resultado[i]=false;
		return resultado;
	}
}
