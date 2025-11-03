
package InterfazSym;
import InterfazSym.RegistroDeVenta;
import InterfazSym.GestorDeVentas;




public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmRegristrar = new javax.swing.JFrame();
        frmRegistrarVenta = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productoId = new javax.swing.JTextField();
        productoCantidad = new javax.swing.JTextField();
        bttnRegistrarVenta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fechaVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosReporte = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        frmActualizarVenta = new javax.swing.JFrame();
        bttnActualizarVenta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fechaVentaActualizada = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        datosReporteActualizado = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        productoIdActualizado = new javax.swing.JTextField();
        productoCantidadActualizado = new javax.swing.JTextField();
        frmBusquedaRegistro = new javax.swing.JFrame();
        jLabel10 = new javax.swing.JLabel();
        idABuscar = new javax.swing.JTextField();
        bttnBuscar = new javax.swing.JButton();
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

        jLabel2.setText("ID del producto:");

        jLabel3.setText("Unidades Vendidas:");

        productoId.setText("jTextField1");
        productoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoIdActionPerformed(evt);
            }
        });

        productoCantidad.setText("jTextField2");
        productoCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoCantidadActionPerformed(evt);
            }
        });

        bttnRegistrarVenta.setText("Registrar");
        bttnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegistrarVentaActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha:");

        fechaVenta.setText("jTextField1");

        datosReporte.setColumns(20);
        datosReporte.setRows(5);
        jScrollPane1.setViewportView(datosReporte);

        jLabel5.setText("Datos del reporte");

        javax.swing.GroupLayout frmRegistrarVentaLayout = new javax.swing.GroupLayout(frmRegistrarVenta.getContentPane());
        frmRegistrarVenta.getContentPane().setLayout(frmRegistrarVentaLayout);
        frmRegistrarVentaLayout.setHorizontalGroup(
            frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRegistrarVentaLayout.createSequentialGroup()
                .addGroup(frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmRegistrarVentaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmRegistrarVentaLayout.createSequentialGroup()
                        .addGroup(frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frmRegistrarVentaLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel4)
                                .addGap(45, 45, 45)
                                .addComponent(fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(frmRegistrarVentaLayout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(productoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(frmRegistrarVentaLayout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(productoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addComponent(bttnRegistrarVenta)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRegistrarVentaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(169, 169, 169))
        );
        frmRegistrarVentaLayout.setVerticalGroup(
            frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRegistrarVentaLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        bttnActualizarVenta.setText("Actualizar Registro");
        bttnActualizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnActualizarVentaActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha:");

        fechaVentaActualizada.setText("jTextField1");
        fechaVentaActualizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaVentaActualizadaActionPerformed(evt);
            }
        });

        datosReporteActualizado.setColumns(20);
        datosReporteActualizado.setRows(5);
        jScrollPane2.setViewportView(datosReporteActualizado);

        jLabel7.setText("ID del producto:");

        jLabel8.setText("Datos de reporte actualizado");

        jLabel9.setText("Unidades Vendidas:");

        productoIdActualizado.setText("jTextField1");
        productoIdActualizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoIdActualizadoActionPerformed(evt);
            }
        });

        productoCantidadActualizado.setText("jTextField2");
        productoCantidadActualizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoCantidadActualizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmActualizarVentaLayout = new javax.swing.GroupLayout(frmActualizarVenta.getContentPane());
        frmActualizarVenta.getContentPane().setLayout(frmActualizarVentaLayout);
        frmActualizarVentaLayout.setHorizontalGroup(
            frmActualizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmActualizarVentaLayout.createSequentialGroup()
                .addGroup(frmActualizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmActualizarVentaLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel6)
                        .addGap(45, 45, 45)
                        .addComponent(fechaVentaActualizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmActualizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frmActualizarVentaLayout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productoIdActualizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(frmActualizarVentaLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(productoCantidadActualizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(bttnActualizarVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmActualizarVentaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(frmActualizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmActualizarVentaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmActualizarVentaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        frmActualizarVentaLayout.setVerticalGroup(
            frmActualizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmActualizarVentaLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(frmActualizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoIdActualizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmActualizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(productoCantidadActualizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnActualizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(frmActualizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fechaVentaActualizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel10.setText("Id del Registro a actualizar:");

        idABuscar.setText("jTextField1");

        bttnBuscar.setText("Buscar registro");
        bttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmBusquedaRegistroLayout = new javax.swing.GroupLayout(frmBusquedaRegistro.getContentPane());
        frmBusquedaRegistro.getContentPane().setLayout(frmBusquedaRegistroLayout);
        frmBusquedaRegistroLayout.setHorizontalGroup(
            frmBusquedaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmBusquedaRegistroLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(idABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmBusquedaRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnBuscar)
                .addGap(134, 134, 134))
        );
        frmBusquedaRegistroLayout.setVerticalGroup(
            frmBusquedaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmBusquedaRegistroLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(frmBusquedaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(idABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttnBuscar)
                .addGap(88, 88, 88))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Startuo Soluciones");
        setPreferredSize(new java.awt.Dimension(750, 482));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazSym/logo.png"))); // NOI18N

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
        jMenuBar1.setVisible(false);
        frmBusquedaRegistro.setVisible(true);
    }//GEN-LAST:event_PeActualizarVentaActionPerformed

    private void PeRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeRegistrarVentaActionPerformed
        jMenuBar1.setVisible(false);
        frmRegistrarVenta.setVisible(true);
    }//GEN-LAST:event_PeRegistrarVentaActionPerformed

    private void PeNewUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeNewUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PeNewUsuarioActionPerformed

    private void productoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoIdActionPerformed

    private void bttnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegistrarVentaActionPerformed
        
        datosReporte.append("ID del Producto: \n" + productoId.getText());
        datosReporte.append("Unidades Vendidas: \n" + productoCantidad.getText());
        datosReporte.append("Fecha: \n" + fechaVenta.getText());
        
        GestorDeVentas.listaDeRegistros.add(GestorDeVentas.idRegistroDeVenta, new RegistroDeVenta(
                GestorDeVentas.idRegistroDeVenta,
                productoId.getText(), productoCantidad.getText(), fechaVenta.getText()));
        
        frmRegistrarVenta.setVisible(false);
        jMenuBar1.setVisible(true);
    }//GEN-LAST:event_bttnRegistrarVentaActionPerformed

    private void productoCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoCantidadActionPerformed

    private void bttnActualizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnActualizarVentaActionPerformed
        datosReporteActualizado.append("ID del Producto: \n" + productoIdActualizado.getText());
        datosReporteActualizado.append("Unidades Vendidas: \n" + productoCantidadActualizado.getText());
        datosReporteActualizado.append("Fecha: \n" + fechaVentaActualizada.getText());
        
        GestorDeVentas.listaDeRegistros.add(new RegistroDeVenta(
                GestorDeVentas.idABuscar,
                productoIdActualizado.getText(), productoCantidadActualizado.getText(), fechaVentaActualizada.getText()));
        GestorDeVentas.idRegistroDeVenta++;
        frmActualizarVenta.setVisible(false);
        jMenuBar1.setVisible(true);
    }//GEN-LAST:event_bttnActualizarVentaActionPerformed

    private void productoIdActualizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoIdActualizadoActionPerformed

    }//GEN-LAST:event_productoIdActualizadoActionPerformed

    private void productoCantidadActualizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoCantidadActualizadoActionPerformed

    }//GEN-LAST:event_productoCantidadActualizadoActionPerformed

    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed
        
        if (GestorDeVentas.buscarPorId(Integer.parseInt(idABuscar.getText())) != null){
            GestorDeVentas.idABuscar = Integer.parseInt(idABuscar.getText());
            
            productoIdActualizado.setText(
                GestorDeVentas.listaDeRegistros.get(GestorDeVentas.idABuscar).textProductoId);

            productoCantidadActualizado.setText(
                GestorDeVentas.listaDeRegistros.get(GestorDeVentas.idABuscar).unidadesVendidas);
	fechaVentaActualizada.setText(
                GestorDeVentas.listaDeRegistros.get(GestorDeVentas.idABuscar).fecha);
            
            
            frmBusquedaRegistro.setVisible(false);
            frmActualizarVenta.setVisible(true);
        }else{
            //LanzarMensajeDeRegistroNoEncontrado
        }
        
    }//GEN-LAST:event_bttnBuscarActionPerformed

    private void fechaVentaActualizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaVentaActualizadaActionPerformed

    }//GEN-LAST:event_fechaVentaActualizadaActionPerformed

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
    private javax.swing.JButton bttnActualizarVenta;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JButton bttnRegistrarVenta;
    private javax.swing.JTextArea datosReporte;
    private javax.swing.JTextArea datosReporteActualizado;
    private javax.swing.JTextField fechaVenta;
    private javax.swing.JTextField fechaVentaActualizada;
    private javax.swing.JFrame frmActualizarVenta;
    private javax.swing.JFrame frmBusquedaRegistro;
    private javax.swing.JFrame frmRegistrarVenta;
    private javax.swing.JFrame frmRegristrar;
    private javax.swing.JTextField idABuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem omActualizarStock;
    private javax.swing.JMenuItem omDardeBaja;
    private javax.swing.JMenuItem omModificarClientes;
    private javax.swing.JMenuItem omNewProducto;
    private javax.swing.JMenu peFile;
    private javax.swing.JTextField productoCantidad;
    private javax.swing.JTextField productoCantidadActualizado;
    private javax.swing.JTextField productoId;
    private javax.swing.JTextField productoIdActualizado;
    // End of variables declaration//GEN-END:variables
}
