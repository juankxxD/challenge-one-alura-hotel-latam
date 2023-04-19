package controller;

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
}
