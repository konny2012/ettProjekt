/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ettprojekt;

import static ettprojekt.EttProjekt.idb;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

import oru.inf.InfException;

/**
 *
 * @author Christoffer
 */
public class inlaggFrame extends javax.swing.JPanel {

    private String ID;
    private Validering val;
    private projektBloggen blogg;
    private String namnet;
    private String userId;
    private UtbildningProjektFlode utbildningBloggen;
    private FormellaBlogg formellaBloggen;
    private InformellaBlogg informellaBloggen;

    /**
     * Creates new form inlaggFrame
     *
     */
    public inlaggFrame() {
        initComponents();
        val = new Validering();
        spara.setVisible(false);

    }

    public String getText() {
        return txtInlagg.getText();
    }

    public String getTitel() {
        return txtTitel.getText();
    }

    public void setText(String text) {

        txtInlagg.setText(text);
    }

    public void setTitel(String titel) {
        txtTitel.setText(titel);
    }

    public void setID(String id) {
        ID = id;
    }

    public String getID() {
        return ID;
    }

    public void setEditable() {
        txtTitel.setEditable(false);
        txtInlagg.setEditable(false);
    }

    public void setSkapare(String namn) {
        namnet = namn;
        lblNamn.setText(namn);

    }

    public String getSkapare() {
        return namnet;
    }

