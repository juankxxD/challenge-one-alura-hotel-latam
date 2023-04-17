package model;

import java.time.LocalDate;

public class Reserva {
	private LocalDate checkIn;
	private LocalDate checkOut;
	private double valorReserva;
	private TypePayment methodPayment; 
	
	
	public Reserva(LocalDate checkIn, LocalDate checkOut, double valorReserva,  TypePayment methodPayment) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.valorReserva = valorReserva;
		this.methodPayment = methodPayment;
	}
	public LocalDate getCheckIn() {
		return checkIn;
	}
	
	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	public TypePayment getMethodPayment() {
		return methodPayment;
	}
	
	public double getValorReserva() {
		return valorReserva;
	}
	
	
	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}
	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}
	public void setValorReserva(double valorReserva) {
		this.valorReserva = valorReserva;
	};
	
	public void setTypePayment(TypePayment methodPayment) {
		this.methodPayment = methodPayment;
	};
	
	
	
}
