package com.canteraSofka;

/**
 * Clase abstracta para el tipo de Nave espacial
 * Lanzadera.
 */
public abstract class NaveLanzadera {

    /**
     * Atributos de las naves espaciales tipo
     * Lanzadera.
     */
    public String nameNave;
    public int loadCapacity;
    public int weight;
    public String typeFuel;
    public int power;

    /**
     * Método constructor de la clase abstracta.
     * @param nameNave parámetro de la nave espacial
     *                 tipo Lanzadera.
     */
    public NaveLanzadera (String nameNave){
        /**
         * Se inicializan los atributos de la nave
         * tipo Lanzadera.
         */
        this.nameNave = nameNave;
        this.loadCapacity = 0;
        this.weight = 0;
        this.typeFuel = "";
        this.power = 0;
    }

    /**
     * Método de la nave tipo Lanzadera
     * @return retorna el peso de la nave.
     */
    public int pesoNave(){
        this.weight = 1500;
        return weight;
    }
}
