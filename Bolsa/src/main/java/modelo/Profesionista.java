package modelo;
// Generated 12/03/2018 01:44:55 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Profesionista generated by hbm2java
 */
public class Profesionista  implements java.io.Serializable {


     private int idProfesionista;
     private String carrera;
     private String nacionalidad;
     private String contrasena;
     private String telefonoProfesionista;
     private String nombreProfesionista;
     private String empresaLaboral;
     private String correoProfesionista;
     private String cargoLaboral;
     private String periodoLaboral;
     private String colegioFormacion;
     private String gradoFormacion;
     private String periodoFormacion;
     private String nombreSkils;
     private String gradoSkils;
     private Set postulars = new HashSet(0);

    public Profesionista() {
    }

	
    public Profesionista(int idProfesionista) {
        this.idProfesionista = idProfesionista;
    }
    public Profesionista(int idProfesionista, String carrera, String nacionalidad, String contrasena, String telefonoProfesionista, String nombreProfesionista, String empresaLaboral, String correoProfesionista, String cargoLaboral, String periodoLaboral, String colegioFormacion, String gradoFormacion, String periodoFormacion, String nombreSkils, String gradoSkils, Set postulars) {
       this.idProfesionista = idProfesionista;
       this.carrera = carrera;
       this.nacionalidad = nacionalidad;
       this.contrasena = contrasena;
       this.telefonoProfesionista = telefonoProfesionista;
       this.nombreProfesionista = nombreProfesionista;
       this.empresaLaboral = empresaLaboral;
       this.correoProfesionista = correoProfesionista;
       this.cargoLaboral = cargoLaboral;
       this.periodoLaboral = periodoLaboral;
       this.colegioFormacion = colegioFormacion;
       this.gradoFormacion = gradoFormacion;
       this.periodoFormacion = periodoFormacion;
       this.nombreSkils = nombreSkils;
       this.gradoSkils = gradoSkils;
       this.postulars = postulars;
    }
   
    public int getIdProfesionista() {
        return this.idProfesionista;
    }
    
    public void setIdProfesionista(int idProfesionista) {
        this.idProfesionista = idProfesionista;
    }
    public String getCarrera() {
        return this.carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getTelefonoProfesionista() {
        return this.telefonoProfesionista;
    }
    
    public void setTelefonoProfesionista(String telefonoProfesionista) {
        this.telefonoProfesionista = telefonoProfesionista;
    }
    public String getNombreProfesionista() {
        return this.nombreProfesionista;
    }
    
    public void setNombreProfesionista(String nombreProfesionista) {
        this.nombreProfesionista = nombreProfesionista;
    }
    public String getEmpresaLaboral() {
        return this.empresaLaboral;
    }
    
    public void setEmpresaLaboral(String empresaLaboral) {
        this.empresaLaboral = empresaLaboral;
    }
    public String getCorreoProfesionista() {
        return this.correoProfesionista;
    }
    
    public void setCorreoProfesionista(String correoProfesionista) {
        this.correoProfesionista = correoProfesionista;
    }
    public String getCargoLaboral() {
        return this.cargoLaboral;
    }
    
    public void setCargoLaboral(String cargoLaboral) {
        this.cargoLaboral = cargoLaboral;
    }
    public String getPeriodoLaboral() {
        return this.periodoLaboral;
    }
    
    public void setPeriodoLaboral(String periodoLaboral) {
        this.periodoLaboral = periodoLaboral;
    }
    public String getColegioFormacion() {
        return this.colegioFormacion;
    }
    
    public void setColegioFormacion(String colegioFormacion) {
        this.colegioFormacion = colegioFormacion;
    }
    public String getGradoFormacion() {
        return this.gradoFormacion;
    }
    
    public void setGradoFormacion(String gradoFormacion) {
        this.gradoFormacion = gradoFormacion;
    }
    public String getPeriodoFormacion() {
        return this.periodoFormacion;
    }
    
    public void setPeriodoFormacion(String periodoFormacion) {
        this.periodoFormacion = periodoFormacion;
    }
    public String getNombreSkils() {
        return this.nombreSkils;
    }
    
    public void setNombreSkils(String nombreSkils) {
        this.nombreSkils = nombreSkils;
    }
    public String getGradoSkils() {
        return this.gradoSkils;
    }
    
    public void setGradoSkils(String gradoSkils) {
        this.gradoSkils = gradoSkils;
    }
    public Set getPostulars() {
        return this.postulars;
    }
    
    public void setPostulars(Set postulars) {
        this.postulars = postulars;
    }




}


