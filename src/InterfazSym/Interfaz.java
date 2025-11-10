
package InterfazSym;
import javax.swing.BorderFactory;
import java.awt.Color;




public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmRegristrar = new javax.swing.JFrame();
        frmRegistrarVenta = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        peFile = new javax.swing.JMenu();
        PeNewUsuario = new javax.swing.JMenuItem();
        PeSalir = new javax.swing.JMenuItem();
        PeTransacción = new javax.swing.JMenu();
        PeRegistrarVenta = new javax.swing.JMenuItem();
        PeGestion = new javax.swing.JMenu();
        PeGestionClientes = new javax.swing.JMenu();
        omModificarClientes = new javax.swing.JMenuItem();
        omDardeBaja = new javax.swing.JMenuItem();
        PeProductos = new javax.swing.JMenu();
        omNewProducto = new javax.swing.JMenuItem();
        omActualizarStock = new javax.swing.JMenuItem();
        PeReportes = new javax.swing.JMenu();
        PeReportarVentas = new javax.swing.JMenuItem();
        PeReportarClientes = new javax.swing.JMenuItem();
        PeReportarProductos = new javax.swing.JMenuItem();

        javax.swing.GroupLayout frmRegristrarLayout = new javax.swing.GroupLayout(frmRegristrar.getContentPane());
        frmRegristrar.getContentPane().setLayout(frmRegristrarLayout);
        frmRegristrarLayout.setHorizontalGroup(
            frmRegristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frmRegristrarLayout.setVerticalGroup(
            frmRegristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        frmRegistrarVenta.setBounds(new java.awt.Rectangle(300, 150, 600, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(26, 242, 235));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(93, 104, 138));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro de Venta");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(171, 171, 171))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(16, 16, 16))
        );

        jPanel4.setBackground(new java.awt.Color(192, 201, 238));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 88, 121));
        jLabel1.setText(" Ingrese el ID del producto: ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(85, 88, 121), new java.awt.Color(85, 88, 121)));

        jTextField1.setBackground(new java.awt.Color(109, 148, 197));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(93, 104, 138));
        jTextField1.setText("ex");
        jTextField1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(85, 88, 121)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(85, 88, 121));
        jLabel4.setText(" Ingrese la cantidad vendida: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(85, 88, 121), new java.awt.Color(85, 88, 121)));

        jTextField2.setBackground(new java.awt.Color(109, 148, 197));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(93, 104, 138));
        jTextField2.setText("ex");
        jTextField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(85, 88, 121)));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(93, 104, 138));
        jButton1.setText("Registrar");
        jButton1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(109, 148, 197)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setText("Producto encontrado:");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextField3.setText("...");
        jTextField3.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(236, 236, 236))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1)))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmRegistrarVentaLayout = new javax.swing.GroupLayout(frmRegistrarVenta.getContentPane());
        frmRegistrarVenta.getContentPane().setLayout(frmRegistrarVentaLayout);
        frmRegistrarVentaLayout.setHorizontalGroup(
            frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frmRegistrarVentaLayout.setVerticalGroup(
            frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Startuo Soluciones");
        setBounds(new java.awt.Rectangle(300, 250, 400, 400));
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(750, 482));

        jPanel3.setMaximumSize(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazSym/logo-400x400.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );

        peFile.setText("File");

        PeNewUsuario.setText("Nuevo Usuario");
        PeNewUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeNewUsuarioActionPerformed(evt);
            }
        });
        peFile.add(PeNewUsuario);

        PeSalir.setText("Salir");
        peFile.add(PeSalir);

        jMenuBar1.add(peFile);

        PeTransacción.setText("Transacción");

        PeRegistrarVenta.setText("Registrar Venta");
        PeRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeRegistrarVentaActionPerformed(evt);
            }
        });
        PeTransacción.add(PeRegistrarVenta);

        jMenuBar1.add(PeTransacción);

        PeGestion.setText("Gestión");

        PeGestionClientes.setText("Gestion Clientes");

        omModificarClientes.setText("Modificar Clientes");
        PeGestionClientes.add(omModificarClientes);

        omDardeBaja.setText("Dar de Baja");
        PeGestionClientes.add(omDardeBaja);

        PeGestion.add(PeGestionClientes);

        PeProductos.setText("Productos");

        omNewProducto.setText("Nuevo Producto");
        omNewProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omNewProductoActionPerformed(evt);
            }
        });
        PeProductos.add(omNewProducto);

        omActualizarStock.setText("Actualizar Stock Producto");
        PeProductos.add(omActualizarStock);

        PeGestion.add(PeProductos);

        jMenuBar1.add(PeGestion);

        PeReportes.setText("Reportes");

        PeReportarVentas.setText("Reportar Ventas");
        PeReportes.add(PeReportarVentas);

        PeReportarClientes.setText("Reportar Clientes");
        PeReportes.add(PeReportarClientes);

        PeReportarProductos.setText("Reportar Productos");
        PeReportes.add(PeReportarProductos);

        jMenuBar1.add(PeReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PeRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeRegistrarVentaActionPerformed

       frmRegistrarVenta.setVisible(true);
    }//GEN-LAST:event_PeRegistrarVentaActionPerformed

    private void PeNewUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeNewUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PeNewUsuarioActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void omNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omNewProductoActionPerformed
        Productos ventanaProductos = new Productos();
        ventanaProductos.setVisible(true);
    }//GEN-LAST:event_omNewProductoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu PeGestion;
    private javax.swing.JMenu PeGestionClientes;
    private javax.swing.JMenuItem PeNewUsuario;
    private javax.swing.JMenu PeProductos;
    private javax.swing.JMenuItem PeRegistrarVenta;
    private javax.swing.JMenuItem PeReportarClientes;
    private javax.swing.JMenuItem PeReportarProductos;
    private javax.swing.JMenuItem PeReportarVentas;
    private javax.swing.JMenu PeReportes;
    private javax.swing.JMenuItem PeSalir;
    private javax.swing.JMenu PeTransacción;
    private javax.swing.JFrame frmRegistrarVenta;
    private javax.swing.JFrame frmRegristrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JMenuItem omActualizarStock;
    private javax.swing.JMenuItem omDardeBaja;
    private javax.swing.JMenuItem omModificarClientes;
    private javax.swing.JMenuItem omNewProducto;
    private javax.swing.JMenu peFile;
    // End of variables declaration//GEN-END:variables
}
