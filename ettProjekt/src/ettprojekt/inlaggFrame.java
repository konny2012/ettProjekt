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
    public void setSkapare(String namn){
       lblNamn.setText(namn);
       namnet = namn;
    }
    
    public String getSkapare(){
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

        tagg1 = new javax.swing.JLabel();
        tagg2 = new javax.swing.JLabel();
        tagg3 = new javax.swing.JLabel();
        tagg4 = new javax.swing.JLabel();
        tagg5 = new javax.swing.JLabel();
        txtTitel = new javax.swing.JTextField();
        taBort = new javax.swing.JButton();
        redigera = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        txtInlagg = new java.awt.TextArea();
        bild = new javax.swing.JLabel();
        lblNamn = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(698, 358));

        tagg1.setText("Tagg1");

        tagg2.setText("Tagg2");

        tagg3.setText("Tagg3");

        tagg4.setText("Tagg4");

        tagg5.setText("Tagg5");

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

        bild.setText("bild");

        lblNamn.setBackground(new java.awt.Color(51, 255, 255));
        lblNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNamnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tagg1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tagg2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tagg3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tagg4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tagg5)
                        .addGap(187, 187, 187)
                        .addComponent(taBort))
                    .addComponent(txtInlagg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(redigera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spara))
                    .addComponent(bild, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(bild, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taBort)
                            .addComponent(redigera)
                            .addComponent(spara)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tagg1)
                            .addComponent(tagg2)
                            .addComponent(tagg3)
                            .addComponent(tagg4)
                            .addComponent(tagg5))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
           try {
            
           
            String fraga1 = "DELETE FROM INLAGG WHERE INLAGG_ID = '" + ID + "'";

            String fraga2 = "DELETE FROM PROJEKT_INLAGG WHERE INLAGG_ID = '" + ID + "'";
            
            String fraga3 = "DELETE FROM SKAPA_INLAGG WHERE INLAGG_ID = '" + ID + "'";
            System.out.println(fraga3);

            idb.delete(fraga2);
            idb.delete(fraga3);
            idb.delete(fraga1);
            JOptionPane.showMessageDialog(null, "Inlagg har raderats");
            blogg.dispose();
            new projektBloggen().setVisible(true);
            

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }

    }//GEN-LAST:event_taBortActionPerformed
    
    public void agare(){
       try{
       User u = User.getInstance();
       int id = u.getID();
       String fraga = "SELECT AGARE FROM PROJEKT JOIN PROJEKT_IN";
       ArrayList<String> inlagg = idb.fetchColumn(fraga);
       for (int i =0; i < inlagg.size(); i++){
           String inlaggId = inlagg.get(i);
       
       if(ID.equals(inlaggId)){
           taBort.setVisible(true);
           redigera.setVisible(true);
       }
       else{
           setOsynlig();
       }
       }
       }catch(InfException e){
           JOptionPane.showMessageDialog(null, "Något gick fel");
       }
    }
    public void setProjektBloggen(projektBloggen projektBloggen) {
        blogg = projektBloggen;
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
            blogg.revalidate();
            JOptionPane.showMessageDialog(null, "Inlägg har uppdaterats");
            setEditable();
            spara.setVisible(false);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_sparaActionPerformed
    
    public String getUserId(){
        return userId;
    }
    private void lblNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNamnActionPerformed
        try{
        String fornamnet = namnet.split(" ")[0];
        String efternamnet = namnet.split(" ")[1];
        String fraga = "SELECT USER_ID FROM USERS WHERE FIRST_NAME = '" + fornamnet + "'AND LAST_NAME = '" + efternamnet + "'";
        String anvandare = idb.fetchSingle(fraga);
        userId = anvandare; 
        new Profil().setVisible(true);
        
       
        
        }catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_lblNamnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bild;
    private javax.swing.JButton lblNamn;
    private javax.swing.JButton redigera;
    private javax.swing.JButton spara;
    private javax.swing.JButton taBort;
    private javax.swing.JLabel tagg1;
    private javax.swing.JLabel tagg2;
    private javax.swing.JLabel tagg3;
    private javax.swing.JLabel tagg4;
    private javax.swing.JLabel tagg5;
    private java.awt.TextArea txtInlagg;
    private javax.swing.JTextField txtTitel;
    // End of variables declaration//GEN-END:variables
}
