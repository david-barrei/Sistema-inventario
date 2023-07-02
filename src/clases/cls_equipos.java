package clases;

import javax.swing.JTable;

public class cls_equipos {

    private int cod_equi;
    private String nom_equ;
    private String mar_equi;
    private String mod_equi;
    private int cant_equi;
    private String col_equi;
    private double cos_uni_equi;
    private String est_equ;

    public cls_equipos() {

    }

    public cls_equipos(int cod_equi, String nom_equ, String mar_equi, String mod_equi, int cant_equi, String col_equi, double cos_uni_equi, String est_equ) {
        this.cod_equi = cod_equi;
        this.nom_equ = nom_equ;
        this.mar_equi = mar_equi;
        this.mod_equi = mod_equi;
        this.cant_equi = cant_equi;
        this.col_equi = col_equi;
        this.cos_uni_equi = cos_uni_equi;
        this.est_equ = est_equ;
    }

    public int getCod_equi() {
        return cod_equi;
    }

    public void setCod_equi(int cod_equi) {
        this.cod_equi = cod_equi;
    }

    public String getNom_equ() {
        return nom_equ;
    }

    public void setNom_equ(String nom_equ) {
        this.nom_equ = nom_equ;
    }

    public String getMar_equi() {
        return mar_equi;
    }

    public void setMar_equi(String mar_equi) {
        this.mar_equi = mar_equi;
    }

    public String getMod_equi() {
        return mod_equi;
    }

    public void setMod_equi(String mod_equi) {
        this.mod_equi = mod_equi;
    }

    public int getCant_equi() {
        return cant_equi;
    }

    public void setCant_equi(int cant_equi) {
        this.cant_equi = cant_equi;
    }

    public String getCol_equi() {
        return col_equi;
    }

    public void setCol_equi(String col_equi) {
        this.col_equi = col_equi;
    }

    public double getCos_uni_equi() {
        return cos_uni_equi;
    }

    public void setCos_uni_equi(double cos_uni_equi) {
        this.cos_uni_equi = cos_uni_equi;
    }

    public String getEst_equ() {
        return est_equ;
    }

    public void setEst_equ(String est_equ) {
        this.est_equ = est_equ;
    }

    cls_conexion obj_conx = new cls_conexion();

    public String Guardar() {
       return obj_conx.ejecutar("INSERT INTO equipos (cod_equi,nom_equ,mar_equi,mod_equi,cant_equi,col_equi,cos_uni_equi,est_equ)  values (" + getCod_equi() + ",'" + getNom_equ() + "', '" + getMar_equi() + "'," + getMod_equi() + "," + getCant_equi() + ",'" + getCol_equi() + "'," + getCos_uni_equi() + ",'" + getEst_equ() + "' )");

    }

    public String Actualizar() {

      return  obj_conx.ejecutar("UPDATE  equipos SET nom_equ='" + getNom_equ() + "',mar_equi='" + getMar_equi() + "',mod_equi=" + getMod_equi() + ",cant_equi=" + getCant_equi() + ",col_equi='" + getCol_equi() + "',cos_uni_equi=" + getCos_uni_equi() + ",est_equ='" + getEst_equ() + "'WHERE(cod_equi=" + getCod_equi() + " )");

    }

    public String Eliminar(int codigo) {
      return  obj_conx.ejecutar("DELETE FROM equipos WHERE (cod_equi=" + codigo + ")");

    }

    public void CargarTabla(JTable NombreTabla) {
        obj_conx.CargarTabla("Select cod_equi as CODIGO,nom_equ as NOMBRE,mar_equi as MARCA,mod_equi as MODELO,cant_equi as CANTIDAD,col_equi as COLOR,cos_uni_equi as COSTOUNITARIO,est_equ as ESTADO From equipos", NombreTabla);

    }

}
