package controller;

import factory.ConnectionFactory;
import model.Reserva;
import dao.ReservaDAO;

public class ReservaController {
	private ReservaDAO reservaDao;
	
	public ReservaController() {
        var factory = new ConnectionFactory();
        this.reservaDao = new ReservaDAO(factory.recuperaConexion());
    }
	
	public void guardar(Reserva reserva, Integer categoriaId) {
		reservaDao.guardar(reserva);
    }

}
