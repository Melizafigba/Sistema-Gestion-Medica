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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

public class CrearFicha extends javax.swing.JFrame {
Conexion cone;
Conexion funcion = new Conexion ();
    public CrearFicha() {
        cone = new Conexion();
        initComponents();
        llenarcombo();
//        llenarcomboj();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jcedula = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jnombre = new javax.swing.JTextField();
        jalergico = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jdiagnostico = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jinsertar = new javax.swing.JButton();
        FondoLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        iSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jfecha = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 243, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 40, 62, 58);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/1.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(790, 40, 30, 30);

        jLabel21.setForeground(new java.awt.Color(105, 111, 121));
        jLabel21.setText("RUT");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(100, 110, 90, 21);

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
        jPanel1.add(jcedula);
        jcedula.setBounds(100, 130, 330, 40);

        jLabel13.setForeground(new java.awt.Color(105, 111, 121));
        jLabel13.setText("Nombre Completo");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(460, 110, 130, 21);

        jnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnombreActionPerformed(evt);
            }
        });
        jPanel1.add(jnombre);
        jnombre.setBounds(460, 130, 330, 40);

        jalergico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalergicoActionPerformed(evt);
            }
        });
        jalergico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jalergicoKeyTyped(evt);
            }
        });
        jPanel1.add(jalergico);
        jalergico.setBounds(460, 200, 330, 40);

        jLabel15.setForeground(new java.awt.Color(105, 111, 121));
        jLabel15.setText("Alergico a:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(460, 180, 180, 21);

        jdiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdiagnosticoActionPerformed(evt);
            }
        });
        jPanel1.add(jdiagnostico);
        jdiagnostico.setBounds(100, 280, 330, 40);

        jLabel11.setForeground(new java.awt.Color(105, 111, 121));
        jLabel11.setText("Diagnostico");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 260, 120, 21);

        jinsertar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jinsertar.setForeground(new java.awt.Color(255, 255, 255));
        jinsertar.setText("Insertar");
        jinsertar.setBorder(null);
        jinsertar.setBorderPainted(false);
        jinsertar.setContentAreaFilled(false);
        jinsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jinsertar.setFocusPainted(false);
        jinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinsertarActionPerformed(evt);
            }
        });
        jPanel1.add(jinsertar);
        jinsertar.setBounds(380, 430, 120, 50);

        FondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/0,75.png"))); // NOI18N
        FondoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(FondoLogin);
        FondoLogin.setBounds(380, 430, 120, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/niños.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 320, 370, 280);

        jLabel12.setForeground(new java.awt.Color(105, 111, 121));
        jLabel12.setText("Sexo");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 180, 80, 21);

        iSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iSexoActionPerformed(evt);
            }
        });
        jPanel1.add(iSexo);
        iSexo.setBounds(100, 200, 330, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Datos del Infante");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 50, 220, 32);

        jLabel16.setForeground(new java.awt.Color(105, 111, 121));
        jLabel16.setText("Fecha De Ingreso");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(460, 260, 230, 21);

        jfecha.setDateFormatString("dd/MM/yyyy");
        jfecha.setFocusable(false);
        jPanel1.add(jfecha);
        jfecha.setBounds(460, 280, 330, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 860, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/niños.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 620, 620));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img3/Union.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void llenarcombo(){
   
    try {
        iSexo.addItem("<<SELECCIONAR>>");
        ResultSet rs = cone.consultabd("SELECT * FROM tipo_sexo_id");
        while (rs.next()){
            iSexo.addItem(rs.getString("nombre")); 
        }
    } catch (SQLException ex) {
        Logger.getLogger(CrearFicha.class.getName()).log(Level.SEVERE, null, ex);
    }
}
//  public void llenarcomboj(){
//   
//    try {
//        jjornada.addItem("<<SELECCIONAR>>");
//        ResultSet rs = cone.consultabd("SELECT * FROM tipo_jornada");
//        while (rs.next()){
//            jjornada.addItem(rs.getString("nombre")); 
//        }
//    } catch (SQLException ex) {
//        Logger.getLogger(PacienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
//    }
//
//}
  public void limpiar(){
       jnombre.setText("");
       jcedula.setText("");
       jalergico.setText("");
       jdiagnostico.setText("");
       iSexo.setSelectedIndex(0);
       jfecha.setCalendar(null);
         
       
   }
 
    private void jdiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdiagnosticoActionPerformed

    private void jalergicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jalergicoKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
        (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jalergicoKeyTyped

    private void jalergicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalergicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jalergicoActionPerformed

    private void jnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnombreActionPerformed

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

    private void jcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcedulaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Agenda AgCita = new Agenda();
        AgCita.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertarActionPerformed
    try {
        int idtipo = 0;
//        Date date = jfecha.getDate();
//        long d = date.getTime();
//        Date fecha = new Date(d);  
        ResultSet rs = cone.consultabd("SELECT id FROM tipo_sexo_id WHERE nombre = '"+iSexo.getSelectedItem()+"'");
        while (rs.next()){
            idtipo = rs.getInt(1);
        }
        cone.modificabd("INSERT INTO hijos(nombre,tipo_sexo_id,rut,alergico,diagnostico,fecha_cita, padre_id) "
                + "VALUES (null,'"+jnombre.getText()+"',"+idtipo+",'"+jcedula.getText()+"','"+jalergico.getText()+"','"+jdiagnostico.getText()+"',)");
    JOptionPane.showMessageDialog(null,"El Registro fue Exitoso!");
    } catch (SQLException ex) {
        Logger.getLogger(CrearFicha.class.getName()).log(Level.SEVERE, null, ex);
    }
limpiar();


    }//GEN-LAST:event_jinsertarActionPerformed

    private void iSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iSexoActionPerformed
//
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
//            java.util.logging.Logger.getLogger(PacienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PacienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PacienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PacienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PacienteNuevo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoLogin;
    private javax.swing.JComboBox<String> iSexo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jalergico;
    private javax.swing.JTextField jcedula;
    private javax.swing.JTextField jdiagnostico;
    private com.toedter.calendar.JDateChooser jfecha;
    private javax.swing.JButton jinsertar;
    private javax.swing.JTextField jnombre;
    // End of variables declaration//GEN-END:variables
}