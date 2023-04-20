package controller;

import java.util.List;

import dao.MethodPaymentDAO;
import factory.ConnectionFactory;
import model.TypePayment;

public class MethodPaymentController {
	private MethodPaymentDAO methodPaymentDAO;
	
	public MethodPaymentController() {
		ConnectionFactory factory = new ConnectionFactory();
		this.methodPaymentDAO = new MethodPaymentDAO(factory.recuperaConexion());
	}
	
	public List<TypePayment> getMethodPayment() {
		return methodPaymentDAO.getMethodPayment();
	}
}
