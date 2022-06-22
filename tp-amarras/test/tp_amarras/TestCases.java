package tp_amarras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnFondeadero() {
		final Integer MAXIMO_AMARRAS = 70;
		
		Fondeadero fondeadero = new Fondeadero(MAXIMO_AMARRAS);
		
		assertNotNull(fondeadero);
	}

	@Test
	public void queSePuedaAmarrarUnYate() {
		final Integer MAXIMO_AMARRAS = 70;
		
		Fondeadero fondeadero = new Fondeadero(MAXIMO_AMARRAS);
		
		final String NOMBRE = "AZ1";
		final String DUENIO = "Andrés Borgeat";
		final Double MANGA = 18.87;
		final Double CALADO = 5.15;
		final Double ESLORA = 119.0;
		final Integer TRIPULACION = 37;
		final Double PESO = 5500.0;
		final Double DESPLAZAMIENTO = 5959.0;
		final String PROPULSION = "2 × motores diésel MAN RK2805";
		final Double POTENCIA = 9000.0;
		final Double VELOCIDAD = 23.0;
		final Double AUTONOMIA = 6500.0;
		
		Yate motor = new Motor(NOMBRE, DUENIO, MANGA, CALADO, ESLORA, TRIPULACION, PESO, DESPLAZAMIENTO, PROPULSION, POTENCIA, VELOCIDAD, AUTONOMIA);
		
		fondeadero.amarrarYate(motor);
		
		final Integer VE = 1;
		
		final Integer VO = fondeadero.getAmarras().size();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaDesamarrarUnYate() {
		final Integer MAXIMO_AMARRAS = 70;
		
		Fondeadero fondeadero = new Fondeadero(MAXIMO_AMARRAS);
		
		final String NOMBRE = "AZ1";
		final String DUENIO = "Andrés Borgeat";
		final Double MANGA = 18.87;
		final Double CALADO = 5.15;
		final Double ESLORA = 119.0;
		final Integer TRIPULACION = 37;
		final Double PESO = 5500.0;
		final Double DESPLAZAMIENTO = 5959.0;
		final String PROPULSION = "2 × motores diésel MAN RK2805";
		final Double POTENCIA = 9000.0;
		final Double VELOCIDAD = 23.0;
		final Double AUTONOMIA = 6500.0;
		
		Yate motor = new Motor(NOMBRE, DUENIO, MANGA, CALADO, ESLORA, TRIPULACION, PESO, DESPLAZAMIENTO, PROPULSION, POTENCIA, VELOCIDAD, AUTONOMIA);
		
		fondeadero.amarrarYate(motor);
		
		fondeadero.desamarrarYate(motor);
		
		final Integer VE = 0;
		
		final Integer VO = fondeadero.getAmarras().size();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaObtenerLaCantidadDeYatesAmarrados() {
		final Integer MAXIMO_AMARRAS = 70;
		
		Fondeadero fondeadero = new Fondeadero(MAXIMO_AMARRAS);
		
		final String NOMBRE_YATE_1 = "AZ1";
		final String DUENIO_YATE_1 = "Andrés Borgeat";
		final Double MANGA_YATE_1 = 18.87;
		final Double CALADO_YATE_1 = 5.15;
		final Double ESLORA_YATE_1 = 119.0;
		final Integer TRIPULACION_YATE_1 = 37;
		final Double PESO_YATE_1 = 5500.0;
		final Double DESPLAZAMIENTO_YATE_1 = 5959.0;
		final String PROPULSION_YATE_1 = "2 × motores diésel MAN RK2805";
		final Double POTENCIA_YATE_1 = 9000.0;
		final Double VELOCIDAD_YATE_1 = 23.0;
		final Double AUTONOMIA_YATE_1 = 6500.0;
		
		Yate motor1 = new Motor(NOMBRE_YATE_1, DUENIO_YATE_1, MANGA_YATE_1, CALADO_YATE_1, ESLORA_YATE_1, TRIPULACION_YATE_1, PESO_YATE_1, DESPLAZAMIENTO_YATE_1, PROPULSION_YATE_1, POTENCIA_YATE_1, VELOCIDAD_YATE_1, AUTONOMIA_YATE_1);
		
		fondeadero.amarrarYate(motor1);
		
		final String NOMBRE_YATE_2 = "AZ2";
		final String DUENIO_YATE_2 = "Juan Borgeat";
		final Double MANGA_YATE_2 = 30.87;
		final Double CALADO_YATE_2 = 8.15;
		final Double ESLORA_YATE_2 = 109.0;
		final Integer TRIPULACION_YATE_2 = 45;
		final Double PESO_YATE_2 = 7500.0;
		final Double DESPLAZAMIENTO_YATE_2 = 6666.0;
		final String PROPULSION_YATE_2 = "3 × motores diésel MAN RK2805";
		final Double POTENCIA_YATE_2 = 10000.0;
		final Double VELOCIDAD_YATE_2 = 50.0;
		final Double AUTONOMIA_YATE_2 = 9500.0;
		
		Yate motor2 = new Motor(NOMBRE_YATE_2, DUENIO_YATE_2, MANGA_YATE_2, CALADO_YATE_2, ESLORA_YATE_2, TRIPULACION_YATE_2, PESO_YATE_2, DESPLAZAMIENTO_YATE_2, PROPULSION_YATE_2, POTENCIA_YATE_2, VELOCIDAD_YATE_2, AUTONOMIA_YATE_2);
		
		fondeadero.amarrarYate(motor2);
		
		final Integer VE = 2;
		
		final Integer VO = fondeadero.getAmarras().size();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaObtenerLaCantidadDeAmarrasLibres() {
		final Integer MAXIMO_AMARRAS = 70;
		
		Fondeadero fondeadero = new Fondeadero(MAXIMO_AMARRAS);
		
		final String NOMBRE = "AZ1";
		final String DUENIO = "Andrés Borgeat";
		final Double MANGA = 18.87;
		final Double CALADO = 5.15;
		final Double ESLORA = 119.0;
		final Integer TRIPULACION = 37;
		final Double PESO = 5500.0;
		final Double DESPLAZAMIENTO = 5959.0;
		final String PROPULSION = "2 × motores diésel MAN RK2805";
		final Double POTENCIA = 9000.0;
		final Double VELOCIDAD = 23.0;
		final Double AUTONOMIA = 6500.0;
		
		Yate motor = new Motor(NOMBRE, DUENIO, MANGA, CALADO, ESLORA, TRIPULACION, PESO, DESPLAZAMIENTO, PROPULSION, POTENCIA, VELOCIDAD, AUTONOMIA);
		
		fondeadero.amarrarYate(motor);
	
		final Integer VE = 69;
		
		final Integer VO = fondeadero.getAmarrasLibres();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaObtenerPrecioDeAmarreEnUnMotor() {
		final Integer MAXIMO_AMARRAS = 70;
		
		Fondeadero fondeadero = new Fondeadero(MAXIMO_AMARRAS);
		
		final String NOMBRE = "AZ1";
		final String DUENIO = "Andrés Borgeat";
		final Double MANGA = 18.87;
		final Double CALADO = 5.15;
		final Double ESLORA = 119.0;
		final Integer TRIPULACION = 37;
		final Double PESO = 5500.0;
		final Double DESPLAZAMIENTO = 5959.0;
		final String PROPULSION = "2 × motores diésel MAN RK2805";
		final Double POTENCIA = 9000.0;
		final Double VELOCIDAD = 23.0;
		final Double AUTONOMIA = 6500.0;
		
		Yate motor = new Motor(NOMBRE, DUENIO, MANGA, CALADO, ESLORA, TRIPULACION, PESO, DESPLAZAMIENTO, PROPULSION, POTENCIA, VELOCIDAD, AUTONOMIA);
		
		fondeadero.amarrarYate(motor);
		
		final Double VE = 13000.0;
		
		final Double VO = motor.getPrecioAmarre();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaObtenerPrecioDeAmarreEnUnaVela() {
		final Integer MAXIMO_AMARRAS = 70;
		
		Fondeadero fondeadero = new Fondeadero(MAXIMO_AMARRAS);
		
		final String NOMBRE = "AZ1";
		final String DUENIO = "Andrés Borgeat";
		final Double MANGA = 18.87;
		final Double CALADO = 5.15;
		final Double ESLORA = 19.0;
		final Integer TRIPULACION = 37;
		final Double PESO = 5500.0;
		final Double ALTURA_MASTIL = 21.5;
		final Double SUPERFICIE_VELICA_MAYOR = 85.0;
		final Double SUPERFICIE_TOTAL= 133.0;
		
		Yate vela = new Vela(NOMBRE, DUENIO, MANGA, CALADO, ESLORA, TRIPULACION, PESO, ALTURA_MASTIL, SUPERFICIE_VELICA_MAYOR, SUPERFICIE_TOTAL);
		
		fondeadero.amarrarYate(vela);
		
		final Double VE = 11000.0;
		
		final Double VO = vela.getPrecioAmarre();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaObtenerRecaudacionTotal() {
		final Integer MAXIMO_AMARRAS = 70;
		
		Fondeadero fondeadero = new Fondeadero(MAXIMO_AMARRAS);
		
		final String NOMBRE_MOTOR = "AZ1";
		final String DUENIO_MOTOR = "Andrés Borgeat";
		final Double MANGA_MOTOR = 18.87;
		final Double CALADO_MOTOR = 5.15;
		final Double ESLORA_MOTOR = 119.0;
		final Integer TRIPULACION_MOTOR = 37;
		final Double PESO_MOTOR = 5500.0;
		final Double DESPLAZAMIENTO_MOTOR = 5959.0;
		final String PROPULSION_MOTOR = "2 × motores diésel MAN RK2805";
		final Double POTENCIA_MOTOR = 9000.0;
		final Double VELOCIDAD_MOTOR = 23.0;
		final Double AUTONOMIA_MOTOR = 6500.0;
		
		Yate motor = new Motor(NOMBRE_MOTOR, DUENIO_MOTOR, MANGA_MOTOR, CALADO_MOTOR, ESLORA_MOTOR, TRIPULACION_MOTOR, PESO_MOTOR, DESPLAZAMIENTO_MOTOR, PROPULSION_MOTOR, POTENCIA_MOTOR, VELOCIDAD_MOTOR, AUTONOMIA_MOTOR);
		
		fondeadero.amarrarYate(motor);
		
		final String NOMBRE_VELA = "AZ2";
		final String DUENIO_VELA = "Tomás Borgeat";
		final Double MANGA_VELA = 28.87;
		final Double CALADO_VELA = 15.15;
		final Double ESLORA_VELA = 19.0;
		final Integer TRIPULACION_VELA = 17;
		final Double PESO_VELA = 3500.0;
		final Double ALTURA_MASTIL_VELA = 11.5;
		final Double SUPERFICIE_VELICA_MAYOR_VELA = 65.0;
		final Double SUPERFICIE_TOTAL_VELA = 113.0;
		
		Yate vela = new Vela(NOMBRE_VELA, DUENIO_VELA, MANGA_VELA, CALADO_VELA, ESLORA_VELA, TRIPULACION_VELA, PESO_VELA, ALTURA_MASTIL_VELA, SUPERFICIE_VELICA_MAYOR_VELA, SUPERFICIE_TOTAL_VELA);
		
		fondeadero.amarrarYate(vela);
		
		final Double VE = 24000.0;
		
		final Double VO = fondeadero.getRecaudacionTotal();
		
		assertEquals(VE, VO);
	}
	
}
