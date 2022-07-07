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
import Metodos_php.HttpClientConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class RegistroDoc extends javax.swing.JFrame {
Conexion cone;
Conexion funcion = new Conexion ();

    public RegistroDoc() throws Exception {
   /*("https://desarrollos.cl/app-contigo/api/api.service.php?nombreFuncion=obtener_hijos&padre_id=103468261");
   JSONParser parser = new JSONParser();    
   JSONObject object = (JSONObject) parser.parse(teset);    
   
   System.out.println(object.get("resultado").toString());
   ArrayList<String> list = new ArrayList<String>();              //FUNCIONA//
   JSONArray jsonArray = (JSONArray) object.get("resultado");
    */
   
   /*
   JSONArray array = (JSONArray) object.get("resultado");
        Iterator<String> iterator = array.iterator();
   while (iterator.hasNext()){
   
   System.out.println(iterator.next());
    }*/
   
        initComponents();
        cone = new Conexion();
        llenarcombo();
        this.setLocationRelativeTo(null);
    }
    
    public void llenarcombo(){
   
    try {
        jtipo.addItem("<<SELECCIONAR>>");
        ResultSet rs = cone.consultabd("SELECT * FROM tipo_cita");
        while (rs.next()){
            jtipo.addItem(rs.getString("nombre")); 
        }
    } catch (SQLException ex) {
        Logger.getLogger(PacienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
    }
}
     public void limpiar(){
       jnombre1.setText("");
       japellido.setText("");
       jcedula.setText("");
       jcelular.setText("");
       jcorreo.setText("");
       jcontraseña.setText("");
       jtipo.setSelectedIndex(0);     
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Complete = new javax.swing.JLabel();
        NameComplete = new javax.swing.JLabel();
        japellido = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        jcedula = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        jcorreo = new javax.swing.JTextField();
        ButtonSave = new javax.swing.JButton();
        FondoSave = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        jcelular = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        jtipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcontraseña = new javax.swing.JTextField();
        jnombre1 = new javax.swing.JTextField();
        NameComplete1 = new javax.swing.JLabel();
        Avatar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Frame 1.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Name.setText("Datos del doctor");
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 230, -1));

        Complete.setText("Complete la informacion de sus datos. ");
        jPanel1.add(Complete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 260, 50));

        NameComplete.setForeground(new java.awt.Color(105, 111, 121));
        NameComplete.setText("Apellido");
        jPanel1.add(NameComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        japellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(japellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 320, 50));

        Email.setForeground(new java.awt.Color(105, 111, 121));
        Email.setText("Correo Electronico*");
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcedulaKeyTyped(evt);
            }
        });
        jPanel1.add(jcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 320, 50));

        Password.setForeground(new java.awt.Color(105, 111, 121));
        Password.setText("Cree una contraseña*");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        jcorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 320, 50));

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
                ButtonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 320, 30));

        FondoSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageNew/Rectangle 27.png"))); // NOI18N
        jPanel1.add(FondoSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 320, 50));

        Direccion.setForeground(new java.awt.Color(105, 111, 121));
        Direccion.setText("Especializacion*");
        jPanel1.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 120, -1));

        jcelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcelularKeyTyped(evt);
            }
        });
        jPanel1.add(jcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 320, 50));

        Telefono.setForeground(new java.awt.Color(105, 111, 121));
        Telefono.setText("Celular");
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        Cedula.setForeground(new java.awt.Color(105, 111, 121));
        Cedula.setText("RUT*");
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jPanel1.add(jtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 320, 50));

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
        jPanel1.add(jcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 320, 50));

        jnombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 320, 50));

        NameComplete1.setForeground(new java.awt.Color(105, 111, 121));
        NameComplete1.setText("Nombre");
        jPanel1.add(NameComplete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        Avatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Avatars/Avatar_1.png"))); // NOI18N
        jPanel1.add(Avatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 790, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcelularKeyTyped
       char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
        (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jcelularKeyTyped

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
    try {
        int idtipo = 0;
//        Date date = jfecha.getDate();
//        long d = date.getTime();
//        Date fecha = new Date(d);
ResultSet rs = cone.consultabd("SELECT id FROM tipo_cita WHERE nombre = '"+jtipo.getSelectedItem()+"'");
while (rs.next()){
    idtipo = rs.getInt(1);
}
cone.modificabd("INSERT INTO registro_doctores(id,nombre,apellido,tipo_cita_id,cedula,celular,correo,contraseña) "
        + "VALUES (null,'"+jnombre1.getText()+"','"+japellido.getText()+"',"+idtipo+",'"+jcedula.getText()+"','"+jcelular.getText()+"','"+jcorreo.getText()+"','"+jcontraseña.getText()+"')");
    JOptionPane.showMessageDialog(null,"Registro Finalizado");
    } catch (SQLException ex) {
        Logger.getLogger(RegistroDoc.class.getName()).log(Level.SEVERE, null, ex);
    }
        limpiar();
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    Administrador admi = new Administrador();
    admi.setVisible(true);
    this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void contraseña_random() {
    
        String contraseña = " ";
        String contraseña2 = " ";
        contraseña = UUID.randomUUID().toString().toUpperCase().substring(0,5);
        contraseña2 = UUID.randomUUID().toString().toLowerCase().substring(0,5);
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
    private javax.swing.JLabel Avatar1;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Complete;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoSave;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameComplete;
    private javax.swing.JLabel NameComplete1;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField japellido;
    private javax.swing.JTextField jcedula;
    private javax.swing.JTextField jcelular;
    private javax.swing.JTextField jcontraseña;
    private javax.swing.JTextField jcorreo;
    private javax.swing.JTextField jnombre1;
    private javax.swing.JComboBox<String> jtipo;
    // End of variables declaration//GEN-END:variables
}