    public void setOsynlig() {
        taBort.setVisible(false);
        redigera.setVisible(false);
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
        lblNamn = new javax.swing.JButton();
        txtTitel = new javax.swing.JTextField();
        txtInlagg = new java.awt.TextArea();
        bild = new javax.swing.JLabel();
        tagg6 = new javax.swing.JLabel();
        tagg7 = new javax.swing.JLabel();
        tagg8 = new javax.swing.JLabel();
        tagg9 = new javax.swing.JLabel();
        tagg10 = new javax.swing.JLabel();
        taBort = new javax.swing.JButton();
        redigera = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(698, 358));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        lblNamn.setBackground(new java.awt.Color(255, 255, 255));
        lblNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNamnActionPerformed(evt);
            }
        });

        bild.setText("bild");

        tagg6.setText("Tagg5");

        tagg7.setText("Tagg1");

        tagg8.setText("Tagg2");

        tagg9.setText("Tagg3");

        tagg10.setText("Tagg4");

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        redigera.setText("Redigera");
        redigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraActionPerformed(evt);
            }
        });

        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/loggo_liten.png"))); // NOI18N

        lblRubrik.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblRubrik.setText("Rubrik");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spara)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(tagg7)
                                    .addGap(18, 18, 18)
                                    .addComponent(tagg8)
                                    .addGap(18, 18, 18)
                                    .addComponent(tagg9)
                                    .addGap(18, 18, 18)
                                    .addComponent(tagg10)
                                    .addGap(18, 18, 18)
                                    .addComponent(tagg6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(redigera)
                                    .addGap(66, 66, 66)
                                    .addComponent(taBort))
                                .addComponent(txtInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bild, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bild, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tagg7)
                                .addComponent(tagg8)
                                .addComponent(tagg9)
                                .addComponent(tagg10)
                                .addComponent(tagg6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(redigera)
                                .addComponent(taBort)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spara)
                        .addGap(141, 141, 141))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        try {

            String fraga1 = "DELETE FROM INLAGG WHERE INLAGG_ID = '" + ID + "'";

            String fraga2 = "DELETE FROM PROJEKT_INLAGG WHERE INLAGG_ID = '" + ID + "'";

            String fraga3 = "DELETE FROM SKAPA_INLAGG WHERE INLAGG_ID = '" + ID + "'";

            idb.delete(fraga2);
            idb.delete(fraga3);
            idb.delete(fraga1);
            JOptionPane.showMessageDialog(null, "Inlagg har raderats");
            if (EttProjekt.siffraVilken == 1) {
                blogg.dispose();
                new projektBloggen().setVisible(true);
            } else if (EttProjekt.siffraVilken == 2) {
                utbildningBloggen.dispose();
                new UtbildningProjektFlode().setVisible(true);
            } else if (EttProjekt.siffraVilken == 3) {
                formellaBloggen.dispose();
                new FormellaBlogg().setVisible(true);
            } else if (EttProjekt.siffraVilken == 4) {
                informellaBloggen.dispose();
                new InformellaBlogg().setVisible(true);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }

    }//GEN-LAST:event_taBortActionPerformed

    public void projektAgare() {
        try {
            User u = User.getInstance();
            int id = u.getID();
            String stringId = Integer.toString(id);
            bloggLayout l = new bloggLayout();
            String projekt = l.getProjektNamn();
            String fraga = "SELECT AGARE FROM PROJEKT WHERE PROJEKTNAMN = '" + projekt + "'";
            String agarId = idb.fetchSingle(fraga);

            if (stringId.equals(agarId)) {
                taBort.setVisible(true);
                redigera.setVisible(true);
            } else {
                setOsynlig();

            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "FEL");
        }
    }

    public void utbildningAgare() {
        try {
            User u = User.getInstance();
            int id = u.getID();
            String stringId = Integer.toString(id);
            bloggLayout l = new bloggLayout();
            String projekt = l.getProjektNamn();
            String fraga = "SELECT AGARE FROM UTBILDNING WHERE UTBILDNINGSNAMN = '" + projekt + "'";
            String agarId = idb.fetchSingle(fraga);

            if (stringId.equals(agarId)) {
                taBort.setVisible(true);
                redigera.setVisible(true);
            } else {
                setOsynlig();

            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "FEL");
        }
    }

    public void inlaggAgare() {
        try {
            User u = User.getInstance();
            int id = u.getID();
            String stringId = Integer.toString(id);
            String fraga1 = "SELECT FIRST_NAME FROM USERS WHERE USER_ID = '" + stringId + "'";
            String fraga2 = "SELECT LAST_NAME FROM USERS WHERE USER_ID = '" + stringId + "'";
            String fornamn = idb.fetchSingle(fraga1);
            String efternamn = idb.fetchSingle(fraga2);
            String helaNamnet = fornamn + " " + efternamn;
            System.out.println(helaNamnet);
            System.out.println(namnet);

            if (helaNamnet.equals(namnet)) {
                taBort.setVisible(true);
                redigera.setVisible(true);
            } else {
                setOsynlig();
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }

    }

    public void setProjektBloggen(projektBloggen projektBloggen) {
        blogg = projektBloggen;
    }

    public void setUtbildningBloggen(UtbildningProjektFlode utbildningBlogg) {
        utbildningBloggen = utbildningBlogg;
    }

    public void setFormellaBloggen(FormellaBlogg formellBlogg) {
        formellaBloggen = formellBlogg;

    }

    public void setInFormellaBloggen(InformellaBlogg informellBlogg) {
        informellaBloggen = informellBlogg;

    }
    private void redigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraActionPerformed
        spara.setVisible(true);
        txtTitel.setEditable(true);
        txtInlagg.setEditable(true);


    }//GEN-LAST:event_redigeraActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        try {
            String nyText = txtInlagg.getText();
            System.out.println(nyText);
            String nyTitel = txtTitel.getText();
            System.out.println(nyTitel);

            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());
            System.out.println(ID);

            String fraga5 = "UPDATE INLAGG SET DATUM= '" + date + "', TEXT ='" + nyText + "' , TITEL = '" + nyTitel + "', INLAGG_ID ='" + ID + "' WHERE INLAGG_ID = '" + ID + "'";
            System.out.println(fraga5);
            idb.update(fraga5);
            JOptionPane.showMessageDialog(null, "Inlägg har uppdaterats");
            setEditable();
            spara.setVisible(false);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_sparaActionPerformed

    public void setLabelOsynlig() {
        lblNamn.setVisible(false);
    }

    public String getUserId() {
        return userId;
    }
    private void lblNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNamnActionPerformed
        try {
            String fornamnet = namnet.split(" ")[0];
            String efternamnet = namnet.split(" ")[1];
            String fraga = "SELECT USER_ID FROM USERS WHERE FIRST_NAME = '" + fornamnet + "'AND LAST_NAME = '" + efternamnet + "'";
            String anvandare = idb.fetchSingle(fraga);
            userId = anvandare;
            new Profil().setVisible(true);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_lblNamnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lblNamn;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JButton redigera;
    private javax.swing.JButton spara;
    private javax.swing.JButton taBort;
    private javax.swing.JLabel tagg10;
    private javax.swing.JLabel tagg6;
    private javax.swing.JLabel tagg7;
    private javax.swing.JLabel tagg8;
    private javax.swing.JLabel tagg9;
    private java.awt.TextArea txtInlagg;
    private javax.swing.JTextField txtTitel;
    // End of variables declaration//GEN-END:variables
}
