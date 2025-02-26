package org.cuatrovientos.ed.ejercicio4;

public class ProductoCompra {

    private String nombre;
    private int cantidad;
    private boolean comprado;

    /**
     * Constructor público vacío
     */
    public ProductoCompra() {
        // TODO falta implementar comandos para que funcione.
    }

    /**
     * Constructor con parámetros
     * @param nombre nombre del producto
     * @param cantidad cantidad
     */
    public ProductoCompra(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.comprado = false;
    }

    /**
     * Devuelve un toString del objeto
     * @return String con la información del producto
     */
    @Override
    public String toString() {
        // TODO falta implementar comandos para que funcione.
        return "";
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public boolean isComprado() {
        return comprado;
    }
    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
}

