package familias2.Interfaz;

//Importaciones de la clase
import familias2.Familias;
import javax.swing.JOptionPane;
import familias2.Operaciones2;

//Clase ConsulFamilia
public class ConsulFamilia extends javax.swing.JFrame {

    //Método de la clase para mostrar los elementos
    public ConsulFamilia() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    //Elementos de gráfica de la ventana
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
        datoCiudad = new javax.swing.JTextField();
        datoIDMostrar = new javax.swing.JTextField();
        datoPadre = new javax.swing.JTextField();
        datoMadre = new javax.swing.JTextField();
        datoPais = new javax.swing.JTextField();
        datoBarrio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        datoDicc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mostrarButon = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        datoEstado = new javax.swing.JTextField();
        datoTel = new javax.swing.JTextField();
        mostrarLabel = new javax.swing.JLabel();
        butonBorrar = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        datoCantidadesCarros = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        datoCantidadMas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        datoCasaPropia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        datoCantidadCasa = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuBuscar = new javax.swing.JMenu();
        buscaFamilia = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATOS FAMILIAS");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("Mostrar datos de familias");

        jLabel2.setText("ID");

        jLabel3.setText("PADRE");

        jLabel4.setText("MADRE");

        jLabel5.setText("PAIS");

        jLabel6.setText("CIUDAD");

        jLabel7.setText("BARRIO");

