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

public class PacAsist1 extends javax.swing.JFrame {

    Conexion cone;
    DefaultTableModel modelo;

    public PacAsist1(String nombre) {
        cone = new Conexion();
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel18.setText(nombre);
        consulta("");

    }

    public PacAsist1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void consulta(String buscar) {
        String sql;
        try {
            Conexion cone2 = new Conexion();
            String[] titulos = {"Nombre", "Apellido", "Cedula", "Fecha_cita", "Horario", "Jornada", "Tipo_cita_id", "Sexo"};
            modelo = new DefaultTableModel(null, titulos);
            ResultSet rs = cone.consultabd("SELECT * FROM ordenes_citas WHERE CONCAT (cedula, nombre, tipo_cita) LIKE '%" + buscar + "%' ");
            String[] datos = new String[10];
            while (rs.next()) {
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("apellido");
                datos[2] = rs.getString("cedula");
                datos[3] = rs.getString("fecha_cita");
                datos[4] = rs.getString("horario");
                datos[5] = rs.getString("jornada");
                datos[6] = rs.getString("tipo_cita_id");
                datos[7] = rs.getString("sexo");

                ResultSet rs2 = cone2.consultabd("SELECT nombre FROM tipo_cita WHERE id = " + rs.getString("tipo_cita_id") + "");
                if (rs2.next()) {
                    datos[8] = rs2.getString("nombre");
                }
                modelo.addRow(datos);
            }
            iDate3.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(PacAsist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Avatar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Modifica = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jfecha = new com.toedter.calendar.JDateChooser();
        jfechacita = new javax.swing.JLabel();
        jcedula = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jhorario = new javax.swing.JTextField();
        jhorariol = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        iDate3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Data.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Avatars/Avatar2.png"))); // NOI18N
        jPanel1.add(Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageNew/Datos de los pacientes.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        Buscar.setCaretColor(new java.awt.Color(204, 204, 204));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarKeyReleased(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, 30));

        jLabel17.setText("Busqueda");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/1.png"))); // NOI18N
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

        Modifica.setFont(new java.awt.Font("Dubai", 1, 15)); // NOI18N
        Modifica.setForeground(new java.awt.Color(255, 255, 255));
        Modifica.setText("Modifica");
        Modifica.setBorderPainted(false);
        Modifica.setContentAreaFilled(false);
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifica(evt);
            }
        });
        jPanel1.add(Modifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 134, 140, -1));

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setFont(new java.awt.Font("Dubai", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 150, 40));

        jfecha.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(jfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 190, -1));

        jfechacita.setForeground(new java.awt.Color(105, 111, 121));
        jfechacita.setText("Fecha de la cita");
        jPanel1.add(jfechacita, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 110, -1));

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
        jPanel1.add(jcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 30));

        jLabel21.setForeground(new java.awt.Color(105, 111, 121));
        jLabel21.setText("Cedula");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhorarioActionPerformed(evt);
            }
        });
        jPanel1.add(jhorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 130, 30));

        jhorariol.setForeground(new java.awt.Color(105, 111, 121));
        jhorariol.setText("Horario");
        jPanel1.add(jhorariol, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(105, 111, 121));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 250, 30));

        iDate3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(iDate3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 760, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 830, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyReleased
        consulta(Buscar.getText());
    }//GEN-LAST:event_BuscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Asistentes asistentes = new Asistentes();
        asistentes.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Modifica(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifica
        Modifica modifica = new Modifica();
        modifica.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Modifica

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

    private void jhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jhorarioActionPerformed


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
    private javax.swing.JTextField Buscar;
    private javax.swing.JButton Modifica;
    public javax.swing.JTable iDate3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jcedula;
    private com.toedter.calendar.JDateChooser jfecha;
    private javax.swing.JLabel jfechacita;
    private javax.swing.JTextField jhorario;
    private javax.swing.JLabel jhorariol;
    // End of variables declaration//GEN-END:variables
}
