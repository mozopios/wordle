/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.daw1.aaron.wordle.gui;

import com.google.common.base.Preconditions;
import java.awt.Color;
import static java.awt.PageAttributes.MediaType.A;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.daw1.aaron.wordle.gestionWordle.GestionWordle;
import org.daw1.aaron.wordle.motores.IMotor;
import org.daw1.aaron.wordle.motores.MotorBaseDatos;
import org.daw1.aaron.wordle.motores.MotorFichero;
import org.daw1.aaron.wordle.motores.MotorTest;

/**
 *
 * @author mozop
 */
public class MainGUI extends javax.swing.JFrame {
    
    private static final java.awt.Color  COLOR_VERDE = new java.awt.Color(0, 102, 0);
    private static final java.awt.Color  COLOR_AMARILLO = new java.awt.Color(255 ,255, 51);
    private static final java.awt.Color  COLOR_ROJO = new java.awt.Color(255 ,0, 51);
    
    private static final Pattern PATRON_INPUT = Pattern.compile("[A-Z]{5}");
    
    private static final int MAX_INTENTOS = 6;
    private static final int TAMANHO_PALABRA = 5;
    
    private final javax.swing.JLabel[][] labels = new javax.swing.JLabel[MAX_INTENTOS][TAMANHO_PALABRA];
    
    private GestionWordle gestion;
    private String aleatoria;
    private int intentos = 0;
    /**
     * Creates new form MainGUI
     */
    public MainGUI() throws Exception {
        gestion = new GestionWordle(new MotorFichero());
        aleatoria = gestion.getPalabraAleatoria();
        initComponents();
        inicializarLabels();
        System.out.println(gestion.getPalabraAleatoria());
    }
    
    public void test(){
        for (int i = 0; i < labels.length; i++) {
            JLabel[] label = labels[i];
            for (int j = 0; j < label.length; j++) {
                JLabel jLabel = label[j];
                jLabel.setVisible(false);

            }
        }
    }
    
