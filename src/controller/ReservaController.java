package controller;

import factory.ConnectionFactory;
import model.Reserva;

import java.util.List;

import dao.ReservaDAO;

public class ReservaController {
	private ReservaDAO reservaDao;
	
	public ReservaController() {
        var factory = new ConnectionFactory();
        this.reservaDao = new ReservaDAO(factory.recuperaConexion());
    }
	
	public List<Reserva> listarReservas(){
		return reservaDao.getReservas();
	}
	
	public void guardar(Reserva reserva, Integer categoriaId) {
		reservaDao.guardar(reserva);
    }

	public List<Reserva> getReserva(String idReserva) {
		return reservaDao.getReserva(Integer.parseInt(idReserva));
	}
}
