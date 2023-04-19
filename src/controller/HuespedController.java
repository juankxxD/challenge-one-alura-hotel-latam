package controller;

import java.util.Date;
import java.util.List;

import dao.HuespedDAO;
import factory.ConnectionFactory;
import model.Huesped;

public class HuespedController {
private HuespedDAO huespedDao;
	
	public HuespedController() {
        var factory = new ConnectionFactory();
        this.huespedDao = new HuespedDAO(factory.recuperaConexion());
    }
	
	public void guardar(Huesped huesped) {
		huespedDao.guardar(huesped);
    }
	
	public List<Huesped> listarHuesped() {
		return huespedDao.getHuespeds();
	}
	
	public List<Huesped> listarHuespedByCondition(String condition) {
		return huespedDao.getHuespedByCondition(condition);
	}
	
	public int delete(int id) {
		return huespedDao.delete(id);
	}
	
	public int deleteByReserva(int idReserva) {
		return huespedDao.deleteByReserva(idReserva);
	}

	public int update(Integer id, String nombre, String apellido, Date fechaNacimiento, String nacionalidad,
			String telefono) {
		return huespedDao.update(id, nombre, apellido, fechaNacimiento, nacionalidad, telefono);
	}
}
