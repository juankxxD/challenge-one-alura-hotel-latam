package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Reserva;
import model.TypePayment;


public class ReservaDAO {
	
	private Connection con;

	public ReservaDAO(Connection con) {
		this.con = con;
	}
	
	 public void guardar(Reserva reserva) {
	        try {
	            PreparedStatement statement;
	                statement = con.prepareStatement(
	                        "INSERT INTO RESERVAS "
	                        + "(fechaEntrada, fechaSalida, valor, formaPago)"
	                        + " VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
	    
	            try (statement) {
	                statement.setObject(1, reserva.getCheckIn());
	                statement.setObject(2, reserva.getCheckOut());
	                statement.setDouble(3, reserva.getValorReserva());
	                statement.setObject(4, reserva.getMethodPayment().getId());
	    
	                statement.execute();
	    
	                final ResultSet resultSet = statement.getGeneratedKeys();
	    
	                try (resultSet) {
	                    while (resultSet.next()) {
	                        reserva.setId(resultSet.getInt(1));
	                        
	                        System.out.println(String.format("Fue insertado la reserva: %s", reserva));
	                    }
	                }
	            }
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }
	 
	 public List<Reserva> getReservas() {
		 List<Reserva> resultado =  new ArrayList<>();
		 try {
	            final PreparedStatement statement = con
	                    .prepareStatement("SELECT ID, fechaEntrada, fechaSalida, valor, formaPago FROM RESERVAS");
	    
	            try (statement) {
	                statement.execute();
	    
	                final ResultSet resultSet = statement.getResultSet();
	    
	                try (resultSet) {
	                    while (resultSet.next()) {
	                    	resultado.add(new Reserva(
	                    			resultSet.getInt("ID"),
	                    			resultSet.getDate("fechaEntrada"),
	                    			resultSet.getDate("fechaSalida"),
	                    			resultSet.getDouble("valor"),
	                    			new TypePayment(resultSet.getString("formaPago"))));
	                    }
	                }
	            }
		 }catch (SQLException e) {
	            throw new RuntimeException(e);
		 }
		 return resultado;
	 }
}
