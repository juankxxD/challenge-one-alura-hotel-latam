package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Huesped;

public class HuespedDAO {
		
		private Connection con;

		public HuespedDAO(Connection con) {
			this.con = con;
		}
		
		 public void guardar(Huesped huesped) {
		        try {
		            PreparedStatement statement;
		                statement = con.prepareStatement(
		                        "INSERT INTO HUESPEDES "
		                        + "(nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva)"
		                        + " VALUES ( ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
		    
		            try (statement) {
		                statement.setString(1, huesped.getNombre());
		                statement.setString(2, huesped.getApellido());
		                statement.setObject(3, huesped.getFechaNacimiento());
		                statement.setString(4, huesped.getNacionalidad());
		                statement.setString(5, huesped.getTelefono());
		                statement.setInt(6, huesped.getReserva().getId());
		                statement.execute();
		    
		                final ResultSet resultSet = statement.getGeneratedKeys();
		    
		                try (resultSet) {
		                    while (resultSet.next()) {
		                    	huesped.setId(resultSet.getInt(1));
		                        System.out.println(String.format("Fue insertado la reserva: %s", huesped));
		                    }
		                }
		            }
		        } catch (SQLException e) {
		            throw new RuntimeException(e);
		        }
		    }

}
