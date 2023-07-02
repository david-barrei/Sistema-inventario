/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import clases.cls_conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author davba
 */
public class frm_productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form frm_productos
     */
    public frm_productos() {
        initComponents();
        clases.cls_productos obj = new clases.cls_productos();
        obj.CargarTabla(tabla_productos);
        //txt_codigo.enable(false);
        clases.cls_conexion cnx = new clases.cls_conexion();
        cnx.cargarCombo("Select concat_WS('-', id_marca, nom_mar) AS Nombre from marcas", cb_marca);

        jTabbedPane_muebles.setEnabledAt(0, true);
        jTabbedPane_muebles.setEnabledAt(1, false);
        jTabbedPane_muebles.setSelectedIndex(0);
        panel_buscar.setVisible(true);

    }

    public int CortarCodigo(String Cadena) {

        String res = "";
        for (int i = 0; i <= Cadena.length() - 1; i++) {
            String a = Cadena.substring(i, i + 1);
            if (a.equals("-")) {
                break;
            } else {
                res = res + a;
            }
        }
        return Integer.parseInt(res);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane_muebles = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        btn_nuevo = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_marca = new javax.swing.JComboBox<>();
        panel_buscar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cb_combo = new javax.swing.JComboBox<>();
        txt_buscar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_productos);

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btn_nuevo)
                        .addGap(39, 39, 39)
                        .addComponent(btn_eliminar)
                        .addGap(46, 46, 46)
                        .addComponent(btn_editar)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_editar))
                .addGap(24, 24, 24))
        );

        jTabbedPane_muebles.addTab("Muebles", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 99, 26));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 99, 26));

        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, 99, 26));

        jLabel4.setText("Cantidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 132, 99, 26));
        jPanel1.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, 30));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, 30));

        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, 30));

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, 30));

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jLabel5.setText("Stock:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 171, 99, 26));
        jPanel1.add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, 30));

        jLabel6.setText("Marca:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, 99, 24));

        cb_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_marcaActionPerformed(evt);
            }
        });
        jPanel1.add(cb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 130, 30));

        jTabbedPane_muebles.addTab("Mantenimineto", jPanel1);

        jLabel9.setText("Campos");

        cb_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "ID", "TIPO" }));

        jLabel10.setText("Buscar:");

        btn_buscar.setText("Buscar:");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cb_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_buscar)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane_muebles, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jTabbedPane_muebles, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cb_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_marcaActionPerformed


    }//GEN-LAST:event_cb_marcaActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed

        clases.cls_conexion cnx = new clases.cls_conexion();
        ResultSet rs = cnx.Consulta("Select max(id_pro)+1 as Codigo From productos");

        try {
            while (rs.next()) {
                if (rs.getObject("Codigo") == null) {
                    txt_codigo.setText("1");
                } else {
                    txt_codigo.setText(rs.getObject("Codigo").toString());
                }
            }
            jTabbedPane_muebles.setEnabledAt(0, false);
            jTabbedPane_muebles.setEnabledAt(1, true);
            jTabbedPane_muebles.setSelectedIndex(1);
            panel_buscar.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(frm_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        if (tabla_productos.getSelectedRow() >= 0) {
            clases.cls_productos obj = new clases.cls_productos();
            String error = obj.eliminar(Integer.parseInt(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 0).toString()));
            if (!"".equals(error)) {
                JOptionPane.showMessageDialog(null, error, "Sistema Inventario", JOptionPane.ERROR_MESSAGE);
            }
            obj.CargarTabla(tabla_productos);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!", "Sistema Inventario", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if (tabla_productos.getSelectedRow() >= 0) {
            txt_codigo.setText(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 0).toString());
            txt_nombre.setText(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 1).toString());
            txt_precio.setText(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 2).toString());
            txt_stock.setText(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 3).toString());

            ga = true;
            jTabbedPane_muebles.setEnabledAt(0, false);
            jTabbedPane_muebles.setEnabledAt(1, true);
            jTabbedPane_muebles.setSelectedIndex(1);
            panel_buscar.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!", "Sistema Inventario", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed

        jTabbedPane_muebles.setEnabledAt(0, true);
        jTabbedPane_muebles.setEnabledAt(1, false);
        jTabbedPane_muebles.setSelectedIndex(0);
        panel_buscar.setVisible(true);
        clases.cls_productos obj = new clases.cls_productos();
        obj.CargarTabla(tabla_productos);
        mtd_limpiar();
        txt_buscar.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        cls_conexion cn = new cls_conexion();
        if (cb_combo.getSelectedItem().toString().equals("*")) {
            cn.CargarTabla("Select cod_equi as CODIGO,nom_equ as NOMBRE,mar_equi as MARCA,mod_equi as MODELO,cant_equi as CANTIDAD,col_equi as COLOR,cos_uni_equi as COSTOUNITARIO,est_equ as ESTADO From equipos", tabla_productos);

        }
        if (cb_combo.getSelectedItem().toString().equals("Codigo")) {
            cn.CargarTabla("Select cod_equi as CODIGO,nom_equ as NOMBRE,mar_equi as MARCA,mod_equi as MODELO,cant_equi as CANTIDAD,col_equi as COLOR,cos_uni_equi as COSTOUNITARIO,est_equ as ESTADO From equipos Where (cod_equi=" + txt_buscar.getText() + ")", tabla_productos);

        }
        if (cb_combo.getSelectedItem().toString().equals("Nombre")) {
            cn.CargarTabla("Select cod_equi as CODIGO,nom_equ as NOMBRE,mar_equi as MARCA,mod_equi as MODELO,cant_equi as CANTIDAD,col_equi as COLOR,cos_uni_equi as COSTOUNITARIO,est_equ as ESTADO From equipos Where (nom_equ='" + txt_buscar.getText() + "')", tabla_productos);

        }
    }//GEN-LAST:event_btn_buscarActionPerformed
    private static boolean ga = false;
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        try {

            clases.cls_productos obj = new clases.cls_productos(Integer.parseInt(txt_codigo.getText()), txt_nombre.getText(), Double.parseDouble(txt_precio.getText()), Integer.parseInt(txt_stock.getText()), CortarCodigo(cb_marca.getSelectedItem().toString()));
            if (ga == false) {
                String error = obj.guardar();
                if (!"".equals(error)) {
                    JOptionPane.showMessageDialog(null, error, "Sistema Inventario", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                String error = obj.actualizar();
                if (!"".equals(error)) {
                    JOptionPane.showMessageDialog(null, error, "Sistema Inventario", JOptionPane.ERROR_MESSAGE);
                }
                ga = false;
            }
            obj.CargarTabla(tabla_productos);
            mtd_limpiar();
            jTabbedPane_muebles.setEnabledAt(0, true);
            jTabbedPane_muebles.setEnabledAt(1, false);
            jTabbedPane_muebles.setSelectedIndex(0);
            panel_buscar.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Sistema Inventario", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void mtd_limpiar() {
        txt_codigo.setText("");
        txt_nombre.setText("");
        txt_precio.setText("");
        txt_stock.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> cb_combo;
    private javax.swing.JComboBox<String> cb_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane_muebles;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}
