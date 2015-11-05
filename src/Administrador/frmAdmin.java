/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Zuajj
 */
public class frmAdmin extends javax.swing.JFrame {

    /**
     * Creates new form frmAdmin
     */
    public frmAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        //evita cerrar Fondo con ALT+C
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        try{
          this.setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
        
        }catch(Exception e){} 
    }
    public static boolean categoria=false;
    public static boolean ControlProducto=false;
    public static boolean empleado=false;
    public static boolean cliente=false;
    public static boolean proveedor=false;
    public static boolean reportes=false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador SiFa");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1444000003_printer.png"))); // NOI18N
        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1443999664_unknown.png"))); // NOI18N
        jMenuItem1.setText("Empleado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1443999695_matureman1.png"))); // NOI18N
        jMenuItem2.setText("Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1443999723_malecostume.png"))); // NOI18N
        jMenuItem3.setText("Proveedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1443999850_Report.png"))); // NOI18N
        jMenuItem4.setText("Reportes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1443999924_Close.png"))); // NOI18N
        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1443999965_box.png"))); // NOI18N
        jMenu2.setText("Productos");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1444000091_bill.png"))); // NOI18N
        jMenuItem6.setText("Control Productos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1444000134_categories.png"))); // NOI18N
        jMenuItem7.setText("Categorias");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1444000039_info.png"))); // NOI18N
        jMenu3.setText("Ayuda");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1443999741_supportmale.png"))); // NOI18N
        jMenuItem8.setText("Ayuda Remota");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, "Cominicate con nosotros:"+"\n"+
                "22-91-16-46-13","Ayuda Remota",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        frmCategorias a = new frmCategorias();
        int y = (escritorio.getHeight()/2)-a.getHeight()/2;
        int x = (escritorio.getWidth()/2)-a.getWidth()/2;
        if(categoria==false){
            escritorio.add(a);
            a.setLocation(x, y);
            a.show();
            categoria=true;
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana esta en uso","Erro de Ventana",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        frmControlProductos a = new frmControlProductos();
        int y = (escritorio.getHeight()/2)-a.getHeight()/2;
        int x = (escritorio.getWidth()/2)-a.getWidth()/2;
        if(ControlProducto==false){
            escritorio.add(a);
            a.setLocation(x, y);
            a.show();
            ControlProducto=true;
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana esta en uso","Erro de Ventana",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmEmpleado a = new frmEmpleado();
        int y = (escritorio.getHeight()/2)-a.getHeight()/2;
        int x = (escritorio.getWidth()/2)-a.getWidth()/2;
        if(empleado==false){
            escritorio.add(a);
            a.setLocation(x, y);
            a.show();
            empleado=true;
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana esta en uso","Erro de Ventana",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmCliente a = new frmCliente();
        int y = (escritorio.getHeight()/2)-a.getHeight()/2;
        int x = (escritorio.getWidth()/2)-a.getWidth()/2;
        if(cliente==false){
            escritorio.add(a);
            a.setLocation(x, y);
            a.show();
            cliente=true;
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana esta en uso","Erro de Ventana",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        frmProveedor a = new frmProveedor();
        int y = (escritorio.getHeight()/2)-a.getHeight()/2;
        int x = (escritorio.getWidth()/2)-a.getWidth()/2;
        if(proveedor==false){
            escritorio.add(a);
            a.setLocation(x, y);
            a.show();
            proveedor=true;
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana esta en uso","Erro de Ventana",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        frmReportes a = new frmReportes();
        int y = (escritorio.getHeight()/2)-a.getHeight()/2;
        int x = (escritorio.getWidth()/2)-a.getWidth()/2;
        if(reportes==false){
            escritorio.add(a);
            a.setLocation(x, y);
            a.show();
            reportes=true;
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana esta en uso","Erro de Ventana",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
