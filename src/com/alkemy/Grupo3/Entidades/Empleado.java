package com.alkemy.Grupo3.Entidades;

public class Empleado  extends Persona{

    protected  double ventasBrutas;
    protected  double tarifaComision;
    protected  String numeroSeguroSocial;
    protected double salario;

    public Empleado(String nombre, String apellido, int edad, double ventasBrutas, double tarifaComision, String numeroSeguroSocial) {
        super(nombre, apellido, edad);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public Empleado(String nombre, String apellido, int edad, double ventasBrutas, String numeroSeguroSocial) {
        super(nombre, apellido, edad);
        this.ventasBrutas = ventasBrutas;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public double ingresos(){
  	     return 0;
     }



    public String toString() {
        return "Empleado";
    }
}
