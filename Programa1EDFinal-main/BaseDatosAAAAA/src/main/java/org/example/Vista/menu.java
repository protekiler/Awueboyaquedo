package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class menu extends JFrame{

    private JButton BotonInicio;
    private JButton BotonSalir;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLayeredPane jLayeredPane1;
    private JLayeredPane jLayeredPane2;
    private JLayeredPane jLayeredPane3;
    private GroupLayout jLayeredPane1Layout;
    private GroupLayout jLayeredPane2Layout;
    private GroupLayout jLayeredPane3Layout;

    public menu(String arg0) throws HeadlessException {
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        BotonInicio = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        BotonSalir = new javax.swing.JButton();

        jLayeredPane1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel2.setText("jLabel2");

        jLabel1.setText("jLabel1");

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane1Layout = new GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(25, 25, 25))
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                .addContainerGap(46, Short.MAX_VALUE))
        );

        BotonInicio.setText("iniciar");


        jLayeredPane2.setLayer(BotonInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2Layout = new GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
                jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
                jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                                .addContainerGap(130, Short.MAX_VALUE)
                                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
        );

        jLayeredPane3.setBackground(new java.awt.Color(153, 153, 0));
        jLayeredPane3.setForeground(new java.awt.Color(153, 153, 0));

        BotonSalir.setText("salir");


        jLayeredPane3.setLayer(BotonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3Layout = new GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
                jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(537, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
                jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLayeredPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        this.setVisible(true);
    }

    public JButton getBotonInicio() {
        return BotonInicio;
    }

    public void setBotonInicio(JButton botonInicio) {
        BotonInicio = botonInicio;
    }

    public JButton getBotonSalir() {
        return BotonSalir;
    }

    public void setBotonSalir(JButton botonSalir) {
        BotonSalir = botonSalir;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLayeredPane getjLayeredPane1() {
        return jLayeredPane1;
    }

    public void setjLayeredPane1(JLayeredPane jLayeredPane1) {
        this.jLayeredPane1 = jLayeredPane1;
    }

    public JLayeredPane getjLayeredPane2() {
        return jLayeredPane2;
    }

    public void setjLayeredPane2(JLayeredPane jLayeredPane2) {
        this.jLayeredPane2 = jLayeredPane2;
    }

    public JLayeredPane getjLayeredPane3() {
        return jLayeredPane3;
    }

    public void setjLayeredPane3(JLayeredPane jLayeredPane3) {
        this.jLayeredPane3 = jLayeredPane3;
    }

    public GroupLayout getjLayeredPane1Layout() {
        return jLayeredPane1Layout;
    }

    public void setjLayeredPane1Layout(GroupLayout jLayeredPane1Layout) {
        this.jLayeredPane1Layout = jLayeredPane1Layout;
    }

    public GroupLayout getjLayeredPane2Layout() {
        return jLayeredPane2Layout;
    }

    public void setjLayeredPane2Layout(GroupLayout jLayeredPane2Layout) {
        this.jLayeredPane2Layout = jLayeredPane2Layout;
    }

    public GroupLayout getjLayeredPane3Layout() {
        return jLayeredPane3Layout;
    }

    public void setjLayeredPane3Layout(GroupLayout jLayeredPane3Layout) {
        this.jLayeredPane3Layout = jLayeredPane3Layout;
    }






}
