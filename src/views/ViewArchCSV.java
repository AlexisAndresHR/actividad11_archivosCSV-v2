/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author LAB-1
 */
public class ViewArchCSV extends javax.swing.JFrame {

    /**
     * Creates new form ViewArchCSV
     */
    public ViewArchCSV() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_encabezado = new javax.swing.JPanel();
        jl_instruccion = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jl_email = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jb_nuevo = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_primero = new javax.swing.JButton();
        jb_anterior = new javax.swing.JButton();
        jb_siguiente = new javax.swing.JButton();
        jb_ultimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda (CSV) v0.2");

        jp_encabezado.setBackground(new java.awt.Color(0, 204, 255));

        jl_instruccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_instruccion.setForeground(new java.awt.Color(0, 0, 153));
        jl_instruccion.setText("Agenda CSV");

        javax.swing.GroupLayout jp_encabezadoLayout = new javax.swing.GroupLayout(jp_encabezado);
        jp_encabezado.setLayout(jp_encabezadoLayout);
        jp_encabezadoLayout.setHorizontalGroup(
            jp_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_encabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_instruccion)
                .addGap(48, 48, 48))
        );
        jp_encabezadoLayout.setVerticalGroup(
            jp_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_encabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_instruccion, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        jl_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(0, 153, 255));
        jl_nombre.setText("Nombre:");

        jl_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_email.setForeground(new java.awt.Color(0, 153, 255));
        jl_email.setText("e-mail:");

        jb_nuevo.setBackground(new java.awt.Color(102, 204, 255));
        jb_nuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jb_nuevo.setForeground(new java.awt.Color(0, 0, 102));
        jb_nuevo.setText("Nuevo");

        jb_guardar.setBackground(new java.awt.Color(102, 204, 255));
        jb_guardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(0, 0, 102));
        jb_guardar.setText("Guardar");

        jb_primero.setBackground(new java.awt.Color(102, 204, 255));
        jb_primero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jb_primero.setForeground(new java.awt.Color(0, 0, 102));
        jb_primero.setText("|<");

        jb_anterior.setBackground(new java.awt.Color(102, 204, 255));
        jb_anterior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jb_anterior.setForeground(new java.awt.Color(0, 0, 102));
        jb_anterior.setText("<<");

        jb_siguiente.setBackground(new java.awt.Color(102, 204, 255));
        jb_siguiente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jb_siguiente.setForeground(new java.awt.Color(0, 0, 102));
        jb_siguiente.setText(">>");

        jb_ultimo.setBackground(new java.awt.Color(102, 204, 255));
        jb_ultimo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jb_ultimo.setForeground(new java.awt.Color(0, 0, 102));
        jb_ultimo.setText(">|");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_nombre)
                    .addComponent(jl_email))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                    .addComponent(jtf_nombre)
                    .addComponent(jtf_email, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_primero)
                .addGap(18, 18, 18)
                .addComponent(jb_anterior)
                .addGap(18, 18, 18)
                .addComponent(jb_siguiente)
                .addGap(18, 18, 18)
                .addComponent(jb_ultimo)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_email)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_primero)
                    .addComponent(jb_anterior)
                    .addComponent(jb_siguiente)
                    .addComponent(jb_ultimo))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewArchCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewArchCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewArchCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewArchCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewArchCSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jb_anterior;
    public javax.swing.JButton jb_guardar;
    public javax.swing.JButton jb_nuevo;
    public javax.swing.JButton jb_primero;
    public javax.swing.JButton jb_siguiente;
    public javax.swing.JButton jb_ultimo;
    private javax.swing.JLabel jl_email;
    private javax.swing.JLabel jl_instruccion;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JPanel jp_encabezado;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}