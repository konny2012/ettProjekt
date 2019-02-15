/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ettprojekt;

import static ettprojekt.EttProjekt.idb;
import java.awt.Dimension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;

import oru.inf.InfException;

/**
 *
 * @author EmelieD
 */
public class projektBloggen extends javax.swing.JFrame {

    private Validering val;

    /**
     * Creates new form projektBloggen
     */
    public projektBloggen() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        bloggInlaggen();
        val = new Validering();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nyttInlagg = new javax.swing.JMenuItem();
        anvandare = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        panelen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelenLayout = new javax.swing.GroupLayout(panelen);
        panelen.setLayout(panelenLayout);
        panelenLayout.setHorizontalGroup(
            panelenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        panelenLayout.setVerticalGroup(
            panelenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelen);

        jLabel2.setFont(new java.awt.Font("Shree Devanagari 714", 1, 24)); // NOI18N
        jLabel2.setText("Forskning");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/52120177_250097332594746_4997812331481137152_n.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addContainerGap(501, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)
                        .addContainerGap(444, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jMenu1.setText("Meny");

        nyttInlagg.setText("Nytt inlägg");
        nyttInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttInlaggActionPerformed(evt);
            }
        });
        jMenu1.add(nyttInlagg);

        anvandare.setText("Hantera användare");
        anvandare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anvandareActionPerformed(evt);
            }
        });
        jMenu1.add(anvandare);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tillbaka");

        jMenuItem1.setText("Tillbaka");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new bloggLayout().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    private void nyttInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttInlaggActionPerformed
        bloggLayout layout = new bloggLayout();
        String projektNamn = layout.getProjektNamn();
        if (val.isMedIForskningProjekt(projektNamn)) {
            new nyttInlagg().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_nyttInlaggActionPerformed

    private void anvandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anvandareActionPerformed
        bloggLayout layout = new bloggLayout();
        String projektNamn = layout.getProjektNamn();
        if (val.isProjektAgare(projektNamn)) {
            new HanteraAnvandare().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_anvandareActionPerformed

    public void bloggInlaggen() {
        try {
            bloggLayout layout = new bloggLayout();
            String projektNamn = layout.getProjektNamn();

            String fraga1 = "SELECT PROJEKT_ID FROM PROJEKT WHERE PROJEKTNAMN = '" + projektNamn + "'";
            String projektId = idb.fetchSingle(fraga1);
            int projektIdInt = Integer.parseInt(projektId);
            String fraga2 = "SELECT INLAGG_ID FROM PROJEKT_INLAGG WHERE PROJEKT_ID = " + projektIdInt + ";";
            ArrayList<String> inlaggLista = idb.fetchColumn(fraga2);

            if (inlaggLista == null) {
                return;

            }
            Collections.reverse(inlaggLista);
            int antalInlagg = inlaggLista.size();
            String fragan = "SELECT TEXT FROM INLAGG JOIN PROJEKT_INLAGG ON INLAGG.INLAGG_ID = PROJEKT_INLAGG.INLAGG_ID WHERE PROJEKT_ID = " + projektIdInt + ";";
            ArrayList<String> texter = idb.fetchColumn(fragan);
            Collections.reverse(texter);

            fragan = "SELECT TITEL FROM INLAGG JOIN PROJEKT_INLAGG ON INLAGG.INLAGG_ID = PROJEKT_INLAGG.INLAGG_ID WHERE PROJEKT_ID = " + projektIdInt + ";";
            ArrayList<String> titlar = idb.fetchColumn(fragan);
            Collections.reverse(titlar);

            for (int j = 0; j < antalInlagg; j++) {
                inlaggFrame panel = new inlaggFrame();
                String id = inlaggLista.get(j);
                panelen.setLayout(new BoxLayout(panelen, BoxLayout.PAGE_AXIS));
                panelen.add(Box.createRigidArea(new Dimension(0, 20)));
                panelen.add(panel);
                panelen.setVisible(true);
                String allaTexter = texter.get(j);
                String allaTitlar = titlar.get(j);
                panel.setText(allaTexter);
                panel.setTitel(allaTitlar);
                panel.setID(id);
                System.out.println(id);
                panel.setProjektBloggen(this);
                panel.setEditable();
                panel.projektAgare();

                try {
                    String anvandare = "SELECT USER_ID FROM SKAPA_INLAGG WHERE INLAGG_ID = '" + id + "'";
                    String anvandarId = idb.fetchSingle(anvandare);
                    System.out.println(anvandarId);
                    String fornamn = "SELECT FIRST_NAME FROM USERS WHERE USER_ID = '" + anvandarId + "'";
                    String fornamnet = idb.fetchSingle(fornamn);
                    String efternamn = "SELECT LAST_NAME FROM USERS WHERE USER_ID = '" + anvandarId + "'";
                    String efternamnet = idb.fetchSingle(efternamn);
                    String helaNamnet = fornamnet + " " + efternamnet;
                    panel.setSkapare(helaNamnet);
                    panel.inlaggAgare();
                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Användare fel");
                }

            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem anvandare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem nyttInlagg;
    private javax.swing.JPanel panelen;
    // End of variables declaration//GEN-END:variables
}
