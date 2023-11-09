package com.example.demo.dto;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cajero_codigo")
    private Cajero cajero;

    @ManyToOne
    @JoinColumn(name = "maquina_codigo")
    private MaquinaRegistradora maquina;

    @ManyToOne
    @JoinColumn(name = "producto_codigo")
    private Producto producto;


    public Venta() {
    }

    public Venta(Cajero cajero, MaquinaRegistradora maquina, Producto producto) {
        this.cajero = cajero;
        this.maquina = maquina;
        this.producto = producto;
    }
    
    

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public MaquinaRegistradora getMaquina() {
        return maquina;
    }

    public void setMaquina(MaquinaRegistradora maquina) {
        this.maquina = maquina;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "cajero=" + cajero +
                ", maquina=" + maquina +
                ", producto=" + producto +
                '}';
    }
}