        datoCiudad.setEditable(false);
        datoCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoCiudadActionPerformed(evt);
            }
        });

        datoPadre.setEditable(false);
        datoPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoPadreActionPerformed(evt);
            }
        });

        datoMadre.setEditable(false);
        datoMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoMadreActionPerformed(evt);
            }
        });

        datoPais.setEditable(false);

        datoBarrio.setEditable(false);

        jLabel8.setText("DICCIONARIO");

        datoDicc.setEditable(false);

        jLabel9.setText("TELÉFONO");

        jLabel10.setText("ESTADO");

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

        datoEstado.setEditable(false);
        datoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoEstadoActionPerformed(evt);
            }
        });

        datoTel.setEditable(false);
        datoTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoTelActionPerformed(evt);
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

        datoCantidadesCarros.setEditable(false);
        datoCantidadesCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoCantidadesCarrosActionPerformed(evt);
            }
        });

        jLabel11.setText("CANTIDAD DE CARROS");

        datoCantidadMas.setEditable(false);
        datoCantidadMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoCantidadMasActionPerformed(evt);
            }
        });

        jLabel12.setText("CANTIDAD DE MASCOTAS");

        datoCasaPropia.setEditable(false);
        datoCasaPropia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoCasaPropiaActionPerformed(evt);
            }
        });

        jLabel13.setText("TIENE CASA PROPIA");

        jLabel14.setText("CANTIDAD DE CASAS");

        datoCantidadCasa.setEditable(false);
        datoCantidadCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoCantidadCasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(datoPais)
                                .addComponent(datoMadre)
                                .addComponent(datoEstado)
                                .addComponent(datoPadre)
                                .addComponent(datoIDMostrar)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(145, 145, 145)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(196, 196, 196)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mostrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(560, 560, 560))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(datoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(datoDicc, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(datoBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(datoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addComponent(datoCantidadesCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datoCantidadMas, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(datoCasaPropia, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(datoCantidadCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoIDMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoCantidadMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoCasaPropia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel14))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datoCantidadCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datoMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datoDicc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datoCantidadesCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarButon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );

        MenuBuscar.setMnemonic('B');
        MenuBuscar.setText("Opciones");
        MenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarActionPerformed(evt);
            }
        });

        buscaFamilia.setText("Lista Familias");
        buscaFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaFamiliaActionPerformed(evt);
            }
        });
        MenuBuscar.add(buscaFamilia);

        jMenuBar1.add(MenuBuscar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datoCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoCiudadActionPerformed

    }//GEN-LAST:event_datoCiudadActionPerformed

    private void datoMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoMadreActionPerformed

    }//GEN-LAST:event_datoMadreActionPerformed

    //Uso de boton "regresar"
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        //Boton  de "Regresar"
        Ventana3 ver3 = new Ventana3();

        ver3.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jButton5ActionPerformed

    //Uso de boton "Mostrar"
    private void mostrarButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButonActionPerformed

        //Búsqueda de la ID
        String id = datoIDMostrar.getText();

        //Validación para el almacenado de nuevos datos de familias
        if (id.isEmpty()) {

            mostrarLabel.setText("|Ingrese datos de ID porfavor|");

        } else if (!id.isEmpty()) {
            mostrarLabel.setText("");
        }

        Operaciones2 operador2 = new Operaciones2();
        try {

            //Ingreso de datos
            Familias familiaExistente = operador2.buscFamilias(id);
            datoPadre.setText(familiaExistente.getPadre());
            datoMadre.setText(familiaExistente.getMadre());
            datoPais.setText(familiaExistente.getPais());
            datoCiudad.setText(familiaExistente.getCiudad());
            datoBarrio.setText(familiaExistente.getBarrio());
            datoEstado.setText(familiaExistente.getEstado());
            datoDicc.setText(familiaExistente.getDiccionario());
            datoTel.setText(familiaExistente.getTelefono2());
            datoCantidadesCarros.setText(familiaExistente.getNumeroCarros());
            datoCantidadMas.setText(familiaExistente.getNumeroMascotas());
            datoCasaPropia.setText(familiaExistente.getTieneCasaPropia());
            datoCantidadCasa.setText(familiaExistente.getNumeroCasas());

            //Uso de botones disponibles
            datoPadre.setEditable(true);
            datoMadre.setEditable(true);
            datoPais.setEditable(true);
            datoCiudad.setEditable(true);
            datoBarrio.setEditable(true);
            datoDicc.setEditable(true);
            datoTel.setEditable(true);
            datoCantidadMas.setEditable(true);
            datoEstado.setEditable(true);
            datoCantidadesCarros.setEditable(true);
            butonBorrar.setEnabled(true);
            jButtonEdit.setEnabled(true);

            //Validaciones de la muestra de datos
            int numberSINO;
            numberSINO = Integer.parseInt(datoCantidadCasa.getText());

            if (numberSINO > 0) {

                datoCantidadCasa.setEditable(true);

                return;

            } else {
                datoCantidadCasa.setEditable(false);
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, "NO SE ENCUENTRA DICHA ID ALMACENADA");
            return;
        }


    }//GEN-LAST:event_mostrarButonActionPerformed

    private void datoTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoTelActionPerformed

    }//GEN-LAST:event_datoTelActionPerformed

    private void butonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonBorrarActionPerformed

        //Operación borrar datos de la lista
        Operaciones2 ope3 = new Operaciones2();
        String id = datoIDMostrar.getText();
        if (id == null || id.isEmpty()) {

            JOptionPane.showMessageDialog(this, "INDIQUE UNA ID PARA ELIMINAR");
            return;
        } else {
            try {
                ope3.deleFamilia(id);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "HUBO UN ERROR NO SE PUEDE ELIMINAR");
                return;
            }

            JOptionPane.showMessageDialog(this, "DATOS DE FAMILIAS ELIMINADOS");

            datoPadre.setEditable(false);
            datoMadre.setEditable(false);
            datoPais.setEditable(false);
            datoCiudad.setEditable(false);
            datoBarrio.setEditable(false);
            datoDicc.setEditable(false);
            datoTel.setEditable(false);
            datoEstado.setEditable(false);
            datoCantidadMas.setEditable(false);
            datoCantidadesCarros.setEditable(false);
            datoCasaPropia.setEditable(false);
            datoCantidadCasa.setEditable(false);

            datoPadre.setText("");
            datoMadre.setText("");
            datoPais.setText("");
            datoCiudad.setText("");
            datoBarrio.setText("");
            datoDicc.setText("");
            datoTel.setText("");
            datoEstado.setText("");
            datoIDMostrar.setText("");
            datoCantidadMas.setText("");
            datoCantidadesCarros.setText("");
            datoPadre.setText("");
            datoCantidadCasa.setText("");
            datoCasaPropia.setText("");

            butonBorrar.setEnabled(false);
            jButtonEdit.setEnabled(false);
            datoIDMostrar.setEditable(true);

        }


    }//GEN-LAST:event_butonBorrarActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed

        //Validaciones de lo que se edite
        String datNuevo = datoIDMostrar.getText();

        if (datNuevo != null && datNuevo.isEmpty() == false) {

            if (Operaciones2.familiasList.containsKey(datNuevo) == true) {

                Familias familiaExistente = Operaciones2.familiasList.get(datNuevo);

                try {
                    if (datoMadre.getText().isEmpty() && datoPadre.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "LA FAMILIA DEBE TENER UN PADRE O UNA MADRE MINIMO");
                        return;
                    } else {

                        familiaExistente.setPadre(datoPadre.getText());
                        familiaExistente.setMadre(datoMadre.getText());

                    }

                    if (datoPais.getText().isEmpty() == false) {
                        familiaExistente.setPais(datoPais.getText());
                    } else {
                        JOptionPane.showMessageDialog(this, "LA FAMILIA DEBE TENER UN PAIS");
                        return;
                    }

                    try {
                        String y = datoTel.getText();
                        int numeTele;
                        numeTele = Integer.parseInt(y);

                        familiaExistente.setTelefono2(y);

                        if (numeTele < 0) {
                            JOptionPane.showMessageDialog(this, "El número teléfonico esta mal escrito");

                            return;
                        }

                    } catch (NumberFormatException ee) {

                        JOptionPane.showMessageDialog(this, "El número teléfonico esta mal escrito");

                        return;

                    }

                    try {
                        String z = datoCantidadesCarros.getText();
                        int num2;
                        num2 = Integer.parseInt(z);

                        familiaExistente.setNumeroCarros(z);

                        if (num2 < 0) {
                            JOptionPane.showMessageDialog(this, "El número de carros esta mal escrito");

                            return;
                        }

                    } catch (NumberFormatException ee) {

                        JOptionPane.showMessageDialog(this, "El número de carros esta mal escrito");

                        return;
                    }

                    try {
                        String a = datoCantidadMas.getText();
                        int num3;
                        num3 = Integer.parseInt(a);

                        familiaExistente.setNumeroMascotas(a);

                        if (num3 < 0) {
                            JOptionPane.showMessageDialog(this, "El número de mascotas esta mal escrito");

                            return;
                        }

                    } catch (NumberFormatException ee) {

                        JOptionPane.showMessageDialog(this, "El número de mascotas esta mal escrito");

                        return;
                    }

                    try {
                        String b = datoCantidadCasa.getText();
                        int nume4;
                        nume4 = Integer.parseInt(b);

                        familiaExistente.setNumeroCasas(b);

                        if (nume4 < 0) {
                            JOptionPane.showMessageDialog(this, "El número de casas esta mal escrito");

                            return;
                        }

                    } catch (NumberFormatException ee) {

                        JOptionPane.showMessageDialog(this, "El número de casas esta mal escrito");

                        return;
                    }

                    familiaExistente.setEstado(datoEstado.getText());
                    familiaExistente.setCiudad(datoCiudad.getText());
                    familiaExistente.setDiccionario(datoDicc.getText());
                    familiaExistente.setBarrio(datoBarrio.getText());;

                    Operaciones2 op3 = new Operaciones2();
                    op3.editFamilia(familiaExistente);

                    JOptionPane.showMessageDialog(this, "LOS DATOS FUERON ACTUALIZADOS");

                    datoPadre.setText("");
                    datoMadre.setText("");
                    datoPais.setText("");
                    datoCiudad.setText("");
                    datoBarrio.setText("");
                    datoDicc.setText("");
                    datoTel.setText("");
                    datoEstado.setText("");
                    datoIDMostrar.setText("");
                    datoCantidadMas.setText("");
                    datoCantidadesCarros.setText("");
                    datoPadre.setText("");
                    datoCantidadCasa.setText("");
                    datoCasaPropia.setText("");
                    datoIDMostrar.setEditable(true);

                    datoPadre.setEditable(false);
                    datoMadre.setEditable(false);
                    datoPais.setEditable(false);
                    datoCiudad.setEditable(false);
                    datoBarrio.setEditable(false);
                    datoDicc.setEditable(false);
                    datoTel.setEditable(false);
                    datoEstado.setEditable(false);
                    datoCantidadMas.setEditable(false);
                    datoCantidadesCarros.setEditable(false);
                    datoCasaPropia.setEditable(false);
                    datoCantidadCasa.setEditable(false);

                    butonBorrar.setEnabled(false);
                    jButtonEdit.setEnabled(false);

                } catch (Exception err) {

                    JOptionPane.showMessageDialog(this, "Alguno de los cuadros puede no estar lleno\n\n o estar mal lleno");

                    return;

                }

            } else {
                JOptionPane.showMessageDialog(this, "NO EXISTE DICHA ID NO SE PUEDE EDITAR");

            }
        }


    }//GEN-LAST:event_jButtonEditActionPerformed

    private void datoPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoPadreActionPerformed

    }//GEN-LAST:event_datoPadreActionPerformed

    private void buscaFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaFamiliaActionPerformed

        //Abrir Ventana de busqueda
        VentanaMostrarFamilias ventanaOp = new VentanaMostrarFamilias();
        ventanaOp.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_buscaFamiliaActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed

        //Boton limpiar las cajas
        datoPadre.setText("");
        datoMadre.setText("");
        datoPais.setText("");
        datoCiudad.setText("");
        datoBarrio.setText("");
        datoDicc.setText("");
        datoTel.setText("");
        datoEstado.setText("");
        datoIDMostrar.setText("");
        datoCantidadMas.setText("");
        datoCantidadesCarros.setText("");
        datoPadre.setText("");
        datoCantidadCasa.setText("");
        datoCasaPropia.setText("");
        datoIDMostrar.setEditable(true);

        datoPadre.setEditable(false);
        datoMadre.setEditable(false);
        datoPais.setEditable(false);
        datoCiudad.setEditable(false);
        datoBarrio.setEditable(false);
        datoDicc.setEditable(false);
        datoTel.setEditable(false);
        datoEstado.setEditable(false);
        datoCantidadMas.setEditable(false);
        datoCantidadesCarros.setEditable(false);
        datoCasaPropia.setEditable(false);
        datoCantidadCasa.setEditable(false);


    }//GEN-LAST:event_LimpiarActionPerformed

    private void datoCantidadesCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoCantidadesCarrosActionPerformed

    }//GEN-LAST:event_datoCantidadesCarrosActionPerformed

    private void datoCantidadMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoCantidadMasActionPerformed

    }//GEN-LAST:event_datoCantidadMasActionPerformed

    private void datoCasaPropiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoCasaPropiaActionPerformed

    }//GEN-LAST:event_datoCasaPropiaActionPerformed

    private void datoCantidadCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoCantidadCasaActionPerformed

    }//GEN-LAST:event_datoCantidadCasaActionPerformed

    private void MenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarActionPerformed

    }//GEN-LAST:event_MenuBuscarActionPerformed

    private void datoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoEstadoActionPerformed

    }//GEN-LAST:event_datoEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsulFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulFamilia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JMenu MenuBuscar;
    private javax.swing.JMenuItem buscaFamilia;
    private javax.swing.JButton butonBorrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField datoBarrio;
    private javax.swing.JTextField datoCantidadCasa;
    private javax.swing.JTextField datoCantidadMas;
    private javax.swing.JTextField datoCantidadesCarros;
    private javax.swing.JTextField datoCasaPropia;
    private javax.swing.JTextField datoCiudad;
    private javax.swing.JTextField datoDicc;
    private javax.swing.JTextField datoEstado;
    private javax.swing.JTextField datoIDMostrar;
    private javax.swing.JTextField datoMadre;
    private javax.swing.JTextField datoPadre;
    private javax.swing.JTextField datoPais;
    private javax.swing.JTextField datoTel;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
