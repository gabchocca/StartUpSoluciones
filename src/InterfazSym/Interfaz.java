
package InterfazSym;
import java.util.Date;
import com.formdev.flatlaf.FlatLaf;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.text.SimpleDateFormat;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;

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
        FrmNuevoCliente = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtTelef = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        frmBuscarUsuario = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        lblNombreUserBuscar = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombUserBuscar = new javax.swing.JTextField();
        btnBuscarUser = new javax.swing.JButton();
        btnSalirBuscarU = new javax.swing.JButton();
        JScrollPane3 = new javax.swing.JScrollPane();
        tblResultadoUsuario = new javax.swing.JTable();
        frmVenta = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        lblUltimoCP = new javax.swing.JLabel();
        lblNumCP = new javax.swing.JLabel();
        lblCodUser = new javax.swing.JLabel();
        lblFechaCP = new javax.swing.JLabel();
        lblDniClie = new javax.swing.JLabel();
        lblNomProd = new javax.swing.JLabel();
        lblCant = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblDescto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNumCP = new javax.swing.JTextField();
        txtCodigoUser = new javax.swing.JTextField();
        txtDNI1 = new javax.swing.JTextField();
        txtNombProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnAgregarPedido = new javax.swing.JButton();
        btnQuitarPedido = new javax.swing.JButton();
        btnEfectuar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        cmbDcto = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClienteEncontrado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProductoEncontrado = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        dateChFechaVenta = new com.toedter.calendar.JDateChooser();
        frmGestionCli = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        btnclientes = new javax.swing.JButton();
        btnproductos = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnproveedores = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        frmReportarClientess = new javax.swing.JFrame();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();
        fechaFin = new com.toedter.calendar.JDateChooser();
        label3 = new java.awt.Label();
        btnGenerarRee = new java.awt.Button();
        frmReportarVentas = new javax.swing.JFrame();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fchaInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        fchaFin = new com.toedter.calendar.JDateChooser();
        label1 = new java.awt.Label();
        btnGenerarR = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        peFile = new javax.swing.JMenu();
        PeNewCliente = new javax.swing.JMenuItem();
        BuscarUsuario = new javax.swing.JMenuItem();
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

        jPanel2.setToolTipText("");

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

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setText(" Ingrese el ID del producto: ");

        jTextField1.setText("ex");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText(" Ingrese la cantidad vendida: ");

        jTextField2.setText("ex");
        jTextField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(85, 88, 121)));
        jTextField2.setDisabledTextColor(null);

        jButton1.setText("Registrar");
        jButton1.setBorder(null);
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
        jTextField3.setEnabled(false);

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
                .addContainerGap(276, Short.MAX_VALUE))
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

        FrmNuevoCliente.setBounds(new java.awt.Rectangle(250, 250, 0, 0));

        jPanel5.setToolTipText("");

        jLabel11.setText("REGISTRAR NUEVO CLIENTE");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setText("Nombre del cliente:");

        jLabel13.setText("DNI:");

        jLabel14.setText("Teléfono:");

        jLabel16.setText("Correo Electronico:");

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreC))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelef)
                                    .addComponent(txtDNI)
                                    .addComponent(txtCorreo))))))
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout FrmNuevoClienteLayout = new javax.swing.GroupLayout(FrmNuevoCliente.getContentPane());
        FrmNuevoCliente.getContentPane().setLayout(FrmNuevoClienteLayout);
        FrmNuevoClienteLayout.setHorizontalGroup(
            FrmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FrmNuevoClienteLayout.setVerticalGroup(
            FrmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frmBuscarUsuario.setTitle("BUSCAR USUARIO");
        frmBuscarUsuario.setMinimumSize(new java.awt.Dimension(450, 450));

        jPanel7.setMinimumSize(new java.awt.Dimension(300, 300));

        lblNombreUserBuscar.setText("Ingrese Codigo Usuario a Buscar: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("BUSCAR USUARIO");

        txtNombUserBuscar.setBorder(null);
        txtNombUserBuscar.setPreferredSize(new java.awt.Dimension(200, 200));
        txtNombUserBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombUserBuscarActionPerformed(evt);
            }
        });

        btnBuscarUser.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btnBuscarUser.setText("BUSCAR");
        btnBuscarUser.setBorder(null);
        btnBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUserActionPerformed(evt);
            }
        });

        btnSalirBuscarU.setText("Salir");
        btnSalirBuscarU.setBorder(null);
        btnSalirBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirBuscarUActionPerformed(evt);
            }
        });

        tblResultadoUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre Usuario", "Password Usuario"
            }
        ));
        JScrollPane3.setViewportView(tblResultadoUsuario);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 73, Short.MAX_VALUE)
                .addComponent(JScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblNombreUserBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombUserBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel22))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnSalirBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel22)
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombUserBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreUserBuscar))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalirBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmBuscarUsuarioLayout = new javax.swing.GroupLayout(frmBuscarUsuario.getContentPane());
        frmBuscarUsuario.getContentPane().setLayout(frmBuscarUsuarioLayout);
        frmBuscarUsuarioLayout.setHorizontalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmBuscarUsuarioLayout.setVerticalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmVenta.setTitle("REGISTRAR VENTA");
        frmVenta.setMinimumSize(new java.awt.Dimension(800, 1000));

        jPanel6.setPreferredSize(new java.awt.Dimension(800, 900));

        lblUltimoCP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoCP.setText(".........");

        lblNumCP.setText("Numero Comprobante:");

        lblCodUser.setText("Usuario");

        lblFechaCP.setText("Fecha:");

        lblDniClie.setText("Ingrese DNI Cliente:");

        lblNomProd.setText("Ingrese Nombre Producto:");

        lblCant.setText("Cantidad:");

        lblTotal.setText("TOTAL VENTA (S/.)");

        lblDescto.setText("Asignar Porcentaje Descuento:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Registrar Venta");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Ultimo Comprobante Generado:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Productos a Vender");

        txtNumCP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtDNI1.setToolTipText("");

        txtNombProducto.setToolTipText("");

        txtCantidad.setToolTipText("");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotal.setToolTipText("");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnAgregarPedido.setText("Agregar a Venta");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        btnQuitarPedido.setText("Quitar de la Venta");
        btnQuitarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarPedidoActionPerformed(evt);
            }
        });

        btnEfectuar.setText("EfectuarVenta");
        btnEfectuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectuarActionPerformed(evt);
            }
        });

        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        cmbDcto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));
        cmbDcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDctoActionPerformed(evt);
            }
        });

        tblClienteEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DNI Cliente", "Nombre Cliente", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(tblClienteEncontrado);

        tblProductoEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod Producto", "Nombre Producto", "Precio", "Saldo Actual"
            }
        ));
        jScrollPane3.setViewportView(tblProductoEncontrado);

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Producto", "Nomre Producto", "Precio Venta", "Cantidad", "SubTotal"
            }
        ));
        tblVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(tblVenta);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblNumCP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumCP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblCodUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFechaCP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel15)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(lblUltimoCP))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblDniClie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDNI1)
                                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNuevoCliente))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblNomProd)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblCant)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator5)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(lblTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(lblDescto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbDcto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQuitarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel18))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnEfectuar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(lblUltimoCP))
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumCP)
                            .addComponent(txtNumCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaCP)
                            .addComponent(lblCodUser))
                        .addComponent(txtCodigoUser))
                    .addComponent(dateChFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDniClie))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomProd))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCant)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnQuitarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescto)
                            .addComponent(cmbDcto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal))))
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEfectuar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout frmVentaLayout = new javax.swing.GroupLayout(frmVenta.getContentPane());
        frmVenta.getContentPane().setLayout(frmVentaLayout);
        frmVentaLayout.setHorizontalGroup(
            frmVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmVentaLayout.setVerticalGroup(
            frmVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnclientes.setText("Clientes");
        btnclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientesActionPerformed(evt);
            }
        });

        btnproductos.setText("Productos");
        btnproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Gestion Clientes");

        jLabel7.setText("DNI del cliente");

        jLabel8.setText("Nombre");

        jLabel9.setText("Apellido");

        jLabel10.setText("Telefono");

        btnguardar.setText("Guardar/Registrar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnproveedores.setText("Proveedores");
        btnproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproveedoresActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");

        btneliminar.setText("Eliminar");

        btnnuevo.setText("Nuevo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(jTextField6))))
                                        .addGap(145, 145, 145)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnguardar)
                                            .addComponent(btneditar)
                                            .addComponent(btnbuscar)
                                            .addComponent(btneliminar)
                                            .addComponent(btnnuevo)))
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(btnclientes)
                                .addGap(43, 43, 43)
                                .addComponent(btnproductos)
                                .addGap(48, 48, 48)
                                .addComponent(btnproveedores)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnproductos)
                    .addComponent(btnclientes)
                    .addComponent(btnproveedores))
                .addGap(42, 42, 42)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnnuevo)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmGestionCliLayout = new javax.swing.GroupLayout(frmGestionCli.getContentPane());
        frmGestionCli.getContentPane().setLayout(frmGestionCliLayout);
        frmGestionCliLayout.setHorizontalGroup(
            frmGestionCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmGestionCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmGestionCliLayout.setVerticalGroup(
            frmGestionCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frmReportarClientess.setTitle("Reportar Ventas");

        jLabel21.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel21.setText("Fecha de inicio:");

        jLabel23.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel23.setText("Reportar Clientes");

        tblReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI del Cliente", "Nombre del Cliente", "Telefono", "Correo"
            }
        ));
        jScrollPane6.setViewportView(tblReportes);

        label3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        label3.setText("Fecha de fin:");

        btnGenerarRee.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnGenerarRee.setLabel("Generar reporte");
        btnGenerarRee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmReportarClientessLayout = new javax.swing.GroupLayout(frmReportarClientess.getContentPane());
        frmReportarClientess.getContentPane().setLayout(frmReportarClientessLayout);
        frmReportarClientessLayout.setHorizontalGroup(
            frmReportarClientessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmReportarClientessLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmReportarClientessLayout.createSequentialGroup()
                .addGroup(frmReportarClientessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmReportarClientessLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmReportarClientessLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel23)))
                .addGap(17, 17, 17)
                .addComponent(fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(frmReportarClientessLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnGenerarRee, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmReportarClientessLayout.setVerticalGroup(
            frmReportarClientessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmReportarClientessLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(29, 29, 29)
                .addGroup(frmReportarClientessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmReportarClientessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnGenerarRee, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        frmReportarVentas.setTitle("Reportar Ventas");

        jLabel19.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel19.setText("Fecha de inicio:");

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel20.setText("Reportar Ventas");

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre de Usuario", "DNI del Cliente", "Monto Bruto", "Monto total"
            }
        ));
        jScrollPane5.setViewportView(tblReporte);

        label1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        label1.setText("Fecha de fin:");

        btnGenerarR.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnGenerarR.setLabel("Generar reporte");
        btnGenerarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmReportarVentasLayout = new javax.swing.GroupLayout(frmReportarVentas.getContentPane());
        frmReportarVentas.getContentPane().setLayout(frmReportarVentasLayout);
        frmReportarVentasLayout.setHorizontalGroup(
            frmReportarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmReportarVentasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmReportarVentasLayout.createSequentialGroup()
                .addGroup(frmReportarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmReportarVentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fchaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmReportarVentasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel20)))
                .addGap(17, 17, 17)
                .addComponent(fchaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(frmReportarVentasLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnGenerarR, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmReportarVentasLayout.setVerticalGroup(
            frmReportarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmReportarVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(29, 29, 29)
                .addGroup(frmReportarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmReportarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fchaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(fchaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnGenerarR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

        PeNewCliente.setText("Nuevo Cliente");
        PeNewCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeNewClienteActionPerformed(evt);
            }
        });
        peFile.add(PeNewCliente);

        BuscarUsuario.setText("Buscar Usuario");
        BuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarUsuarioActionPerformed(evt);
            }
        });
        peFile.add(BuscarUsuario);

        PeSalir.setText("Salir");
        PeSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeSalirActionPerformed(evt);
            }
        });
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
        omModificarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omModificarClientesActionPerformed(evt);
            }
        });
        PeGestionClientes.add(omModificarClientes);

        omDardeBaja.setText("Dar de Baja");
        omDardeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omDardeBajaActionPerformed(evt);
            }
        });
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
        omActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omActualizarStockActionPerformed(evt);
            }
        });
        PeProductos.add(omActualizarStock);

        PeGestion.add(PeProductos);

        jMenuBar1.add(PeGestion);

        PeReportes.setText("Reportes");

        PeReportarVentas.setText("Reportar Ventas");
        PeReportarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeReportarVentasActionPerformed(evt);
            }
        });
        PeReportes.add(PeReportarVentas);

        PeReportarClientes.setText("Reportar Clientes");
        PeReportarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeReportarClientesActionPerformed(evt);
            }
        });
        PeReportes.add(PeReportarClientes);

        PeReportarProductos.setText("Reportar Productos");
        PeReportarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeReportarProductosActionPerformed(evt);
            }
        });
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
       FlatLaf.updateUI();
    }//GEN-LAST:event_PeRegistrarVentaActionPerformed

    private void PeNewClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeNewClienteActionPerformed
        
        FrmNuevoCliente.setVisible(true);
        FlatLaf.updateUI();
        FrmNuevoCliente.setSize(400,500);
        
    }//GEN-LAST:event_PeNewClienteActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void omNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omNewProductoActionPerformed
        Productos ventanaProductos = new Productos();
        ventanaProductos.setVisible(true);
        FlatLaf.updateUI();
    }//GEN-LAST:event_omNewProductoActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        cConnection con = new cConnection();
        
        String DniC;
        String nombC;
        String telefC;
        String correoC;
       
        try{
              
              DniC = txtDNI.getText();
                nombC = txtNombreC.getText();
                telefC = txtTelef.getText();     // Teléfono
                correoC = txtCorreo.getText();   // Correo

                Statement st = null;
                st = con.ObtenerConexion().createStatement();

                // Cambiamos ApellidoC y Direccion por Telefono y Correo
                st.executeUpdate(
                    "INSERT INTO Cliente(DNICliente,NombreC,Telefono,Correo) " +
                    "VALUES ('" + DniC + "' , '" + nombC + "' , '" + telefC + "' , '" + correoC + "')"
                );

                JOptionPane.showMessageDialog(null, "Se registró cliente...");

                DefaultTableModel dtClienteEncontrado = new DefaultTableModel();
                tblClienteEncontrado.setModel(dtClienteEncontrado);

                dtClienteEncontrado.addColumn("DNI Cliente");
                dtClienteEncontrado.addColumn("Nombres");
                dtClienteEncontrado.addColumn("Telefono"); 
                dtClienteEncontrado.addColumn("Correo");

                String query = "SELECT * FROM Cliente WHERE DNICliente = '" + DniC + "'";

                PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
                ResultSet rs = pstm.executeQuery();         

                while(rs.next()){
                    dtClienteEncontrado.addRow(new Object[] {
                        rs.getString("DNICliente"),
                        rs.getString("NombreC"),
                        rs.getString("Telefono"),
                        rs.getString("Correo")
                    });
                }
                rs.close();

                txtDNI.setText("");
                txtNombreC.setText("");
                txtTelef.setText("");
                txtCorreo.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo agregar: " + e.getMessage(),
                                              "Mensaje", JOptionPane.CANCEL_OPTION);

                txtDNI.setText("");
                txtNombreC.setText("");
                txtTelef.setText("");
                txtCorreo.setText("");
            }
        
      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FrmNuevoCliente.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void PeSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeSalirActionPerformed
       
        this.dispose();
        
    }//GEN-LAST:event_PeSalirActionPerformed

    private void BuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarUsuarioActionPerformed
     frmBuscarUsuario.setVisible(true);        
     FlatLaf.updateUI();
        
        
        
    }//GEN-LAST:event_BuscarUsuarioActionPerformed

    private void txtNombUserBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombUserBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombUserBuscarActionPerformed

    private void btnBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUserActionPerformed

        String codUser;

        cConnection con = new cConnection();

        try{
            codUser = txtNombUserBuscar.getText();

            DefaultTableModel dtBuscarUsuario = new DefaultTableModel(); //Crear Modelo de Tabla dtBuscarUsuario
            tblResultadoUsuario.setModel(dtBuscarUsuario);  // Asignar el Modelo de Tabla para el tblResultadoUuario (formulario)

            dtBuscarUsuario.addColumn("Nombre"); //Asigna nom,be a cada columna del Modelo de Tabla
            dtBuscarUsuario.addColumn("Password");

            String query = "SELECT * FROM Usuario WHERE IdUser = "+codUser+"";

            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()){
                dtBuscarUsuario.addRow(new Object[] {rs.getString("NombUser"),rs.getString("PassUSer")}); //Extrae del rs y lo añade al Modelo de Tabla
            }
            rs.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No existe Usuario. Puede Crear Nuevo.","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarUserActionPerformed

    private void btnSalirBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirBuscarUActionPerformed

        frmBuscarUsuario.setVisible(false);
    }//GEN-LAST:event_btnSalirBuscarUActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed

        
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed

        String nombProd= txtNombProducto.getText();

        cConnection con = new cConnection();

        try
        {
            DefaultTableModel dtResultadoProducto = new DefaultTableModel(); // Crea un Modelo de Tabla
            tblProductoEncontrado.setModel(dtResultadoProducto);  // Asigna el Model ode Tabla al tbProductoEncontrado

            dtResultadoProducto.addColumn("Codigo");
            dtResultadoProducto.addColumn("Nombre Producto");
            dtResultadoProducto.addColumn("Precio Venta");
            dtResultadoProducto.addColumn("Saldo");

            String query = "SELECT * FROM Producto WHERE NombProd LIKE '"+nombProd+"%'";

            Statement st = con.ObtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
            {
                dtResultadoProducto.addRow(new Object[] {rs.getString("CodProd"),rs.getString("NombProd"),rs.getString("Precio"),rs.getString("Saldo")});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No existe el Producto","Mensaje",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed

        
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void btnQuitarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarPedidoActionPerformed

        
             

        
    }//GEN-LAST:event_btnQuitarPedidoActionPerformed

    private void btnEfectuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectuarActionPerformed

             
    }//GEN-LAST:event_btnEfectuarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        frmVenta.setVisible(false);
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void cmbDctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDctoActionPerformed

    }//GEN-LAST:event_cmbDctoActionPerformed

    private void omModificarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omModificarClientesActionPerformed
        

