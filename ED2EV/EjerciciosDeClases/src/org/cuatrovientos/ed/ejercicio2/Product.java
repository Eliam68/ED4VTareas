package org.cuatrovientos.ed.ejercicio2;

public class Product {
	
    private String name;
    private int qty;
    private float price;

    /**
     * Constructor público vacío
     */
    public Product() {
    	  // TODO falta implementar comandos para que funcione.
    }

    /**
     * Constructor con todos los atributos
     * @param name nombre del producto
     * @param qty cantidad
     * @param price precio unitario
     */
    public Product(String name, int qty, float price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
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

    /**
     * Devuelve el total (qty * price)
     * @return total del producto
     */
    public float total() {
    	  // TODO falta implementar comandos para que funcione.
        return qty * price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}

