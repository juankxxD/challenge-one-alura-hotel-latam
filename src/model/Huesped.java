package model;

import java.time.LocalDate;
import java.util.Date;

public class Huesped {
	  private int id;
	  private String nombre;
	  private String apellido;
	  private Date fechaNacimiento;
	  private String nacionalidad;
	  private String telefono;
	  private Reserva reserva;
	  
	public Huesped(String nombre, String apellido, Date fechaNacimiento, String nacionalidad,
			String telefono, Reserva reserva) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.reserva = reserva;
	}
	public Huesped(Integer id, String nombre, String apellido, Date fechaNacimiento, String nacionalidad,
			String telefono, Reserva reserva) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.reserva = reserva;
	}

	@Override
    public String toString() {
        return "id: " + this.id + ", nombre: " + this.nombre +  ", apellido: " + this.apellido + ""
        		+ ", fechaNacimiento: "+ this.fechaNacimiento + ", nacionalidad: "+ this.nacionalidad
        		+ ", telefono: "+ this.telefono + ", reserva: "+ this.reserva;
    }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
	
	  
	  
}
