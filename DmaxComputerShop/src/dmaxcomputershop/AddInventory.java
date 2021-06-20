package dmaxcomputershop;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.FocusManager;
import javax.swing.JOptionPane;

public class AddInventory extends javax.swing.JFrame {

    DBConnection _dbConn = new DBConnection();
    Connection con = new DBConnection().databaseConn();
    int type;
    // 0=add
    // 1=update

    public AddInventory() {
        initComponents();
        type = 0;
    }

    public AddInventory(String itemid, String itemname, String itemmodel, String itembrand, String storecount, String price) {
        initComponents();
        type = 1;
        jLabel6.setText("Update Inventory Item");
        addInventoryButton.setText("Update");
        id.setText(itemid);
        name.setText(itemname);
        model.setText(itemmodel);
        brand.setText(itembrand);
        unitInStock.setText(storecount);
        unitPrice.setText(price);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        unitPrice = new javax.swing.JTextField();
        unitInStock = new javax.swing.JTextField();
        addInventoryButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Product_ID");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Product_Name");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Product_Model");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Unit_Price");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Unit_in_Stock");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));

        id.setNextFocusableComponent(name);
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });

        name.setNextFocusableComponent(model);
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        model.setNextFocusableComponent(brand);
        model.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modelKeyPressed(evt);
            }
        });

        unitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitPriceActionPerformed(evt);
            }
        });
        unitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unitPriceKeyPressed(evt);
            }
        });

        unitInStock.setNextFocusableComponent(unitPrice);
        unitInStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unitInStockKeyPressed(evt);
            }
        });

        addInventoryButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        addInventoryButton.setForeground(new java.awt.Color(0, 0, 0));
        addInventoryButton.setText("Add");
        addInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInventoryButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Add Inventory Item");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/mini_Button-Close-icon.png"))); // NOI18N
        jLabel7.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel7ComponentAdded(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/mini_Minimize-Window-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Product_Brand");
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 30));

        brand.setNextFocusableComponent(unitInStock);
        brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                brandKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id)
                                    .addComponent(name)
                                    .addComponent(model, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                                    .addComponent(brand)
                                    .addComponent(unitPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                                    .addComponent(unitInStock)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(addInventoryButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitInStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(addInventoryButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitPriceActionPerformed

    private void addInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInventoryButtonActionPerformed
        PreparedStatement pst;
        if (type == 0) {
            addInventoryValidate();
        } else {
            try {
                //create the java mysql update preparedstatement
                String query = "update tableinventry set product_name=?, product_model=?, product_brand=?, unit_in_stock=?, unit_price=? where product_id=?";
                pst = con.prepareStatement(query);
                pst.setString(1, name.getText());
                pst.setString(2, model.getText());
                pst.setString(3, brand.getText());
                pst.setString(4, unitInStock.getText());
                pst.setString(5, unitPrice.getText());
                pst.setString(6, id.getText());
                //execute the java preparedstatement
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Updated");
                dispose();
            } catch (HeadlessException | SQLException e) {
                System.out.println(e.getMessage());
            }

        }

    }//GEN-LAST:event_addInventoryButtonActionPerformed

    private void jLabel7ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel7ComponentAdded
        System.exit(0);
    }//GEN-LAST:event_jLabel7ComponentAdded

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.setExtendedState(AddInventory.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            FocusManager.getCurrentManager().focusNextComponent();
        }

    }//GEN-LAST:event_idKeyPressed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            FocusManager.getCurrentManager().focusNextComponent();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            FocusManager.getCurrentManager().focusPreviousComponent();
        }

    }//GEN-LAST:event_nameKeyPressed

    private void modelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            FocusManager.getCurrentManager().focusNextComponent();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            FocusManager.getCurrentManager().focusPreviousComponent();
        }

    }//GEN-LAST:event_modelKeyPressed

    private void brandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            FocusManager.getCurrentManager().focusNextComponent();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            FocusManager.getCurrentManager().focusPreviousComponent();
        }

    }//GEN-LAST:event_brandKeyPressed

    private void unitInStockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitInStockKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            FocusManager.getCurrentManager().focusNextComponent();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            FocusManager.getCurrentManager().focusPreviousComponent();
        }

    }//GEN-LAST:event_unitInStockKeyPressed

    private void unitPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitPriceKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            FocusManager.getCurrentManager().focusPreviousComponent();
        }
    }//GEN-LAST:event_unitPriceKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new AddInventory().setVisible(true);
        });
    }

    //validation
    String itemid;
    String itemname;
    String itemmodel;
    String itembrand;
    String storecount;
    String price;

    public void addInventoryValidate() {
        itemid = id.getText();
        itemname = name.getText();
        itemmodel = model.getText();
        itembrand = brand.getText();
        storecount = unitInStock.getText();
        price = unitPrice.getText();

        if ("".equals(itemid)) {
            JOptionPane.showMessageDialog(this, "Enter Product ID before continue");
        } else {
            if ("".equals(itemname)) {
                JOptionPane.showMessageDialog(this, "Enter Product Name before continue");
            } else {
                if ("".equals(itemmodel)) {
                    JOptionPane.showMessageDialog(this, "Enter Product Model before continue");
                } else {
                    if ("".equals(itembrand)) {
                        JOptionPane.showMessageDialog(this, "Enter Product Brand before continue");
                    } else {
                        if ("".equals(storecount)) {
                            JOptionPane.showMessageDialog(this, "Enter Units in Stock before continue");
                        } else {
                            if ("".equals(price)) {
                                JOptionPane.showMessageDialog(this, "Enter Unit Price before continue");
                            } else {
                                //Validation Successful
                                passDataToDatabase(itemid, itemname, itemmodel, itembrand, storecount, price);
                                dispose();
                            }
                        }
                    }
                }
            }
        }
    }

    public void passDataToDatabase(String itemid, String itemname, String itemmodel, String itembrand, String storecount, String price) {
        try {
            String query = " insert into tableinventry values (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = _dbConn.databaseConn().prepareStatement(query);
            pst.setString(1, itemid);
            pst.setString(2, itemname);
            pst.setString(3, itemmodel);
            pst.setString(4, itembrand);
            pst.setString(5, storecount);
            pst.setString(6, price);

            pst.execute();
            _dbConn.databaseConn().close();
            JOptionPane.showMessageDialog(AddInventory.this, "Details Uploaded Successfully", "Done", 1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(AddInventory.this, e.getMessage(), "Error", 0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInventoryButton;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField model;
    private javax.swing.JTextField name;
    private javax.swing.JTextField unitInStock;
    private javax.swing.JTextField unitPrice;
    // End of variables declaration//GEN-END:variables
}
