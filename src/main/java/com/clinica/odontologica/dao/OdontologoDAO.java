package main.java.com.clinica.odontologica.dao;


import main.java.com.clinica.odontologica.model.Odontologo;
import java.util.List;

public interface OdontologoDAO {
	void guardarOdontologo(Odontologo odontologo);
	List<Odontologo> listarOdontologos();
}
