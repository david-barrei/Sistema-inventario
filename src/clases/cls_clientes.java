package clases;

import javax.swing.JTable;

public class cls_clientes {

    private int cod_cli;
    private String nom_cli;
    private int tel_cli;
    private String dir_cli;
    private int id_tip_cli;
    

    public cls_clientes() {

    }

    public cls_clientes(int cod_cli, String nom_cli, int tel_cli, String dir_cli, int id_tip_cli) {
        this.cod_cli = cod_cli;
        this.nom_cli = nom_cli;
        this.tel_cli = tel_cli;
        this.dir_cli = dir_cli;
        this.id_tip_cli = id_tip_cli;
    }

    public int getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public int getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(int tel_cli) {
        this.tel_cli = tel_cli;
    }

    public String getDir_cli() {
        return dir_cli;
    }

    public void setDir_cli(String dir_cli) {
        this.dir_cli = dir_cli;
    }

    public int getId_tip_cli() {
        return id_tip_cli;
    }

    public void setId_tip_cli(int id_tip_cli) {
        this.id_tip_cli = id_tip_cli;
    }

    cls_conexion cnx = new cls_conexion();
    
    public String guardar() {
      return cnx.ejecutar("Insert into clientes (cod_cli, nom_cli, dir_cli, tel_cli, id_tip_cli)values(" + getCod_cli() + ",'" + getNom_cli() + "','" + getDir_cli() + "'," + getTel_cli() + ", "+getId_tip_cli()+");");
       
    }
    
    public String actualizar() {
      return cnx.ejecutar("Update clientes set nom_cli=" + getNom_cli() + ", dir_cli='" + getDir_cli()+ "', tel_cli=" + getTel_cli()+ ", id_tip_cli=" + getId_tip_cli()+ " Where (cod_cli=" + getCod_cli()+ ");");
    }
    
    public String eliminar(int codigo) {
     return cnx.ejecutar("Delete from clientes Where (cod_cli=" + codigo + ");");
    }
    
    public void CargarTabla(JTable Tabla) {
        cnx.CargarTabla("Select cod_cli as Cédula, nom_cli as Nombre, dir_cli as Dirección, tel_cli as Teléfono, des_tip_cli as Tipo_Cliente From clientes\n" +
          "inner join tipo_clientes on tipo_clientes.id_tip_cli=Clientes.id_tip_cli", Tabla);
    }
}



















