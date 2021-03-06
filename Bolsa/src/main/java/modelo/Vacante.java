package modelo;
// Generated 12/03/2018 01:44:55 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Vacante generated by hbm2java
 */
public class Vacante  implements java.io.Serializable {


     private int idVacante;
     private String descripcion;
     private String puesto;
     private String horario;
     private String lugar;
     private String salario;
     private String actividades;
     private Set postulars = new HashSet(0);
     private Set teners = new HashSet(0);

    public Vacante() {
    }

	
    public Vacante(int idVacante) {
        this.idVacante = idVacante;
    }
    public Vacante(int idVacante, String descripcion, String puesto, String horario, String lugar, String salario, String actividades, Set postulars, Set teners) {
       this.idVacante = idVacante;
       this.descripcion = descripcion;
       this.puesto = puesto;
       this.horario = horario;
       this.lugar = lugar;
       this.salario = salario;
       this.actividades = actividades;
       this.postulars = postulars;
       this.teners = teners;
    }
   
    public int getIdVacante() {
        return this.idVacante;
    }
    
    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getHorario() {
        return this.horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getSalario() {
        return this.salario;
    }
    
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getActividades() {
        return this.actividades;
    }
    
    public void setActividades(String actividades) {
        this.actividades = actividades;
    }
    public Set getPostulars() {
        return this.postulars;
    }
    
    public void setPostulars(Set postulars) {
        this.postulars = postulars;
    }
    public Set getTeners() {
        return this.teners;
    }
    
    public void setTeners(Set teners) {
        this.teners = teners;
    }




}


