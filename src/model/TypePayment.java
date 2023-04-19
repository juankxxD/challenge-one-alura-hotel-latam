package model;

public class TypePayment {

	private Integer id;
    private String nombre;

	public TypePayment(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public TypePayment(String nombre) {
		this.nombre = nombre;
	}
	public TypePayment(Integer id) {
		this.id = id;
	}
	
	@Override
    public String toString() {
        return "id: " + this.id + ", nombre: " + this.nombre;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
}
