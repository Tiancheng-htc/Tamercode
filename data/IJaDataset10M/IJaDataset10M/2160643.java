package gpahh;

import gpahh.objetos.Conexion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author cic
 */
public class RegistroHorario extends javax.swing.JFrame {

    static String nombreProfesores[];

    /** Creates new form RegistroHorario */
    public RegistroHorario() {
        nombreProfesores = new String[Conexion.profesoresRegistrados()];
        nombreProfesores = Conexion.llenarNombreProfesores();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono3.png")).getImage());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ProfesorBox = new javax.swing.JComboBox();
        jTextField18 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        guardarhorarioButton = new javax.swing.JButton();
        CancelarHorarioButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AsignaturaBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        GrupoBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        SalonBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        diaBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Horario");
        setResizable(false);
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Elige a un profesor"));
        jLabel4.setText("Nombre del Profesor: ");
        ProfesorBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Profesor 1", "Profesor 2", " " }));
        ProfesorBox.setModel(new javax.swing.DefaultComboBoxModel(nombreProfesores));
        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel4).addGap(18, 18, 18).addComponent(ProfesorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(ProfesorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jTextField18.setText("jTextField10");
        jTextField25.setText("jTextField10");
        jTextField33.setText("jTextField10");
        jTextField41.setText("jTextField10");
        guardarhorarioButton.setText("Guardar");
        guardarhorarioButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarhorarioButtonActionPerformed(evt);
            }
        });
        CancelarHorarioButton.setText("Cancelar");
        CancelarHorarioButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarHorarioButtonActionPerformed(evt);
            }
        });
        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Horario"));
        jLabel5.setText("Asignatura:");
        AsignaturaBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Historia I", "Historia II", "Comunicación Oral y Escrita", "Lengua y Comunicación", "Comunicación Cientifica", "Entorno Socioeconómico de México", "Filosofía I", "Filosofía II", "Desarrollo de Habilidades del Pensamiento", "Inglés I", "Inglés II", "Inglés III", "Inglés IV" }));
        AsignaturaBox.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignaturaBoxActionPerformed(evt);
            }
        });
        jLabel6.setText("Grupo:");
        GrupoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige turno" }));
        GrupoBox.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrupoBoxActionPerformed(evt);
            }
        });
        jLabel7.setText("Salón:");
        SalonBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " " }));
        jLabel3.setText("Hora de Inicio:");
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(7, 7, 21, 1));
        jLabel11.setText("Hora de termino:");
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(8, 8, 22, 1));
        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Matutino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Vespertino");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        diaBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes", "Martes", "Miércoles", "Jueves ", "Viernes", "Sábado" }));
        diaBox.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaBoxActionPerformed(evt);
            }
        });
        jLabel2.setText("Dia:");
        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGap(68, 68, 68).addComponent(jLabel5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(AsignaturaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel8Layout.createSequentialGroup().addGap(92, 92, 92).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel11).addComponent(jLabel3).addComponent(jLabel7).addComponent(jLabel2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(SalonBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(diaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel8Layout.createSequentialGroup().addGap(101, 101, 101).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGap(35, 35, 35).addComponent(jLabel6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(GrupoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel8Layout.createSequentialGroup().addComponent(jRadioButton1).addGap(18, 18, 18).addComponent(jRadioButton2))))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(AsignaturaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jRadioButton1).addComponent(jRadioButton2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(GrupoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel6)).addGap(13, 13, 13).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(SalonBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(17, 17, 17).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(diaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel2)).addGap(23, 23, 23).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Registro de Horas");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(97, 97, 97).addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(83, 83, 83).addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel34)).addGroup(jPanel2Layout.createSequentialGroup().addGap(87, 87, 87).addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(89, 89, 89).addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap()).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap(260, Short.MAX_VALUE).addComponent(guardarhorarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(CancelarHorarioButton).addGap(70, 70, 70)).addGroup(jPanel2Layout.createSequentialGroup().addGap(138, 138, 138).addComponent(jLabel1).addContainerGap(198, Short.MAX_VALUE)).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(80, 80, 80)))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(18, 18, 18).addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(8, 8, 8).addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(CancelarHorarioButton).addComponent(guardarhorarioButton)).addGap(78, 78, 78).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(60, 60, 60).addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(74, 74, 74).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE));
        pack();
    }

    private void guardarhorarioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        boolean lol = jRadioButton1.isSelected() == jRadioButton2.isSelected();
        if (!lol) {
            String profesor = (String) ProfesorBox.getSelectedItem();
            String asignatura = (String) AsignaturaBox.getSelectedItem();
            String grupo = (String) GrupoBox.getSelectedItem();
            String salon = (String) SalonBox.getSelectedItem();
            String horaComienzo = jSpinner1.getValue().toString();
            String horaTermino = jSpinner3.getValue().toString();
            String dia = diaBox.getSelectedItem().toString();
            int inicio = Integer.parseInt(horaComienzo);
            int termino = Integer.parseInt(horaTermino);
            if (termino > inicio) {
                Object[] opciones = { "Aceptar", "Cancelar" };
                int decide = JOptionPane.showOptionDialog(null, "Se agregara una nueva hora a : " + profesor + " de las " + horaComienzo + " a " + horaTermino + "\nde la asignatura " + asignatura + " al Grupo " + grupo, "Confirmación", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]);
                if (decide == 0) {
                    if (!Conexion.existeHorario(grupo, salon, horaComienzo, dia)) {
                        if (!Conexion.existeHorario(profesor, asignatura, grupo, salon, horaComienzo, horaTermino, dia)) {
                            Conexion.ingresaHorario(profesor, asignatura, grupo, salon, horaComienzo, horaTermino, dia);
                            JOptionPane.showMessageDialog(null, "Hora de clase registrada con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Ya existe una hora de clase registrada en la hora " + horaComienzo + " en el salón " + salon + " y con el grupo " + grupo, "Información", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya existe una hora de clase registrada en la hora " + horaComienzo + " en el salón " + salon + " y con el grupo " + grupo, "Información", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Verificar horas ", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Elige un turno", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void CancelarHorarioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void GrupoBoxActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jRadioButton2.setSelected(false);
        GrupoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1IM1", "1IM2", "1IM3", "1IM4", "1IM5", "1IM6", "1IM7", "1IM8", "2IM1", "2IM2", "2IM3", "2IM4", "2IM5", "2IM6", "2IM7", "2IM8", "3IM1", "3IM2", "3IM3", "3IM4", "3IM5", "3IM6", "3IM7", "3IM8", "4IM1", "4IM2", "4IM3", "4IM4", "4IM5", "4IM6", "4IM7", "4IM8" }));
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        jRadioButton1.setSelected(false);
        GrupoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1IV1", "1IV2", "1IV3", "1IV4", "1IV5", "1IV6", "1IV7", "1IV8", "2IV1", "2IV2", "2IV3", "2IV4", "2IV5", "2IV6", "2IV7", "2IV8", "3IV1", "3IV2", "3IV3", "3IV4", "3IV5", "3IV6", "3IV7", "3IV8", "4IV1", "4IV2", "4IV3", "4IV4", "4IV5", "4IV6", "4IV7", "4IV8" }));
    }

    private void AsignaturaBoxActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void diaBoxActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RegistroHorario().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox AsignaturaBox;

    private javax.swing.JButton CancelarHorarioButton;

    private javax.swing.JComboBox GrupoBox;

    private javax.swing.JComboBox ProfesorBox;

    private javax.swing.JComboBox SalonBox;

    private javax.swing.JComboBox diaBox;

    private javax.swing.JButton guardarhorarioButton;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel11;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel34;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JPanel jPanel6;

    private javax.swing.JPanel jPanel8;

    private javax.swing.JRadioButton jRadioButton1;

    private javax.swing.JRadioButton jRadioButton2;

    private javax.swing.JSpinner jSpinner1;

    private javax.swing.JSpinner jSpinner3;

    private javax.swing.JTextField jTextField18;

    private javax.swing.JTextField jTextField25;

    private javax.swing.JTextField jTextField33;

    private javax.swing.JTextField jTextField41;
}