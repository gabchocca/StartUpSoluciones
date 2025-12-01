package InterfazSym;

import java.util.Date;
import com.formdev.flatlaf.FlatLaf;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
import InterfazSym.Datos.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.time.format.DateTimeFormatter;

public class Interfaz extends javax.swing.JFrame {

    public boolean productoBuscado = false;
    public boolean DNIBuscado = false;
    public boolean CalcularPresionado = false;
    public Double MontoBruto;
    public Double MontoDcto = 0.0;
    public Double MontoTotal;
    public String DNICli;
    public int cantidad;
    
    Calendar calend = new GregorianCalendar();
    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmRegistrarVenta = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfIdProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCantidadVendida = new javax.swing.JTextField();
        bttnRegistrar = new javax.swing.JButton();
        bttnBuscar = new javax.swing.JButton();
        txtFecha = new javax.swing.JLabel();
        txtIdBoleta = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableDctoVenta = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductoEncontrado = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfDctoProducto = new javax.swing.JTextField();
        tfDctoVenta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        bttnCancelar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableDctoProducto = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        bttnBuscarDNI = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbClienteEncontrado = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        cbAdelanto = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        txtMontoBruto = new javax.swing.JLabel();
        txtMontoDcto = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JLabel();
        txtDNICliente = new javax.swing.JLabel();
        bttnCalcular = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
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
        frmReportarClientess = new javax.swing.JFrame();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();
        fechaFin = new com.toedter.calendar.JDateChooser();
        label3 = new java.awt.Label();
        btnGenerarRee = new java.awt.Button();
        frmGestionCli = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtCorreo1 = new javax.swing.JTextField();
        frmNuevoDctoVenta = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        lblCodigoDctoVenta = new javax.swing.JLabel();
        lblValorDctoVenta = new javax.swing.JLabel();
        lblFechaCreacionDctoVenta = new javax.swing.JLabel();
        lblUltimoDctoVenta = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodDctoVenta = new javax.swing.JTextField();
        txtValorDctoVenta = new javax.swing.JTextField();
        btnRegistrarDctoVenta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        dateChFechaDctoVenta = new com.toedter.calendar.JDateChooser();
        frmNuevoDctoProducto = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        lblCodProdu = new javax.swing.JLabel();
        lblCodigoDctoProdu = new javax.swing.JLabel();
        lblValorDcto = new javax.swing.JLabel();
        lblFechaCreacionDcto = new javax.swing.JLabel();
        lblUltimoDcto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodProdu = new javax.swing.JTextField();
        txtCodDctoProd = new javax.swing.JTextField();
        txtValorDcto = new javax.swing.JTextField();
        btnBuscarProdu = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbResulProducto = new javax.swing.JTable();
        btnRegistrarDctoProducto = new javax.swing.JButton();
        btnSalirDctoProd = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbReportDcto = new javax.swing.JTable();
        dateChFechaDctoProducto = new com.toedter.calendar.JDateChooser();
        frmReportarVentas = new javax.swing.JFrame();
        jLabel26 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fchaInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        fchaFin = new com.toedter.calendar.JDateChooser();
        label1 = new java.awt.Label();
        btnGenerarR = new java.awt.Button();
        frmActualizar = new javax.swing.JFrame();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtNomPro = new javax.swing.JTextField();
        txtProd = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnNuevooo = new javax.swing.JButton();
        frmNuevoProducto = new javax.swing.JFrame();
        jPanel10 = new javax.swing.JPanel();
        lblCodigoP = new javax.swing.JLabel();
        lblNombreP = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblUltimoP = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        btnRegistrarNuevoProducto = new javax.swing.JButton();
        btnSalirP = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        peFile = new javax.swing.JMenu();
        BuscarUsuario = new javax.swing.JMenuItem();
        PeSalir = new javax.swing.JMenuItem();
        PeTransacción = new javax.swing.JMenu();
        PeRegistrarVenta = new javax.swing.JMenuItem();
        PeGestion = new javax.swing.JMenu();
        PeGestionClientes = new javax.swing.JMenu();
        omModificarClientes = new javax.swing.JMenuItem();
        PeProductos = new javax.swing.JMenu();
        omNewProducto = new javax.swing.JMenuItem();
        omActualizarStock = new javax.swing.JMenuItem();
        opNuevoDctoProd = new javax.swing.JMenuItem();
        opNuevoDctoVent = new javax.swing.JMenuItem();
        PeReportes = new javax.swing.JMenu();
        PeReportarVentas = new javax.swing.JMenuItem();
        PeReportarClientes = new javax.swing.JMenuItem();

        frmRegistrarVenta.setBounds(new java.awt.Rectangle(100, 10, 1200, 790));

        jPanel2.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro de Venta");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel2)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setText(" Ingrese el ID del producto: ");

