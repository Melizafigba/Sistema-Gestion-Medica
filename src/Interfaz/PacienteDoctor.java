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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PacienteDoctor extends javax.swing.JFrame {

    Conexion cone;
    DefaultTableModel modelo;

    public PacienteDoctor(String nombre, String apellido) {
        cone = new Conexion();
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelname.setText(nombre);
        jLabelAp.setText(apellido);

        consulta("");

    }

   

    public void consulta(String buscar) {
        String sql;
        try {
            Conexion cone2 = new Conexion();
            String[] titulos = {"ID", " NOMBRE ", "APELLIDO", " RUT ", "MOVIL", " CORREO "};
            modelo = new DefaultTableModel(null, titulos);
            ResultSet rs = cone.consultabd("SELECT * FROM registro_tutor WHERE CONCAT (id,cedula,nombre,apellido, tipo_sexo_id) LIKE '%" + buscar + "%' ");
            String[] datos = new String[10];
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[1] = rs.getString("apellido");
                datos[2] = rs.getString("cedula");
                datos[3] = rs.getString("movil");
                datos[4] = rs.getString("correo");

                ResultSet rs2 = cone2.consultabd("SELECT nombre FROM tipo_sexo WHERE id = " + rs.getString("tipo_sexo_id") + "");
                if (rs2.next()) {
                    datos[5] = rs2.getString("nombre");
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        Avatar = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        iDatos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelAp = new javax.swing.JLabel();
        jLabelname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        registropacientenuevo = new javax.swing.JMenu();
        CrearFicha = new javax.swing.JMenu();
        AtencionMedica = new javax.swing.JMenu();
        AtencionMedica1 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        jMenu8.setText("jMenu8");

        jMenu9.setText("jMenu9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Avatar2.png"))); // NOI18N
        jPanel1.add(Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 760, 520));

        jButton3.setFont(new java.awt.Font("Dubai", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Registra Nuevo Tutor");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registropacientenuevo(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 190, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Datos de los Tutores");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 220, -1));

        jLabelAp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelAp.setForeground(new java.awt.Color(105, 111, 121));
        jPanel1.add(jLabelAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 110, 30));

        jLabelname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelname.setForeground(new java.awt.Color(105, 111, 121));
        jPanel1.add(jLabelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 830, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Data.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 690));

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setOpaque(true);

        registropacientenuevo.setBackground(new java.awt.Color(0, 153, 153));
        registropacientenuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registropacientenuevo.setForeground(new java.awt.Color(255, 255, 255));
        registropacientenuevo.setText("  Registra Nuevo Tutor  ");
        registropacientenuevo.setFocusPainted(true);
        registropacientenuevo.setFocusable(false);
        registropacientenuevo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        registropacientenuevo.setOpaque(true);
        registropacientenuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registropacientenuevoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registropacientenuevoMousePressed(evt);
            }
        });
        jMenuBar1.add(registropacientenuevo);

        CrearFicha.setBackground(new java.awt.Color(0, 153, 153));
        CrearFicha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CrearFicha.setForeground(new java.awt.Color(255, 255, 255));
        CrearFicha.setText("  Crear Ficha del Infante  ");
        CrearFicha.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        CrearFicha.setHideActionText(true);
        CrearFicha.setOpaque(true);
        CrearFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearFichaMouseClicked(evt);
            }
        });
        CrearFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaFichaActionPerformed(evt);
            }
        });
        jMenuBar1.add(CrearFicha);

        AtencionMedica.setBackground(new java.awt.Color(0, 153, 153));
        AtencionMedica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AtencionMedica.setForeground(new java.awt.Color(255, 255, 255));
        AtencionMedica.setText("  Atencion Médica  ");
        AtencionMedica.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        AtencionMedica.setOpaque(true);
        AtencionMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtencionMedicaMouseClicked(evt);
            }
        });
        AtencionMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtencionMedicaActionPerformed(evt);
            }
        });
        jMenuBar1.add(AtencionMedica);

        AtencionMedica1.setBackground(new java.awt.Color(0, 153, 153));
        AtencionMedica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AtencionMedica1.setForeground(new java.awt.Color(255, 255, 255));
        AtencionMedica1.setText("                                                                                                                                                                                        ");
        AtencionMedica1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        AtencionMedica1.setOpaque(true);
        jMenuBar1.add(AtencionMedica1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

    }//GEN-LAST:event_buscarActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        consulta(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Doctores Doc = new Doctores();
        Doc.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void registropacientenuevo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registropacientenuevo

    RegistroPac Rp = new RegistroPac();
        Rp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registropacientenuevo

    private void CreaFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaFichaActionPerformed
       
    }//GEN-LAST:event_CreaFichaActionPerformed

    private void AtencionMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtencionMedicaActionPerformed
        AtencionMedica AMedica = new AtencionMedica();
        AMedica.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtencionMedicaActionPerformed

    private void registropacientenuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registropacientenuevoMouseClicked
        RegistroPac Rp = new RegistroPac();
        Rp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registropacientenuevoMouseClicked

    private void CrearFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearFichaMouseClicked
      CrearFicha cf = new CrearFicha();
      cf.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_CrearFichaMouseClicked

    private void AtencionMedicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtencionMedicaMouseClicked
        AtencionMedica AMedica = new AtencionMedica();
        AMedica.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtencionMedicaMouseClicked

    private void registropacientenuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registropacientenuevoMousePressed
        RegistroPac Rp = new RegistroPac();
        Rp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registropacientenuevoMousePressed

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
    private javax.swing.JMenu AtencionMedica;
    private javax.swing.JMenu AtencionMedica1;
    private javax.swing.JLabel Avatar;
    private javax.swing.JMenu CrearFicha;
    private javax.swing.JTextField buscar;
    public javax.swing.JTable iDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAp;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu registropacientenuevo;
    // End of variables declaration//GEN-END:variables
}