// TODO add your handling code here:
        FlatLaf.updateUI();
    }//GEN-LAST:event_omModificarClientesActionPerformed

    private void omDardeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omDardeBajaActionPerformed
        // TODO add your handling code here:
        FlatLaf.updateUI();
    }//GEN-LAST:event_omDardeBajaActionPerformed

    private void omActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omActualizarStockActionPerformed
        // TODO add your handling code here:
        FlatLaf.updateUI();
    }//GEN-LAST:event_omActualizarStockActionPerformed

    private void PeReportarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeReportarVentasActionPerformed
        
        frmReportarVentas.setVisible(true);
        FlatLaf.updateUI();
        frmReportarVentas.setSize(500,600);
        
    }//GEN-LAST:event_PeReportarVentasActionPerformed

    private void PeReportarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeReportarClientesActionPerformed
        frmReportarClientess.setVisible(true);
        FlatLaf.updateUI();
        frmReportarClientess.setSize(500,600);
    }//GEN-LAST:event_PeReportarClientesActionPerformed

    private void PeReportarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeReportarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PeReportarProductosActionPerformed

    private void btnclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclientesActionPerformed

    private void btnproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnproductosActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnproveedoresActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnGenerarReeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReeActionPerformed
        cConnection con = new cConnection();

        try {

            // 1. Tomar fechas del JDateChooser
            Date fechaIni = fechaInicio.getDate();
            Date fehaFin = fechaFin.getDate();

            // 2. Validación
            if (fechaIni == null || fechaFin == null) {
                JOptionPane.showMessageDialog(null, "Seleccione ambas fechas.");
                return;
            }

            // 3. Formato para Access
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            String f1 = "#" + sdf.format(fechaIni) + "#";
            String f2 = "#" + sdf.format(fechaFin) + "#";

            // 4. Consulta SOLO con los campos que pediste
            String sql = "SELECT NombreC, DNICliente, Correo, Telefono, FechaVenta "
            + "FROM DctoProd "
            + "WHERE FechaVenta BETWEEN " + f1 + " AND " + f2;

            // 5. Modelo para la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("DNI");
            modelo.addColumn("Correo");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Fecha");

            // 6. Conexión y ejecución
            Connection cn = con.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // 7. Llenar JTable
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("NombreC"),
                    rs.getString("DNICliente"),
                    rs.getString("Correo"),
                    rs.getString("Telefono"),
                    rs.getString("FechaVenta")
                });
            }

            tblReportes.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGenerarReeActionPerformed

    private void btnGenerarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRActionPerformed
        cConnection con = new cConnection();
        Date fechaIni = fchaInicio.getDate();
        Date fechaFin = fchaFin.getDate();

        if(fechaIni == null || fechaFin == null){
            JOptionPane.showMessageDialog(null, "Seleccione ambas fechas para filtrar.");
            return;
        }

        // FORMATO DE FECHAS PARA ACCESS (#MM/dd/yyyy#)
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String fIni = "#" + sdf.format(fechaIni) + "#";
        String fFin = "#" + sdf.format(fechaFin) + "#";

        // Modelo de tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre Usuario");
        modelo.addColumn("DNI Cliente");
        modelo.addColumn("Monto Bruto");
        modelo.addColumn("Dcto Producto");
        modelo.addColumn("Monto Total");
        modelo.addColumn("Fecha Venta");

        tblReporte.setModel(modelo);

        // CONSULTA SQL ACTUALIZADA
        String sql = "SELECT NomUsuario, DNICli, MontoBruto, DctoProd, MontoTotal, FechaVenta "
        + "FROM Ventas "
        + "WHERE FechaVenta BETWEEN " + fIni + " AND " + fFin;

        try {
            Connection cn = con.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Object fila[] = {
                    rs.getString("NomUsuario"),
                    rs.getString("DNICli"),
                    rs.getDouble("MontoBruto"),
                    rs.getDouble("DctoProd"),
                    rs.getDouble("MontoTotal"),
                    rs.getString("FechaVenta")
                };
                modelo.addRow(fila);
            }

            tblReporte.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGenerarRActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscarUsuario;
    private javax.swing.JFrame FrmNuevoCliente;
    private javax.swing.JScrollPane JScrollPane3;
    private javax.swing.JMenu PeGestion;
    private javax.swing.JMenu PeGestionClientes;
    private javax.swing.JMenuItem PeNewCliente;
    private javax.swing.JMenu PeProductos;
    private javax.swing.JMenuItem PeRegistrarVenta;
    private javax.swing.JMenuItem PeReportarClientes;
    private javax.swing.JMenuItem PeReportarProductos;
    private javax.swing.JMenuItem PeReportarVentas;
    private javax.swing.JMenu PeReportes;
    private javax.swing.JMenuItem PeSalir;
    private javax.swing.JMenu PeTransacción;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEfectuar;
    private java.awt.Button btnGenerarR;
    private java.awt.Button btnGenerarRee;
    public javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnQuitarPedido;
    private javax.swing.JButton btnSalirBuscarU;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnclientes;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnproductos;
    private javax.swing.JButton btnproveedores;
    public javax.swing.JComboBox cmbDcto;
    private com.toedter.calendar.JDateChooser dateChFechaVenta;
    private com.toedter.calendar.JDateChooser fchaFin;
    private com.toedter.calendar.JDateChooser fchaInicio;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JFrame frmBuscarUsuario;
    private javax.swing.JFrame frmGestionCli;
    private javax.swing.JFrame frmRegistrarVenta;
    private javax.swing.JFrame frmRegristrar;
    private javax.swing.JFrame frmReportarClientess;
    private javax.swing.JFrame frmReportarVentas;
    private javax.swing.JFrame frmVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblCodUser;
    private javax.swing.JLabel lblDescto;
    private javax.swing.JLabel lblDniClie;
    private javax.swing.JLabel lblFechaCP;
    private javax.swing.JLabel lblNomProd;
    private javax.swing.JLabel lblNombreUserBuscar;
    private javax.swing.JLabel lblNumCP;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUltimoCP;
    private javax.swing.JMenuItem omActualizarStock;
    private javax.swing.JMenuItem omDardeBaja;
    private javax.swing.JMenuItem omModificarClientes;
    private javax.swing.JMenuItem omNewProducto;
    private javax.swing.JMenu peFile;
    public javax.swing.JTable tblClienteEncontrado;
    private javax.swing.JTable tblProductoEncontrado;
    private javax.swing.JTable tblReporte;
    private javax.swing.JTable tblReportes;
    private javax.swing.JTable tblResultadoUsuario;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCodigoUser;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    public javax.swing.JTextField txtDNI1;
    private javax.swing.JTextField txtNombProducto;
    private javax.swing.JTextField txtNombUserBuscar;
    private javax.swing.JTextField txtNombreC;
    public javax.swing.JTextField txtNumCP;
    private javax.swing.JTextField txtTelef;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
