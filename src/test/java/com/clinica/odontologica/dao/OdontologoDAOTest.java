package test.java.com.clinica.odontologica.dao;

import main.java.com.clinica.odontologica.dao.OdontologoCollectionDAOImpl;
import main.java.com.clinica.odontologica.dao.OdontologoDAO;
import main.java.com.clinica.odontologica.model.Odontologo;

import main.java.com.clinica.odontologica.model.Odontologo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OdontologoDAOTest {
	private OdontologoDAO dao;

	@BeforeEach
	public void setUp(){
		dao = new OdontologoCollectionDAOImpl();
	}

	@Test
	public void	testGuardarOdontologo() {
		Odontologo odontologo = new Odontologo("12345", "Juan", "Perez");
		dao.guardarOdontologo(odontologo);

		List<Odontologo> odontologos = dao.listarOdontologos();
		assertEquals(1, odontologos.size());
		assertEquals("Juan", odontologos.get(0).getNombre());
	}

	@Test
	public void testListarOdontologos() {
		Odontologo odontologo1 = new Odontologo("12345", "Juan", "Perez");
		Odontologo odontologo2 = new Odontologo("67890", "Ana", "Gomez");

		dao.guardarOdontologo(odontologo1);
		dao.guardarOdontologo(odontologo2);

		List<Odontologo> odontologos = dao.listarOdontologos();
		assertEquals(2, odontologos.size());
	}

}
