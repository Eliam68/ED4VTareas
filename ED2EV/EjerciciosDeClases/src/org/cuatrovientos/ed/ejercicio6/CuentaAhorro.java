package org.cuatrovientos.ed.ejercicio6;

public class CuentaAhorro extends CuentaBancaria {


    private float interes = 2; 

    public CuentaAhorro() {
		super();
		// TODO Auto-generated constructor stub
	}
    public CuentaAhorro(String numero, String titular, float saldo, float interes) {
        super(numero, titular, saldo);
        this.interes = interes;
    }
	/**
     * Aplica el interés al saldo actual
     */
    public void aplicarInteres() {
    	 // TODO falta implementar comandos para que funcione
    
    }

    /**
     * Sobrescribe mostrarInformacion para incluir también el interés
     */
    @Override
    public void mostrarInformacion() {
    	 // TODO falta implementar comandos para que funcione
    }

    public  float getInteres() {
        return interes;
    }
    public  void setInteres(float nuevoInteres) {
        interes = nuevoInteres;
    }
}
