package algoritmoCalidad;

public class Evaluacion {

	public static final int BUENA = 2;
	public static final int REGULAR = 1;
	public static final int MALA = 0;
	
	private boolean satisfaccion;
	private boolean[] caracsEn0;
	private boolean[] subCaracsEn0;
	
	public static final int FUNCIONALIDAD = 0;
	public static final int EFICIENCIA = 1;
	public static final int FIABILIDAD = 2;
	public static final int MANTENIBILIDAD = 3;
	public static final int USABILIDAD = 4;
	public static final int PORTABILIDAD = 5;
	
	public Evaluacion(int segAcceso, int exactitudRes, //Funcionalidad
			int utilRecursos, int compEnTiempo, //Eficiencia
			int toleranciaFallos, int capacidadRecuperacionErr, //Fiabilidad
			int analizarCod, int cambiarCod, int estabilidad, //Mantenibilidad
			int serEntendido, int serOperado, //Usabilidad
			int adaptabilidad, int instalabilidad) //Portabilidad
	{
		calcular(segAcceso, exactitudRes, utilRecursos, compEnTiempo, toleranciaFallos, 
				capacidadRecuperacionErr, analizarCod, cambiarCod, estabilidad, serEntendido, 
				serOperado, adaptabilidad, instalabilidad);
	}

	private void calcular(int segAcceso, int exactitudRes, //Funcionalidad
			int utilRecursos, int compEnTiempo, //Eficiencia
			int toleranciaFallos, int capacidadRecuperacionErr, //Fiabilidad
			int analizarCod, int cambiarCod, int estabilidad, //Mantenibilidad
			int serEntendido, int serOperado, //Usabilidad
			int adaptabilidad, int instalabilidad) //Portabilidad 
	{
		int funcionalidad, eficiencia, fiabilidad, mantenibilidad, usabilidad, portabilidad; //Caracteristicas
		
		//Calculo las caracteristicas a partir de los promedios
		funcionalidad = (segAcceso + exactitudRes)/2;
		eficiencia = (utilRecursos + compEnTiempo)/2;
		fiabilidad = (toleranciaFallos + capacidadRecuperacionErr)/2;
		mantenibilidad = (analizarCod + cambiarCod + estabilidad)/3;
		usabilidad = (serEntendido + serOperado)/2;
		portabilidad = (adaptabilidad + instalabilidad)/2;
		
		//Filtros
		if(funcionalidad == 0 || eficiencia == 0  || fiabilidad == 0 || mantenibilidad == 0 ||
				usabilidad == 0 || portabilidad == 0)
		{
			//|| exactitudRes == MALA || toleranciaFallos == MALA){
			//}
			satisfaccion = false;
		}
	}
}
