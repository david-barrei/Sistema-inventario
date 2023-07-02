package clases;

import javax.swing.JTable;

public class cls_productos {

    private int id_pro;
    private String nom_pro;
    private double pvp_pro;
    private int stock_pro;
    private int id_marca;

    public cls_productos() {
    }

    public cls_productos(int id_pro, String nom_pro, double pvp_pro, int stock_pro, int id_marca) {
        this.id_pro = id_pro;
        this.nom_pro = nom_pro;
        this.pvp_pro = pvp_pro;
        this.stock_pro = stock_pro;
        this.id_marca = id_marca;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }

    public double getPvp_pro() {
        return pvp_pro;
    }

    public void setPvp_pro(double pvp_pro) {
        this.pvp_pro = pvp_pro;
    }

    public int getStock_pro() {
        return stock_pro;
    }

    public void setStock_pro(int stock_pro) {
        this.stock_pro = stock_pro;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    
    cls_conexion cnx = new cls_conexion();
    
    public String guardar() {
      return cnx.ejecutar("Insert into productos (id_pro, nom_pro, pvp_pro, stock_pro, id_marca)values(" + getId_pro() + ",'" + getNom_pro() + "'," + getPvp_pro() + "," + getStock_pro() + ", "+getId_marca()+");");
    }
    
    public String actualizar() {
      return cnx.ejecutar("Update productos set nom_pro='" + getNom_pro() + "', pvp_pro=" + getPvp_pro() + ", stock_pro=" + getStock_pro() + ", id_marca=" + getId_marca() + "  Where (id_pro=" + getId_pro() + ");");
    }
    
    public String eliminar(int codigo) {
     return cnx.ejecutar("Delete from productos Where (id_pro=" + codigo + ");");
    }
    
    public void CargarTabla(JTable Tabla) {
        cnx.CargarTabla("Select id_pro as ID, nom_pro as Producto, pvp_pro as PVP, stock_pro as Stock, nom_mar as Marca from productos inner join marcas on productos.id_pro=marcas.id_marca;", Tabla);
    }
}
