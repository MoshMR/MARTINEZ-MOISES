package main.java.com.clinica.odontologica;

import main.java.com.clinica.odontologica.dao.OdontologoDAO;
import main.java.com.clinica.odontologica.dao.OdontologoDAOImpl;
import main.java.com.clinica.odontologica.model.Odontologo;

public class main {
	public static void main(String[] args) {
		OdontologoDAO dao = new OdontologoDAOImpl();
		Odontologo odontologo1 = new Odontologo("12345", "Juan", "Perez");
		dao.guardarOdontologo(odontologo1);

		Odontologo odontologo2 = new Odontologo("67890", "Ana", "Gomez");
		dao.guardarOdontologo(odontologo2);

		dao.listarOdontologos().forEach(System.out::println);
	}
}
