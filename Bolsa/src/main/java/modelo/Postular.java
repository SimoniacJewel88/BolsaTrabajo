package modelo;
// Generated 12/03/2018 01:44:55 PM by Hibernate Tools 4.3.1



/**
 * Postular generated by hbm2java
 */
public class Postular  implements java.io.Serializable {


     private int idPostular;
     private Profesionista profesionista;
     private Vacante vacante;

    public Postular() {
    }

	
    public Postular(int idPostular) {
        this.idPostular = idPostular;
    }
    public Postular(int idPostular, Profesionista profesionista, Vacante vacante) {
       this.idPostular = idPostular;
       this.profesionista = profesionista;
       this.vacante = vacante;
    }
   
    public int getIdPostular() {
        return this.idPostular;
    }
    
    public void setIdPostular(int idPostular) {
        this.idPostular = idPostular;
    }
    public Profesionista getProfesionista() {
        return this.profesionista;
    }
    
    public void setProfesionista(Profesionista profesionista) {
        this.profesionista = profesionista;
    }
    public Vacante getVacante() {
        return this.vacante;
    }
    
    public void setVacante(Vacante vacante) {
        this.vacante = vacante;
    }




}