        tfIdProducto.setText("1");
        tfIdProducto.setBorder(null);
        tfIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdProductoActionPerformed(evt);
            }
        });

        jLabel4.setText(" Ingrese la cantidad vendida: ");

        tfCantidadVendida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfCantidadVendida.setDisabledTextColor(null);
        tfCantidadVendida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantidadVendidaActionPerformed(evt);
            }
        });
        tfCantidadVendida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantidadVendidaKeyTyped(evt);
            }
        });

        bttnRegistrar.setText("Registrar");
        bttnRegistrar.setBorder(null);
        bttnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegistrarActionPerformed(evt);
            }
        });

        bttnBuscar.setText("Buscar");
        bttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        txtFecha.setText("Fecha: ...");

        txtIdBoleta.setText("ID_BOLETA: ...");

        txtUsuario.setText("USUARIO: ...");

        tableDctoVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ValorDctoVenta", "IdDctoVenta", "FechaCreacionDctoVenta"
            }
        ));
        jScrollPane5.setViewportView(tableDctoVenta);

        tbProductoEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NombProd", "precio", "saldo", "codProd"
            }
        ));
        jScrollPane1.setViewportView(tbProductoEncontrado);
        if (tbProductoEncontrado.getColumnModel().getColumnCount() > 0) {
            tbProductoEncontrado.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setText("Producto encontrado:");

        jLabel8.setText("DescuentoVenta");

        jLabel9.setText("Ingrese el Id de descuento del Producto:");

        jLabel10.setText("Ingrese el Id del descuento de venta:");

        tfDctoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDctoProductoActionPerformed(evt);
            }
        });
        tfDctoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDctoProductoKeyTyped(evt);
            }
        });

        tfDctoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDctoVentaActionPerformed(evt);
            }
        });
        tfDctoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDctoVentaKeyTyped(evt);
            }
        });

        jLabel19.setText("Ingrese el Dni del cliente:");

        tfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDNIActionPerformed(evt);
            }
        });
        tfDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDNIKeyTyped(evt);
            }
        });

        bttnCancelar.setText("Cancelar");
        bttnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelarActionPerformed(evt);
            }
        });

        tableDctoProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ValorDctoProd", "IdDctoProd", "FechaCreacionDctoProd", "CodProduc"
            }
        ));
        jScrollPane6.setViewportView(tableDctoProducto);

        jLabel7.setText("DescuentoProducto");

        bttnBuscarDNI.setText("Buscar");
        bttnBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarDNIActionPerformed(evt);
            }
        });

        tbClienteEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "NombreC", "ApellidoC", "Telefono", "Correo"
            }
        ));
        jScrollPane7.setViewportView(tbClienteEncontrado);

        jLabel28.setText("Venta de adelanto");

        cbAdelanto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI", " " }));
        cbAdelanto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdelantoActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("BOLETA");

        txtMontoBruto.setText("MontoBruto: ...");

        txtMontoDcto.setText("MontoDescuento: ...");

        txtMontoTotal.setText("MontoTotal: ...");

        txtDNICliente.setText("DNI-Cliente:...");

        bttnCalcular.setText("Calcular");
        bttnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(tfIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(158, 158, 158))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdBoleta)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(txtFecha))
                                .addComponent(txtUsuario)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMontoTotal)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtMontoDcto)
                                .addGap(30, 30, 30)
                                .addComponent(txtDNICliente))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel33)
                                .addComponent(txtMontoBruto))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(11, 11, 11))
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDctoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCantidadVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bttnCalcular)
                                            .addComponent(cbAdelanto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(2, 2, 2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(bttnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(172, 172, 172))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jLabel5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(bttnBuscarDNI))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(bttnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(bttnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bttnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnBuscarDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfCantidadVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfDctoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(tfDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdBoleta)
                                    .addComponent(txtMontoBruto)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbAdelanto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttnCalcular)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario)
                            .addComponent(txtMontoDcto)
                            .addComponent(txtDNICliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha)
                            .addComponent(txtMontoTotal)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmRegistrarVentaLayout = new javax.swing.GroupLayout(frmRegistrarVenta.getContentPane());
        frmRegistrarVenta.getContentPane().setLayout(frmRegistrarVentaLayout);
        frmRegistrarVentaLayout.setHorizontalGroup(
            frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmRegistrarVentaLayout.setVerticalGroup(
            frmRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        jScrollPane9.setViewportView(tblReportes);

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
                .addComponent(jScrollPane9)
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
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Gestion Clientes");

        jLabel29.setText("DNI del cliente");

        jLabel30.setText("Nombre");

        jLabel31.setText("Apellido");

        jLabel32.setText("Telefono");

        btnguardar.setText("Guardar/Registrar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Telefono", "Correo"
            }
        ));
        jScrollPane11.setViewportView(jTable1);

        jLabel25.setText("Correo Electronico:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel29)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel31)))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel32)
                                                .addGap(30, 30, 30)))
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                .addComponent(txtCorreo1)))))
                                .addGap(145, 145, 145)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnguardar)
                                    .addComponent(btnbuscar)
                                    .addComponent(btnsalir)
                                    .addComponent(btnnuevo)))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel6))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnnuevo))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalir)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmGestionCliLayout = new javax.swing.GroupLayout(frmGestionCli.getContentPane());
        frmGestionCli.getContentPane().setLayout(frmGestionCliLayout);
        frmGestionCliLayout.setHorizontalGroup(
            frmGestionCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmGestionCliLayout.setVerticalGroup(
            frmGestionCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmGestionCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        frmNuevoDctoVenta.setTitle("REGISTRAR DESCUENTO VENTAS");
        frmNuevoDctoVenta.setMinimumSize(new java.awt.Dimension(600, 600));

        lblCodigoDctoVenta.setText("Codigo Dcto Venta Total:");

        lblValorDctoVenta.setText("Ingrese Valor Descuento:");
        lblValorDctoVenta.setToolTipText("");

        lblFechaCreacionDctoVenta.setText("Fecha de Creación:");

        lblUltimoDctoVenta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoDctoVenta.setText(".........");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Ingresar Datos de Descuento para Venta");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Ultimo Codigo Registrado:");

        txtCodDctoVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodDctoVenta.setForeground(new java.awt.Color(0, 0, 255));

        btnRegistrarDctoVenta.setText("Registrar");
        btnRegistrarDctoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDctoVentaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(lblUltimoDctoVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblFechaCreacionDctoVenta)
                        .addGap(32, 32, 32)
                        .addComponent(dateChFechaDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCodigoDctoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodDctoVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnRegistrarDctoVenta)
                        .addGap(95, 95, 95)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUltimoDctoVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoDctoVenta)
                    .addComponent(lblValorDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaCreacionDctoVenta)
                    .addComponent(dateChFechaDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarDctoVenta)
                    .addComponent(btnSalir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoDctoVentaLayout = new javax.swing.GroupLayout(frmNuevoDctoVenta.getContentPane());
        frmNuevoDctoVenta.getContentPane().setLayout(frmNuevoDctoVentaLayout);
        frmNuevoDctoVentaLayout.setHorizontalGroup(
            frmNuevoDctoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoDctoVentaLayout.setVerticalGroup(
            frmNuevoDctoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmNuevoDctoProducto.setTitle("REGISTRAR DESCUENTO PRODUCTO");
        frmNuevoDctoProducto.setMinimumSize(new java.awt.Dimension(600, 600));

        lblCodProdu.setText("Ingrese Codigo de Producto:");

        lblCodigoDctoProdu.setText("Codigo Dcto:");

        lblValorDcto.setText("Valor Descuento:");
        lblValorDcto.setToolTipText("");

        lblFechaCreacionDcto.setText("Fecha de Creación:");

        lblUltimoDcto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoDcto.setText(".........");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Ingresar Datos de Descuento de Producto");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Ultimo Codigo Registrado:");

        txtCodDctoProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodDctoProd.setForeground(new java.awt.Color(0, 0, 255));

        btnBuscarProdu.setText("Buscar Producto");
        btnBuscarProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProduActionPerformed(evt);
            }
        });

        tbResulProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo Producto", "Nombre Producto", "Precio", "Saldo"
            }
        ));
        jScrollPane8.setViewportView(tbResulProducto);

        btnRegistrarDctoProducto.setText("Registrar");
        btnRegistrarDctoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDctoProductoActionPerformed(evt);
            }
        });

        btnSalirDctoProd.setText("Salir");
        btnSalirDctoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDctoProdActionPerformed(evt);
            }
        });

        tbReportDcto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo Dcto", "% Dcto"
            }
        ));
        jScrollPane12.setViewportView(tbReportDcto);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(lblCodProdu)
                            .addGap(27, 27, 27)
                            .addComponent(txtCodProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarProdu))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(lblUltimoDcto))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoDctoProdu)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(btnRegistrarDctoProducto)
                                    .addGap(48, 48, 48)
                                    .addComponent(btnSalirDctoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(txtCodDctoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblValorDcto)
                                        .addComponent(txtValorDcto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateChFechaDctoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblFechaCreacionDcto)))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodProdu)
                    .addComponent(txtCodProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProdu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUltimoDcto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoDctoProdu)
                    .addComponent(lblValorDcto)
                    .addComponent(lblFechaCreacionDcto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChFechaDctoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValorDcto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodDctoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrarDctoProducto)
                        .addComponent(btnSalirDctoProd))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoDctoProductoLayout = new javax.swing.GroupLayout(frmNuevoDctoProducto.getContentPane());
        frmNuevoDctoProducto.getContentPane().setLayout(frmNuevoDctoProductoLayout);
        frmNuevoDctoProductoLayout.setHorizontalGroup(
            frmNuevoDctoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmNuevoDctoProductoLayout.setVerticalGroup(
            frmNuevoDctoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frmReportarVentas.setTitle("Reportar Ventas");

        jLabel26.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel26.setText("Fecha de inicio:");

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
        jScrollPane13.setViewportView(tblReporte);

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
                .addComponent(jScrollPane13)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmReportarVentasLayout.createSequentialGroup()
                .addGroup(frmReportarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmReportarVentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)
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
                        .addComponent(jLabel26)
                        .addComponent(fchaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnGenerarR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel35.setText("Nombre del Producto:");
        frmActualizar.getContentPane().add(jLabel35);

        jLabel36.setText("Codigo:");
        frmActualizar.getContentPane().add(jLabel36);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Actualización de Stock");
        frmActualizar.getContentPane().add(jLabel34);
        frmActualizar.getContentPane().add(txtNomPro);
        frmActualizar.getContentPane().add(txtProd);

        btnBuscar.setText("Actualizar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        frmActualizar.getContentPane().add(btnBuscar);
        frmActualizar.getContentPane().add(jSeparator8);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo:", "Producto", "Precio", "Cantidad"
            }
        ));
        jScrollPane10.setViewportView(tblProductos);

        frmActualizar.getContentPane().add(jScrollPane10);

        btnNuevooo.setText("Nuevo");
        btnNuevooo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoooActionPerformed(evt);
            }
        });
        frmActualizar.getContentPane().add(btnNuevooo);

        frmNuevoProducto.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmNuevoProducto.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmNuevoProducto.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel10.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel10.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel10.setPreferredSize(new java.awt.Dimension(427, 435));

        lblCodigoP.setText("Codigo:");

        lblNombreP.setText("Nombre del Producto:");

        lblPrecio.setText("Precio:");

        lblSaldo.setText("Cantidad:");

        lblUltimoP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP.setText(".........");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Ultimo Codigo Registrado:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setText("Ingresar Datos de Producto");

        txtCodigoP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigoP.setForeground(new java.awt.Color(0, 0, 255));

        btnRegistrarNuevoProducto.setText("Agregar");
        btnRegistrarNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoProductoActionPerformed(evt);
            }
        });

        btnSalirP.setText("Salir");
        btnSalirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigoP)
                    .addComponent(lblPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(18, 18, 18)
                            .addComponent(lblUltimoP))
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74)
                            .addComponent(lblSaldo)
                            .addGap(18, 18, 18)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrarNuevoProducto)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombreP)
                            .addComponent(btnSalirP, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel27)
                .addGap(35, 35, 35)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblUltimoP))
                .addGap(40, 40, 40)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSaldo)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigoP)
                        .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreP)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirP)
                    .addComponent(btnRegistrarNuevoProducto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoProductoLayout = new javax.swing.GroupLayout(frmNuevoProducto.getContentPane());
        frmNuevoProducto.getContentPane().setLayout(frmNuevoProductoLayout);
        frmNuevoProductoLayout.setHorizontalGroup(
            frmNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 459, Short.MAX_VALUE)
        );
        frmNuevoProductoLayout.setVerticalGroup(
            frmNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        opNuevoDctoProd.setText("Nuevo Descuento Producto");
        opNuevoDctoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNuevoDctoProdActionPerformed(evt);
            }
        });
        PeGestion.add(opNuevoDctoProd);

        opNuevoDctoVent.setText("Nuevo Descuento Venta");
        opNuevoDctoVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNuevoDctoVentActionPerformed(evt);
            }
        });
        PeGestion.add(opNuevoDctoVent);

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

    private void omNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omNewProductoActionPerformed
        frmNuevoProducto.setVisible(true);
        frmNuevoProducto.setVisible(true);
        FlatLaf.updateUI();
    }//GEN-LAST:event_omNewProductoActionPerformed

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

        try {
            codUser = txtNombUserBuscar.getText();

            DefaultTableModel dtBuscarUsuario = new DefaultTableModel(); //Crear Modelo de Tabla dtBuscarUsuario
            tblResultadoUsuario.setModel(dtBuscarUsuario);  // Asignar el Modelo de Tabla para el tblResultadoUuario (formulario)

            dtBuscarUsuario.addColumn("Nombre"); //Asigna nom,be a cada columna del Modelo de Tabla
            dtBuscarUsuario.addColumn("Password");

            String query = "SELECT * FROM Usuario WHERE IdUser = " + codUser + "";

            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                dtBuscarUsuario.addRow(new Object[]{rs.getString("NombUser"), rs.getString("PassUSer")}); //Extrae del rs y lo añade al Modelo de Tabla
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe Usuario. Puede Crear Nuevo.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
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

        String nombProd = txtNombProducto.getText();

        cConnection con = new cConnection();

        try {
            DefaultTableModel dtResultadoProducto = new DefaultTableModel(); // Crea un Modelo de Tabla
            tblProductoEncontrado.setModel(dtResultadoProducto);  // Asigna el Model ode Tabla al tbProductoEncontrado

            dtResultadoProducto.addColumn("Codigo");
            dtResultadoProducto.addColumn("Nombre Producto");
            dtResultadoProducto.addColumn("Precio Venta");
            dtResultadoProducto.addColumn("Saldo");

            String query = "SELECT * FROM Producto WHERE NombProd LIKE '" + nombProd + "%'";

            Statement st = con.ObtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                dtResultadoProducto.addRow(new Object[]{rs.getString("CodProd"), rs.getString("NombProd"), rs.getString("Precio"), rs.getString("Saldo")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe el Producto", "Mensaje", JOptionPane.CANCEL_OPTION);
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

        frmGestionCli.setVisible(true);
        frmGestionCli.setSize(600, 715);

        FlatLaf.updateUI();
    }//GEN-LAST:event_omModificarClientesActionPerformed

    private void omActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omActualizarStockActionPerformed
       
        frmActualizar.setVisible(true);
        frmActualizar.setSize(400, 400);
        
        
        FlatLaf.updateUI();
    }//GEN-LAST:event_omActualizarStockActionPerformed

    private void PeReportarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeReportarVentasActionPerformed

        frmReportarVentas.setVisible(true);
        FlatLaf.updateUI();
        frmReportarVentas.setSize(500, 600);

    }//GEN-LAST:event_PeReportarVentasActionPerformed

    private void PeReportarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeReportarClientesActionPerformed
        frmReportarClientess.setVisible(true);
        FlatLaf.updateUI();
        frmReportarClientess.setSize(500, 600);
    }//GEN-LAST:event_PeReportarClientesActionPerformed

    private void bttnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegistrarActionPerformed
        //comprobacion
        if (!productoBuscado) {
            JOptionPane.showMessageDialog(null, "Busque un producto primero porfavor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int stock = Integer.parseInt(tbProductoEncontrado.getValueAt(0, 2).toString());

        if (tfCantidadVendida.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene el campo de cantidad por favor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (Integer.parseInt(tfCantidadVendida.getText()) > stock) {
            JOptionPane.showMessageDialog(null, "No hay suficiente saldo", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tfDctoProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene el campo de descuento de producto por favor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tfDctoVenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene el campo de descuento de venta por favor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!DNIBuscado) {
            JOptionPane.showMessageDialog(null, "Busque un cliente por favor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!CalcularPresionado){
            JOptionPane.showMessageDialog(null, "Calcule primero porfavor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String NumDocVenta;
        String FechaVenta;
        String NomUsuario;


        //Hallando monto de descuento
        cConnection con = new cConnection();


        //Monto total, DNi, Id del registro de venta, Fecha y nombre de usuario
        NumDocVenta = String.valueOf(Datos.ID_NUM_DOC_VENTA);
        FechaVenta = txtFecha.getText();
        NomUsuario = Datos.USUARIO;

        //aumentando id para el siguiente registro
        Datos.aumentarID_NUM_DOC_VENTA();
        //

        String sql = "INSERT INTO "
                + "CabecDocVenta (MontoBruto, MontoDcto, MontoTotal, DNICli, NumDocVenta, FechaVenta, NomUsuario) "
                + "VALUES (" + MontoBruto + ", '" + MontoDcto + "', '" + MontoTotal + "', '" + DNICli + "', '" + NumDocVenta + "', '" + FechaVenta + "', '" + NomUsuario + "')";
        try {
            Statement st = con.ObtenerConexion().createStatement();
            int resultado = st.executeUpdate(sql);
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "✅ Venta registrada correctamente");
                frmRegistrarVenta.setVisible(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.toString(), "mensaje", JOptionPane.ERROR_MESSAGE);
        } finally {
            con.closeConecction();
        }

        //Descontando saldo del producto
        try {
            String idDctoProducto = tfDctoProducto.getText();
            int nuevoSaldo = stock - cantidad;
            String queryActualizarStock = "UPDATE Producto SET Saldo = " + nuevoSaldo + " WHERE CodProd = " + idDctoProducto + "";
            Statement stA = con.ObtenerConexion().createStatement();
            stA.executeUpdate(queryActualizarStock);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.toString(), "mensaje", JOptionPane.ERROR_MESSAGE);
        } finally {
            con.closeConecction();
        }


    }//GEN-LAST:event_bttnRegistrarActionPerformed


    private void tfIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdProductoActionPerformed

    private void tfCantidadVendidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantidadVendidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCantidadVendidaActionPerformed

    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed

        String idProducto;
        cConnection con = new cConnection();

        if (tfIdProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene el campo de id del producto", "mensaje", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            //tabla de producto
            idProducto = tfIdProducto.getText();
            DefaultTableModel dtProductoEncontrado = new DefaultTableModel();
            tbProductoEncontrado.setModel(dtProductoEncontrado);

            dtProductoEncontrado.addColumn("NombProd");
            dtProductoEncontrado.addColumn("Precio");
            dtProductoEncontrado.addColumn("Saldo");
            dtProductoEncontrado.addColumn("CodProd");

            String queryP = "SELECT * FROM Producto WHERE CodProd = " + idProducto + "";
            Statement stP = con.ObtenerConexion().createStatement();
            ResultSet rsP = stP.executeQuery(queryP);

            while (rsP.next()) {
                dtProductoEncontrado.addRow(new Object[]{rsP.getString("NombProd"), rsP.getString("Precio"),
                    rsP.getString("Saldo"), rsP.getString("CodProd")});
            }
            stP.close();
            rsP.close();

            //tabla de descuento de producto:
            idProducto = tfIdProducto.getText();

            DefaultTableModel dtDescuentosProducto = new DefaultTableModel();
            tableDctoProducto.setModel(dtDescuentosProducto);
            dtDescuentosProducto.addColumn("ValorDctoProd");
            dtDescuentosProducto.addColumn("IdDctoProd");
            dtDescuentosProducto.addColumn("FechaCreacionDctoProd");
            dtDescuentosProducto.addColumn("CodProduc");

            String queryDP = "SELECT * FROM DctoProd WHERE CodProduc = " + idProducto + "";
            Statement stDP = con.ObtenerConexion().createStatement();
            ResultSet rsDP = stDP.executeQuery(queryDP);

            while (rsDP.next()) {
                dtDescuentosProducto.addRow(new Object[]{rsDP.getString("ValorDctoProd"),
                    rsDP.getString("IdDctoProd"),
                    rsDP.getString("FechaCreacionDctoProd"), rsDP.getString("CodProduc")});
            }
            stDP.close();
            rsDP.close();

            //tabla de descuento de Venta:
            DefaultTableModel dtDescuentosVenta = new DefaultTableModel();
            tableDctoVenta.setModel(dtDescuentosVenta);
            dtDescuentosVenta.addColumn("ValorDctoVenta");
            dtDescuentosVenta.addColumn("IdDctoVenta");
            dtDescuentosVenta.addColumn("FechaCreacionDctoVenta");

            String queryDV = "SELECT * FROM DctoVenta";
            Statement stDV = con.ObtenerConexion().createStatement();
            ResultSet rsDV = stDV.executeQuery(queryDV);

            while (rsDV.next()) {
                dtDescuentosVenta.addRow(new Object[]{rsDV.getString("ValorDctoVenta"),
                    rsDV.getString("IdDctoVenta"),
                    rsDV.getString("FechaCreacionDctoVenta")});
            }
            stDV.close();
            rsDV.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.toString(), "mensaje", JOptionPane.ERROR_MESSAGE);
        } finally {
            con.closeConecction();
        }

        productoBuscado = true;
    }//GEN-LAST:event_bttnBuscarActionPerformed

    private void bttnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelarActionPerformed
        frmRegistrarVenta.setVisible(false);
    }//GEN-LAST:event_bttnCancelarActionPerformed

    private void tfDctoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDctoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDctoProductoActionPerformed

    private void tfCantidadVendidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantidadVendidaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCantidadVendidaKeyTyped

    private void tfDctoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDctoProductoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfDctoProductoKeyTyped

    private void tfDctoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDctoVentaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfDctoVentaKeyTyped

    private void tfDctoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDctoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDctoVentaActionPerformed

    private void tfDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDNIKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfDNIKeyTyped

    private void tfDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDNIActionPerformed

    private void bttnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarDNIActionPerformed
        cConnection con = new cConnection();

        try {
        String dni = tfDNI.getText().trim();

        // EVITAR BUSQUEDAS VACÍAS
        if(dni.equals("")){
            JOptionPane.showMessageDialog(null, 
                    "Ingrese un DNI para buscar.");
            return;
        }

        // MODELO PARA LA TABLA
        DefaultTableModel dt = new DefaultTableModel();
        tbClienteEncontrado.setModel(dt);

        dt.addColumn("DNI");
        dt.addColumn("Nombre");
        dt.addColumn("Apellido");
        dt.addColumn("Telefono");
        dt.addColumn("Correo");

        // CONSULTA SOLO POR DNI
        String query = "SELECT * FROM Cliente WHERE DNICliente = ?";

        PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
        pstm.setString(1, dni);

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            dt.addRow(new Object[]{
                rs.getString("DNICliente"),
                rs.getString("NombreC"),
                rs.getString("ApellidoC"),
                rs.getString("Telefono"),
                rs.getString("Correo")
            });
        }

        rs.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, 
                "Error al buscar: " + e.getMessage());
    }

        DNIBuscado = true;
    }//GEN-LAST:event_bttnBuscarDNIActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        cConnection con = new cConnection();

        String dniC;
        String nombreC;
        String apellidoC;
        String telefonoC;
        String correoC;

        try {

            dniC = txtDni.getText();
            nombreC = txtNombre.getText();
            apellidoC = txtApellido.getText();
            telefonoC = txtTelefono.getText();
            correoC = txtCorreo1.getText();

            Statement st = con.ObtenerConexion().createStatement();

            // Insertar con los campos nuevos
            st.executeUpdate(
                    "INSERT INTO Cliente(DNICliente, NombreC, ApellidoC, Telefono, Correo) "
                    + "VALUES ('" + dniC + "', '" + nombreC + "', '" + apellidoC + "', '" + telefonoC + "', '" + correoC + "')"
            );

            JOptionPane.showMessageDialog(null, "Se registró cliente...");

            // Tabla de datos encontrados
            DefaultTableModel dt = new DefaultTableModel();
            jTable1.setModel(dt);

            dt.addColumn("DNI");
            dt.addColumn("NombresC");
            dt.addColumn("ApellidosC");
            dt.addColumn("Telefono");

            String query = "SELECT * FROM Cliente WHERE DNICliente = '" + dniC + "'";

            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                dt.addRow(new Object[]{
                    rs.getString("DNICliente"),
                    rs.getString("Nombre"),
                    rs.getString("Apellido"),
                    rs.getString("Telefono")
                });
            }

            rs.close();

            // Limpiar campos
            txtDni.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtTelefono.setText("");
            txtCorreo1.setText("");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se pudo agregar: " + e.getMessage(),
                    "Mensaje", JOptionPane.CANCEL_OPTION);

            txtDni.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtTelefono.setText("");
            txtCorreo1.setText("");
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        cConnection con = new cConnection();

        try {
            String dni = txtDni.getText().trim();
            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String correo = txtCorreo1.getText().trim();

            // MODELO PARA LA TABLA
            DefaultTableModel dt = new DefaultTableModel();
            jTable1.setModel(dt);

            dt.addColumn("DNI");
            dt.addColumn("Nombre");
            dt.addColumn("Apellido");
            dt.addColumn("Telefono");
            dt.addColumn("Correo");

            // CONSULTA FLEXIBLE PARA TODOS LOS CAMPOS
            String query = "SELECT * FROM Cliente WHERE "
                    + "DNICliente LIKE ? AND "
                    + "NombreC LIKE ? AND "
                    + "ApellidoC LIKE ? AND "
                    + "Telefono LIKE ? AND "
                    + "Correo LIKE ?";

            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);

            // Permite buscar cualquiera de los campos
            pstm.setString(1, "%" + dni + "%");
            pstm.setString(2, "%" + nombre + "%");
            pstm.setString(3, "%" + apellido + "%");
            pstm.setString(4, "%" + telefono + "%");
            pstm.setString(5, "%" + correo + "%");

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                dt.addRow(new Object[]{
                    rs.getString("DNICliente"),
                    rs.getString("NombreC"),
                    rs.getString("ApellidoC"),
                    rs.getString("Telefono"),
                    rs.getString("Correo")
                });
            }

            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error al buscar: " + e.getMessage());
        }

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

        frmGestionCli.setVisible(false);

    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCorreo1.setText("");

        // Colocar cursor en el primer campo
        txtDni.requestFocus();

        // OPCIONAL: limpiar la tabla jTable1 también
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void opNuevoDctoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNuevoDctoProdActionPerformed

        frmNuevoDctoProducto.setVisible(true);
        frmNuevoDctoProducto.setLocationRelativeTo(null);
        frmNuevoDctoProducto.setSize(318,517);

        dateChFechaDctoProducto.setCalendar(calend);  // Poner la fecha Actual en el JDateChooser

    }//GEN-LAST:event_opNuevoDctoProdActionPerformed

    private void opNuevoDctoVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNuevoDctoVentActionPerformed

        frmNuevoDctoVenta.setVisible(true);
        frmNuevoDctoVenta.setLocationRelativeTo(null);

        dateChFechaDctoVenta.setCalendar(calend); // Poner la fecha Actual en el JDateChooser

        cConnection con = new cConnection();

        String queryDV = "SELECT MAX(IdDctoVenta) AS IdDctoVenta FROM DctoVenta"; //selecciona el ultimo(MAX) registro de la tabla

        int codDV;

        try
        {
            Statement st = con.ObtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(queryDV);

            if(rs.next())
            {
                lblUltimoDctoVenta.setText(rs.getString("IdDctoVenta"));
                codDV = Integer.parseInt(rs.getString("IdDctoVenta"));
                codDV++;
                txtCodDctoVenta.setText(String.valueOf(codDV));
                txtCodDctoVenta.setEditable(false);
                txtValorDctoVenta.requestFocus();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No existe un Descuento de Venta. Puede Crear nuevo.","Mensaje",JOptionPane.INFORMATION_MESSAGE);

            codDV=1;           // Para poner el promer codigo del producto
            lblUltimoDctoVenta.setText("CERO");
            txtCodDctoVenta.setText(String.valueOf(codDV));
            txtCodDctoVenta.setEditable(false);
            txtCodDctoVenta.requestFocus();
        }
    }//GEN-LAST:event_opNuevoDctoVentActionPerformed

    private void btnRegistrarDctoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDctoVentaActionPerformed

        cConnection con = new cConnection();

        String codDV;
        String valorDV;
        String FechaDV;

        try{
            codDV = txtCodDctoVenta.getText();
            valorDV = txtValorDctoVenta.getText();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //Primero dar formato para fecha
            FechaDV = sdf.format(dateChFechaDctoVenta.getDate());

            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO DctoVenta(IdDctoVenta,ValorDctoVenta,FechaCreacionDctoVenta)" + "values("+codDV+" , "+valorDV+" , '"+FechaDV+"')");

            JOptionPane.showMessageDialog(null, "Se registró Descuento de Venta...");

            txtCodDctoVenta.setText("");
            txtValorDctoVenta.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
            txtCodDctoVenta.setText("");
            txtValorDctoVenta.setText("");
        }
    }//GEN-LAST:event_btnRegistrarDctoVentaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        frmNuevoDctoVenta.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProduActionPerformed

        String codProd;

        cConnection con = new cConnection();

        try
        {
            codProd= txtCodProdu.getText();

            DefaultTableModel dtProductoDcto = new DefaultTableModel(); // Creal el Modelo de Tabla dtProductoDcto
            tbResulProducto.setModel(dtProductoDcto); // Asigna el Modelo de Tabla al JTable del Formulario

            dtProductoDcto.addColumn("Codigo");  //Asigna nombre a cada columna del Modelo de Tabla
            dtProductoDcto.addColumn("NombreProd");
            dtProductoDcto.addColumn("PrecioProd");
            dtProductoDcto.addColumn("SaldoProd");

            String queryP = "SELECT * from Producto WHERE CodProd = "+codProd+"";
            Statement stP = con.ObtenerConexion().createStatement();
            ResultSet rsP = stP.executeQuery(queryP);

            while(rsP.next())
            {
                dtProductoDcto.addRow(new Object[] {rsP.getString("CodProd"),rsP.getString("NombProd"),rsP.getString("Precio"),rsP.getString("Saldo")}); // extrae del rs y lo añade a una fila del Model ode Tabla
            }

            DefaultTableModel dtDcto = new DefaultTableModel(); // Creal el Modelo de Tabla dtReportDcto
            tbReportDcto.setModel(dtDcto); // Asigna el Modelo de Tabla al JTable del Formulario

            dtDcto.addColumn("Codigo Dcto");  //Asigna nombre a cada columna del Modelo de Tabla
            dtDcto.addColumn("% Dcto");

            String queryDcP = "SELECT * from DctoProd WHERE CodProduc = "+codProd+"";
            Statement stDcP = con.ObtenerConexion().createStatement();
            ResultSet rsDcP = stDcP.executeQuery(queryDcP);

            String queryDP = "SELECT MAX(IdDctoProd) AS IdDctoProd FROM DctoProd"; //selecciona el ultimo(MAX) registro de la tabla

            int codDP;

            try
            {
                Statement stDP = con.ObtenerConexion().createStatement();
                ResultSet rsDP = stDP.executeQuery(queryDP);

                if(rsDP.next())
                {
                    lblUltimoDcto.setText(rsDP.getString("IdDctoProd"));
                    codDP = Integer.parseInt(rsDP.getString("IdDctoProd"));
                    codDP++;
                    txtCodDctoProd.setText(String.valueOf(codDP));
                    txtCodDctoProd.setEditable(false);
                    txtValorDctoVenta.requestFocus();

                    while(rsDcP.next())
                    {
                        dtDcto.addRow(new Object[] {rsDcP.getString("IdDctoProd"),rsDcP.getString("ValorDctoProd")}); // extrae del rs y lo añade a una fila del Model ode Tabla
                    }
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"No existe un Descuento para este Producto. Puede Crear nuevo.","Mensaje",JOptionPane.INFORMATION_MESSAGE);

                codDP=1;           // Para poner el promer codigo del producto
                lblUltimoDcto.setText("CERO");
                txtCodDctoProd.setText(String.valueOf(codDP));
                txtCodDctoProd.setEditable(false);
                txtCodDctoProd.requestFocus();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No existe el Producto","Mensaje",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnBuscarProduActionPerformed

    private void btnRegistrarDctoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDctoProductoActionPerformed

        cConnection con = new cConnection();

        String codDP;
        String valorDP;
        String FechaDP;
        String CodProduc;

        DefaultTableModel dtProductoDcto = new DefaultTableModel(); // Creal el Modelo de Tabla dtProductoDcto
        tbResulProducto.setModel(dtProductoDcto); // Asigna el Modelo de Tabla al JTable del Formulario para incicalizarlo

        DefaultTableModel dtDcto = new DefaultTableModel(); // Creal el Modelo de Tabla dtReportDcto
        tbReportDcto.setModel(dtDcto); // Asigna el Modelo de Tabla al JTable del Formulario para incicalizarlo

        try{
            codDP = txtCodDctoProd.getText();
            valorDP = txtValorDcto.getText();
            CodProduc = txtCodProdu.getText();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //Primero dar formato para fecha
            FechaDP = sdf.format(dateChFechaDctoProducto.getDate());

            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO DctoProd(IdDctoProd,CodProduc,ValorDctoProd,FechaCreacionDctoProd)" + "values("+codDP+" , "+CodProduc+" , "+valorDP+" , '"+FechaDP+"')");

            JOptionPane.showMessageDialog(null, "Se registró Descuento de Producto.");

            txtCodDctoProd.setText("");
            txtValorDcto.setText("");
            txtCodProdu.setText("");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
            txtCodDctoProd.setText("");
            txtValorDcto.setText("");
        }
    }//GEN-LAST:event_btnRegistrarDctoProductoActionPerformed

    private void btnSalirDctoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDctoProdActionPerformed

        frmNuevoDctoProducto.setVisible(false);
    }//GEN-LAST:event_btnSalirDctoProdActionPerformed

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cConnection con = new cConnection();

        try {
            String codigo = txtProd.getText().trim();
            String nombre = txtNomPro.getText().trim();

            // MODELO DE TABLA
            DefaultTableModel dt = new DefaultTableModel();
            tblProductos.setModel(dt);

            dt.addColumn("Codigo");
            dt.addColumn("Producto");
            dt.addColumn("Precio");
            dt.addColumn("Cantidad");

            // CONSULTA FLEXIBLE
            String query = "SELECT * FROM Producto WHERE "
            + "CodProd LIKE ? AND "
            + "NombProd LIKE ?";

            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);

            // Permite buscar por código, nombre o ambos
            pstm.setString(1, "%" + codigo + "%");
            pstm.setString(2, "%" + nombre + "%");

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                dt.addRow(new Object[]{
                    rs.getString("CodProd"),
                    rs.getString("NombProd"),
                    rs.getString("Precio"),
                    rs.getString("Saldo")
                });
            }

            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Error al buscar: " + e.getMessage());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoooActionPerformed

        txtProd.setText("");
        txtNomPro.setText("");

        // Borra la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        modelo.setRowCount(0);

        // Pone el cursor en el primer campo
        txtProd.requestFocus();

    }//GEN-LAST:event_btnNuevoooActionPerformed

    private void btnRegistrarNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoProductoActionPerformed

        cConnection con = new cConnection();

        String codProd;
        String nombProd;
        String precioProd;
        String saldoProd;

        try{

            codProd = txtCodigoP.getText();
            nombProd = txtNombreP.getText();
            precioProd = txtPrecio.getText();
            saldoProd = txtSaldo.getText();

            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Producto(CodProd,NombProd,Precio,Saldo)" + "values("+codProd+" , '"+nombProd+"' , "+precioProd+" , "+saldoProd+")");

            JOptionPane.showMessageDialog(null, "Se registró producto...");

            txtCodigoP.setText("");
            txtNombreP.setText("");
            txtPrecio.setText("");
            txtSaldo.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
            txtCodigoP.setText("");
            txtNombreP.setText("");
            txtPrecio.setText("");
            txtSaldo.setText("");
        }
    }//GEN-LAST:event_btnRegistrarNuevoProductoActionPerformed

    private void btnSalirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPActionPerformed

        frmNuevoProducto.setVisible(false);
    }//GEN-LAST:event_btnSalirPActionPerformed

    private void cbAdelantoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdelantoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdelantoActionPerformed

    private void bttnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCalcularActionPerformed
        if (!productoBuscado) {
            JOptionPane.showMessageDialog(null, "Busque un producto primero porfavor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tfCantidadVendida.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene el campo de cantidad por favor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tfDctoProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene el campo de descuento de producto por favor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tfDctoVenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene el campo de descuento de venta por favor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!DNIBuscado) {
            JOptionPane.showMessageDialog(null, "Busque un cliente por favor", "mensaje", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String idDctoProducto;
        String idDctoVenta;
        //Hallando monto bruto
        Double Precio = Double.valueOf(tbProductoEncontrado.getValueAt(0, 1).toString());
        cantidad = Integer.parseInt(tfCantidadVendida.getText());
        MontoBruto = Precio * cantidad;
        

        
        cConnection con = new cConnection();
        
        try {
            //aplicando descuento de producto
            idDctoProducto = tfDctoProducto.getText();
            String queryDP = "SELECT * FROM DctoProd WHERE IdDctoProd = " + idDctoProducto + "";
            Statement stDP = con.ObtenerConexion().createStatement();
            ResultSet rsDP = stDP.executeQuery(queryDP);

            while (rsDP.next()) {
                MontoDcto += Double.parseDouble(rsDP.getString("ValorDctoProd"));
            }

            stDP.close();
            rsDP.close();

            //aplicando descuento de venta
            idDctoVenta = tfDctoVenta.getText();
            String queryDV = "SELECT * FROM DctoVenta WHERE IdDctoVenta = " + idDctoVenta + "";
            Statement stDV = con.ObtenerConexion().createStatement();
            ResultSet rsDV = stDV.executeQuery(queryDV);

            while (rsDV.next()) {
                MontoDcto += Double.parseDouble(rsDV.getString("ValorDctoVenta"));
            }
            stDV.close();
            rsDV.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.toString(), "mensaje", JOptionPane.ERROR_MESSAGE);
        } finally {
            con.closeConecction();
        }
        
        if("SI".equals(cbAdelanto.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "El monto calculado es un adelanto, por tanto, falta cancelar el 50% de la venta", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        MontoTotal = MontoBruto - MontoDcto;
        DNICli = tfDNI.getText();
        txtIdBoleta.setText("ID_BOLETA: " + Datos.ID_NUM_DOC_VENTA);
        txtUsuario.setText("USUARIO: " + Datos.USUARIO);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        txtFecha.setText("FECHA: " + LocalDate.now().format(formato));
        
        txtMontoBruto.setText("MontoBruto: "+ MontoBruto);
        txtMontoDcto.setText("MontoDcto: " + MontoDcto);
        txtMontoTotal.setText("MontoTotal: " + MontoTotal);
        txtDNICliente.setText("DNICliente: " + DNICli);
        
        CalcularPresionado = true;
    }//GEN-LAST:event_bttnCalcularActionPerformed
    
    public static void btnGenerarReeActionPerformed(java.awt.event.ActionEvent evt){
        
    };
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscarUsuario;
    private javax.swing.JScrollPane JScrollPane3;
    private javax.swing.JMenu PeGestion;
    private javax.swing.JMenu PeGestionClientes;
    private javax.swing.JMenu PeProductos;
    private javax.swing.JMenuItem PeRegistrarVenta;
    private javax.swing.JMenuItem PeReportarClientes;
    private javax.swing.JMenuItem PeReportarVentas;
    private javax.swing.JMenu PeReportes;
    private javax.swing.JMenuItem PeSalir;
    private javax.swing.JMenu PeTransacción;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProdu;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEfectuar;
    private java.awt.Button btnGenerarR;
    private java.awt.Button btnGenerarRee;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevooo;
    private javax.swing.JButton btnQuitarPedido;
    private javax.swing.JButton btnRegistrarDctoProducto;
    private javax.swing.JButton btnRegistrarDctoVenta;
    private javax.swing.JButton btnRegistrarNuevoProducto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirBuscarU;
    private javax.swing.JButton btnSalirDctoProd;
    private javax.swing.JButton btnSalirP;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JButton bttnBuscarDNI;
    private javax.swing.JButton bttnCalcular;
    private javax.swing.JButton bttnCancelar;
    private javax.swing.JButton bttnRegistrar;
    private javax.swing.JComboBox<String> cbAdelanto;
    public javax.swing.JComboBox cmbDcto;
    private com.toedter.calendar.JDateChooser dateChFechaDctoProducto;
    private com.toedter.calendar.JDateChooser dateChFechaDctoVenta;
    private com.toedter.calendar.JDateChooser dateChFechaVenta;
    private com.toedter.calendar.JDateChooser fchaFin;
    private com.toedter.calendar.JDateChooser fchaInicio;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JFrame frmActualizar;
    private javax.swing.JFrame frmBuscarUsuario;
    private javax.swing.JFrame frmGestionCli;
    private javax.swing.JFrame frmNuevoDctoProducto;
    private javax.swing.JFrame frmNuevoDctoVenta;
    private javax.swing.JFrame frmNuevoProducto;
    private javax.swing.JFrame frmRegistrarVenta;
    private javax.swing.JFrame frmReportarClientess;
    private javax.swing.JFrame frmReportarVentas;
    private javax.swing.JFrame frmVenta;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblCodProdu;
    private javax.swing.JLabel lblCodUser;
    private javax.swing.JLabel lblCodigoDctoProdu;
    private javax.swing.JLabel lblCodigoDctoVenta;
    private javax.swing.JLabel lblCodigoP;
    private javax.swing.JLabel lblDescto;
    private javax.swing.JLabel lblDniClie;
    private javax.swing.JLabel lblFechaCP;
    private javax.swing.JLabel lblFechaCreacionDcto;
    private javax.swing.JLabel lblFechaCreacionDctoVenta;
    private javax.swing.JLabel lblNomProd;
    private javax.swing.JLabel lblNombreP;
    private javax.swing.JLabel lblNombreUserBuscar;
    private javax.swing.JLabel lblNumCP;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUltimoCP;
    private javax.swing.JLabel lblUltimoDcto;
    private javax.swing.JLabel lblUltimoDctoVenta;
    private javax.swing.JLabel lblUltimoP;
    private javax.swing.JLabel lblValorDcto;
    private javax.swing.JLabel lblValorDctoVenta;
    private javax.swing.JMenuItem omActualizarStock;
    private javax.swing.JMenuItem omModificarClientes;
    private javax.swing.JMenuItem omNewProducto;
    private javax.swing.JMenuItem opNuevoDctoProd;
    private javax.swing.JMenuItem opNuevoDctoVent;
    private javax.swing.JMenu peFile;
    private javax.swing.JTable tableDctoProducto;
    private javax.swing.JTable tableDctoVenta;
    private javax.swing.JTable tbClienteEncontrado;
    private javax.swing.JTable tbProductoEncontrado;
    private javax.swing.JTable tbReportDcto;
    public javax.swing.JTable tbResulProducto;
    public javax.swing.JTable tblClienteEncontrado;
    private javax.swing.JTable tblProductoEncontrado;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblReporte;
    private javax.swing.JTable tblReportes;
    private javax.swing.JTable tblResultadoUsuario;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField tfCantidadVendida;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDctoProducto;
    private javax.swing.JTextField tfDctoVenta;
    private javax.swing.JTextField tfIdProducto;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodDctoProd;
    private javax.swing.JTextField txtCodDctoVenta;
    public javax.swing.JTextField txtCodProdu;
    private javax.swing.JTextField txtCodigoP;
    public javax.swing.JTextField txtCodigoUser;
    private javax.swing.JTextField txtCorreo1;
    public javax.swing.JTextField txtDNI1;
    private javax.swing.JLabel txtDNICliente;
    private javax.swing.JTextField txtDni;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtIdBoleta;
    private javax.swing.JLabel txtMontoBruto;
    private javax.swing.JLabel txtMontoDcto;
    private javax.swing.JLabel txtMontoTotal;
    private javax.swing.JTextField txtNomPro;
    private javax.swing.JTextField txtNombProducto;
    private javax.swing.JTextField txtNombUserBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreP;
    public javax.swing.JTextField txtNumCP;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtTotal;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JTextField txtValorDcto;
    private javax.swing.JTextField txtValorDctoVenta;
    // End of variables declaration//GEN-END:variables
}
