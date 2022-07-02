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
import com.sun.xml.internal.bind.v2.model.core.ID;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class VerFicha extends javax.swing.JFrame {

    Conexion cone;
    DefaultTableModel modelo;

    public VerFicha(String nombre) {
        cone = new Conexion();
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel18.setText(nombre);
        consulta("");

    }

    VerFicha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void consulta(String buscar) {
        String sql;
        try {
            Conexion cone2 = new Conexion();
            String[] titulos = {"ID", "NOMBRE ", " SEXO ", "ALERGICO ", " DIAGNOSTICO ", "FECHA DE INGRESO", "RUT DEL PADRE"};
            modelo = new DefaultTableModel(null, titulos);
            ResultSet rs = cone.consultabd("SELECT * FROM hijos WHERE CONCAT (nombre,tipo_sexo_id,alergico,diagnostico,fecha_cita, padre_id) LIKE '%" + buscar + "%' ");
            String[] datos = new String[10];
            while (rs.next()) {
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("sexo");
                datos[2] = rs.getString("alergico");
                datos[3] = rs.getString("diagnostico");
                datos[4] = rs.getString("fecha_cita");
                datos[5] = rs.getString("rut del padre");

                ResultSet rs2 = cone2.consultabd("SELECT nombre FROM tipo_sexo WHERE id = " + rs.getString("tipo_sexo_id") + "");
                if (rs2.next()) {
                    datos[6] = rs2.getString("nombre");
                }
                modelo.addRow(datos);
            }
            iDatos.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ModificarPac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        iDatos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Avatar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 102, 153));
        buscar.setCaretColor(new java.awt.Color(204, 204, 204));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 290, 30));

        jLabel17.setText("Busqueda");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 110, 60, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(105, 111, 121));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 250, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 17, -1, 30));

        iDatos.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        iDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(iDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 760, 490));

        jButton3.setFont(new java.awt.Font("Dubai", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Nuevo Paciente");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registropacientenuevo(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 134, 140, -1));

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setFont(new java.awt.Font("Dubai", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 150, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ficha del Infante");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 830, 720));

        Avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/niños.png"))); // NOI18N
        getContentPane().add(Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 410, 470, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Data.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

    }//GEN-LAST:event_buscarActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        consulta(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegistroDoc registroDoc;
        try {
            registroDoc = new RegistroDoc();
        registroDoc.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(VerFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void registropacientenuevo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registropacientenuevo

        CrearFicha cficha = new CrearFicha();
        cficha.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registropacientenuevo

//    * @param args the command line arguments
//     */
//   public static void main(String args[]) {
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
//            java.util.logging.Logger.getLogger(pacienteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(pacienteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(pacienteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(pacienteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new pacienteDoctor().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avatar;
    private javax.swing.JTextField buscar;
    public javax.swing.JTable iDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
