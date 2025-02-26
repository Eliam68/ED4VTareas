package org.cuatrovientos.ed.ejercicio6;

public class CuentaCorriente extends CuentaBancaria {


    private float limiteDescubierto;

    /**
     * Constructor público vacío
     */
    public CuentaCorriente() {
        super();
        // TODO falta implementar
        this.limiteDescubierto = 0;
    }

    /**
     * Constructor con parámetros
     * @param numero número de cuenta
     * @param titular titular de la cuenta
     * @param saldo saldo inicial
     * @param limiteDescubierto límite de descubierto
     */
    public CuentaCorriente(String numero, String titular, float saldo, float limiteDescubierto) {
        super(numero, titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    /**
     * Retira una cantidad de la cuenta, permitiendo saldo negativo hasta el límite
     * @param cantidad cantidad a retirar
     */
    @Override
    public void retirar(float cantidad) {
    	 // TODO falta implementar comandos para que funcione
    }

    /**
     * (Opcional) Getters y Setters para limiteDescubierto
     */
    public float getLimiteDescubierto() {
        return limiteDescubierto;
    }
    public void setLimiteDescubierto(float limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }
}
