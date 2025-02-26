package org.cuatrovientos.ed.ejercicio6;

public class CuentaBancaria {
    protected String numero;
    protected String titular;
    protected float saldo;

    /**
     * Constructor público vacío
     */
    public CuentaBancaria() {
    	 // TODO falta implementar validaciones si se desea
    }

    /**
     * Constructor con parámetros
     * @param numero número de cuenta
     * @param titular titular de la cuenta
     * @param saldo saldo inicial
     */
    public CuentaBancaria(String numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     * Deposita una cantidad en la cuenta
     * @param cantidad cantidad a depositar
     */
    public void depositar(float cantidad) {
        // TODO falta implementar validaciones si se desea
        this.saldo += cantidad;
    }

    /**
     * Retira una cantidad de la cuenta (sin permitir saldo negativo)
     * @param cantidad cantidad a retirar
     */
    public void retirar(float cantidad) {
        // TODO modificar lógica si se desea
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente. No se puede retirar " + cantidad);
        }
    }

    /**
     * Muestra la información de la cuenta
     */
    public void mostrarInformacion() {
    	 // TODO falta implementar comandos para que funcione
    }

    // Getters y Setters (opcionales)
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
