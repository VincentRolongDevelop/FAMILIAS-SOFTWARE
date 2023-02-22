package familias2.Interfaz;

//Importaciones de la clase
import familias2.Familias;
import familias2.Operaciones;
import familias2.Operaciones2;
import javax.swing.JOptionPane;

public class Ventana3 extends javax.swing.JFrame {

    String casaPropia;

    public Ventana3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaIdFamilia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaPadre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaMadre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaPais = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cajaCiudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cajaBarrio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cajaDicc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cajaTele = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cajaCarros = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cajaMascotas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        familiasCrearBoton = new javax.swing.JButton();
        leerFamiliaBoton = new javax.swing.JButton();
        borraFamiliabutton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        labelCasaPropia = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cjaNumCasas = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenuItem1.setText("jMenuItem1");

        jMenu9.setText("File");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar4.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATOS FAMILIAS");
        setResizable(false);

        jLabel1.setText("DATOS DE FAMILIA");

        jLabel2.setText("ID");

        cajaIdFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIdFamiliaActionPerformed(evt);
            }
        });

        jLabel3.setText("PADRE");

        jLabel4.setText("MADRE");

        jLabel5.setText("PAIS");

        cajaPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPaisActionPerformed(evt);
            }
        });

        jLabel6.setText("ESTADO");

        cajaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEstadoActionPerformed(evt);
            }
        });

        jLabel7.setText("CIUDAD");

        jLabel8.setText("BARRIO");

        cajaBarrio.setToolTipText("");

        jLabel9.setText("DICCIONARIO");

        cajaDicc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDiccActionPerformed(evt);
            }
        });

        jLabel10.setText("TELÉFONO");

        cajaTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTeleActionPerformed(evt);
            }
        });

        jLabel11.setText("CUANTOS CARROS");

        cajaCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCarrosActionPerformed(evt);
            }
        });

        jLabel12.setText("CUANTAS MASCOTAS");

        jLabel13.setText("TIENEN CASA PROPIA");

        familiasCrearBoton.setText("CREAR ARCHIVO");
        familiasCrearBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familiasCrearBotonActionPerformed(evt);
            }
        });

        leerFamiliaBoton.setText("LEER ARCHIVO");
        leerFamiliaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerFamiliaBotonActionPerformed(evt);
            }
        });

        borraFamiliabutton.setText("LIMPIAR");
        borraFamiliabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borraFamiliabuttonActionPerformed(evt);
            }
        });

        jButton4.setText("REGRESAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("SI");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("NO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel14.setText("NÚMERO DE CASAS PROPIAS");

        cjaNumCasas.setEditable(false);
        cjaNumCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjaNumCasasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(familiasCrearBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(leerFamiliaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borraFamiliabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(cajaIdFamilia)
                            .addComponent(jLabel3)
                            .addComponent(cajaPadre)
                            .addComponent(cajaMadre)
                            .addComponent(cajaPais, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(cajaEstado))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(cajaCiudad)
                            .addComponent(jLabel8)
                            .addComponent(cajaBarrio)
                            .addComponent(jLabel9)
                            .addComponent(cajaDicc)
                            .addComponent(jLabel10)
                            .addComponent(cajaTele)
                            .addComponent(jLabel11)
                            .addComponent(cajaCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addComponent(cajaMascotas, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(jLabel14)
                                    .addComponent(cjaNumCasas)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton7)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(labelCasaPropia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaIdFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelCasaPropia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cajaMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cajaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cajaCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cajaBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6)
                                    .addComponent(jButton7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaDicc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(cjaNumCasas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cajaCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borraFamiliabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leerFamiliaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familiasCrearBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPaisActionPerformed

    private void cajaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEstadoActionPerformed

    private void familiasCrearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familiasCrearBotonActionPerformed
      
        //Boton para crear familias
        String id = cajaIdFamilia.getText();
        if (Operaciones2.familiasList.containsKey(id) == true) {

            JOptionPane.showMessageDialog(this, "YA EXISTE UNA FAMILIA CON ESE ID: " + id);
            return;

        }

        //Datos de la familia   
        String padre = cajaPadre.getText();
        String madre = cajaMadre.getText();
        String pais = cajaPais.getText();
        String estado = cajaEstado.getText();
        String ciudad = cajaCiudad.getText();
        String barrio = cajaBarrio.getText();
        String diccionario = cajaDicc.getText();
        String telefono2 = cajaTele.getText();
        String numeroCarros = cajaCarros.getText();
        String numeroMascotas = cajaMascotas.getText();
        String tieneCasasPropias = casaPropia;
        String numCasas = cjaNumCasas.getText();

      
        //Validaciones de datos   
        if (padre.isEmpty() && madre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "LA FAMILIA DEBE TENER UN PADRE O UNA MADRE MINIMO");
            return;

        }

        if (id.isEmpty() || pais.isEmpty() || estado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO HA LLENADO UNO DE LOS CAMPOS OBLIGATORIOS:\n\n*ID*\n*PAIS*\n"
                    + "*ESTADO*\n");
            return;

        }

        try {

            int numeTele2;
            numeTele2 = Integer.parseInt(telefono2);

            if (numeTele2 < 0) {
                JOptionPane.showMessageDialog(this, "El número teléfonico esta mal escrito");

                return;

            }

        } catch (NumberFormatException ee) {

            JOptionPane.showMessageDialog(this, "El número teléfonico esta mal escrito");

            return;

        }

        int ide;
        try {

            ide = Integer.parseInt(id);

            if (ide < 0) {
                JOptionPane.showMessageDialog(this, "El número del ID esta mal escrito");

                return;
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El número del ID esta mal escrito");

            return;

        }

        int numCarros;
        try {

            numCarros = Integer.parseInt(numeroCarros);

            if (numCarros < 0) {
                JOptionPane.showMessageDialog(this, "EL NÚMERO DE CARROS ESTA MAL ESCRITO");
                return;
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "EL NÚMERO DE CARROS ESTA MAL ESCRITO");

            return;

        }

        int numMascotas;
        try {

            numMascotas = Integer.parseInt(numeroMascotas);

            if (numMascotas < 0) {
                JOptionPane.showMessageDialog(this, "EL NÚMERO DE MASCOTAS ESTA MAL ESCRITO");
                return;
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "EL NÚMERO DE MASCOTAS ESTA MAL ESCRITO");

            return;

        }

        int numberCasas;
        try {

            numberCasas = Integer.parseInt(numCasas);

            if (numberCasas < 0) {
                JOptionPane.showMessageDialog(this, "EL NÚMERO DE CASAS ESTA MAL ESCRITO");
                return;
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "EL NÚMERO NO SE ESPECIFICA, INDIQUE *NO* O *SI* HE INDIQUE UN NÚMERO");

            return;

        }

        //Generamos y guardamos la información del nuevo objeto
        Familias familiaExistente = new Familias();

        Operaciones2 operador = new Operaciones2();

        familiaExistente.setId(id);
        familiaExistente.setPadre(padre);
        familiaExistente.setMadre(madre);
        familiaExistente.setPais(pais);
        familiaExistente.setEstado(estado);
        familiaExistente.setCiudad(ciudad);
        familiaExistente.setBarrio(barrio);
        familiaExistente.setDiccionario(diccionario);
        familiaExistente.setTelefono2(telefono2);
        familiaExistente.setTieneCasaPropia(tieneCasasPropias);
        familiaExistente.setNumeroCarros(numeroCarros);
        familiaExistente.setNumeroMascotas(numeroMascotas);
        familiaExistente.setNumeroCasas(numCasas);

        try {
            operador.addFamilias(familiaExistente);
            int listaComplFamilias = operador.familiasList.size();
            JOptionPane.showMessageDialog(this, "SE HA ALMACENADO LA FAMILIA");
            JOptionPane.showMessageDialog(this, "NÚMERO DE FAMILIAS ALMACENADAS: " + listaComplFamilias);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "NO SE ALMACENO LA FAMILIA");
        }


    }//GEN-LAST:event_familiasCrearBotonActionPerformed

    private void leerFamiliaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerFamiliaBotonActionPerformed
        
        //Botón para abrir ventana de leer datos
        ConsulFamilia verC2 = new ConsulFamilia();

        verC2.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_leerFamiliaBotonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        //Boton regresar
        Ventana1 ve = new Ventana1();
        ve.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        //Boton de valor casa propia
        labelCasaPropia.setText("|SI|");
        
        
        casaPropia = jButton6.getText();
        cjaNumCasas.setText("");
        cjaNumCasas.setEditable(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        //Boton de valor casa propia
        labelCasaPropia.setText("|NO|");
        
       casaPropia = jButton7.getText();
        cjaNumCasas.setText("0");
        cjaNumCasas.setEditable(false);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void borraFamiliabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borraFamiliabuttonActionPerformed
       
        //Boton Limpiar
        cajaIdFamilia.setText("");
        cajaPadre.setText("");
        cajaMadre.setText("");
        cajaPais.setText("");
        cajaEstado.setText("");
        cajaCiudad.setText("");
        cajaBarrio.setText("");
        cajaDicc.setText("");
        cajaTele.setText("");
        cajaCarros.setText("");
        cjaNumCasas.setText("");
        cajaMascotas.setText("");
        cjaNumCasas.setEditable(false);

        casaPropia = ("No especificado");

        labelCasaPropia.setText("");


    }//GEN-LAST:event_borraFamiliabuttonActionPerformed

    private void cajaTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTeleActionPerformed
      
    }//GEN-LAST:event_cajaTeleActionPerformed

    private void cajaCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCarrosActionPerformed
      
    }//GEN-LAST:event_cajaCarrosActionPerformed

    private void cajaIdFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIdFamiliaActionPerformed
       
    }//GEN-LAST:event_cajaIdFamiliaActionPerformed

    private void cajaDiccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDiccActionPerformed
      
    }//GEN-LAST:event_cajaDiccActionPerformed

    private void cjaNumCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjaNumCasasActionPerformed
   
    }//GEN-LAST:event_cjaNumCasasActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borraFamiliabutton;
    private javax.swing.JTextField cajaBarrio;
    private javax.swing.JTextField cajaCarros;
    private javax.swing.JTextField cajaCiudad;
    private javax.swing.JTextField cajaDicc;
    private javax.swing.JTextField cajaEstado;
    private javax.swing.JTextField cajaIdFamilia;
    private javax.swing.JTextField cajaMadre;
    private javax.swing.JTextField cajaMascotas;
    private javax.swing.JTextField cajaPadre;
    private javax.swing.JTextField cajaPais;
    private javax.swing.JTextField cajaTele;
    private javax.swing.JTextField cjaNumCasas;
    private javax.swing.JButton familiasCrearBoton;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCasaPropia;
    private javax.swing.JButton leerFamiliaBoton;
    // End of variables declaration//GEN-END:variables
}
