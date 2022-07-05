package veterinaria;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaInstanciarUnaVeterinariaConNombre() {
		final String NOMBRE_VETERINARIA = "Pet Centre";
		
		Veterinaria veterinaria = new Veterinaria(NOMBRE_VETERINARIA);
		
		assertNotNull(veterinaria);
	}

	@Test
	public void queSePuedaCrearUnDuenioConDniYConNombre() {
		final Integer DNI_DUENIO = 11111111;
		final String NOMBRE_DUENIO = "Juan Miguel Pérez";
		
		Dueno dueno = new Dueno(DNI_DUENIO, NOMBRE_DUENIO);
		
		assertNotNull(dueno);
	}
	
	@Test
	public void queSePuedaCrearUnaMascotaConNombreIdApodoYTipoDeMascota() {
		final Integer ID_MASCOTA = 1;
		final String NOMBRE_MASCOTA = "Mora";
		final String APODO_MASCOTA = "Morita";
		final Boolean MASCOTA_DOMESTICA = true;
		
		Mascota mascota = new Mascota(ID_MASCOTA, NOMBRE_MASCOTA, APODO_MASCOTA, MASCOTA_DOMESTICA);
		
		assertNotNull(mascota);
	}
	
	@Test
	public void queSePuedaAgregarDosMascotasAUnDuenio() throws MascotaDuplicadaException {
		final Integer DNI_DUENIO = 11111111;
		final String NOMBRE_DUENIO = "Juan Miguel Pérez";
		
		Dueno dueno = new Dueno(DNI_DUENIO, NOMBRE_DUENIO);
		
		final Integer ID_MASCOTA_1 = 1;
		final String NOMBRE_MASCOTA_1 = "Mora";
		final String APODO_MASCOTA_1 = "Morita";
		final Boolean MASCOTA_DOMESTICA_1 = true;
		
		Mascota mascota1 = new Mascota(ID_MASCOTA_1, NOMBRE_MASCOTA_1, APODO_MASCOTA_1, MASCOTA_DOMESTICA_1);
		
		dueno.agregarMascota(mascota1);
		
		final Integer ID_MASCOTA_2 = 2;
		final String NOMBRE_MASCOTA_2 = "Salvador";
		final String APODO_MASCOTA_2 = "Salva";
		final Boolean MASCOTA_DOMESTICA_2 = false;
		
		Mascota mascota2 = new Mascota(ID_MASCOTA_2, NOMBRE_MASCOTA_2, APODO_MASCOTA_2, MASCOTA_DOMESTICA_2);
		
		dueno.agregarMascota(mascota2);
		
		final Integer VE = 2;
		final Integer VO = dueno.getMascotas().size();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queAlAgregarDosMascotasConMismoIdParaUnMismoDuenioLanceUnaExcepcionMascotaDuplicadaException() throws MascotaDuplicadaException {
		final Integer DNI_DUENIO = 11111111;
		final String NOMBRE_DUENIO = "Juan Miguel Pérez";
		
		Dueno dueno = new Dueno(DNI_DUENIO, NOMBRE_DUENIO);
		
		final Integer ID_MASCOTA_1 = 1;
		final String NOMBRE_MASCOTA_1 = "Mora";
		final String APODO_MASCOTA_1 = "Morita";
		final Boolean MASCOTA_DOMESTICA_1 = true;
		
		Mascota mascota1 = new Mascota(ID_MASCOTA_1, NOMBRE_MASCOTA_1, APODO_MASCOTA_1, MASCOTA_DOMESTICA_1);
		
		dueno.agregarMascota(mascota1);
		
		final Integer ID_MASCOTA_2 = 1;
		final String NOMBRE_MASCOTA_2 = "Salvador";
		final String APODO_MASCOTA_2 = "Salva";
		final Boolean MASCOTA_DOMESTICA_2 = false;
		
		Mascota mascota2 = new Mascota(ID_MASCOTA_2, NOMBRE_MASCOTA_2, APODO_MASCOTA_2, MASCOTA_DOMESTICA_2);
		
		try {
			dueno.agregarMascota(mascota2);
		} catch (MascotaDuplicadaException e) {
			System.err.println(e.getMessage());
		}
		
		final Integer VE = 1;
		final Integer VO = dueno.getMascotas().size();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCrearUnMedicamentoConIdDescripcionYPrecio() {
		final Integer ID_MEDICAMENTO = 1;
		final String DESCRIPCION_MEDICAMENTO = "Antibiótico 0.5grs";
		final Double PRECIO_MEDICAMENTO = 150.0;
		
		Medicamento medicamento = new Medicamento(ID_MEDICAMENTO, DESCRIPCION_MEDICAMENTO, PRECIO_MEDICAMENTO);
		
		assertNotNull(medicamento);
	}
	
	@Test
	public void queSePuedanAgregarDueniosDeMascotasAUnaVeterinaria() {
		final String NOMBRE_VETERINARIA = "Pet Centre";
		
		Veterinaria veterinaria = new Veterinaria(NOMBRE_VETERINARIA);
		
		final Integer DNI_DUENIO_1 = 11111111;
		final String NOMBRE_DUENIO_1 = "Juan Miguel Pérez";
		
		Dueno dueno1 = new Dueno(DNI_DUENIO_1, NOMBRE_DUENIO_1);
		
		veterinaria.agregarDueno(dueno1);
	
		final Integer DNI_DUENIO_2 = 22222222;
		final String NOMBRE_DUENIO_2 = "María Rosa Díaz";
		
		Dueno dueno2 = new Dueno(DNI_DUENIO_2, NOMBRE_DUENIO_2);
		
		veterinaria.agregarDueno(dueno2);
	
		final Integer VE = 2;
		final Integer VO = veterinaria.getDuenos().size();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCrearUnaAtencionConDniDeDuenioIdDeMascotaYPrecio() throws DuenioInexistenteException, MascotaNoEncontradaException {
		final String NOMBRE_VETERINARIA = "Pet Centre";
		
		Veterinaria veterinaria = new Veterinaria(NOMBRE_VETERINARIA);
		
		final Integer DNI_DUENIO = 11111111;
		final String NOMBRE_DUENIO = "Juan Miguel Pérez";
		
		Dueno dueno = new Dueno(DNI_DUENIO, NOMBRE_DUENIO);
		
		veterinaria.agregarDueno(dueno);
		
		final Integer ID_MASCOTA = 1;
		final String NOMBRE_MASCOTA = "Mora";
		final String APODO_MASCOTA = "Morita";
		final Boolean MASCOTA_DOMESTICA = true;
		
		Mascota mascota = new Mascota(ID_MASCOTA, NOMBRE_MASCOTA, APODO_MASCOTA, MASCOTA_DOMESTICA);
		
		try {
			dueno.agregarMascota(mascota);
		} catch (MascotaDuplicadaException e) {
			System.err.println(e.getMessage());
		}
		
		final Double PRECIO_ATENCION = 10000.0;
		
		Atencion atencion = new Atencion(DNI_DUENIO, ID_MASCOTA, PRECIO_ATENCION);
		
		try {
			veterinaria.agregarAtencion(atencion);
		} catch (DuenioInexistenteException e) {
			System.err.println(e.getMessage());
		} catch (MascotaNoEncontradaException e) {
			System.err.println(e.getMessage());
		}
		
		final Integer VE = 1;
		final Integer VO = veterinaria.getAtenciones().size();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaAsignarVariosMedicamentosAUnaAtencion() {
		final String NOMBRE_VETERINARIA = "Pet Centre";
		
		Veterinaria veterinaria = new Veterinaria(NOMBRE_VETERINARIA);
		
		final Integer DNI_DUENIO = 11111111;
		final String NOMBRE_DUENIO = "Juan Miguel Pérez";
		
		Dueno dueno = new Dueno(DNI_DUENIO, NOMBRE_DUENIO);
		
		veterinaria.agregarDueno(dueno);
		
		final Integer ID_MASCOTA = 1;
		final String NOMBRE_MASCOTA = "Mora";
		final String APODO_MASCOTA = "Morita";
		final Boolean MASCOTA_DOMESTICA = true;
		
		Mascota mascota = new Mascota(ID_MASCOTA, NOMBRE_MASCOTA, APODO_MASCOTA, MASCOTA_DOMESTICA);
		
		try {
			dueno.agregarMascota(mascota);
		} catch (MascotaDuplicadaException e) {
			System.err.println(e.getMessage());
		}
		
		final Double PRECIO_ATENCION = 10000.0;
		
		Atencion atencion = new Atencion(DNI_DUENIO, ID_MASCOTA, PRECIO_ATENCION);
		
		try {
			veterinaria.agregarAtencion(atencion);
		} catch (DuenioInexistenteException e) {
			System.err.println(e.getMessage());
		} catch (MascotaNoEncontradaException e) {
			System.err.println(e.getMessage());
		}
		
		final Integer ID_ATENCION = 1;
		
		final Integer ID_MEDICAMENTO_1 = 1;
		final String DESCRIPCION_MEDICAMENTO_1 = "Antibiótico 0.5grs";
		final Double PRECIO_MEDICAMENTO_1 = 150.0;
		
		Medicamento medicamento1 = new Medicamento(ID_ATENCION, ID_MEDICAMENTO_1, DESCRIPCION_MEDICAMENTO_1, PRECIO_MEDICAMENTO_1);
		
		atencion.asignarMedicamento(medicamento1);
		
		final Integer ID_MEDICAMENTO_2 = 2;
		final String DESCRIPCION_MEDICAMENTO_2 = "Antibiótico 1gr";
		final Double PRECIO_MEDICAMENTO_2 = 250.0;
		
		Medicamento medicamento2 = new Medicamento(ID_ATENCION, ID_MEDICAMENTO_2, DESCRIPCION_MEDICAMENTO_2, PRECIO_MEDICAMENTO_2);
	
		atencion.asignarMedicamento(medicamento2);
		
		final Integer VE = 2;
		final Integer VO = atencion.getMedicamentos().size();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCalcularElPrecioTotalDeUnaAtencion() {
		final String NOMBRE_VETERINARIA = "Pet Centre";
		
		Veterinaria veterinaria = new Veterinaria(NOMBRE_VETERINARIA);
		
		final Integer DNI_DUENIO = 11111111;
		final String NOMBRE_DUENIO = "Juan Miguel Pérez";
		
		Dueno dueno = new Dueno(DNI_DUENIO, NOMBRE_DUENIO);
		
		veterinaria.agregarDueno(dueno);
		
		final Integer ID_MASCOTA = 1;
		final String NOMBRE_MASCOTA = "Mora";
		final String APODO_MASCOTA = "Morita";
		final Boolean MASCOTA_DOMESTICA = true;
		
		Mascota mascota = new Mascota(ID_MASCOTA, NOMBRE_MASCOTA, APODO_MASCOTA, MASCOTA_DOMESTICA);
		
		try {
			dueno.agregarMascota(mascota);
		} catch (MascotaDuplicadaException e) {
			System.err.println(e.getMessage());
		}
		
		final Double PRECIO_ATENCION = 10000.0;
		
		Atencion atencion = new Atencion(DNI_DUENIO, ID_MASCOTA, PRECIO_ATENCION);
		
		try {
			veterinaria.agregarAtencion(atencion);
		} catch (DuenioInexistenteException e) {
			System.err.println(e.getMessage());
		} catch (MascotaNoEncontradaException e) {
			System.err.println(e.getMessage());
		}
		
		final Integer ID_ATENCION = 1;
		
		final Integer ID_MEDICAMENTO_1 = 1;
		final String DESCRIPCION_MEDICAMENTO_1 = "Antibiótico 0.5grs";
		final Double PRECIO_MEDICAMENTO_1 = 150.0;
		
		Medicamento medicamento1 = new Medicamento(ID_ATENCION, ID_MEDICAMENTO_1, DESCRIPCION_MEDICAMENTO_1, PRECIO_MEDICAMENTO_1);
		
		atencion.asignarMedicamento(medicamento1);
		
		final Integer ID_MEDICAMENTO_2 = 2;
		final String DESCRIPCION_MEDICAMENTO_2 = "Antibiótico 1gr";
		final Double PRECIO_MEDICAMENTO_2 = 250.0;
		
		Medicamento medicamento2 = new Medicamento(ID_ATENCION, ID_MEDICAMENTO_2, DESCRIPCION_MEDICAMENTO_2, PRECIO_MEDICAMENTO_2);
	
		atencion.asignarMedicamento(medicamento2);
		
		final Double VE = PRECIO_ATENCION + PRECIO_MEDICAMENTO_1 + PRECIO_MEDICAMENTO_2;
		final Double VO = atencion.calcularPrecioTotal();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaObtenerDeUnDuenioUnaListaDeMascotasDomesticasOrdenadasPorApodo() {
		final String NOMBRE_VETERINARIA = "Pet Centre";
		
		Veterinaria veterinaria = new Veterinaria(NOMBRE_VETERINARIA);
		
		final Integer DNI_DUENIO = 11111111;
		final String NOMBRE_DUENIO = "Juan Miguel Pérez";
		
		Dueno dueno = new Dueno(DNI_DUENIO, NOMBRE_DUENIO);
		
		veterinaria.agregarDueno(dueno);
		
		final Integer ID_MASCOTA_1 = 1;
		final String NOMBRE_MASCOTA_1 = "Mora";
		final String APODO_MASCOTA_1 = "Morita";
		final Boolean MASCOTA_DOMESTICA_1 = true;
		
		Mascota mascota1 = new Mascota(ID_MASCOTA_1, NOMBRE_MASCOTA_1, APODO_MASCOTA_1, MASCOTA_DOMESTICA_1);
		
		try {
			dueno.agregarMascota(mascota1);
		} catch (MascotaDuplicadaException e) {
			System.err.println(e.getMessage());
		}
		
		final Integer ID_MASCOTA_2 = 2;
		final String NOMBRE_MASCOTA_2 = "Salvador";
		final String APODO_MASCOTA_2 = "Salva";
		final Boolean MASCOTA_DOMESTICA_2 = false;
		
		Mascota mascota2 = new Mascota(ID_MASCOTA_2, NOMBRE_MASCOTA_2, APODO_MASCOTA_2, MASCOTA_DOMESTICA_2);
		
		try {
			dueno.agregarMascota(mascota2);
		} catch (MascotaDuplicadaException e) {
			System.err.println(e.getMessage());
		}
		
		final Integer ID_MASCOTA_3 = 3;
		final String NOMBRE_MASCOTA_3 = "Jannik";
		final String APODO_MASCOTA_3 = "Jan";
		final Boolean MASCOTA_DOMESTICA_3 = true;
		
		Mascota mascota3 = new Mascota(ID_MASCOTA_3, NOMBRE_MASCOTA_3, APODO_MASCOTA_3, MASCOTA_DOMESTICA_3);
		
		try {
			dueno.agregarMascota(mascota3);
		} catch (MascotaDuplicadaException e) {
			System.err.println(e.getMessage());
		}
		
		List<Mascota> VE = new ArrayList<Mascota>();
		
		VE.add(mascota3);
		VE.add(mascota1);
		VE.add(mascota2);
		
		List<Mascota> VO = new ArrayList<Mascota>(dueno.obtenerListaMascotasDomesticasOrdenadasPorApodo());
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaObtenerUnMapaConIdDeAtencionYIdDeMascota() {
		final String NOMBRE_VETERINARIA = "Pet Centre";
		
		Veterinaria veterinaria = new Veterinaria(NOMBRE_VETERINARIA);
		
		final Integer DNI_DUENIO = 11111111;
		final String NOMBRE_DUENIO = "Juan Miguel Pérez";
		
		Dueno dueno = new Dueno(DNI_DUENIO, NOMBRE_DUENIO);
		
		veterinaria.agregarDueno(dueno);
		
		final Integer ID_MASCOTA_1 = 1;
		final String NOMBRE_MASCOTA_1 = "Mora";
		final String APODO_MASCOTA_1 = "Morita";
		final Boolean MASCOTA_DOMESTICA_1 = true;
		
		Mascota mascota1 = new Mascota(ID_MASCOTA_1, NOMBRE_MASCOTA_1, APODO_MASCOTA_1, MASCOTA_DOMESTICA_1);
		
		try {
			dueno.agregarMascota(mascota1);
		} catch (MascotaDuplicadaException e) {
			System.err.println(e.getMessage());
		}
		
		final Integer ID_MASCOTA_2 = 2;
		final String NOMBRE_MASCOTA_2 = "Salvador";
		final String APODO_MASCOTA_2 = "Salva";
		final Boolean MASCOTA_DOMESTICA_2 = false;
		
		Mascota mascota2 = new Mascota(ID_MASCOTA_2, NOMBRE_MASCOTA_2, APODO_MASCOTA_2, MASCOTA_DOMESTICA_2);
		
		try {
			dueno.agregarMascota(mascota2);
		} catch (MascotaDuplicadaException e) {
			System.err.println(e.getMessage());
		}
		
		final Double PRECIO_ATENCION = 10000.0;
		final Integer ID_ATENCION_1 = 1;
		final Integer ID_ATENCION_2 = 2;
		
		Atencion atencion1 = new Atencion(ID_ATENCION_1, DNI_DUENIO, ID_MASCOTA_1, PRECIO_ATENCION);
		
		try {
			veterinaria.agregarAtencion(atencion1);
		} catch (DuenioInexistenteException e) {
			System.err.println(e.getMessage());
		} catch (MascotaNoEncontradaException e) {
			System.err.println(e.getMessage());
		}
		
		Atencion atencion2 = new Atencion(ID_ATENCION_2, DNI_DUENIO, ID_MASCOTA_2, PRECIO_ATENCION);
		
		try {
			veterinaria.agregarAtencion(atencion2);
		} catch (DuenioInexistenteException e) {
			System.err.println(e.getMessage());
		} catch (MascotaNoEncontradaException e) {
			System.err.println(e.getMessage());
		}
		
		Map<Integer, Integer> VE = new HashMap<Integer, Integer>();
		
		VE.put(ID_ATENCION_1, ID_MASCOTA_1);
		VE.put(ID_ATENCION_2, ID_MASCOTA_2);
		
		Map<Integer, Integer> VO = new HashMap<Integer, Integer>(veterinaria.obtenerMapaConIdAtencionYIdMascota());
		
		assertEquals(VE, VO);
	}

}
