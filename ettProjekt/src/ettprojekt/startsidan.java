/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ettprojekt;

import static ettprojekt.EttProjekt.idb;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import oru.inf.InfException;

/**
 *
 * @author mira
 */
public final class startsidan extends javax.swing.JFrame {

    /**
     * Creates new form startsidan
     */
      public startsidan() {
        initComponents();
        showDate();
        showTime();
        bloggInlaggen();
        setSize(1000,900);
        
    }
void showDate() {
    Date d= new Date();
    SimpleDateFormat s= new SimpleDateFormat ("dd-MM-yyyy");
    lbdate.setText (s.format(d));
    

}
void showTime(){
   new Timer(0, (ActionEvent e) -> {
       Date d= new Date();
       SimpleDateFormat s= new SimpleDateFormat ("hh-mm-ss a");
       lbtime.setText (s.format(d));
   }
   ).start();       
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        informellaBlogg = new javax.swing.JLabel();
        formellaBlogg = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbdate = new javax.swing.JLabel();
        lbtime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Profil");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Skapa användare");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Projekt Blogg");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Boka möte");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Visa möten");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        informellaBlogg.setForeground(new java.awt.Color(255, 255, 255));
        informellaBlogg.setText("Informella Blogg");
        informellaBlogg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informellaBloggMouseClicked(evt);
            }
        });

        formellaBlogg.setForeground(new java.awt.Color(255, 255, 255));
        formellaBlogg.setText("Formella Blogg");
        formellaBlogg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formellaBloggMouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mötesinbjudan");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(52, 52, 52)
                .addComponent(informellaBlogg)
                .addGap(45, 45, 45)
                .addComponent(formellaBlogg)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(informellaBlogg)
                    .addComponent(formellaBlogg)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/loggo_liten.png"))); // NOI18N

        lbdate.setForeground(new java.awt.Color(0, 51, 255));
        lbdate.setText("dag");

        lbtime.setForeground(new java.awt.Color(0, 51, 255));
        lbtime.setText("tid");

        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Datum");

        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Tid");

        javax.swing.GroupLayout panelenLayout = new javax.swing.GroupLayout(panelen);
        panelen.setLayout(panelenLayout);
        panelenLayout.setHorizontalGroup(
            panelenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
        );
        panelenLayout.setVerticalGroup(
            panelenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelen);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtime)
                    .addComponent(lbdate))
                .addGap(41, 41, 41))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbdate)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbtime)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Profil().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new skapaanvandare().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new bloggLayout().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new bokaMoten().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Kalender().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void informellaBloggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informellaBloggMouseClicked
        EttProjekt.siffraVilken = 4;
        new InformellaBlogg().setVisible(true);
    }//GEN-LAST:event_informellaBloggMouseClicked

    private void formellaBloggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formellaBloggMouseClicked
        EttProjekt.siffraVilken = 3;
        new FormellaBlogg().setVisible(true);
    }//GEN-LAST:event_formellaBloggMouseClicked
     
    public void bloggInlaggen() {
        try {
           
            String fraga2 = "SELECT INLAGG_ID FROM INLAGG";
            ArrayList<String> inlaggLista = idb.fetchColumn(fraga2);

            if (inlaggLista == null) {
                return;

            }
            Collections.reverse(inlaggLista);
            int antalInlagg = inlaggLista.size();
            String fragan = "SELECT TEXT FROM INLAGG";
            ArrayList<String> texter = idb.fetchColumn(fragan);
            Collections.reverse(texter);

            fragan = "SELECT TITEL FROM INLAGG";
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
                panel.setEditable();
                panel.projektAgare();
                panel.setBild(id);
                panel.setFil(id);
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
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        new bjudIn().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel formellaBlogg;
    private javax.swing.JLabel informellaBlogg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbdate;
    private javax.swing.JLabel lbtime;
    private javax.swing.JPanel panelen;
    // End of variables declaration//GEN-END:variables
}
