/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ettprojekt;

import static ettprojekt.EttProjekt.idb;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfException;

/**
 *
 * @author EmelieD
 */
public class projektBloggen extends javax.swing.JFrame {

    /**
     * Creates new form projektBloggen
     */
    public projektBloggen() {
        initComponents();
        start();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelen = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nyttInlagg = new javax.swing.JMenuItem();
        anvandare = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelenLayout = new javax.swing.GroupLayout(panelen);
        panelen.setLayout(panelenLayout);
        panelenLayout.setHorizontalGroup(
            panelenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        panelenLayout.setVerticalGroup(
            panelenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelen);

        jMenu1.setText("Meny");

        nyttInlagg.setText("Nytt inlägg");
        nyttInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttInlaggActionPerformed(evt);
            }
        });
        jMenu1.add(nyttInlagg);

        anvandare.setText("Bjud in användare");
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new bloggLayout().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void nyttInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttInlaggActionPerformed
        new nyttInlagg().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nyttInlaggActionPerformed

    public void start() {
        try {
            bloggLayout layout = new bloggLayout();

            String projektNamn = layout.getProjektNamn();

            String fraga1 = "SELECT PROJEKT_ID FROM PROJEKT WHERE PROJEKTNAMN = '" + projektNamn + "'";
            String projektId = idb.fetchSingle(fraga1);
            int projektIdInt = Integer.parseInt(projektId);
            String fraga2 = "SELECT INLAGG_ID FROM PROJEKT_INLAGG WHERE PROJEKT_ID = " + projektIdInt + ";";
            ArrayList<String> inlaggLista = idb.fetchColumn(fraga2);
            if (inlaggLista == null) {
                panelen.setVisible(true);
            } else {
                bloggInlaggen();
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }
    
    

    public void bloggInlaggen() {

        try {
            bloggLayout layout = new bloggLayout();

            String projektNamn = layout.getProjektNamn();

            System.out.println(projektNamn);

            String fraga1 = "SELECT PROJEKT_ID FROM PROJEKT WHERE PROJEKTNAMN = '" + projektNamn + "'";
            String projektId = idb.fetchSingle(fraga1);
            int projektIdInt = Integer.parseInt(projektId);
            String fraga2 = "SELECT INLAGG_ID FROM PROJEKT_INLAGG WHERE PROJEKT_ID = " + projektIdInt + ";";
            ArrayList<String> inlaggLista = idb.fetchColumn(fraga2);
            int antalInlagg = inlaggLista.size();
            String fragan = "SELECT TEXT FROM INLAGG JOIN PROJEKT_INLAGG ON INLAGG.INLAGG_ID = PROJEKT_INLAGG.INLAGG_ID WHERE PROJEKT_ID = " + projektIdInt + ";";
            ArrayList<String> texter = idb.fetchColumn(fragan);
            System.out.println(texter);

            fragan = "SELECT TITEL FROM INLAGG JOIN PROJEKT_INLAGG ON INLAGG.INLAGG_ID = PROJEKT_INLAGG.INLAGG_ID WHERE PROJEKT_ID = " + projektIdInt + ";";
            ArrayList<String> titlar = idb.fetchColumn(fragan);
            System.out.println(titlar);

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

            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem anvandare;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem nyttInlagg;
    private javax.swing.JPanel panelen;
    // End of variables declaration//GEN-END:variables
}
