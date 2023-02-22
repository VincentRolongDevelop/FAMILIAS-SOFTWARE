package familias2.Interfaz;

//Importaciones de la clase
import familias2.Operaciones;
import familias2.Personas;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

//Clase ConsulPersona
public class ConsulPersona extends javax.swing.JFrame {

    public ConsulPersona() {
        initComponents();

        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        datoEmail2 = new javax.swing.JTextField();
        datoCCMostrar = new javax.swing.JTextField();
        datoContra2 = new javax.swing.JTextField();
        datoNombre2 = new javax.swing.JTextField();
        datoApe2 = new javax.swing.JTextField();
        datoTel2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        datoRol2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mostrarButon = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        datoFecha2 = new javax.swing.JTextField();
        datoGene2 = new javax.swing.JTextField();
        mostrarLabel = new javax.swing.JLabel();
        butonBorrar = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuBuscar = new javax.swing.JMenu();
        buscaPersona = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATOS PERSONAS");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("Mostrar datos de personas");

        jLabel2.setText("CC");

        jLabel3.setText("PASSWORD");

        jLabel4.setText("NOMBRE");

        jLabel5.setText("APELLIDO");

        jLabel6.setText("EMAIL");

        jLabel7.setText("TELÉFONO");

        datoEmail2.setEditable(false);
        datoEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoEmail2ActionPerformed(evt);
            }
        });

        datoContra2.setEditable(false);
        datoContra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoContra2ActionPerformed(evt);
            }
        });

        datoNombre2.setEditable(false);
        datoNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoNombre2ActionPerformed(evt);
            }
        });

        datoApe2.setEditable(false);

        datoTel2.setEditable(false);

        jLabel8.setText("ROL");

        datoRol2.setEditable(false);

        jLabel9.setText("GÉNERO");

        jLabel10.setText("FECHA DE NACIMIENTO (yyyy/mm/dd)");

        mostrarButon.setText("MOSTRAR DATOS");
        mostrarButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButonActionPerformed(evt);
            }
        });

        jButton5.setText("REGRESAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        datoFecha2.setEditable(false);

        datoGene2.setEditable(false);
        datoGene2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoGene2ActionPerformed(evt);
            }
        });

        butonBorrar.setText("ELIMINAR DATOS");
        butonBorrar.setEnabled(false);
        butonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonBorrarActionPerformed(evt);
            }
        });

        jButtonEdit.setText("GUARDAR CAMBIOS");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(datoApe2)
                                .addComponent(datoNombre2)
                                .addComponent(datoFecha2)
                                .addComponent(datoContra2)
                                .addComponent(datoCCMostrar)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(145, 145, 145))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mostrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mostrarButon, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(datoGene2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(datoRol2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(datoTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(datoEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))))
                                .addGap(52, 52, 52))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(butonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoCCMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoContra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoRol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoGene2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mostrarButon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datoFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        MenuBuscar.setMnemonic('B');
        MenuBuscar.setText("Opciones");

        buscaPersona.setText("Lista Personas");
        buscaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaPersonaActionPerformed(evt);
            }
        });
        MenuBuscar.add(buscaPersona);

        jMenuBar1.add(MenuBuscar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datoEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoEmail2ActionPerformed

    }//GEN-LAST:event_datoEmail2ActionPerformed

    private void datoNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoNombre2ActionPerformed

    }//GEN-LAST:event_datoNombre2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        //Boton Regresar
        Ventana2 ver = new Ventana2();
        ver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void mostrarButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButonActionPerformed

        //Boton mostrar datos
        String cc = datoCCMostrar.getText();

        //Validaciones para mostrar los datos
        if (cc.isEmpty()) {

            mostrarLabel.setText("|Ingrese datos de CC porfavor|");

        } else if (!cc.isEmpty()) {
            mostrarLabel.setText("");
        }

        Operaciones op2 = new Operaciones();
        try {

            Personas personaHum = op2.buscPersonas(cc);
            datoContra2.setText(personaHum.getPassword());
            datoNombre2.setText(personaHum.getNombre());
            datoApe2.setText(personaHum.getApellidos());
            datoEmail2.setText(personaHum.getEmail());
            datoTel2.setText(personaHum.getTelefono());
            datoRol2.setText(personaHum.getRol());
            datoGene2.setText(personaHum.getGenero());

            String rol = datoRol2.getText();

            if (rol.isEmpty()) {

                datoRol2.setText("No especificado");
            }

            String gene = datoGene2.getText();

            if (gene.isEmpty()) {

                datoGene2.setText("No especificado");
            }

            SimpleDateFormat cambioFecha = new SimpleDateFormat("yyyy/mm/dd");
            if (personaHum.getFechaNacimiento() != null) {

                String fechaNacimi = cambioFecha.format(personaHum.getFechaNacimiento());

                datoFecha2.setText(fechaNacimi);

            } else {

                datoFecha2.setText("FECHA NO LEGIBLE O INESPECIFICA");

            }

            datoContra2.setEditable(true);
            datoNombre2.setEditable(true);
            datoApe2.setEditable(true);
            datoEmail2.setEditable(true);
            datoTel2.setEditable(true);
            datoRol2.setEditable(true);
            datoGene2.setEditable(false);
            datoFecha2.setEditable(false);
            butonBorrar.setEnabled(true);
            jButtonEdit.setEnabled(true);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, "NO SE ENCUENTRA DICHA CC ALMACENADA");
            return;
        }


    }//GEN-LAST:event_mostrarButonActionPerformed

    private void datoGene2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoGene2ActionPerformed

    }//GEN-LAST:event_datoGene2ActionPerformed

    private void butonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonBorrarActionPerformed

        //Boton para borrar el elemento de la lista
        Operaciones ope3 = new Operaciones();
        String cc = datoCCMostrar.getText();
        if (cc == null || cc.isEmpty()) {

            //Validaciones del boton
            JOptionPane.showMessageDialog(this, "INDIQUE UNA CEDULA PARA ELIMINAR");
            return;
        } else {
            try {
                ope3.delePersona(cc);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "HUBO UN ERROR NO SE PUEDE ELIMINAR");
                return;
            }

            JOptionPane.showMessageDialog(this, "DATOS DE PERSONA ELIMINADOS");

            datoContra2.setEditable(false);
            datoNombre2.setEditable(false);
            datoApe2.setEditable(false);
            datoEmail2.setEditable(false);
            datoTel2.setEditable(false);
            datoRol2.setEditable(false);
            datoGene2.setEditable(false);
            datoFecha2.setEditable(false);

            datoContra2.setText("");
            datoNombre2.setText("");
            datoApe2.setText("");
            datoEmail2.setText("");
            datoTel2.setText("");
            datoRol2.setText("");
            datoGene2.setText("");
            datoFecha2.setText("");
            datoCCMostrar.setText("");
            butonBorrar.setEnabled(false);
            jButtonEdit.setEnabled(false);
            datoCCMostrar.setEditable(true);

        }


    }//GEN-LAST:event_butonBorrarActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        

        //Validaciones del boton mostrar
        String dat0 = datoCCMostrar.getText();
       

        if (dat0 != null && dat0.isEmpty() == false) {

            if (Operaciones.personaslist.containsKey(dat0) == true) {

                Personas personaHum = Operaciones.personaslist.get(dat0);

                try {
                    if (datoNombre2.getText().isEmpty() == false) {
                        personaHum.setNombre(datoNombre2.getText());
                    } else {
                        JOptionPane.showMessageDialog(this, "LA PERSONA DEBE TENER NOMBRE");
                        return;
                    }

                    if (datoContra2.getText().isEmpty() == false) {
                        personaHum.setPassword(datoContra2.getText());
                    } else {
                        JOptionPane.showMessageDialog(this, "LA PERSONA DEBE TENER CONTRASEÑA");
                        return;
                    }

                    if (datoApe2.getText().isEmpty() == false) {
                        personaHum.setApellidos(datoApe2.getText());
                    } else {
                        JOptionPane.showMessageDialog(this, "LA PERSONA DEBE TENER APELLIDO");
                        return;
                    }

                    if (datoEmail2.getText().isEmpty() == false && datoEmail2.getText().contains("@") && datoEmail2.getText().contains(".")) {
                        personaHum.setEmail(datoEmail2.getText());

                    } else {
                        JOptionPane.showMessageDialog(this, "Correo invalido, debe tener @ y .");

                        return;
                    }

                    try {
                        String y = datoTel2.getText();
                        int numeTele;
                        numeTele = Integer.parseInt(y);

                        personaHum.setTelefono(y);

                        if (numeTele < 0) {
                            JOptionPane.showMessageDialog(this, "El número teléfonico esta mal escrito");

                            return;
                        }

                    } catch (NumberFormatException ee) {

                        JOptionPane.showMessageDialog(this, "El número teléfonico esta mal escrito");

                        return;

                    }

                    String z = datoRol2.getText();

                    if (z.equals("No especificado"));
                    {

                        personaHum.setRol(datoRol2.getText());

                    }

                    Operaciones op3 = new Operaciones();
                    op3.editPersona(personaHum);

                    JOptionPane.showMessageDialog(this, "LOS DATOS FUERON ACTUALIZADOS");

                    datoContra2.setText("");
                    datoNombre2.setText("");
                    datoApe2.setText("");
                    datoEmail2.setText("");
                    datoTel2.setText("");
                    datoRol2.setText("");
                    datoGene2.setText("");
                    datoFecha2.setText("");
                    datoCCMostrar.setText("");
                    butonBorrar.setEnabled(false);
                    jButtonEdit.setEnabled(false);

                    //    personaHum.setFechaNacimiento(datoFecha2.getText());
                } catch (Exception err) {

                    JOptionPane.showMessageDialog(this, "Alguno de los cuadros puede no estar lleno\n\n o estar mal lleno");
                    JOptionPane.showMessageDialog(this, "*LA CC DEBE SER NUMERICA*\n*EL TELÉFONO DEBE SER NUMERICOn\nLA FECHA DEBE ESCRIBIR CE /YYYY/MM/DD"
                            + "n\nEL CORREO DEBE CONTENER @ Y .");

                    return;

                }

            } else {
                JOptionPane.showMessageDialog(this, "NO EXISTE DICHA CC NO SE PUEDE EDITAR");

            }
        }


    }//GEN-LAST:event_jButtonEditActionPerformed

    private void datoContra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoContra2ActionPerformed
        
    }//GEN-LAST:event_datoContra2ActionPerformed

    private void buscaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaPersonaActionPerformed
       
        //Abrir ventana de Mostrar lista
        VentanaMostrarPersona er = new VentanaMostrarPersona();
        er.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_buscaPersonaActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
       
        //Boton limpiar
        datoContra2.setText("");
        datoNombre2.setText("");
        datoApe2.setText("");
        datoEmail2.setText("");
        datoTel2.setText("");
        datoRol2.setText("");
        datoGene2.setText("");
        datoFecha2.setText("");
        datoCCMostrar.setText("");
        datoCCMostrar.setEditable(true);


    }//GEN-LAST:event_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsulPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JMenu MenuBuscar;
    private javax.swing.JMenuItem buscaPersona;
    private javax.swing.JButton butonBorrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField datoApe2;
    private javax.swing.JTextField datoCCMostrar;
    private javax.swing.JTextField datoContra2;
    private javax.swing.JTextField datoEmail2;
    private javax.swing.JTextField datoFecha2;
    private javax.swing.JTextField datoGene2;
    private javax.swing.JTextField datoNombre2;
    private javax.swing.JTextField datoRol2;
    private javax.swing.JTextField datoTel2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonEdit;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrarButon;
    private javax.swing.JLabel mostrarLabel;
    // End of variables declaration//GEN-END:variables
}
