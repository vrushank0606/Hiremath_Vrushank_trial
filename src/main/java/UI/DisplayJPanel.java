/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Car_Details;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author vrushankhiremath
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    Car_Details car;
    
    public DisplayJPanel(Car_Details car) {
        initComponents();
        this.car=car;
        fetch_data();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblCreateCarProfile = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblEngineNo = new javax.swing.JLabel();
        lblSeatsNumber = new javax.swing.JLabel();
        lblLicensePlates = new javax.swing.JLabel();
        lblOwnerName = new javax.swing.JLabel();
        lblOwnerTelephoneNumber = new javax.swing.JLabel();
        lblOwnerEmailAddress = new javax.swing.JLabel();
        lblOwnerDriverLicense = new javax.swing.JLabel();
        lblOwnerSocialSecurityNumber = new javax.swing.JLabel();
        lblOwnerAddress = new javax.swing.JLabel();
        lblServiceRecords = new javax.swing.JLabel();
        lblWarrantyYear = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtEngineNo = new javax.swing.JTextField();
        txtSeatNumber = new javax.swing.JTextField();
        txtLicensePlates = new javax.swing.JTextField();
        txtOwnerName = new javax.swing.JTextField();
        txtOwnerEmailAddress = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtOwnerDriverLicense = new javax.swing.JTextField();
        txtOwnerTelephoneNumber = new javax.swing.JTextField();
        txtOwnerAddress = new javax.swing.JTextField();
        txtServiceRecords = new javax.swing.JTextField();
        txtOwnerSocialSecurityNumber = new javax.swing.JTextField();
        txtWarrantyYear = new javax.swing.JTextField();
        btnViewPhoto = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        lblCreateCarProfile.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCreateCarProfile.setText(" Car Profile");
        lblCreateCarProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblBrand.setText("Brand:");

        lblModel.setText("Model:");

        lblColor.setText("Color:");

        lblYear.setText("Year:");

        lblEngineNo.setText("Engine No:");

        lblSeatsNumber.setText("Seats Number:");

        lblLicensePlates.setText("License Plates:");

        lblOwnerName.setText("Owner Name:");

        lblOwnerTelephoneNumber.setText("Owner Telephone Number:");

        lblOwnerEmailAddress.setText("Owner Email Address:");

        lblOwnerDriverLicense.setText("Owner Driver License:");

        lblOwnerSocialSecurityNumber.setText("Owner Social Security Number:");

        lblOwnerAddress.setText("Owner Address:");

        lblServiceRecords.setText("Service Records:");

        lblWarrantyYear.setText("Warranty Year:");

        lblPhoto.setText("Photo:");

        txtModel.setEditable(false);
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });
        txtModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModelKeyPressed(evt);
            }
        });

        txtBrand.setEditable(false);
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });
        txtBrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBrandKeyPressed(evt);
            }
        });

        txtEngineNo.setEditable(false);
        txtEngineNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEngineNoActionPerformed(evt);
            }
        });
        txtEngineNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEngineNoKeyPressed(evt);
            }
        });

        txtSeatNumber.setEditable(false);
        txtSeatNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatNumberActionPerformed(evt);
            }
        });
        txtSeatNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeatNumberKeyPressed(evt);
            }
        });

        txtLicensePlates.setEditable(false);
        txtLicensePlates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicensePlatesActionPerformed(evt);
            }
        });
        txtLicensePlates.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLicensePlatesKeyPressed(evt);
            }
        });

        txtOwnerName.setEditable(false);
        txtOwnerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerNameActionPerformed(evt);
            }
        });
        txtOwnerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOwnerNameKeyPressed(evt);
            }
        });

        txtOwnerEmailAddress.setEditable(false);
        txtOwnerEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerEmailAddressActionPerformed(evt);
            }
        });
        txtOwnerEmailAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOwnerEmailAddressKeyPressed(evt);
            }
        });

        txtYear.setEditable(false);
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });
        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYearKeyPressed(evt);
            }
        });

        txtColor.setEditable(false);
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtColorKeyPressed(evt);
            }
        });

        txtOwnerDriverLicense.setEditable(false);
        txtOwnerDriverLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerDriverLicenseActionPerformed(evt);
            }
        });
        txtOwnerDriverLicense.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOwnerDriverLicenseKeyPressed(evt);
            }
        });

        txtOwnerTelephoneNumber.setEditable(false);
        txtOwnerTelephoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerTelephoneNumberActionPerformed(evt);
            }
        });
        txtOwnerTelephoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOwnerTelephoneNumberKeyPressed(evt);
            }
        });

        txtOwnerAddress.setEditable(false);
        txtOwnerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerAddressActionPerformed(evt);
            }
        });
        txtOwnerAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOwnerAddressKeyPressed(evt);
            }
        });

        txtServiceRecords.setEditable(false);
        txtServiceRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceRecordsActionPerformed(evt);
            }
        });
        txtServiceRecords.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtServiceRecordsKeyPressed(evt);
            }
        });

        txtOwnerSocialSecurityNumber.setEditable(false);
        txtOwnerSocialSecurityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerSocialSecurityNumberActionPerformed(evt);
            }
        });
        txtOwnerSocialSecurityNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOwnerSocialSecurityNumberKeyPressed(evt);
            }
        });

        txtWarrantyYear.setEditable(false);
        txtWarrantyYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarrantyYearActionPerformed(evt);
            }
        });
        txtWarrantyYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWarrantyYearKeyPressed(evt);
            }
        });

        btnViewPhoto.setText("View Photo");
        btnViewPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(lblCreateCarProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOwnerTelephoneNumber)
                    .addComponent(lblOwnerEmailAddress)
                    .addComponent(lblOwnerDriverLicense)
                    .addComponent(lblOwnerSocialSecurityNumber)
                    .addComponent(lblOwnerAddress)
                    .addComponent(lblServiceRecords)
                    .addComponent(lblWarrantyYear)
                    .addComponent(lblPhoto)
                    .addComponent(lblOwnerName)
                    .addComponent(lblLicensePlates)
                    .addComponent(lblSeatsNumber)
                    .addComponent(lblEngineNo)
                    .addComponent(lblYear)
                    .addComponent(lblColor)
                    .addComponent(lblModel)
                    .addComponent(lblBrand))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtServiceRecords)
                    .addComponent(txtOwnerAddress)
                    .addComponent(txtOwnerDriverLicense)
                    .addComponent(txtOwnerEmailAddress)
                    .addComponent(txtModel)
                    .addComponent(txtEngineNo)
                    .addComponent(txtBrand)
                    .addComponent(txtSeatNumber)
                    .addComponent(txtLicensePlates)
                    .addComponent(txtOwnerName)
                    .addComponent(txtYear)
                    .addComponent(txtColor)
                    .addComponent(txtOwnerTelephoneNumber)
                    .addComponent(txtOwnerSocialSecurityNumber)
                    .addComponent(txtWarrantyYear)
                    .addComponent(btnViewPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCreateCarProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModel))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEngineNo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeatsNumber))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLicensePlates, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicensePlates))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerName))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblOwnerTelephoneNumber)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOwnerEmailAddress)
                                    .addComponent(txtOwnerEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOwnerDriverLicense)
                                    .addComponent(txtOwnerDriverLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtOwnerTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblOwnerSocialSecurityNumber)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOwnerAddress)
                                    .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtOwnerSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblServiceRecords)
                            .addComponent(txtServiceRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblWarrantyYear)
                                .addGap(28, 28, 28)
                                .addComponent(lblPhoto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewPhoto)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(56, 56, 56))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtModelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelKeyPressed
        // TODO add your handling code here:

        //code to accept only Alphabets

        // TO DO add your handling code here:

        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            txtModel.setEditable(false);
            //lblNameVali.setText("Please enter letters only!");
        }
        else
        {
            txtModel.setEditable(true);
            //   lblNameVali.setText(""); // To disable the warnings once user feed correct character
        }
    }//GEN-LAST:event_txtModelKeyPressed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtBrandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandKeyPressed

    private void txtEngineNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEngineNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEngineNoActionPerformed

    private void txtEngineNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEngineNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEngineNoKeyPressed

    private void txtSeatNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatNumberActionPerformed

    private void txtSeatNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatNumberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatNumberKeyPressed

    private void txtLicensePlatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicensePlatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicensePlatesActionPerformed

    private void txtLicensePlatesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLicensePlatesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicensePlatesKeyPressed

    private void txtOwnerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerNameActionPerformed

    private void txtOwnerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerNameKeyPressed

    private void txtOwnerEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerEmailAddressActionPerformed

    private void txtOwnerEmailAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerEmailAddressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerEmailAddressKeyPressed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearKeyPressed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtColorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorKeyPressed

    private void txtOwnerDriverLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerDriverLicenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerDriverLicenseActionPerformed

    private void txtOwnerDriverLicenseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerDriverLicenseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerDriverLicenseKeyPressed

    private void txtOwnerTelephoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerTelephoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerTelephoneNumberActionPerformed

    private void txtOwnerTelephoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerTelephoneNumberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerTelephoneNumberKeyPressed

    private void txtOwnerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerAddressActionPerformed

    private void txtOwnerAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerAddressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerAddressKeyPressed

    private void txtServiceRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceRecordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServiceRecordsActionPerformed

    private void txtServiceRecordsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServiceRecordsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServiceRecordsKeyPressed

    private void txtOwnerSocialSecurityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerSocialSecurityNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerSocialSecurityNumberActionPerformed

    private void txtOwnerSocialSecurityNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerSocialSecurityNumberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerSocialSecurityNumberKeyPressed

    private void txtWarrantyYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarrantyYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarrantyYearActionPerformed

    private void txtWarrantyYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWarrantyYearKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtWarrantyYearKeyPressed

    private void btnViewPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPhotoActionPerformed
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(car.getPhoto());
        Image iconfit = icon.getImage();
        Image imgfit = iconfit.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
           
        label.setIcon(icon);
    }//GEN-LAST:event_btnViewPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewPhoto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblCreateCarProfile;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblLicensePlates;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblOwnerAddress;
    private javax.swing.JLabel lblOwnerDriverLicense;
    private javax.swing.JLabel lblOwnerEmailAddress;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerSocialSecurityNumber;
    private javax.swing.JLabel lblOwnerTelephoneNumber;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSeatsNumber;
    private javax.swing.JLabel lblServiceRecords;
    private javax.swing.JLabel lblWarrantyYear;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtLicensePlates;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtOwnerAddress;
    private javax.swing.JTextField txtOwnerDriverLicense;
    private javax.swing.JTextField txtOwnerEmailAddress;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerSocialSecurityNumber;
    private javax.swing.JTextField txtOwnerTelephoneNumber;
    private javax.swing.JTextField txtSeatNumber;
    private javax.swing.JTextField txtServiceRecords;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    
    private void fetch_data(){
        
        txtBrand.setText(car.getBrand());
        txtColor.setText(car.getColor());
        txtEngineNo.setText(car.getEngine_No());
        txtLicensePlates.setText(car.getLicense_plates());
        txtModel.setText(car.getModel());
        txtOwnerAddress.setText(car.getOwner_address());
        txtOwnerDriverLicense.setText(car.getOwner_Driver_license());
        txtOwnerEmailAddress.setText(car.getOwner_Email_address());
        txtOwnerName.setText(car.getOwner_Name());
        txtOwnerSocialSecurityNumber.setText(car.getOwner_Social_Security_number());
        txtOwnerTelephoneNumber.setText(car.getOwner_Telephone_number());
        txtSeatNumber.setText(car.getSeat_Number());
        txtServiceRecords.setText(car.getService_records());
        txtWarrantyYear.setText(car.getWarranty_Year());
        txtYear.setText(car.getYear());
        
        
        
    }





}
