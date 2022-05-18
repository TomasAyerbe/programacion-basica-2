package empresa_la_perseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void calcularSueldoEmpleadoPlantaTemporariaCon80HorasConEsposaYSinHijos() {
		final Integer HORAS_TRABAJADAS = 80;
		final Integer HIJOS = 0;
		final Boolean CASADO = true;
		final Double VALOR_HORA = 200.0;
		
		EmpleadoPlantaTemporaria empleado = new EmpleadoPlantaTemporaria(HORAS_TRABAJADAS, HIJOS, CASADO, VALOR_HORA);
		
		Double sueldo = empleado.calcularSueldo();
		
		final Double VE = (double) ((HORAS_TRABAJADAS * 200) + (200 * HIJOS) + 100);

		assertEquals(VE, sueldo);
	}
	
	@Test
	public void calcularSueldoEmpleadoPlantaPermanenteCon80HorasCon6AniosAntiguedadConEsposaYCon2Hijos() {
		final Integer HORAS_TRABAJADAS = 80;
		final Integer ANIOS_ANTIGUEDAD = 6;
		final Integer HIJOS = 2;
		final Boolean CASADO = true;
		final Double VALOR_HORA = 300.0;
		final Double VALOR_ANIOS_ANTIGUEDAD = 100.0;
		
		EmpleadoPlantaPermanente empleado = new EmpleadoPlantaPermanente(HORAS_TRABAJADAS, ANIOS_ANTIGUEDAD, HIJOS, CASADO, VALOR_HORA, VALOR_ANIOS_ANTIGUEDAD);
		
		Double sueldo = empleado.calcularSueldo();
		
		final Double VE = (double) ((HORAS_TRABAJADAS * 300) + (ANIOS_ANTIGUEDAD * 100) + (200 * HIJOS) + 100);
		
		assertEquals(VE, sueldo);
	}
	
	@Test
	public void calcularSueldoEmpleadoPlantaPermanenteCon160HorasCon4AniosAntiguedadSinEsposaYSinHijos() {
		final Integer HORAS_TRABAJADAS = 160;
		final Integer ANIOS_ANTIGUEDAD = 4;
		final Integer HIJOS = 0;
		final Boolean CASADO = false;
		final Double VALOR_HORA = 300.0;
		final Double VALOR_ANIOS_ANTIGUEDAD = 100.0;
		
		EmpleadoPlantaPermanente empleado = new EmpleadoPlantaPermanente(HORAS_TRABAJADAS, ANIOS_ANTIGUEDAD, HIJOS, CASADO, VALOR_HORA, VALOR_ANIOS_ANTIGUEDAD);
		
		Double sueldo = empleado.calcularSueldo();
		
		final Double VE = (double) ((HORAS_TRABAJADAS * 300) + (ANIOS_ANTIGUEDAD * 100) + (200 * HIJOS));
		
		assertEquals(VE, sueldo);
	}
	
	@Test
	public void calcularSueldoGerenteCon160HorasCon10AniosAntiguedadConEsposaYUnHijo() {
		final Integer HORAS_TRABAJADAS = 160;
		final Integer ANIOS_ANTIGUEDAD = 10;
		final Integer HIJOS = 1;
		final Boolean CASADO = true;
		final Double VALOR_HORA = 400.0;
		final Double VALOR_ANIOS_ANTIGUEDAD = 150.0;
		
		Gerente empleado = new Gerente(HORAS_TRABAJADAS, ANIOS_ANTIGUEDAD, HIJOS, CASADO, VALOR_HORA, VALOR_ANIOS_ANTIGUEDAD);
		
		Double sueldo = empleado.calcularSueldo();
		
		final Double VE = (double) ((HORAS_TRABAJADAS * 400) + (ANIOS_ANTIGUEDAD * 150) + (200 * HIJOS) + 100);
		
		assertEquals(VE, sueldo);
	}
	
	@Test
	public void calcularSueldoDeTodosLosEmpleadosDeLaEmpresa() {
		final Integer CUIT = 123456789;
		final String RAZON_SOCIAL = "La Perseveracia";
		
		Empresa empresa = new Empresa(CUIT, RAZON_SOCIAL);
		
		final Integer HORAS_TRABAJADAS_EMPLEADO_1 = 80;
		final Integer HIJOS_EMPLEADO_1 = 0;
		final Boolean CASADO_EMPLEADO_1 = true;
		final Double VALOR_HORA_EMPLEADO_1 = 200.0;
		
		EmpleadoPlantaTemporaria empleado1 = new EmpleadoPlantaTemporaria(HORAS_TRABAJADAS_EMPLEADO_1, HIJOS_EMPLEADO_1, CASADO_EMPLEADO_1, VALOR_HORA_EMPLEADO_1);
		
		empresa.agregarEmpleado(empleado1);
		
		final Integer HORAS_TRABAJADAS_EMPLEADO_2 = 80;
		final Integer ANIOS_ANTIGUEDAD_EMPLEADO_2 = 6;
		final Integer HIJOS_EMPLEADO_2 = 2;
		final Boolean CASADO_EMPLEADO_2 = true;
		final Double VALOR_HORA_EMPLEADO_2 = 300.0;
		final Double VALOR_ANIOS_ANTIGUEDAD_EMPLEADO_2 = 100.0;
		
		EmpleadoPlantaPermanente empleado2 = new EmpleadoPlantaPermanente(HORAS_TRABAJADAS_EMPLEADO_2, ANIOS_ANTIGUEDAD_EMPLEADO_2, HIJOS_EMPLEADO_2,  CASADO_EMPLEADO_2, VALOR_HORA_EMPLEADO_2, VALOR_ANIOS_ANTIGUEDAD_EMPLEADO_2);
		
		empresa.agregarEmpleado(empleado2);
		
		final Integer HORAS_TRABAJADAS_EMPLEADO_3 = 160;
		final Integer ANIOS_ANTIGUEDAD_EMPLEADO_3 = 4;
		final Integer HIJOS_EMPLEADO_3 = 0;
		final Boolean CASADO_EMPLEADO_3 = false;
		final Double VALOR_HORA_EMPLEADO_3 = 300.0;
		final Double VALOR_ANIOS_ANTIGUEDAD_EMPLEADO_3 = 100.0;
		
		EmpleadoPlantaPermanente empleado3 = new EmpleadoPlantaPermanente(HORAS_TRABAJADAS_EMPLEADO_3, ANIOS_ANTIGUEDAD_EMPLEADO_3, HIJOS_EMPLEADO_3,  CASADO_EMPLEADO_3, VALOR_HORA_EMPLEADO_3, VALOR_ANIOS_ANTIGUEDAD_EMPLEADO_3);
		
		empresa.agregarEmpleado(empleado3);
		
		final Integer HORAS_TRABAJADAS_EMPLEADO_4 = 160;
		final Integer ANIOS_ANTIGUEDAD_EMPLEADO_4 = 10;
		final Integer HIJOS_EMPLEADO_4 = 1;
		final Boolean CASADO_EMPLEADO_4 = true;
		final Double VALOR_HORA_EMPLEADO_4 = 400.0;
		final Double VALOR_ANIOS_ANTIGUEDAD_EMPLEADO_4 = 150.0;
		
		Gerente empleado4 = new Gerente(HORAS_TRABAJADAS_EMPLEADO_4, ANIOS_ANTIGUEDAD_EMPLEADO_4, HIJOS_EMPLEADO_4, CASADO_EMPLEADO_4, VALOR_HORA_EMPLEADO_4, VALOR_ANIOS_ANTIGUEDAD_EMPLEADO_4);
		
		empresa.agregarEmpleado(empleado4);
		
		final int CANTIDAD_EMPLEADOS = 4;
		
		assertEquals(CANTIDAD_EMPLEADOS, empresa.getEmpleados().size());
		
		final Double SUMA_TOTAL_SUELDOS_ESPERADA = empleado1.calcularSueldo() + empleado2.calcularSueldo() + empleado3.calcularSueldo() + empleado4.calcularSueldo();
		
		Double sumaTotalSueldos = empresa.calcularTotalSueldos();
		
		assertEquals(SUMA_TOTAL_SUELDOS_ESPERADA, sumaTotalSueldos);
	}
	
}
