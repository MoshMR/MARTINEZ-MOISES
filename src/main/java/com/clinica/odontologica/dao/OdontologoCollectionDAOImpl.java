package main.java.com.clinica.odontologica.dao;

import main.java.com.clinica.odontologica.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoCollectionDAOImpl implements OdontologoDAO{
	private static final Logger logger = Logger.getLogger(OdontologoCollectionDAOImpl.class);
	private List<Odontologo> odontologos = new ArrayList<>();

	@Override
	public void guardarOdontologo(Odontologo odontologo) {
		odontologos.add(odontologo);
		logger.info("Odontólogo guardado: " + odontologo);
	}

	@Override
	public List<Odontologo> listarOdontologos() {
		logger.info("Listado de odontologos: " + odontologos);
		return new ArrayList<>(odontologos);
	}
}
