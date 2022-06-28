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


public class Doctores extends javax.swing.JInternalFrame {
Conexion cone;
    
    public Doctores() {
        cone = new Conexion();
        initComponents();
        
        
    }

public void validar(){
        
    try {
        ResultSet rs = cone.consultabd("SELECT * FROM registro_doctores WHERE correo = "
                + "'"+CuadroEmail.getText()+"' AND contraseña = '"+CuadroPassword.getText()+"'");
        if (rs.next()){
            PacienteDoctor in = new PacienteDoctor(rs.getString("nombre"));
            in.setVisible(true);
            in.setSize(1280, 700);
        }else{
            jLabel1.setText("Correo o Contraseña Incorrecta, Intenta De Nuevo");
            CuadroEmail.setText("");
            CuadroPassword.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Asistentes.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Slogan = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        LineEmail = new javax.swing.JLabel();
        EmailAdress = new javax.swing.JLabel();
        CuadroEmail = new javax.swing.JTextField();
        LinePassword = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        CuadroPassword = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        FondoLogin = new javax.swing.JLabel();
        Iniciar = new javax.swing.JLabel();
        Google = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        Linkedin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ImgMedicine = new javax.swing.JLabel();
        Medicos = new javax.swing.JButton();
        Asistentes = new javax.swing.JButton();
        Administrador = new javax.swing.JButton();
        Desarrollador = new javax.swing.JButton();
        LineMedicos = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Doctores");
        setToolTipText("");
        setName("Doctores"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/corporativo.png"))); // NOI18N
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        Slogan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Slogan.png"))); // NOI18N
        jPanel1.add(Slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        Welcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Welcome.png"))); // NOI18N
        jPanel1.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        LineEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Line 2.png"))); // NOI18N
        jPanel1.add(LineEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 10, 50));

        EmailAdress.setText("Email Adress");
        jPanel1.add(EmailAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        CuadroEmail.setForeground(new java.awt.Color(55, 81, 254));
        CuadroEmail.setToolTipText("");
        CuadroEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CuadroEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CuadroEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroEmailActionPerformed(evt);
            }
        });
        jPanel1.add(CuadroEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 490, 50));

        LinePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Line 2.png"))); // NOI18N
        jPanel1.add(LinePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 10, 50));

        Password.setText("Password");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 20));

        CuadroPassword.setForeground(new java.awt.Color(55, 81, 254));
        CuadroPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CuadroPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(CuadroPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 490, 50));

        Login.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Iniciar Sesion");
        Login.setBorder(null);
        Login.setBorderPainted(false);
        Login.setContentAreaFilled(false);
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 130, 50));

        FondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/0,75.png"))); // NOI18N
        FondoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 130, 60));

        Iniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Iniciar.setText("Inicar con");
        jPanel1.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        Google.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Google.setForeground(new java.awt.Color(55, 81, 254));
        Google.setText("Google");
        jPanel1.add(Google, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 630, 70, -1));

        Facebook.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Facebook.setForeground(new java.awt.Color(55, 81, 254));
        Facebook.setText("Facebook");
        jPanel1.add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, -1, -1));

        Linkedin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Linkedin.setForeground(new java.awt.Color(55, 81, 254));
        Linkedin.setText("Linkedin");
        jPanel1.add(Linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 80, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 490, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 700));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.setForeground(new java.awt.Color(229, 229, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImgMedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Medicina.png"))); // NOI18N
        jPanel2.add(ImgMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        Medicos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Medicos.setText("Medicos");
        Medicos.setBorder(null);
        Medicos.setBorderPainted(false);
        Medicos.setContentAreaFilled(false);
        Medicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(Medicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 90, 20));

        Asistentes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Asistentes.setText("Asistentes");
        Asistentes.setBorder(null);
        Asistentes.setBorderPainted(false);
        Asistentes.setContentAreaFilled(false);
        Asistentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Asistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsistentesActionPerformed(evt);
            }
        });
        jPanel2.add(Asistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 100, 20));

        Administrador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Administrador.setText("Administrador");
        Administrador.setBorder(null);
        Administrador.setBorderPainted(false);
        Administrador.setContentAreaFilled(false);
        Administrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(Administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 140, 20));

        Desarrollador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Desarrollador.setText("Desarrollador");
        Desarrollador.setBorder(null);
        Desarrollador.setBorderPainted(false);
        Desarrollador.setContentAreaFilled(false);
        Desarrollador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(Desarrollador, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, 20));

        LineMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Avatars/LineX.png"))); // NOI18N
        jPanel2.add(LineMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 70, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 660, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AsistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsistentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsistentesActionPerformed

    private void CuadroEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroEmailActionPerformed
        validar();
    }//GEN-LAST:event_CuadroEmailActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        validar();
    }//GEN-LAST:event_LoginActionPerformed

    private void CuadroPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroPasswordActionPerformed
        validar();
    }//GEN-LAST:event_CuadroPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Administrador;
    private javax.swing.JButton Asistentes;
    private javax.swing.JTextField CuadroEmail;
    private javax.swing.JPasswordField CuadroPassword;
    private javax.swing.JButton Desarrollador;
    private javax.swing.JLabel EmailAdress;
    private javax.swing.JLabel Facebook;
    private javax.swing.JLabel FondoLogin;
    private javax.swing.JLabel Google;
    private javax.swing.JLabel ImgMedicine;
    private javax.swing.JLabel Iniciar;
    private javax.swing.JLabel LineEmail;
    private javax.swing.JLabel LineMedicos;
    private javax.swing.JLabel LinePassword;
    private javax.swing.JLabel Linkedin;
    private javax.swing.JButton Login;
    private javax.swing.JButton Medicos;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Slogan;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
