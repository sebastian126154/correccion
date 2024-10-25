package models;

public class Carro {
    private String nombre;
    private String modelo;

    private int year;

    public Carro(String nombre, String modelo, int year) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.year = year;
    }

    public String getPlaca() {
        return nombre;
    }

    public void setPlaca(String nombre) {
        this.nombre = nombre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
}
