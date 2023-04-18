package controller;

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
}
