/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacientes;

import alertas.ErrorAlert;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import necesario.FadeEffect;
import necesario.RSAWTUtilities;
import necesario.RSScrollBar;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author RojeruSan
 */
public class Registrar extends javax.swing.JDialog {

    private boolean minimiza = false;

    /**
     * Creates new form Registrar
     */
    public Registrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        RSAWTUtilities.setOpaque(this, false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);
        this.setLocationRelativeTo(parent);
        FadeEffect.fadeIn(this, 1, 0.1f);

        this.scroll1.getVerticalScrollBar().setUI(new RSScrollBar());
        this.scroll2.getVerticalScrollBar().setUI(new RSScrollBar());

        this.btnAtras.setEnabled(false);

        ocultarAciertos();

        //Extrae el un ID para asignar al nuevo registro
        pacientes.ficha_identificacion.Opciones.extraerID();
        this.lblID.setVisible(false);
    }

    private void ocultarAciertos() {
        pacientes.Variables.PASO = 1;
        
        this.lblNivel1.setVisible(false);
        this.lblNivel2.setVisible(false);
        this.lblNivel3.setVisible(false);
        this.lblNivel4.setVisible(false);
        this.lblNivel5.setVisible(false);
        this.lblNivel6.setVisible(false);
        this.lblNivel7.setVisible(false);

        this.nievel1.setColorBorde(new Color(0, 204, 0));

        this.line1.setBackground(new Color(0, 112, 192));
        this.nievel2.setColorBorde(new Color(0, 112, 192));

        this.line2.setBackground(new Color(0, 112, 192));
        this.nievel3.setColorBorde(new Color(0, 112, 192));

        this.line3.setBackground(new Color(0, 112, 192));
        this.nievel4.setColorBorde(new Color(0, 112, 192));

        this.line4.setBackground(new Color(0, 112, 192));
        this.nievel5.setColorBorde(new Color(0, 112, 192));

        this.line5.setBackground(new Color(0, 112, 192));
        this.nievel6.setColorBorde(new Color(0, 112, 192));

        this.line6.setBackground(new Color(0, 112, 192));
        this.nievel7.setColorBorde(new Color(0, 112, 192));

        //Limpia campos del nivel UNO
        this.txtNumControl.setText("");
        this.comboCarrera.setSelectedIndex(0);
        this.txtNombre.setText("");
        this.comboGenero.setSelectedIndex(0);
        this.txtEdad.setText("");
        this.txtFechaNac.setLimpiarFecha(true);
        this.txtLugarNac.setText("");
        this.txtOrigen.setText("");
        this.txtDomicilio.setText("");
        this.comboCivil.setSelectedIndex(0);
        this.txtReligion.setText("");

        //Limpia campos del nivel DOS
        this.txtHerFam.setText("");

        //Limpia campos del nivel TRES
        this.txtAlimentacion.setText("");
        this.txtHabitacion.setText("");
        this.txtHabitos.setText("");

        //Limpia campos del nivel CUATRO
        this.txtMenarca.setText("");
        this.txtIVSA.setText("");
        this.txtNumParejas.setText("");
        this.txtEmbarazos.setText("");
        this.txtMetodos.setText("");

        //Limpia campos del nivel CINCO
        this.txtEnfermedades.setText("");
        this.txtCronico.setText("");
        this.txtAlergicos.setText("");
        this.txtQuirurgicos.setText("");
        this.txtTraumatologicos.setText("");
        this.txtTansfusiones.setText("");
        this.txtConvulsiones.setText("");
        this.txtAdicciones.setText("");
        this.txtHospitalizaciones.setText("");

        //Limpia campos del nivel SEIS
        this.txtPulso.setText("");
        this.txtPresion.setText("");
        this.txtTemperatura.setText("");
        this.txtFarecuencia.setText("");
        this.txtPeso.setText("");
        this.txtTalla.setText("");
        this.txtMasa.setText("");
        this.txtTipoSangre.setText("");

        //Limpia campos del nivel SIETE
        this.txtInspeccionGen.setText("");
        
        focusNivel1();
    }
    
    private void focusNivel1(){
        this.txtNumControl.requestFocus();
        this.txtNumControl.setNextFocusableComponent(comboCarrera);
        this.comboCarrera.setNextFocusableComponent(txtNombre);
        this.txtNombre.setNextFocusableComponent(comboGenero);
        this.comboGenero.setNextFocusableComponent(txtEdad);
        this.txtEdad.setNextFocusableComponent(txtFechaNac);
        this.txtFechaNac.setNextFocusableComponent(txtLugarNac);
        this.txtLugarNac.setNextFocusableComponent(txtOrigen);
        this.txtOrigen.setNextFocusableComponent(txtDomicilio);
        this.txtDomicilio.setNextFocusableComponent(comboCivil);
        this.comboCivil.setNextFocusableComponent(txtReligion);
    }
    
    private void focusNivel2(){
        this.txtHerFam.requestFocus();
    }
    
    private void focusNivel3(){
        this.txtAlimentacion.requestFocus();
        this.txtAlimentacion.setNextFocusableComponent(txtHabitacion);
        this.txtHabitacion.setNextFocusableComponent(txtHabitos);
    }
    
    private void focusNivel4(){
        this.txtMenarca.requestFocus();
        this.txtMenarca.setNextFocusableComponent(txtIVSA);
        this.txtIVSA.setNextFocusableComponent(txtNumParejas);
        this.txtNumParejas.setNextFocusableComponent(txtEmbarazos);
        this.txtEmbarazos.setNextFocusableComponent(txtMetodos);
    }
    
    private void focusNivel5(){
        this.txtEnfermedades.requestFocus();
        this.txtEnfermedades.setNextFocusableComponent(txtCronico);
        this.txtCronico.setNextFocusableComponent(txtAlergicos);
        this.txtAlergicos.setNextFocusableComponent(txtQuirurgicos);
        this.txtQuirurgicos.setNextFocusableComponent(txtTraumatologicos);
        this.txtTraumatologicos.setNextFocusableComponent(txtTansfusiones);
        this.txtTansfusiones.setNextFocusableComponent(txtConvulsiones);
        this.txtConvulsiones.setNextFocusableComponent(txtAdicciones);
        this.txtAdicciones.setNextFocusableComponent(txtHospitalizaciones);
    }
    private void focusNivel6(){
        this.txtPulso.requestFocus();
        this.txtPulso.setNextFocusableComponent(txtPresion);
        this.txtPresion.setNextFocusableComponent(txtTemperatura);
        this.txtTemperatura.setNextFocusableComponent(txtFarecuencia);
        this.txtFarecuencia.setNextFocusableComponent(txtPeso);
        this.txtPeso.setNextFocusableComponent(txtTalla);
        this.txtTalla.setNextFocusableComponent(txtMasa);
        this.txtMasa.setNextFocusableComponent(txtTipoSangre);
    }
    
    private void focusNivel7(){
        this.txtInspeccionGen.requestFocus();
    }

    private void pasarNiveles(int paso) {
        if (paso == 2) {
            this.lblNivel1.setVisible(true);

            this.line1.setBackground(new Color(0, 204, 0));
            this.nievel2.setColorBorde(new Color(0, 204, 0));
        }
        if (paso == 3) {
            this.lblNivel2.setVisible(true);

            this.line2.setBackground(new Color(0, 204, 0));
            this.nievel3.setColorBorde(new Color(0, 204, 0));
        }
        if (paso == 4) {
            this.lblNivel3.setVisible(true);

            this.line3.setBackground(new Color(0, 204, 0));
            this.nievel4.setColorBorde(new Color(0, 204, 0));
        }
        if (paso == 5) {
            this.lblNivel4.setVisible(true);

            this.line4.setBackground(new Color(0, 204, 0));
            this.nievel5.setColorBorde(new Color(0, 204, 0));
        }
        if (paso == 6) {
            this.lblNivel5.setVisible(true);

            this.line5.setBackground(new Color(0, 204, 0));
            this.nievel6.setColorBorde(new Color(0, 204, 0));
        }
        if (paso == 7) {
            this.lblNivel6.setVisible(true);

            this.line6.setBackground(new Color(0, 204, 0));
            this.nievel7.setColorBorde(new Color(0, 204, 0));
        }
        if (paso == 8) {
            this.lblNivel7.setVisible(true);
        }
    }

    private void regresarNiveles(int paso) {
        if (paso == 1) {
            this.lblNivel1.setVisible(false);
            this.line1.setBackground(new Color(0, 112, 192));
            this.nievel2.setColorBorde(new Color(0, 112, 192));
        }
        if (paso == 2) {
            this.lblNivel2.setVisible(false);
            this.line2.setBackground(new Color(0, 112, 192));
            this.nievel3.setColorBorde(new Color(0, 112, 192));
        }
        if (paso == 3) {
            this.lblNivel3.setVisible(false);

            this.line3.setBackground(new Color(0, 112, 192));
            this.nievel4.setColorBorde(new Color(0, 112, 192));
        }
        if (paso == 4) {
            this.lblNivel4.setVisible(false);
            this.line4.setBackground(new Color(0, 112, 192));
            this.nievel5.setColorBorde(new Color(0, 112, 192));
        }
        if (paso == 5) {
            this.lblNivel5.setVisible(false);
            this.line5.setBackground(new Color(0, 112, 192));
            this.nievel6.setColorBorde(new Color(0, 112, 192));
        }
        if (paso == 6) {
            this.lblNivel6.setVisible(false);
            this.line6.setBackground(new Color(0, 112, 192));
            this.nievel7.setColorBorde(new Color(0, 112, 192));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelImage1 = new rojerusan.RSPanelImage();
        jPanel1 = new javax.swing.JPanel();
        line1 = new javax.swing.JPanel();
        lblNivel3 = new javax.swing.JLabel();
        lblNivel1 = new javax.swing.JLabel();
        lblNivel4 = new javax.swing.JLabel();
        lblNivel5 = new javax.swing.JLabel();
        lblNivel6 = new javax.swing.JLabel();
        lblNivel7 = new javax.swing.JLabel();
        lblNivel2 = new javax.swing.JLabel();
        nievel1 = new rojerusan.RSLabelCircleImage();
        nievel2 = new rojerusan.RSLabelCircleImage();
        nievel6 = new rojerusan.RSLabelCircleImage();
        nievel4 = new rojerusan.RSLabelCircleImage();
        nievel3 = new rojerusan.RSLabelCircleImage();
        nievel5 = new rojerusan.RSLabelCircleImage();
        nievel7 = new rojerusan.RSLabelCircleImage();
        line2 = new javax.swing.JPanel();
        line3 = new javax.swing.JPanel();
        line4 = new javax.swing.JPanel();
        line5 = new javax.swing.JPanel();
        line6 = new javax.swing.JPanel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        pnlUno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboCivil = new rojerusan.RSComboMetro();
        txtNumControl = new rojerusan.RSMetroTextFullPlaceHolder();
        txtNombre = new rojerusan.RSMetroTextFullPlaceHolder();
        txtLugarNac = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEdad = new rojerusan.RSMetroTextFullPlaceHolder();
        txtOrigen = new rojerusan.RSMetroTextFullPlaceHolder();
        comboGenero = new rojerusan.RSComboMetro();
        txtDomicilio = new rojerusan.RSMetroTextFullPlaceHolder();
        txtReligion = new rojerusan.RSMetroTextFullPlaceHolder();
        txtFechaNac = new rojerusan.RSDateChooser();
        lblID = new javax.swing.JLabel();
        comboCarrera = new rojerusan.RSComboMetro();
        pnlDos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        txtHerFam = new javax.swing.JTextArea();
        pnlTres = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAlimentacion = new rojerusan.RSMetroTextFullPlaceHolder();
        txtHabitacion = new rojerusan.RSMetroTextFullPlaceHolder();
        txtHabitos = new rojerusan.RSMetroTextFullPlaceHolder();
        pnlCuatro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtMenarca = new rojerusan.RSMetroTextFullPlaceHolder();
        txtIVSA = new rojerusan.RSMetroTextFullPlaceHolder();
        txtMetodos = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEmbarazos = new rojerusan.RSMetroTextFullPlaceHolder();
        txtNumParejas = new rojerusan.RSMetroTextFullPlaceHolder();
        pnlCinco = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEnfermedades = new rojerusan.RSMetroTextFullPlaceHolder();
        txtQuirurgicos = new rojerusan.RSMetroTextFullPlaceHolder();
        txtTraumatologicos = new rojerusan.RSMetroTextFullPlaceHolder();
        txtCronico = new rojerusan.RSMetroTextFullPlaceHolder();
        txtAlergicos = new rojerusan.RSMetroTextFullPlaceHolder();
        txtConvulsiones = new rojerusan.RSMetroTextFullPlaceHolder();
        txtTansfusiones = new rojerusan.RSMetroTextFullPlaceHolder();
        txtHospitalizaciones = new rojerusan.RSMetroTextFullPlaceHolder();
        txtAdicciones = new rojerusan.RSMetroTextFullPlaceHolder();
        pnlSeis = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPulso = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPeso = new rojerusan.RSMetroTextFullPlaceHolder();
        txtTalla = new rojerusan.RSMetroTextFullPlaceHolder();
        txtMasa = new rojerusan.RSMetroTextFullPlaceHolder();
        txtTipoSangre = new rojerusan.RSMetroTextFullPlaceHolder();
        txtFarecuencia = new rojerusan.RSMetroTextFullPlaceHolder();
        txtTemperatura = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPresion = new rojerusan.RSMetroTextFullPlaceHolder();
        pnlSiete = new javax.swing.JPanel();
        scroll2 = new javax.swing.JScrollPane();
        txtInspeccionGen = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        pnlOcho = new javax.swing.JPanel();
        lblFinal = new javax.swing.JLabel();
        iconoFinal = new javax.swing.JLabel();
        btnNuevo = new rojerusan.RSButtonHover();
        btnCerrar = new rojerusan.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        btnAtras = new rojerusan.RSButtonHover();
        btnSig = new rojerusan.RSButtonHover();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/fondotransparente.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 112, 192), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        line1.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout line1Layout = new javax.swing.GroupLayout(line1);
        line1.setLayout(line1Layout);
        line1Layout.setHorizontalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line1Layout.setVerticalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 74, 46, -1));

        lblNivel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/pasos.png"))); // NOI18N
        jPanel1.add(lblNivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 60, 40, 40));

        lblNivel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/pasos.png"))); // NOI18N
        jPanel1.add(lblNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 40, 40));

        lblNivel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/pasos.png"))); // NOI18N
        jPanel1.add(lblNivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 60, 40, 40));

        lblNivel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/pasos.png"))); // NOI18N
        jPanel1.add(lblNivel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 60, 40, 40));

        lblNivel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/pasos.png"))); // NOI18N
        jPanel1.add(lblNivel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 60, 40, 40));

        lblNivel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/pasos.png"))); // NOI18N
        jPanel1.add(lblNivel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 60, 40, 40));

        lblNivel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/pasos.png"))); // NOI18N
        jPanel1.add(lblNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 60, 40, 40));

        nievel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/fondoNiveles.png"))); // NOI18N
        nievel1.setColorBorde(new java.awt.Color(0, 204, 0));
        jPanel1.add(nievel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 45, 70, 70));

        nievel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/fondoNiveles.png"))); // NOI18N
        jPanel1.add(nievel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 45, 70, 70));

        nievel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/fondoNiveles.png"))); // NOI18N
        jPanel1.add(nievel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 45, 70, 70));

        nievel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/fondoNiveles.png"))); // NOI18N
        jPanel1.add(nievel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 45, 70, 70));

        nievel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/fondoNiveles.png"))); // NOI18N
        jPanel1.add(nievel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 45, 70, 70));

        nievel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/fondoNiveles.png"))); // NOI18N
        jPanel1.add(nievel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 45, 70, 70));

        nievel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/fondoNiveles.png"))); // NOI18N
        jPanel1.add(nievel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 45, 70, 70));

        line2.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout line2Layout = new javax.swing.GroupLayout(line2);
        line2.setLayout(line2Layout);
        line2Layout.setHorizontalGroup(
            line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line2Layout.setVerticalGroup(
            line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 75, 46, -1));

        line3.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout line3Layout = new javax.swing.GroupLayout(line3);
        line3.setLayout(line3Layout);
        line3Layout.setHorizontalGroup(
            line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line3Layout.setVerticalGroup(
            line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 75, 46, -1));

        line4.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout line4Layout = new javax.swing.GroupLayout(line4);
        line4.setLayout(line4Layout);
        line4Layout.setHorizontalGroup(
            line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line4Layout.setVerticalGroup(
            line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(line4, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 74, 46, -1));

        line5.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout line5Layout = new javax.swing.GroupLayout(line5);
        line5.setLayout(line5Layout);
        line5Layout.setHorizontalGroup(
            line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line5Layout.setVerticalGroup(
            line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(line5, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 74, 46, -1));

        line6.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout line6Layout = new javax.swing.GroupLayout(line6);
        line6.setLayout(line6Layout);
        line6Layout.setHorizontalGroup(
            line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line6Layout.setVerticalGroup(
            line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(line6, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 73, 48, -1));

        pnlUno.setBackground(new java.awt.Color(255, 255, 255));
        pnlUno.setName("pnlUno"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 112, 192));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FICHA DE IDENTIFICACIÓN");

        comboCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR ESTADO CIVIL", "SOLTERO(A)", "CASADO(A)", "COMPROMETIDO(A)", "DIVORCIADO(A)", "VIUDO(A)" }));
        comboCivil.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        txtNumControl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtNumControl.setPlaceholder("No. CONTROL");
        txtNumControl.setSoloNumeros(true);

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtNombre.setMayusculas(true);
        txtNombre.setPlaceholder("NOMBRE COMPLETO");
        txtNombre.setSoloLetras(true);

        txtLugarNac.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtLugarNac.setMayusculas(true);
        txtLugarNac.setPlaceholder("LUGAR DE NACIMIENTO");
        txtLugarNac.setSoloLetras(true);

        txtEdad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtEdad.setPlaceholder("EDAD");
        txtEdad.setSoloNumeros(true);

        txtOrigen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtOrigen.setMayusculas(true);
        txtOrigen.setPlaceholder("LUGAR DE ORIGEN");
        txtOrigen.setSoloLetras(true);

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR GÉNERO", "MASCULINO", "FEMENINO" }));
        comboGenero.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        txtDomicilio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtDomicilio.setMayusculas(true);
        txtDomicilio.setPlaceholder("DOMICILIO");

        txtReligion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtReligion.setMayusculas(true);
        txtReligion.setPlaceholder("RELIGIÓN");
        txtReligion.setSoloLetras(true);

        txtFechaNac.setFormatoFecha("yyyy-MM-dd");
        txtFechaNac.setFuente(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtFechaNac.setPlaceholder("FECHA DE NACIMIENTO");

        lblID.setText("lblID");

        comboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR CARRERA", "ING. DESARROLLO COMUNITARIO (IDC)", "ING. GESTIÓN EMPRESARIAL (IGEM)", "ING. SISTEMAS COMPUTACIONALES (ISC)" }));
        comboCarrera.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N

        javax.swing.GroupLayout pnlUnoLayout = new javax.swing.GroupLayout(pnlUno);
        pnlUno.setLayout(pnlUnoLayout);
        pnlUnoLayout.setHorizontalGroup(
            pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlUnoLayout.createSequentialGroup()
                .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUnoLayout.createSequentialGroup()
                        .addComponent(lblID)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlUnoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlUnoLayout.createSequentialGroup()
                                .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(txtFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLugarNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pnlUnoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboCarrera, comboCivil, comboGenero, txtDomicilio, txtNombre, txtNumControl, txtOrigen, txtReligion});

        pnlUnoLayout.setVerticalGroup(
            pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUnoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUnoLayout.createSequentialGroup()
                        .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLugarNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUnoLayout.createSequentialGroup()
                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(180, 180, 180))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUnoLayout.createSequentialGroup()
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(comboCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlUnoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboCarrera, comboCivil, comboGenero, txtDomicilio, txtEdad, txtFechaNac, txtLugarNac, txtNombre, txtNumControl, txtOrigen, txtReligion});

        rSPanelsSlider1.add(pnlUno, "card2");

        pnlDos.setBackground(new java.awt.Color(255, 255, 255));
        pnlDos.setName("pnlDos"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 112, 192));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ANTECEDENTES HEREDO-FAMILIARES");

        scroll1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 112, 192), 3));

        txtHerFam.setColumns(20);
        txtHerFam.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtHerFam.setForeground(new java.awt.Color(0, 112, 192));
        txtHerFam.setLineWrap(true);
        txtHerFam.setRows(5);
        txtHerFam.setMargin(new java.awt.Insets(10, 10, 10, 10));
        txtHerFam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHerFamKeyTyped(evt);
            }
        });
        scroll1.setViewportView(txtHerFam);

        javax.swing.GroupLayout pnlDosLayout = new javax.swing.GroupLayout(pnlDos);
        pnlDos.setLayout(pnlDosLayout);
        pnlDosLayout.setHorizontalGroup(
            pnlDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlDosLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        pnlDosLayout.setVerticalGroup(
            pnlDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDosLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(pnlDos, "card3");

        pnlTres.setBackground(new java.awt.Color(255, 255, 255));
        pnlTres.setName("pnlTres"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 112, 192));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ANTECEDENTES PERSONALES NO PATOLÓGICOS");

        txtAlimentacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtAlimentacion.setMayusculas(true);
        txtAlimentacion.setPlaceholder("ALIMENTACIÓN");

        txtHabitacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtHabitacion.setMayusculas(true);
        txtHabitacion.setPlaceholder("HABITACIÓN");

        txtHabitos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtHabitos.setMayusculas(true);
        txtHabitos.setPlaceholder("HÁBITOS HIGIÉNICOS");

        javax.swing.GroupLayout pnlTresLayout = new javax.swing.GroupLayout(pnlTres);
        pnlTres.setLayout(pnlTresLayout);
        pnlTresLayout.setHorizontalGroup(
            pnlTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlTresLayout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(txtAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(txtHabitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTresLayout.setVerticalGroup(
            pnlTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTresLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(pnlTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHabitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(pnlTres, "card4");

        pnlCuatro.setBackground(new java.awt.Color(255, 255, 255));
        pnlCuatro.setName("pnlCuatro"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 112, 192));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ANTECEDENTES GINÉCO-OBSTÉTRICOS");

        txtMenarca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtMenarca.setMayusculas(true);
        txtMenarca.setPlaceholder("MENARCA");

        txtIVSA.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtIVSA.setMayusculas(true);
        txtIVSA.setPlaceholder("IVSA");

        txtMetodos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtMetodos.setMayusculas(true);
        txtMetodos.setPlaceholder("MÉTODO ANTICONCEPTIVO");

        txtEmbarazos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtEmbarazos.setMayusculas(true);
        txtEmbarazos.setPlaceholder("EMBARAZOS G_P_C_A");
        txtEmbarazos.setSoloNumeros(true);

        txtNumParejas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtNumParejas.setMayusculas(true);
        txtNumParejas.setPlaceholder("No. PAREJAS");
        txtNumParejas.setSoloNumeros(true);

        javax.swing.GroupLayout pnlCuatroLayout = new javax.swing.GroupLayout(pnlCuatro);
        pnlCuatro.setLayout(pnlCuatroLayout);
        pnlCuatroLayout.setHorizontalGroup(
            pnlCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
            .addGroup(pnlCuatroLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(pnlCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumParejas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIVSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(pnlCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmbarazos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCuatroLayout.setVerticalGroup(
            pnlCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuatroLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(pnlCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCuatroLayout.createSequentialGroup()
                        .addComponent(txtMenarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIVSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCuatroLayout.createSequentialGroup()
                        .addComponent(txtEmbarazos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtNumParejas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 130, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(pnlCuatro, "card5");

        pnlCinco.setBackground(new java.awt.Color(255, 255, 255));
        pnlCinco.setName("pnlCinco"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 112, 192));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ANTECEDENTES PERSONALES PATOLÓGICOS");

        txtEnfermedades.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtEnfermedades.setMayusculas(true);
        txtEnfermedades.setPlaceholder("ENFERMEDADES INFECTOCONTA...");

        txtQuirurgicos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtQuirurgicos.setMayusculas(true);
        txtQuirurgicos.setPlaceholder("QUIRÚRGICOS");

        txtTraumatologicos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtTraumatologicos.setMayusculas(true);
        txtTraumatologicos.setPlaceholder("TRAUMATOLÓGICOS");

        txtCronico.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtCronico.setMayusculas(true);
        txtCronico.setPlaceholder("CRONICO DEGENERATIVAS");

        txtAlergicos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtAlergicos.setMayusculas(true);
        txtAlergicos.setPlaceholder("ALÉRGICOS");

        txtConvulsiones.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtConvulsiones.setMayusculas(true);
        txtConvulsiones.setPlaceholder("CONVULSIONES");

        txtTansfusiones.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtTansfusiones.setMayusculas(true);
        txtTansfusiones.setPlaceholder("TRANSFUCIONES");

        txtHospitalizaciones.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtHospitalizaciones.setMayusculas(true);
        txtHospitalizaciones.setPlaceholder("HOSPITALIZACIONES");

        txtAdicciones.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtAdicciones.setMayusculas(true);
        txtAdicciones.setPlaceholder("ADICCIONES");

        javax.swing.GroupLayout pnlCincoLayout = new javax.swing.GroupLayout(pnlCinco);
        pnlCinco.setLayout(pnlCincoLayout);
        pnlCincoLayout.setHorizontalGroup(
            pnlCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
            .addGroup(pnlCincoLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(pnlCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTraumatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlergicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuirurgicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(pnlCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConvulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTansfusiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospitalizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdicciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCincoLayout.setVerticalGroup(
            pnlCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCincoLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCincoLayout.createSequentialGroup()
                        .addComponent(txtEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCincoLayout.createSequentialGroup()
                        .addComponent(txtTansfusiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtConvulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCincoLayout.createSequentialGroup()
                        .addComponent(txtAlergicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuirurgicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCincoLayout.createSequentialGroup()
                        .addComponent(txtAdicciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHospitalizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtTraumatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(pnlCinco, "card6");

        pnlSeis.setBackground(new java.awt.Color(255, 255, 255));
        pnlSeis.setName("pnlSeis"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 112, 192));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SIGNOS VITALES Y SOMATOMETRIA");

        txtPulso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPulso.setMayusculas(true);
        txtPulso.setPlaceholder("PULSO");

        txtPeso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPeso.setMayusculas(true);
        txtPeso.setPlaceholder("PESO");

        txtTalla.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtTalla.setMayusculas(true);
        txtTalla.setPlaceholder("TALLA");

        txtMasa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtMasa.setMayusculas(true);
        txtMasa.setPlaceholder("INDICE DE MASA CORPORAL");

        txtTipoSangre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtTipoSangre.setMayusculas(true);
        txtTipoSangre.setPlaceholder("TIPO DE SANGRE");

        txtFarecuencia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtFarecuencia.setMayusculas(true);
        txtFarecuencia.setPlaceholder("FRECUENCIA RESPIRATORIA");

        txtTemperatura.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtTemperatura.setMayusculas(true);
        txtTemperatura.setPlaceholder("TEMPERATURA");

        txtPresion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPresion.setMayusculas(true);
        txtPresion.setPlaceholder("PRESIÓN");

        javax.swing.GroupLayout pnlSeisLayout = new javax.swing.GroupLayout(pnlSeis);
        pnlSeis.setLayout(pnlSeisLayout);
        pnlSeisLayout.setHorizontalGroup(
            pnlSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
            .addGroup(pnlSeisLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(pnlSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFarecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(pnlSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSeisLayout.setVerticalGroup(
            pnlSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeisLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSeisLayout.createSequentialGroup()
                        .addComponent(txtPulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSeisLayout.createSequentialGroup()
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSeisLayout.createSequentialGroup()
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFarecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSeisLayout.createSequentialGroup()
                        .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 69, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(pnlSeis, "card7");

        pnlSiete.setBackground(new java.awt.Color(255, 255, 255));
        pnlSiete.setName("pnlSiete"); // NOI18N

        scroll2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 112, 192), 3));

        txtInspeccionGen.setColumns(20);
        txtInspeccionGen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtInspeccionGen.setForeground(new java.awt.Color(0, 112, 192));
        txtInspeccionGen.setLineWrap(true);
        txtInspeccionGen.setRows(5);
        txtInspeccionGen.setMargin(new java.awt.Insets(10, 10, 10, 10));
        txtInspeccionGen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInspeccionGenKeyTyped(evt);
            }
        });
        scroll2.setViewportView(txtInspeccionGen);

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 112, 192));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INSPECCIÓN GENERAL (HABITUS EXTERIOR)");

        javax.swing.GroupLayout pnlSieteLayout = new javax.swing.GroupLayout(pnlSiete);
        pnlSiete.setLayout(pnlSieteLayout);
        pnlSieteLayout.setHorizontalGroup(
            pnlSieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlSieteLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        pnlSieteLayout.setVerticalGroup(
            pnlSieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSieteLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(pnlSiete, "card8");

        pnlOcho.setBackground(new java.awt.Color(255, 255, 255));
        pnlOcho.setName("pnlOcho"); // NOI18N

        lblFinal.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblFinal.setForeground(new java.awt.Color(0, 112, 192));
        lblFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinal.setText("¡REGISTRO EXITOSO!");

        iconoFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pacientes/success.png"))); // NOI18N

        btnNuevo.setText("Registrar un nuevo paciente");
        btnNuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOchoLayout = new javax.swing.GroupLayout(pnlOcho);
        pnlOcho.setLayout(pnlOchoLayout);
        pnlOchoLayout.setHorizontalGroup(
            pnlOchoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOchoLayout.createSequentialGroup()
                .addComponent(lblFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlOchoLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(pnlOchoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(iconoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 313, Short.MAX_VALUE))
        );
        pnlOchoLayout.setVerticalGroup(
            pnlOchoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOchoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(pnlOcho, "card9");

        jPanel1.add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 126, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 0, 51));
        btnCerrar.setText("X");
        btnCerrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnCerrar.setGrosorLinea(3);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 5, 40, 34));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnAtras.setText("Atras");
        btnAtras.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnSig.setText("Siguiente");
        btnSig.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 513, 832, 60));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 112, 192));
        jLabel8.setText("REGISTRAR NUEVO PACIENTE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, -1));

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (pacientes.Variables.PASO < 9 && pacientes.Variables.PASO > 0) {
            pacientes.Variables.PASO--;
            if (pacientes.Variables.PASO == 1) {
                rSPanelsSlider1.slidPanel(2, pnlUno, RSPanelsSlider.direct.Left);
                regresarNiveles(1);
                this.btnAtras.setEnabled(false);
                focusNivel1();
            }
            if (pacientes.Variables.PASO == 2) {
                rSPanelsSlider1.slidPanel(2, pnlDos, RSPanelsSlider.direct.Left);
                regresarNiveles(2);
                focusNivel2();
            }
            if (pacientes.Variables.PASO == 3) {
                rSPanelsSlider1.slidPanel(2, pnlTres, RSPanelsSlider.direct.Left);
                regresarNiveles(3);
                focusNivel3();
            }
            if (pacientes.Variables.PASO == 4) {
                rSPanelsSlider1.slidPanel(2, pnlCuatro, RSPanelsSlider.direct.Left);
                regresarNiveles(4);
                focusNivel4();
            }
            if (pacientes.Variables.PASO == 5) {
                rSPanelsSlider1.slidPanel(2, pnlCinco, RSPanelsSlider.direct.Left);
                regresarNiveles(5);
                focusNivel5();
            }
            if (pacientes.Variables.PASO == 6) {
                rSPanelsSlider1.slidPanel(2, pnlSeis, RSPanelsSlider.direct.Left);
                this.btnSig.setText("Siguiente");
                regresarNiveles(6);
                focusNivel6();
            }
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed
        if (pacientes.Variables.PASO < 9 && pacientes.Variables.PASO > 0) {
            if (verificoNivel(pacientes.Variables.PASO)) {
                pacientes.Variables.PASO++;
                if (pacientes.Variables.PASO == 2) {
                    rSPanelsSlider1.slidPanel(2, pnlDos, RSPanelsSlider.direct.Right);
                    this.btnAtras.setEnabled(true);
                    pasarNiveles(2);
                    focusNivel2();
                }
                if (pacientes.Variables.PASO == 3) {
                    rSPanelsSlider1.slidPanel(2, pnlTres, RSPanelsSlider.direct.Right);
                    pasarNiveles(3);
                    focusNivel3();
                }
                if (pacientes.Variables.PASO == 4) {
                    rSPanelsSlider1.slidPanel(2, pnlCuatro, RSPanelsSlider.direct.Right);
                    pasarNiveles(4);
                    focusNivel4();
                }
                if (pacientes.Variables.PASO == 5) {
                    rSPanelsSlider1.slidPanel(2, pnlCinco, RSPanelsSlider.direct.Right);
                    pasarNiveles(5);
                    focusNivel5();
                }
                if (pacientes.Variables.PASO == 6) {
                    rSPanelsSlider1.slidPanel(2, pnlSeis, RSPanelsSlider.direct.Right);
                    pasarNiveles(6);
                    focusNivel6();
                }
                if (pacientes.Variables.PASO == 7) {
                    rSPanelsSlider1.slidPanel(2, pnlSiete, RSPanelsSlider.direct.Right);
                    this.btnSig.setText("Registrar");
                    pasarNiveles(7);
                    focusNivel7();
                }
                if (pacientes.Variables.PASO == 8) {
                    registrarTodo();
                    this.btnNuevo.requestFocus();
                }
            } else {
                ErrorAlert a = new ErrorAlert(null, true);
                a.msj1.setText("Todos los campos son requeridos.");
                a.msj2.setVisible(false);
                a.msj3.setVisible(false);
                a.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnSigActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        rSPanelsSlider1.slidPanel(2, pnlUno, RSPanelsSlider.direct.Right);
        this.btnAtras.setEnabled(false);
        this.btnSig.setVisible(true);
        this.btnAtras.setVisible(true);

        ocultarAciertos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtHerFamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHerFamKeyTyped
        char car = evt.getKeyChar();
        String cad = ("" + car).toUpperCase();
        car = cad.charAt(0);
        evt.setKeyChar(car);
    }//GEN-LAST:event_txtHerFamKeyTyped

    private void txtInspeccionGenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInspeccionGenKeyTyped
        char car = evt.getKeyChar();
        String cad = ("" + car).toUpperCase();
        car = cad.charAt(0);
        evt.setKeyChar(car);
    }//GEN-LAST:event_txtInspeccionGenKeyTyped

    private boolean verificoNivel(int nivel) {
        if (nivel == 1) {
            if (txtNumControl.getText().length() == 0 || txtNombre.getText().length() == 0
                    || comboGenero.getSelectedIndex() == 0 || txtEdad.getText().length() == 0
                    || txtFechaNac.getFechaSeleccionada().length() == 0 || txtLugarNac.getText().length() == 0
                    || txtOrigen.getText().length() == 0 || txtDomicilio.getText().length() == 0
                    || comboCivil.getSelectedIndex() == 0 || txtReligion.getText().length() == 0
                    || comboCarrera.getSelectedIndex() == 0) {

                return false;
            } else {
                return true;
            }
        }

        if (nivel == 2) {
            if (txtHerFam.getText().length() == 0) {
                return false;
            } else {
                return true;
            }
        }

        if (nivel == 3) {
            if (txtAlimentacion.getText().length() == 0 || txtHabitacion.getText().length() == 0
                    || txtHabitos.getText().length() == 0) {

                return false;
            } else {
                return true;
            }
        }

        if (nivel == 4) {
            if (txtMenarca.getText().length() == 0 || txtIVSA.getText().length() == 0
                    || txtNumParejas.getText().length() == 0 || txtEmbarazos.getText().length() == 0
                    || txtMetodos.getText().length() == 0) {

                return false;
            } else {
                return true;
            }
        }

        if (nivel == 5) {
            if (txtEnfermedades.getText().length() == 0 || txtCronico.getText().length() == 0
                    || txtAlergicos.getText().length() == 0 || txtQuirurgicos.getText().length() == 0
                    || txtTraumatologicos.getText().length() == 0 || txtTansfusiones.getText().length() == 0
                    || txtConvulsiones.getText().length() == 0 || txtAdicciones.getText().length() == 0
                    || txtHospitalizaciones.getText().length() == 0) {

                return false;
            } else {
                return true;
            }
        }

        if (nivel == 6) {
            if (txtPulso.getText().length() == 0 || txtPresion.getText().length() == 0
                    || txtTemperatura.getText().length() == 0 || txtFarecuencia.getText().length() == 0
                    || txtPeso.getText().length() == 0 || txtTalla.getText().length() == 0
                    || txtMasa.getText().length() == 0 || txtTipoSangre.getText().length() == 0) {

                return false;
            } else {
                return true;
            }
        }

        if (nivel == 7) {
            if (txtInspeccionGen.getText().length() == 0) {
                return false;
            } else {
                return true;
            }
        }

        return false;
    }

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registrar dialog = new Registrar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover btnAtras;
    private rojerusan.RSButtonMetro btnCerrar;
    private rojerusan.RSButtonHover btnNuevo;
    private rojerusan.RSButtonHover btnSig;
    private rojerusan.RSComboMetro comboCarrera;
    private rojerusan.RSComboMetro comboCivil;
    private rojerusan.RSComboMetro comboGenero;
    private javax.swing.JLabel iconoFinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFinal;
    public static javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNivel1;
    private javax.swing.JLabel lblNivel2;
    private javax.swing.JLabel lblNivel3;
    private javax.swing.JLabel lblNivel4;
    private javax.swing.JLabel lblNivel5;
    private javax.swing.JLabel lblNivel6;
    private javax.swing.JLabel lblNivel7;
    private javax.swing.JPanel line1;
    private javax.swing.JPanel line2;
    private javax.swing.JPanel line3;
    private javax.swing.JPanel line4;
    private javax.swing.JPanel line5;
    private javax.swing.JPanel line6;
    private rojerusan.RSLabelCircleImage nievel1;
    private rojerusan.RSLabelCircleImage nievel2;
    private rojerusan.RSLabelCircleImage nievel3;
    private rojerusan.RSLabelCircleImage nievel4;
    private rojerusan.RSLabelCircleImage nievel5;
    private rojerusan.RSLabelCircleImage nievel6;
    private rojerusan.RSLabelCircleImage nievel7;
    private javax.swing.JPanel pnlCinco;
    private javax.swing.JPanel pnlCuatro;
    private javax.swing.JPanel pnlDos;
    private javax.swing.JPanel pnlOcho;
    private javax.swing.JPanel pnlSeis;
    private javax.swing.JPanel pnlSiete;
    private javax.swing.JPanel pnlTres;
    private javax.swing.JPanel pnlUno;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private rojerusan.RSMetroTextFullPlaceHolder txtAdicciones;
    private rojerusan.RSMetroTextFullPlaceHolder txtAlergicos;
    private rojerusan.RSMetroTextFullPlaceHolder txtAlimentacion;
    private rojerusan.RSMetroTextFullPlaceHolder txtConvulsiones;
    private rojerusan.RSMetroTextFullPlaceHolder txtCronico;
    private rojerusan.RSMetroTextFullPlaceHolder txtDomicilio;
    private rojerusan.RSMetroTextFullPlaceHolder txtEdad;
    private rojerusan.RSMetroTextFullPlaceHolder txtEmbarazos;
    private rojerusan.RSMetroTextFullPlaceHolder txtEnfermedades;
    private rojerusan.RSMetroTextFullPlaceHolder txtFarecuencia;
    private rojerusan.RSDateChooser txtFechaNac;
    private rojerusan.RSMetroTextFullPlaceHolder txtHabitacion;
    private rojerusan.RSMetroTextFullPlaceHolder txtHabitos;
    private javax.swing.JTextArea txtHerFam;
    private rojerusan.RSMetroTextFullPlaceHolder txtHospitalizaciones;
    private rojerusan.RSMetroTextFullPlaceHolder txtIVSA;
    private javax.swing.JTextArea txtInspeccionGen;
    private rojerusan.RSMetroTextFullPlaceHolder txtLugarNac;
    private rojerusan.RSMetroTextFullPlaceHolder txtMasa;
    private rojerusan.RSMetroTextFullPlaceHolder txtMenarca;
    private rojerusan.RSMetroTextFullPlaceHolder txtMetodos;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombre;
    private rojerusan.RSMetroTextFullPlaceHolder txtNumControl;
    private rojerusan.RSMetroTextFullPlaceHolder txtNumParejas;
    private rojerusan.RSMetroTextFullPlaceHolder txtOrigen;
    private rojerusan.RSMetroTextFullPlaceHolder txtPeso;
    private rojerusan.RSMetroTextFullPlaceHolder txtPresion;
    private rojerusan.RSMetroTextFullPlaceHolder txtPulso;
    private rojerusan.RSMetroTextFullPlaceHolder txtQuirurgicos;
    private rojerusan.RSMetroTextFullPlaceHolder txtReligion;
    private rojerusan.RSMetroTextFullPlaceHolder txtTalla;
    private rojerusan.RSMetroTextFullPlaceHolder txtTansfusiones;
    private rojerusan.RSMetroTextFullPlaceHolder txtTemperatura;
    private rojerusan.RSMetroTextFullPlaceHolder txtTipoSangre;
    private rojerusan.RSMetroTextFullPlaceHolder txtTraumatologicos;
    // End of variables declaration//GEN-END:variables

    private void registrarTodo() {
        int errores = 0;

        if (pacientes.ficha_identificacion.Opciones.verificaNumControl(this.txtNumControl.getText())) {
            ErrorAlert a = new ErrorAlert(null, true);
            a.msj1.setText("El No. CONTROL que intentas registrar");
            a.msj2.setText("ya existe.");
            a.msj3.setVisible(false);
            a.setVisible(true);
            pacientes.Variables.PASO--;
        } else {
            //Registro de la FICHA DE IDENTIFICACIÓN
            pacientes.ficha_identificacion.Sentencias fichaIdent
                    = new pacientes.ficha_identificacion.Sentencias();

            fichaIdent.setId_paciente(Integer.parseInt(this.lblID.getText()));
            fichaIdent.setN_control(this.txtNumControl.getText());
            String carrera = "";
            if (this.comboCarrera.getSelectedIndex() == 1) {
                carrera = "IDC";
            }
            if (this.comboCarrera.getSelectedIndex() == 2) {
                carrera = "IGEM";
            }
            if (this.comboCarrera.getSelectedIndex() == 3) {
                carrera = "ISC";
            }
            fichaIdent.setCarrera(carrera);
            fichaIdent.setNombre(this.txtNombre.getText());
            fichaIdent.setGenero(this.comboGenero.getSelectedItem().toString());
            fichaIdent.setEdad(this.txtEdad.getText());
            fichaIdent.setFecha_nacimiento(this.txtFechaNac.getFechaSeleccionada());
            fichaIdent.setLugar_nacimiento(this.txtLugarNac.getText());
            fichaIdent.setLugar_origen(this.txtOrigen.getText());
            fichaIdent.setDomicilio(this.txtDomicilio.getText());
            fichaIdent.setEstado_civil(this.comboCivil.getSelectedItem().toString());
            fichaIdent.setReligion(this.txtReligion.getText());

            if (!pacientes.ficha_identificacion.Opciones.registrar(fichaIdent)) {
                errores++;
            }

            //Registro de los ANTECEDENTES HEREDO-FAMILIARES
            pacientes.atecedentes_familiares.Sentencias ant_heredo
                    = new pacientes.atecedentes_familiares.Sentencias();

            ant_heredo.setId(Integer.parseInt(this.lblID.getText()));
            ant_heredo.setHeredo_familiar(this.txtHerFam.getText());

            if (!pacientes.atecedentes_familiares.Opciones.registrar(ant_heredo)) {
                errores++;
            }

            //Registro de los ANTECEDENTES PERSONALES NO PATOLÓGICOS
            pacientes.atecedentes_personales.Sentencias ant_no_pat
                    = new pacientes.atecedentes_personales.Sentencias();

            ant_no_pat.setId(Integer.parseInt(this.lblID.getText()));
            ant_no_pat.setAlimentacion(this.txtAlimentacion.getText());
            ant_no_pat.setHabitacion(this.txtHabitacion.getText());
            ant_no_pat.setHabitos_higienicos(this.txtHabitos.getText());

            if (!pacientes.atecedentes_personales.Opciones.registrar(ant_no_pat)) {
                errores++;
            }

            //Registro de los ANTECEDENTES GINÉCO-OBSTÉTRICOS
            pacientes.atecedentes_guineco_obstetricos.Sentencias ant_gin_obst
                    = new pacientes.atecedentes_guineco_obstetricos.Sentencias();

            ant_gin_obst.setId(Integer.parseInt(this.lblID.getText()));
            ant_gin_obst.setMenarca(this.txtMenarca.getText());
            ant_gin_obst.setIvsa(this.txtIVSA.getText());
            ant_gin_obst.setNumero_parejas(Integer.parseInt(this.txtNumParejas.getText()));
            ant_gin_obst.setEmbarazos(Integer.parseInt(this.txtEmbarazos.getText()));
            ant_gin_obst.setMetodo_anticonceptivo(this.txtMetodos.getText());

            if (!pacientes.atecedentes_guineco_obstetricos.Opciones.registrar(ant_gin_obst)) {
                errores++;
            }

            //Registro de los ANTECEDENTES PERSONALES PATOLÓGICOS
            pacientes.antecedentes_patologicos.Sentencias ant_pat
                    = new pacientes.antecedentes_patologicos.Sentencias();

            ant_pat.setId(Integer.parseInt(this.lblID.getText()));
            ant_pat.setEnfermedades_infecto(this.txtEnfermedades.getText());
            ant_pat.setCronico_degenerativas(this.txtCronico.getText());
            ant_pat.setAlergicos(this.txtAlergicos.getText());
            ant_pat.setQuirurgicos(this.txtQuirurgicos.getText());
            ant_pat.setTraumatologicos(this.txtTraumatologicos.getText());
            ant_pat.setTransfuciones(this.txtTansfusiones.getText());
            ant_pat.setConvulsiones(this.txtConvulsiones.getText());
            ant_pat.setAdicciones(this.txtAdicciones.getText());
            ant_pat.setHospitalizaciones(this.txtHospitalizaciones.getText());

            if (!pacientes.antecedentes_patologicos.Opciones.registrar(ant_pat)) {
                errores++;
            }

            //Registro de los SIGNOS VITALES Y SOMATOMETRIA
            pacientes.antecedentes_vitales.Sentencias sig_vitales
                    = new pacientes.antecedentes_vitales.Sentencias();

            sig_vitales.setId(Integer.parseInt(this.lblID.getText()));
            sig_vitales.setPulso(this.txtPulso.getText());
            sig_vitales.setPresion(this.txtPresion.getText());
            sig_vitales.setTemperatura(this.txtTemperatura.getText());
            sig_vitales.setFrecuencia_respiratoria(this.txtFarecuencia.getText());
            sig_vitales.setPeso(this.txtPeso.getText());
            sig_vitales.setTalla(this.txtTalla.getText());
            sig_vitales.setIndice_masa_corporal(this.txtMasa.getText());
            sig_vitales.setTipo_sangre(this.txtTipoSangre.getText());

            if (!pacientes.antecedentes_vitales.Opciones.registrar(sig_vitales)) {
                errores++;
            }

            //Registro de INSPECCIÓN GENERAL (HABITUS EXTERIOR)
            pacientes.atecedentes_general.Sentencias generarl
                    = new pacientes.atecedentes_general.Sentencias();

            generarl.setId(Integer.parseInt(this.lblID.getText()));
            generarl.setGeneral(this.txtInspeccionGen.getText());

            if (!pacientes.atecedentes_general.Opciones.registrar(generarl)) {
                errores++;
            }

            if (errores == 0) {
                this.btnSig.setVisible(false);
                this.btnAtras.setVisible(false);
                pasarNiveles(8);
                rSPanelsSlider1.slidPanel(2, pnlOcho, RSPanelsSlider.direct.Right);
                this.btnSig.setText("Siguiente");

                pacientes.ficha_identificacion.Opciones.listar("");
                pacientes.ficha_identificacion.Opciones.selecionaFila(this.lblID.getText());
                pacientes.ficha_identificacion.Opciones.extraerID();
            }
        }
    }
}
