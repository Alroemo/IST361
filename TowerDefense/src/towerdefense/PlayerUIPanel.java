/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

/**
 *
 * @author bci5021
 */
public class PlayerUIPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public PlayerUIPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tower1 = new javax.swing.JLabel();
        Range1 = new javax.swing.JLabel();
        Damage1 = new javax.swing.JLabel();
        Image1 = new javax.swing.JLabel();
        Tower2 = new javax.swing.JLabel();
        Range2 = new javax.swing.JLabel();
        Damage2 = new javax.swing.JLabel();
        Image2 = new javax.swing.JLabel();
        Tower3 = new javax.swing.JLabel();
        Range3 = new javax.swing.JLabel();
        Damage3 = new javax.swing.JLabel();
        Image3 = new javax.swing.JLabel();
        Tower4 = new javax.swing.JLabel();
        Range4 = new javax.swing.JLabel();
        Damage4 = new javax.swing.JLabel();
        Image4 = new javax.swing.JLabel();
        Tower5 = new javax.swing.JLabel();
        Range5 = new javax.swing.JLabel();
        Damage5 = new javax.swing.JLabel();
        Image5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        Difficulty = new javax.swing.JLabel();
        Currency = new javax.swing.JLabel();
        Lives = new javax.swing.JLabel();
        Wave = new javax.swing.JLabel();

        Tower1.setText("Tower 1");

        Range1.setText("Range:");

        Damage1.setText("Damage:");

        Image1.setText("Image");

        Tower2.setText("Tower 2");

        Range2.setText("Range:");

        Damage2.setText("Damage:");

        Image2.setText("Image");

        Tower3.setText("Tower 3");

        Range3.setText("Range:");

        Damage3.setText("Damage:");

        Image3.setText("Image");

        Tower4.setText("Tower 4");

        Range4.setText("Range:");

        Damage4.setText("Damage:");

        Image4.setText("Image");

        Tower5.setText("Tower 5");

        Range5.setText("Range:");

        Damage5.setText("Damage:");

        Image5.setText("Image");

        jButton1.setText("Next Wave");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Name.setText("Name:");

        Score.setText("Score: ");

        Difficulty.setText("Difficulty: ");

        Currency.setText("Currency: ");

        Lives.setText("Lives:");

        Wave.setText("Wave:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tower1)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Damage1)
                            .addComponent(Range1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tower2)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Damage2)
                            .addComponent(Range2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tower3)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Image3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Damage3)
                            .addComponent(Range3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tower4)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Image4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Damage4)
                            .addComponent(Range4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tower5)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Image5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Damage5)
                            .addComponent(Range5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Score)
                            .addComponent(Name)
                            .addComponent(Difficulty))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Wave)
                            .addComponent(Lives)
                            .addComponent(Currency))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(Lives))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Score)
                    .addComponent(Currency))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Difficulty)
                    .addComponent(Wave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Tower1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Range1)
                                .addGap(6, 6, 6)
                                .addComponent(Damage1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Image1)))
                        .addGap(30, 30, 30)
                        .addComponent(Tower2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Range2)
                                .addGap(6, 6, 6)
                                .addComponent(Damage2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Image2)))
                        .addGap(30, 30, 30)
                        .addComponent(Tower3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Range3)
                                .addGap(6, 6, 6)
                                .addComponent(Damage3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Image3)))
                        .addGap(30, 30, 30)
                        .addComponent(Tower4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Range4)
                                .addGap(6, 6, 6)
                                .addComponent(Damage4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Image4)))
                        .addGap(30, 30, 30)
                        .addComponent(Tower5)
                        .addGap(2, 2, 2)
                        .addComponent(Range5)
                        .addGap(6, 6, 6)
                        .addComponent(Damage5))
                    .addComponent(Image5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Currency;
    private javax.swing.JLabel Damage1;
    private javax.swing.JLabel Damage2;
    private javax.swing.JLabel Damage3;
    private javax.swing.JLabel Damage4;
    private javax.swing.JLabel Damage5;
    private javax.swing.JLabel Difficulty;
    private javax.swing.JLabel Image1;
    private javax.swing.JLabel Image2;
    private javax.swing.JLabel Image3;
    private javax.swing.JLabel Image4;
    private javax.swing.JLabel Image5;
    private javax.swing.JLabel Lives;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Range1;
    private javax.swing.JLabel Range2;
    private javax.swing.JLabel Range3;
    private javax.swing.JLabel Range4;
    private javax.swing.JLabel Range5;
    private javax.swing.JLabel Score;
    private javax.swing.JLabel Tower1;
    private javax.swing.JLabel Tower2;
    private javax.swing.JLabel Tower3;
    private javax.swing.JLabel Tower4;
    private javax.swing.JLabel Tower5;
    private javax.swing.JLabel Wave;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
