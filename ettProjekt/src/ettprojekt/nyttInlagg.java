/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ettprojekt;

import static ettprojekt.EttProjekt.idb;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author EmelieD
 */
public class nyttInlagg extends javax.swing.JFrame {

    private bloggLayout layout;
    private inlaggFrame panelInlagg;
    static String filename = null;

    /**
     * Creates new form nyttInlagg
     *
     *
     */
    public nyttInlagg() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        layout = new bloggLayout();
        panelInlagg = new inlaggFrame();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(panelInlagg);
        panelInlagg.setVisible(true);
        panelInlagg.setOsynlig();
        panelInlagg.setLabelOsynlig();
        filename = null;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nytt = new javax.swing.JButton();
        tillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        nytt.setText("Nytt inlagg");
        nytt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttActionPerformed(evt);
            }
        });

        tillbaka.setText("Tillbaka");
        tillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(tillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(nytt)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nytt)
                    .addComponent(tillbaka))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void nyttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttActionPerformed
        try {

            bloggLayout l = new bloggLayout();
            User u = User.getInstance();
            int id = u.getID();

            String fornamnet = "SELECT FIRST_NAME FROM USERS WHERE USER_ID = " + id + ";";
            String fornamn = idb.fetchSingle(fornamnet);
            String efternamnet = "SELECT LAST_NAME FROM USERS WHERE USER_ID = " + id + ";";
            String efternamn = idb.fetchSingle(efternamnet);
            String helaNamnet = fornamn + " " + efternamn;
            System.out.println(helaNamnet);
            String text = panelInlagg.getText();

            String titel = panelInlagg.getTitel();

            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());

            String increment = idb.getAutoIncrement("INLAGG", "INLAGG_ID");
            System.out.println(increment + " increment");
            try {
                String output = "";
                int idt = Integer.parseInt(increment);
                if (!(filename == null)) {
                    output = filePicker.fileSaverProfil(filename, idt);
                    File outputFile = new File(output);
                    System.out.println(output);
                    File inputFile = new File(filename);
                    fileSave.copyFileUsingStream(inputFile, outputFile);
                }
                if (EttProjekt.siffraVilken == 1) {
                    String projektNamn = l.getProjektNamn();
                    System.out.println(projektNamn);

                    String fraga1 = "SELECT PROJEKT_ID FROM PROJEKT WHERE PROJEKTNAMN = '" + projektNamn + "'";
                    String projektId = idb.fetchSingle(fraga1);
                    int projektIdInt = Integer.parseInt(projektId);
                    System.out.println(projektIdInt);
                    String fraga2 = "INSERT INTO PROJEKT_INLAGG VALUES (" + increment + "," + projektIdInt + ")";
                    String fraga3 = "INSERT INTO INLAGG VALUES ('" + date + "','" + output + "','" + text + "', '" + titel + "', '" + increment + "');";
                    String fraga4 = "INSERT INTO SKAPA_INLAGG VALUES (" + id + "," + increment + ")";
                    System.out.println(fraga3);

                    idb.insert(fraga3);
                    idb.insert(fraga2);
                    idb.insert(fraga4);

                    JOptionPane.showMessageDialog(null, "Inlägg har tillagts");

                } else if (EttProjekt.siffraVilken == 2) {

                    String projektNamn = l.getUtbildningProjekt();
                    System.out.println(projektNamn);

                    String fraga1 = "SELECT UTBILDNINGS_ID FROM UTBILDNING WHERE UTBILDNINGSNAMN = '" + projektNamn + "'";
                    String projektId = idb.fetchSingle(fraga1);
                    int projektIdInt = Integer.parseInt(projektId);
                    System.out.println(projektIdInt);
                    String fraga2 = "INSERT INTO UTBILDNING_INLAGG VALUES (" + projektIdInt + "," + increment + ")";
                    String fraga3 = "INSERT INTO INLAGG VALUES ('" + date + "','" + output + "','" + text + "', '" + titel + "', '" + increment + "');";
                    String fraga4 = "INSERT INTO SKAPA_INLAGG VALUES (" + id + "," + increment + ")";
                    System.out.println(fraga3);
                    System.out.println(fraga4);
                    System.out.println(fraga2);

                    idb.insert(fraga3);
                    idb.insert(fraga2);
                    idb.insert(fraga4);

                    JOptionPane.showMessageDialog(null, "Inlägg har tillagts");

                } else if (EttProjekt.siffraVilken == 3) {

                    String fraga2 = "INSERT INTO INLAGG_FORMELL VALUES (" + increment + ")";
                    String fraga3 = "INSERT INTO INLAGG VALUES ('" + date + "','" + output + "','" + text + "', '" + titel + "', '" + increment + "');";
                    String fraga4 = "INSERT INTO SKAPA_INLAGG VALUES (" + id + "," + increment + ")";
                    System.out.println(fraga3);
                    System.out.println(fraga4);
                    System.out.println(fraga2);

                    idb.insert(fraga3);
                    idb.insert(fraga2);
                    idb.insert(fraga4);

                    JOptionPane.showMessageDialog(null, "Inlägg har tillagts");

                } else if (EttProjekt.siffraVilken == 4) {

                    String fraga2 = "INSERT INTO INLAGG_INFORMELL VALUES (" + increment + ")";
                    String fraga3 = "INSERT INTO INLAGG VALUES ('" + date + "','" + output + "','" + text + "', '" + titel + "', '" + increment + "');";
                    String fraga4 = "INSERT INTO SKAPA_INLAGG VALUES (" + id + "," + increment + ")";
                    System.out.println(fraga3);
                    System.out.println(fraga4);
                    System.out.println(fraga2);

                    idb.insert(fraga3);
                    idb.insert(fraga2);
                    idb.insert(fraga4);

                    JOptionPane.showMessageDialog(null, "Inlägg har tillagts");
                }
            } catch (IOException i) {
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_nyttActionPerformed

    private void tillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaActionPerformed
        if (EttProjekt.siffraVilken == 1) {
            new projektBloggen().setVisible(true);
            this.dispose();
        } else if (EttProjekt.siffraVilken == 2) {
            new UtbildningProjektFlode().setVisible(true);
            this.dispose();
        } else if (EttProjekt.siffraVilken == 3) {
            new FormellaBlogg().setVisible(true);
            this.dispose();
        } else if (EttProjekt.siffraVilken == 4) {
            new InformellaBlogg().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_tillbakaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nytt;
    private javax.swing.JPanel panel;
    private javax.swing.JButton tillbaka;
    // End of variables declaration//GEN-END:variables
}
