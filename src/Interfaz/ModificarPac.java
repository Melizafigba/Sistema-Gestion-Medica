/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaz;

/**
 *
 * @author maite
 */
import Metodos_php.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ModificarPac extends javax.swing.JFrame {

    Conexion cone;
    DefaultTableModel modelo;
    Conexion funcion = new Conexion();

    public ModificarPac() {
        cone = new Conexion();
        initComponents();
        consulta("");
        this.setLocationRelativeTo(null);
        jcorreo.setVisible(false);   
        jcedula.setVisible(false);
        jActualizar.setVisible(false);
    }

    public void limpiar() {
        
        jcedula.setText("");
        jcorreo.setText("");
        
    }

    public void consulta(String buscar1) {

        try {
            Conexion cone2 = new Conexion();
            String[] titulos = {"ID", "NOMBRE", "RUT", "CELULAR", "CORREO"};
            modelo = new DefaultTableModel(null, titulos);
            ResultSet rs = cone.consultabd("SELECT * FROM registro_tutor WHERE CONCAT (id,cedula,nombre,tipo_sexo_id) LIKE '%" + buscar1 + "%' ");
            String[] datos = new String[10];
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("cedula");
                datos[3] = rs.getString("movil");
                datos[4] = rs.getString("correo");

                ResultSet rs2 = cone2.consultabd("SELECT nombre FROM tipo_sexo WHERE id = " + rs.getString("tipo_sexo_id") + "");
                if (rs2.next()) {
                    datos[5] = rs2.getString("nombre");
                }

                modelo.addRow(datos);

            }

            iDatos1.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ModificarPac.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jeditar = new javax.swing.JMenuItem();
        jeliminar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        iDatos1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        Ilustracion = new javax.swing.JLabel();
        Icon2 = new javax.swing.JLabel();
        buscar1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcedula = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jcorreo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jeditar.setText("Editar");
        jeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jeditar);

        jeliminar.setText("Eliminar");
        jeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jeliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Citas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Atras.setForeground(new java.awt.Color(134, 146, 166));
        Atras.setText("Atras");
        Atras.setBorder(null);
        Atras.setBorderPainted(false);
        Atras.setContentAreaFilled(false);
        Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atras.setFocusPainted(false);
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 26, 50, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageNew/Datos de los pacientes.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        iDatos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iDatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        iDatos1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(iDatos1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 760, 450));

        jLabel17.setForeground(new java.awt.Color(105, 111, 121));
        jLabel17.setText("Busqueda");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        Ilustracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img3/Group 38.png"))); // NOI18N
        jPanel1.add(Ilustracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 60, 190, -1));

        Icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageNew/arrow_back_ios_24px.png"))); // NOI18N
        jPanel1.add(Icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar1ActionPerformed(evt);
            }
        });
        buscar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Buscar1KeyReleased(evt);
            }
        });
        jPanel1.add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 230, 30));

        jButton1.setFont(new java.awt.Font("Dubai", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_btn(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 120, 30));

        jLabel3.setBackground(new java.awt.Color(0, 153, 204));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 120, 30));

        jcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcedulaActionPerformed(evt);
            }
        });
        jcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcedulaKeyTyped(evt);
            }
        });
        jPanel1.add(jcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 230, 30));

        jLabel21.setForeground(new java.awt.Color(105, 111, 121));
        jLabel21.setText("Cedula");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcorreoActionPerformed(evt);
            }
        });
        jcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcorreoKeyTyped(evt);
            }
        });
        jPanel1.add(jcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 230, 30));

        jLabel22.setForeground(new java.awt.Color(105, 111, 121));
        jLabel22.setText("Correo");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jActualizar.setFont(new java.awt.Font("Dubai", 1, 15)); // NOI18N
        jActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jActualizar.setText("Actualizar");
        jActualizar.setBorderPainted(false);
        jActualizar.setContentAreaFilled(false);
        jActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizar(evt);
            }
        });
        jPanel1.add(jActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 120, 30));

        jLabel4.setBackground(new java.awt.Color(0, 153, 204));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 120, 30));

        jButton2.setText("Crear Ficha");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 820, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        InicioAsistent c = new InicioAsistent();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtrasActionPerformed

    private void jeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditarActionPerformed
        jcedula.setText("" + modelo.getValueAt(iDatos1.getSelectedRow(), 2));
        jcorreo.setText("" + modelo.getValueAt(iDatos1.getSelectedRow(), 2));
       
        jcedula.setVisible(true);
        jcedula.setEditable(false);
        
        jcorreo.setVisible(true);
        jcorreo.setEditable(false);
        
        jActualizar.setVisible(true);
    }//GEN-LAST:event_jeditarActionPerformed

    private void jeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeliminarActionPerformed
        cone.modificabd("DELETE FROM registro_tutor WHERE cedula = " + modelo.getValueAt(iDatos1.getSelectedRow(), 2));
        consulta("");
    }//GEN-LAST:event_jeliminarActionPerformed

    private void Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar1ActionPerformed

    private void Buscar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Buscar1KeyReleased
        consulta(buscar1.getText());
    }//GEN-LAST:event_Buscar1KeyReleased

    private void Salir_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_btn
        Doctores drs = new Doctores();
        drs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Salir_btn

    private void jcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcedulaActionPerformed

    private void jcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcedulaKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
        (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jcedulaKeyTyped

    private void jcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcorreoActionPerformed

    private void jcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jcorreoKeyTyped

    private void jActualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizar
        // TODO add your handling code here:
    }//GEN-LAST:event_jActualizar

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CrearFicha cficha = new CrearFicha();
        cficha.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModificarPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModificarPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModificarPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModificarPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModificarPac().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JLabel Icon2;
    private javax.swing.JLabel Ilustracion;
    private javax.swing.JTextField buscar1;
    private javax.swing.JTable iDatos1;
    private javax.swing.JButton jActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jcedula;
    private javax.swing.JTextField jcorreo;
    private javax.swing.JMenuItem jeditar;
    private javax.swing.JMenuItem jeliminar;
    // End of variables declaration//GEN-END:variables
}
