package main.java.com.clinica.odontologica.dao;

import main.java.com.clinica.odontologica.model.Odontologo;
import main.java.com.clinica.odontologica.util.DBUtil;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOImpl implements OdontologoDAO{

	private static final Logger logger = Logger.getLogger(OdontologoDAOImpl.class);

	@Override
	public void guardarOdontologo(Odontologo odontologo) {
		String sql = "INSERT INTO odontologos (numeroMatricula, nombre, apellido) VALUES (?, ?, ?)";

		try (Connection conn = DBUtil.getConnection();
				 PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, odontologo.getNumeroMatricula());
			stmt.setString(2, odontologo.getNombre());
			stmt.setString(3, odontologo.getApellido());

			stmt.executeUpdate();
			logger.info("Odontólogo guardado: " + odontologo);
		} catch (SQLException e) {
			logger.error("Error al guardar odontólogo: " + odontologo, e);
		}
	}

	@Override
	public List<Odontologo> listarOdontologos() {
		List<Odontologo> odontologos = new ArrayList<>();
		String sql = "SELECT * FROM odontologos";

		try (Connection conn = DBUtil.getConnection();
				 PreparedStatement stmt = conn.prepareStatement(sql);
				 ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				String numeroMatricula = rs.getString("numeroMatricula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");

				Odontologo odontologo = new Odontologo(numeroMatricula, nombre, apellido);
				odontologos.add(odontologo);
			}
			logger.info("Listado de odontólogos: " + odontologos);
		} catch (SQLException e) {
			logger.error("Error al listar odontólogos", e);
		}

		return odontologos;
	}
}