    public final void inicializarLabels() {
        for (int i = 1; i <= MAX_INTENTOS; i++) {
            for (int j = 1; j <= TAMANHO_PALABRA; j++) {
                try {
                    String nombreLabel = "jLabel" + i + "_" + j;
                    System.out.println(nombreLabel);
                    javax.swing.JLabel aux = (javax.swing.JLabel) this.getClass().getDeclaredField(nombreLabel).get(this);
                    labels[i-1][j-1] = aux;
                    aux.setVisible(false);
                } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
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
        java.awt.GridBagConstraints gridBagConstraints;

        grupo = new javax.swing.ButtonGroup();
        mainjPanel = new javax.swing.JPanel();
        letrasjPanel = new javax.swing.JPanel();
        jLabel1_1 = new javax.swing.JLabel();
        jLabel1_2 = new javax.swing.JLabel();
        jLabel1_3 = new javax.swing.JLabel();
        jLabel1_4 = new javax.swing.JLabel();
        jLabel1_5 = new javax.swing.JLabel();
        jLabel2_1 = new javax.swing.JLabel();
        jLabel2_2 = new javax.swing.JLabel();
        jLabel2_3 = new javax.swing.JLabel();
        jLabel2_4 = new javax.swing.JLabel();
        jLabel2_5 = new javax.swing.JLabel();
        jLabel3_1 = new javax.swing.JLabel();
        jLabel3_2 = new javax.swing.JLabel();
        jLabel3_3 = new javax.swing.JLabel();
        jLabel3_4 = new javax.swing.JLabel();
        jLabel3_5 = new javax.swing.JLabel();
        jLabel4_1 = new javax.swing.JLabel();
        jLabel4_2 = new javax.swing.JLabel();
        jLabel4_3 = new javax.swing.JLabel();
        jLabel4_4 = new javax.swing.JLabel();
        jLabel4_5 = new javax.swing.JLabel();
        jLabel5_1 = new javax.swing.JLabel();
        jLabel5_2 = new javax.swing.JLabel();
        jLabel5_3 = new javax.swing.JLabel();
        jLabel5_4 = new javax.swing.JLabel();
        jLabel5_5 = new javax.swing.JLabel();
        jLabel6_1 = new javax.swing.JLabel();
        jLabel6_2 = new javax.swing.JLabel();
        jLabel6_3 = new javax.swing.JLabel();
        jLabel6_4 = new javax.swing.JLabel();
        jLabel6_5 = new javax.swing.JLabel();
        bottomjPanel = new javax.swing.JPanel();
        estadojPanel = new javax.swing.JPanel();
        maljPanel = new javax.swing.JPanel();
        maljLabel = new javax.swing.JLabel();
        existejPanel = new javax.swing.JPanel();
        existejLabel = new javax.swing.JLabel();
        bienjPanel = new javax.swing.JPanel();
        bienjLabel = new javax.swing.JLabel();
        inputjPanel = new javax.swing.JPanel();
        palabrajTextField = new javax.swing.JTextField();
        enviarjButton = new javax.swing.JButton();
        exitojPanel = new javax.swing.JPanel();
        finaljLabel = new javax.swing.JLabel();
        errorjPanel = new javax.swing.JPanel();
        errorjLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivosjMenu = new javax.swing.JMenu();
        nuevaPartidajMenuItem = new javax.swing.JMenuItem();
        motoresjMenu = new javax.swing.JMenu();
        fichero = new javax.swing.JRadioButtonMenuItem();
        BDDES = new javax.swing.JRadioButtonMenuItem();
        BDDGA = new javax.swing.JRadioButtonMenuItem();
        Test = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        GestionMotor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DAW1 Wordle Aarón");
        setPreferredSize(new java.awt.Dimension(200, 200));

        mainjPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainjPanel.setPreferredSize(new java.awt.Dimension(200, 200));
        mainjPanel.setLayout(new java.awt.BorderLayout());

        letrasjPanel.setBackground(new java.awt.Color(255, 255, 255));
        letrasjPanel.setPreferredSize(new java.awt.Dimension(200, 200));
        letrasjPanel.setLayout(new java.awt.GridLayout(6, 5));

        jLabel1_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_1.setText("A");
        jLabel1_1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1_1.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel1_1);

        jLabel1_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_2.setText("A");
        jLabel1_2.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1_2.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel1_2);

        jLabel1_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_3.setText("A");
        jLabel1_3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1_3.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel1_3);

