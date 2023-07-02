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
public class cls_detallefactura {
    
    private int num_fac;
    private int id_pro;
    private int can_pro;
    private double tot_linea;
    
    public cls_detallefactura(){
        
    }

    public cls_detallefactura(int num_fac, int id_pro, int can_pro, double tot_linea) {
        this.num_fac = num_fac;
        this.id_pro = id_pro;
        this.can_pro = can_pro;
        this.tot_linea = tot_linea;
    }

    public int getNum_fac() {
        return num_fac;
    }

    public void setNum_fac(int num_fac) {
        this.num_fac = num_fac;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public int getCan_pro() {
        return can_pro;
    }

    public void setCan_pro(int can_pro) {
        this.can_pro = can_pro;
    }

    public double getTot_linea() {
        return tot_linea;
    }

    public void setTot_linea(double tot_linea) {
        this.tot_linea = tot_linea;
    }
    
     cls_conexion obj_conx = new cls_conexion();
    public String guardar(){   //int num_fac, int id_pro, int can_pro, double tot_linea
         return obj_conx.ejecutar("INSERT INTO detalle_factura (num_fac, id_pro ,can_pro, tot_linea) VALUES ("+getNum_fac()+",'"+getId_pro()+"','"+getCan_pro()+"',"+getTot_linea()+")");
      
        
    }
    
//     public void CargarTabla (JTable NombreTabla){
//        obj_conx.CargarTabla("Select num_fac as Numero_Factura, id_pro as ID_Producto, can_pro as Cantidad, tot_linea as Total From detalle_factura", NombreTabla);
//    }
    
    
    
}
