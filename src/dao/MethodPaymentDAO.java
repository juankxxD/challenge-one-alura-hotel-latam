package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.TypePayment;

public class MethodPaymentDAO {
	private Connection con;
	
	public MethodPaymentDAO(Connection con) {
		this.con = con;
	}
	
	public List<TypePayment> getMethodPayment() {
		List<TypePayment> listMethod = new ArrayList<>();
		
		try {
			 final PreparedStatement statement = con
	                    .prepareStatement("SELECT ID, NOMBRE FROM METHOD_PAYMENT");
			 
	            try (statement) {
	                statement.execute();

	                final ResultSet resultSet = statement.getResultSet();
	    
	                try (resultSet) {
	                	 while (resultSet.next()) {
	                		 listMethod.add(new TypePayment(
	                				 resultSet.getInt("ID"),
	                				 resultSet.getString("NOMBRE")
	                				 ));
	                	 }
	                }
	            }
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listMethod;
	}
}
