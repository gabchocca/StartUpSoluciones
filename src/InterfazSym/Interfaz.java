
package InterfazSym;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmRegristrar = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        peFile = new javax.swing.JMenu();
        PeNewUsuario = new javax.swing.JMenuItem();
        PeSalir = new javax.swing.JMenuItem();
        PeTransacción = new javax.swing.JMenu();
        PeRegistrarVenta = new javax.swing.JMenuItem();
        PeActualizarVenta = new javax.swing.JMenuItem();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Startuo Soluciones");
        setPreferredSize(new java.awt.Dimension(750, 482));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazSym/logo.png"))); // NOI18N

        peFile.setText("File");

        PeNewUsuario.setText("Nuevo Usuario");
        peFile.add(PeNewUsuario);

        PeSalir.setText("Salir");
        peFile.add(PeSalir);

        jMenuBar1.add(peFile);

        PeTransacción.setText("Transacción");

        PeRegistrarVenta.setText("Registrar Venta");
        PeTransacción.add(PeRegistrarVenta);

        PeActualizarVenta.setText("Actualizar Venta");
        PeActualizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeActualizarVentaActionPerformed(evt);
            }
        });
        PeTransacción.add(PeActualizarVenta);

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
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PeActualizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeActualizarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PeActualizarVentaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem PeActualizarVenta;
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
    private javax.swing.JFrame frmRegristrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem omActualizarStock;
    private javax.swing.JMenuItem omDardeBaja;
    private javax.swing.JMenuItem omModificarClientes;
    private javax.swing.JMenuItem omNewProducto;
    private javax.swing.JMenu peFile;
    // End of variables declaration//GEN-END:variables
}
