/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JTable;

/**
 *
 * @author davba
 */
public class cls_marca {
   
    private int id_marca;
    private String nom_mar;
    private String obs_marca;
    
    public cls_marca(){
        
        
    }

    public cls_marca(int id_marca, String nom_mar, String obs_marca) {
        this.id_marca = id_marca;
        this.nom_mar = nom_mar;
        this.obs_marca = obs_marca;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getNom_mar() {
        return nom_mar;
    }

    public void setNom_mar(String nom_mar) {
        this.nom_mar = nom_mar;
    }

    public String getObs_marca() {
        return obs_marca;
    }

    public void setObs_marca(String obs_marca) {
        this.obs_marca = obs_marca;
    }
    
     cls_conexion cnx = new cls_conexion();

    public String guardar() {
       return cnx.ejecutar("Insert into marcas (id_marca, nom_mar, obs_marca)values ("+getId_marca()+",'"+getNom_mar()+"', '"+getObs_marca()+"');");
    }
    public String actualizar() {
      return  cnx.ejecutar("Update marcas set nom_mar='"+getNom_mar()+"', obs_marca='"+getObs_marca()+"' Where (id_marca="+getId_marca()+");");
    }
    public String eliminar(int codigo) {
      return  cnx.ejecutar("Delete from marcas Where(id_marca="+codigo+");");
    }
    public void CargarTabla(JTable Tabla){
        cnx.CargarTabla("Select id_marca as ID, nom_mar as Nombre, obs_marca as Observaciones From marcas", Tabla);
    }
    
}
