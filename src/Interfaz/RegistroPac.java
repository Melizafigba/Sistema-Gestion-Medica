
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

public class RegistroPac extends javax.swing.JFrame {

    Conexion cone;
    Conexion funcion = new Conexion();

    public RegistroPac() {
        initComponents();
        cone = new Conexion();
        llenarcombo();
        this.setLocationRelativeTo(null);
    }

    

   

 

    public void llenarcombo() {

        try {
            isexo.addItem("<<SELECCIONAR>>");
            ResultSet rs = cone.consultabd("SELECT * FROM tipo_sexo");
            while (rs.next()) {
                isexo.addItem(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limpiar() {
        jnombre.setText("");
        japellido.setText("");
        jcedula.setText("");
        jcelular.setText("");
        jcorreo.setText("");
        isexo.setSelectedIndex(0);
        jcontraseña.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Complete = new javax.swing.JLabel();
        NameComplete = new javax.swing.JLabel();
        jnombre = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        jcedula = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        jcorreo = new javax.swing.JTextField();
        ButtonSave = new javax.swing.JButton();
        FondoSave = new javax.swing.JLabel();
        jcelular = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        Avatar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcontraseña = new javax.swing.JTextField();
        isexo = new javax.swing.JComboBox<>();
        NameComplete1 = new javax.swing.JLabel();
        japellido = new javax.swing.JTextField();
        Cedula1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Frame 1.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Name.setText("Ingrese Datos del Tutor");
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 290, -1));

        Complete.setText("Complete la informacion con sus datos. ");
        jPanel1.add(Complete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 280, 50));

        NameComplete.setForeground(new java.awt.Color(105, 111, 121));
        NameComplete.setText("Nombre*");
        jPanel1.add(NameComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnombreActionPerformed(evt);
            }
        });
        jPanel1.add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 320, 50));

        Email.setForeground(new java.awt.Color(105, 111, 121));
        Email.setText("Correo Electronico*");
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel1.add(jcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 50));

        Password.setForeground(new java.awt.Color(105, 111, 121));
        Password.setText("Cree una contraseña*");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        jcorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 320, 50));

        ButtonSave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSave.setText("Guardar");
        ButtonSave.setBorder(null);
        ButtonSave.setBorderPainted(false);
        ButtonSave.setContentAreaFilled(false);
        ButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSave.setFocusPainted(false);
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSave(evt);
            }
        });
        jPanel1.add(ButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 320, 30));

        FondoSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageNew/Rectangle 27.png"))); // NOI18N
        jPanel1.add(FondoSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 320, 50));

        jcelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcelularKeyTyped(evt);
            }
        });
        jPanel1.add(jcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 320, 50));

        Telefono.setForeground(new java.awt.Color(105, 111, 121));
        Telefono.setText("Celular*");
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, 20));

        Cedula.setForeground(new java.awt.Color(105, 111, 121));
        Cedula.setText("Sexo");
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        Avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Avatars/Avatar_1.png"))); // NOI18N
        jPanel1.add(Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img3/Img.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, -1, 160));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, 40));

        jcontraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 320, 50));

        isexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isexoActionPerformed(evt);
            }
        });
        jPanel1.add(isexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 320, 50));

        NameComplete1.setForeground(new java.awt.Color(105, 111, 121));
        NameComplete1.setText("Apellido");
        jPanel1.add(NameComplete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        japellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(japellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 320, 50));

        Cedula1.setForeground(new java.awt.Color(105, 111, 121));
        Cedula1.setText("RUT");
        jPanel1.add(Cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 790, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcedulaKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jcedulaKeyTyped

    private void jcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcelularKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jcelularKeyTyped

    private void ButtonSave(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSave
        try {
            int idtipo = 0;
            ResultSet rs = cone.consultabd("SELECT id FROM tipo_sexo  WHERE nombre  = '" + isexo.getSelectedItem() + "'");
            while (rs.next()) {
                idtipo = rs.getInt(1);
            }
            cone.modificabd("INSERT INTO registro_tutor(id,nombre,apellido,tipo_sexo_id,cedula,movil,correo,contraseña) "
                    + "VALUES (null,'" + jnombre.getText() + "','" + japellido.getText() + "'," + idtipo + ",'" + jcedula.getText() + "','" + jcelular.getText() + "','" + jcorreo.getText() + "','" + jcontraseña.getText() + "')");
            JOptionPane.showMessageDialog(null, "Registro Finalizado");
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPac.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
    }

    /*
cone.modificabd("INSERT INTO registro_paciente(id,nombre,tipo_sexo_id,cedula,celular,correo,contraseña) "
        + "VALUES (null,'"+jnombre.getText()+"',"+idtipo+",'"+jcedula.getText()+"','"+jcelular.getText()+"','"+jcorreo.getText()+"','"+isexo.getSelectedItem()+"','"+jcontraseña.getText()+"')");
    JOptionPane.showMessageDialog(null,"Registro Finalizado");
    } catch (SQLException ex) {
        Logger.getLogger(RegistroPac.class.getName()).log(Level.SEVERE, null, ex);
    }
        limpiar();
    }//GEN-LAST:event_ButtonSave
*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InicioAsistent InAsis = new InicioAsistent();
        InAsis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void isexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isexoActionPerformed

    private void jcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcedulaActionPerformed

    }//GEN-LAST:event_jcedulaActionPerformed

    private void jnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnombreActionPerformed

    public void contraseña_random() {

        String contraseña = " ";
        String contraseña2 = " ";
        contraseña = UUID.randomUUID().toString().toUpperCase().substring(0, 5);
        contraseña2 = UUID.randomUUID().toString().toLowerCase().substring(0, 5);
        jcontraseña.setText(contraseña + contraseña2);

    }

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
//            java.util.logging.Logger.getLogger(RegistroDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistroDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistroDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistroDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistroDoc().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avatar;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Cedula1;
    private javax.swing.JLabel Complete;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoSave;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameComplete;
    private javax.swing.JLabel NameComplete1;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Telefono;
    private javax.swing.JComboBox<String> isexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField japellido;
    private javax.swing.JTextField jcedula;
    private javax.swing.JTextField jcelular;
    private javax.swing.JTextField jcontraseña;
    private javax.swing.JTextField jcorreo;
    private javax.swing.JTextField jnombre;
    // End of variables declaration//GEN-END:variables
}