        jLabel1_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_4.setText("A");
        jLabel1_4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1_4.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel1_4);

        jLabel1_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_5.setText("A");
        jLabel1_5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1_5.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel1_5);

        jLabel2_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_1.setText("A");
        jLabel2_1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel2_1.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel2_1);

        jLabel2_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_2.setText("A");
        jLabel2_2.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel2_2.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel2_2);

        jLabel2_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_3.setText("A");
        jLabel2_3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel2_3.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel2_3);

        jLabel2_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_4.setText("A");
        jLabel2_4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel2_4.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel2_4);

        jLabel2_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_5.setText("A");
        jLabel2_5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel2_5.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel2_5);

        jLabel3_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_1.setText("A");
        jLabel3_1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3_1.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel3_1);

        jLabel3_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_2.setText("A");
        jLabel3_2.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3_2.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel3_2);

        jLabel3_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_3.setText("A");
        jLabel3_3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3_3.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel3_3);

        jLabel3_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_4.setText("A");
        jLabel3_4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3_4.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel3_4);

        jLabel3_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_5.setText("A");
        jLabel3_5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3_5.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel3_5);

        jLabel4_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_1.setText("A");
        jLabel4_1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4_1.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel4_1);

        jLabel4_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_2.setText("A");
        jLabel4_2.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4_2.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel4_2);

        jLabel4_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_3.setText("A");
        jLabel4_3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4_3.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel4_3);

        jLabel4_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_4.setText("A");
        jLabel4_4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4_4.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel4_4);

        jLabel4_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_5.setText("A");
        jLabel4_5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4_5.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel4_5);

        jLabel5_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_1.setText("A");
        jLabel5_1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5_1.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel5_1);

        jLabel5_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_2.setText("A");
        jLabel5_2.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5_2.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel5_2);

        jLabel5_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_3.setText("A");
        jLabel5_3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5_3.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel5_3);

        jLabel5_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_4.setText("A");
        jLabel5_4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5_4.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel5_4);

        jLabel5_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_5.setText("A");
        jLabel5_5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5_5.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel5_5);

        jLabel6_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_1.setText("A");
        jLabel6_1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6_1.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel6_1);

        jLabel6_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_2.setText("A");
        jLabel6_2.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6_2.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel6_2);

        jLabel6_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_3.setText("A");
        jLabel6_3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6_3.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel6_3);

        jLabel6_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_4.setText("A");
        jLabel6_4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6_4.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel6_4);

        jLabel6_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_5.setText("A");
        jLabel6_5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6_5.setPreferredSize(new java.awt.Dimension(10, 10));
        letrasjPanel.add(jLabel6_5);

        mainjPanel.add(letrasjPanel, java.awt.BorderLayout.CENTER);

        bottomjPanel.setBackground(new java.awt.Color(255, 255, 255));
        bottomjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        bottomjPanel.setPreferredSize(new java.awt.Dimension(200, 100));
        bottomjPanel.setLayout(new java.awt.GridLayout(2, 2));

        estadojPanel.setBackground(new java.awt.Color(255, 255, 255));
        estadojPanel.setLayout(new java.awt.GridLayout(3, 0));

        maljPanel.setBackground(new java.awt.Color(255, 255, 255));
        maljPanel.setLayout(new java.awt.GridLayout(1, 0));

        maljLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        maljLabel.setForeground(new java.awt.Color(255, 0, 51));
        maljLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maljLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        maljPanel.add(maljLabel);

        estadojPanel.add(maljPanel);

        existejPanel.setBackground(new java.awt.Color(255, 255, 255));
        existejPanel.setLayout(new java.awt.GridLayout(1, 0));

        existejLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        existejLabel.setForeground(new java.awt.Color(255, 204, 0));
        existejPanel.add(existejLabel);

        estadojPanel.add(existejPanel);

        bienjPanel.setBackground(new java.awt.Color(255, 255, 255));
        bienjPanel.setLayout(new java.awt.GridLayout(1, 0));

        bienjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bienjLabel.setForeground(new java.awt.Color(0, 102, 0));
        bienjPanel.add(bienjLabel);

        estadojPanel.add(bienjPanel);

        bottomjPanel.add(estadojPanel);

        inputjPanel.setBackground(new java.awt.Color(255, 255, 255));

        palabrajTextField.setPreferredSize(new java.awt.Dimension(120, 23));
        inputjPanel.add(palabrajTextField);

        enviarjButton.setText("Enviar");
        enviarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarjButtonActionPerformed(evt);
            }
        });
        inputjPanel.add(enviarjButton);

        bottomjPanel.add(inputjPanel);

        exitojPanel.setBackground(new java.awt.Color(255, 255, 255));
        exitojPanel.setLayout(new java.awt.GridBagLayout());

        finaljLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        finaljLabel.setForeground(new java.awt.Color(51, 153, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(142, 200, 142, 200);
        exitojPanel.add(finaljLabel, gridBagConstraints);

        bottomjPanel.add(exitojPanel);

        errorjPanel.setBackground(new java.awt.Color(255, 255, 255));
        errorjPanel.setLayout(new java.awt.GridBagLayout());

        errorjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        errorjLabel.setForeground(new java.awt.Color(255, 0, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(143, 204, 144, 205);
        errorjPanel.add(errorjLabel, gridBagConstraints);

        bottomjPanel.add(errorjPanel);

        mainjPanel.add(bottomjPanel, java.awt.BorderLayout.PAGE_END);

        archivosjMenu.setText("Archivo");
        archivosjMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivosjMenuActionPerformed(evt);
            }
        });

        nuevaPartidajMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        nuevaPartidajMenuItem.setText("Nueva Partida");
        nuevaPartidajMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaPartidajMenuItemActionPerformed(evt);
            }
        });
        archivosjMenu.add(nuevaPartidajMenuItem);

        jMenuBar1.add(archivosjMenu);

        motoresjMenu.setText("Motores");
        motoresjMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motoresjMenuActionPerformed(evt);
            }
        });

        fichero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        grupo.add(fichero);
        fichero.setSelected(true);
        fichero.setText("Motor Fichero ");
        fichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficheroActionPerformed(evt);
            }
        });
        motoresjMenu.add(fichero);

        BDDES.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        grupo.add(BDDES);
        BDDES.setText(" Motor BDDES");
        BDDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDDESActionPerformed(evt);
            }
        });
        motoresjMenu.add(BDDES);

        BDDGA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        grupo.add(BDDGA);
        BDDGA.setText("Motor BDDGA");
        BDDGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDDGAActionPerformed(evt);
            }
        });
        motoresjMenu.add(BDDGA);

        Test.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        grupo.add(Test);
        Test.setText("Motor Test");
        Test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestActionPerformed(evt);
            }
        });
        motoresjMenu.add(Test);
        motoresjMenu.add(jSeparator1);

        GestionMotor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        GestionMotor.setText("Gestion Motor");
        GestionMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionMotorActionPerformed(evt);
            }
        });
        motoresjMenu.add(GestionMotor);

        jMenuBar1.add(motoresjMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarjButtonActionPerformed
        String input = this.palabrajTextField.getText().toUpperCase();
        if(PATRON_INPUT.matcher(input).matches()){
            Color[] colores = gestion.coloresLetras(input);
            this.bienjLabel.setText("");
            this.maljLabel.setText("");
            this.existejLabel.setText("");
            for(int i = 0; i < colores.length; i++) {
                char caracter = input.charAt(i);
                Color color = colores[i];
                String carac = Character.toString(caracter);
                labels[intentos][i].setForeground(color);
                labels[intentos][i].setText(carac);
                labels[intentos][i].setVisible(true);
            }
                this.maljLabel.setText(gestion.getLetraMal());
                this.bienjLabel.setText(gestion.getLetraBien());
                this.existejLabel.setText(gestion.getLetraExiste());
                gestion.getPalabraAle().clear();
                this.palabrajTextField.setText("");
                intentos++;

            if(input.equals(aleatoria)){
                this.finaljLabel.setForeground(COLOR_VERDE);
                this.finaljLabel.setText("Ha acertado la palabra, Intentos: " + intentos );
                this.enviarjButton.setVisible(false);
            }else if(intentos == MAX_INTENTOS){
                this.finaljLabel.setForeground(COLOR_ROJO);
                this.finaljLabel.setText("Intentos acabados , la palabra correcta era  " + aleatoria);
                this.enviarjButton.setVisible(false);
            }
        }else{
            this.errorjLabel.setText("La palabra debe tener 5 letras");
            this.errorjLabel.setText("");
        }
    }//GEN-LAST:event_enviarjButtonActionPerformed

    private void GestionMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionMotorActionPerformed
        GestionMotorGUI gestionMotor = new GestionMotorGUI(this,true,gestion);
        gestionMotor.setVisible(true);
        this.nuevaPartidajMenuItemActionPerformed(evt);
    }//GEN-LAST:event_GestionMotorActionPerformed

    private void motoresjMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motoresjMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motoresjMenuActionPerformed

    private void ficheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficheroActionPerformed
        try {
            gestion = new GestionWordle(new MotorFichero());
            aleatoria = gestion.getPalabraAleatoria();
            this.nuevaPartidajMenuItemActionPerformed(evt);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar el motor: " + ex.getMessage());
        }
    }//GEN-LAST:event_ficheroActionPerformed

    private void BDDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDDESActionPerformed

            this.nuevaPartidajMenuItemActionPerformed(evt);
        
    }//GEN-LAST:event_BDDESActionPerformed

    private void BDDGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDDGAActionPerformed
       
            this.nuevaPartidajMenuItemActionPerformed(evt);
         
    }//GEN-LAST:event_BDDGAActionPerformed

    private void TestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestActionPerformed
        
            this.nuevaPartidajMenuItemActionPerformed(evt);
        
    }//GEN-LAST:event_TestActionPerformed

    private void archivosjMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivosjMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_archivosjMenuActionPerformed

    private void nuevaPartidajMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPartidajMenuItemActionPerformed
        this.test();
        this.intentos = 0;
        this.errorjLabel.setText("");
        this.finaljLabel.setText("");
        this.bienjLabel.setText("");
        this.existejLabel.setText("");
        this.maljLabel.setText("");
        this.enviarjButton.setVisible(true);
        if(this.Test.isSelected()){
            try {
                gestion = new GestionWordle(new MotorTest());
            } catch (Exception ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(this.fichero.isSelected()){
            try {
                gestion = new GestionWordle(new MotorFichero());
            } catch (Exception ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(this.BDDES.isSelected()){
            try {
                gestion = new GestionWordle(new MotorBaseDatos("es"));
            } catch (Exception ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(this.BDDGA.isSelected()){
            try {
                gestion = new GestionWordle(new MotorBaseDatos("gl"));
            } catch (Exception ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        aleatoria = gestion.getPalabraAleatoria();
    }//GEN-LAST:event_nuevaPartidajMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainGUI().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem BDDES;
    private javax.swing.JRadioButtonMenuItem BDDGA;
    private javax.swing.JMenuItem GestionMotor;
    private javax.swing.JRadioButtonMenuItem Test;
    private javax.swing.JMenu archivosjMenu;
    private javax.swing.JLabel bienjLabel;
    private javax.swing.JPanel bienjPanel;
    private javax.swing.JPanel bottomjPanel;
    private javax.swing.JButton enviarjButton;
    private javax.swing.JLabel errorjLabel;
    private javax.swing.JPanel errorjPanel;
    private javax.swing.JPanel estadojPanel;
    private javax.swing.JLabel existejLabel;
    private javax.swing.JPanel existejPanel;
    private javax.swing.JPanel exitojPanel;
    private javax.swing.JRadioButtonMenuItem fichero;
    private javax.swing.JLabel finaljLabel;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JPanel inputjPanel;
    private javax.swing.JLabel jLabel1_1;
    private javax.swing.JLabel jLabel1_2;
    private javax.swing.JLabel jLabel1_3;
    private javax.swing.JLabel jLabel1_4;
    private javax.swing.JLabel jLabel1_5;
    private javax.swing.JLabel jLabel2_1;
    private javax.swing.JLabel jLabel2_2;
    private javax.swing.JLabel jLabel2_3;
    private javax.swing.JLabel jLabel2_4;
    private javax.swing.JLabel jLabel2_5;
    private javax.swing.JLabel jLabel3_1;
    private javax.swing.JLabel jLabel3_2;
    private javax.swing.JLabel jLabel3_3;
    private javax.swing.JLabel jLabel3_4;
    private javax.swing.JLabel jLabel3_5;
    private javax.swing.JLabel jLabel4_1;
    private javax.swing.JLabel jLabel4_2;
    private javax.swing.JLabel jLabel4_3;
    private javax.swing.JLabel jLabel4_4;
    private javax.swing.JLabel jLabel4_5;
    private javax.swing.JLabel jLabel5_1;
    private javax.swing.JLabel jLabel5_2;
    private javax.swing.JLabel jLabel5_3;
    private javax.swing.JLabel jLabel5_4;
    private javax.swing.JLabel jLabel5_5;
    private javax.swing.JLabel jLabel6_1;
    private javax.swing.JLabel jLabel6_2;
    private javax.swing.JLabel jLabel6_3;
    private javax.swing.JLabel jLabel6_4;
    private javax.swing.JLabel jLabel6_5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel letrasjPanel;
    private javax.swing.JPanel mainjPanel;
    private javax.swing.JLabel maljLabel;
    private javax.swing.JPanel maljPanel;
    private javax.swing.JMenu motoresjMenu;
    private javax.swing.JMenuItem nuevaPartidajMenuItem;
    private javax.swing.JTextField palabrajTextField;
    // End of variables declaration//GEN-END:variables
}
