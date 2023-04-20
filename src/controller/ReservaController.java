package controller;

import factory.ConnectionFactory;
import model.Reserva;
import views.ReservasView;

import java.util.Date;
import java.util.List;

import dao.ReservaDAO;

public class ReservaController {
	private ReservaDAO reservaDao;
	
	public ReservaController() {
		ConnectionFactory factory = new ConnectionFactory();
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
	
	public int delete(int id) {
		return reservaDao.delete(id);
	}

	public int update(Integer id, Date checkin, Date checkout) {
		// TODO Auto-generated method stub
		int from = Integer.parseInt(checkin.toString().split(" ")[2]);
		int to = Integer.parseInt(checkout.toString().split(" ")[2]);
		double valor = (to - from + 1) * 3000;
		return reservaDao.update(id, checkin, checkout, valor);
	}
}
