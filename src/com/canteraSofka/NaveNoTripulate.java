package com.canteraSofka;

/**
 * Clase abstracta para el tipo de Nave espacial
 * No Tripulada.
 */
public abstract class NaveNoTripulate {

    /**
     * Atributos de las naves espaciales tipo
     * No Tripuladas.
     */
    public String nameNave;
    public String typeFuel;
    public double thrust;
    public int travelDistance;

    /**
     * Método constructor de la clase abstracta.
     * @param nameNave parámetro de la nave espacial
     *                 tipo No Tripulada.
     */
    public NaveNoTripulate(String nameNave){
        this.nameNave = nameNave;
        this.typeFuel = "";
        this.thrust = 0;
        this.travelDistance = 0;
    }

    /**
     * Método de la nave tipo No Tripulada
     * @return retorna la distancia que puede
     * viajar este tipo de nave.
     */
    public int travelScope(){
        this.travelDistance = 56000;
        return travelDistance;
    }
}
