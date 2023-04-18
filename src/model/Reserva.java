package model;

import java.util.Date;

public class Reserva {
	private Integer id;
	private Date checkIn;
	private Date checkOut;
	private double valorReserva;
	private TypePayment methodPayment; 
	
	
	public Reserva(Date checkIn, Date checkOut, double valorReserva,  TypePayment methodPayment) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.valorReserva = valorReserva;
		this.methodPayment = methodPayment;
	}
	
	 @Override
	    public String toString() {
	        return "id: " + this.id + ", entrada: " + this.checkIn +  ", salida: " + this.checkOut + ""
	        		+ ", valor: "+ this.valorReserva;
	    }
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public TypePayment getMethodPayment() {
		return methodPayment;
	}
	
	public double getValorReserva() {
		return valorReserva;
	}
	
	
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public void setValorReserva(double valorReserva) {
		this.valorReserva = valorReserva;
	};
	
	public void setTypePayment(TypePayment methodPayment) {
		this.methodPayment = methodPayment;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	};
	
	
	
}
