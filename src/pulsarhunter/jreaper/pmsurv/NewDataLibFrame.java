/*
Copyright (C) 2005-2007 Michael Keith, University Of Manchester
 
email: mkeith@pulsarastronomy.net
www  : www.pulsarastronomy.net/wiki/Software/PulsarHunter
 
This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.
 
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
 
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 
 */
/*
 * NewDataLibFrame.java
 *
 * Created on 28 May 2005, 12:21
 */

package pulsarhunter.jreaper.pmsurv;

import java.io.File;
import java.net.URL;
import javax.swing.JFileChooser;
import pulsarhunter.jreaper.JReaper;
import pulsarhunter.jreaper.Main;

/**
 *
 * @author  mkeith
 */
public class NewDataLibFrame extends javax.swing.JFrame {
    JReaper jreaper;
    /** Creates new form NewDataLibFrame */
    public NewDataLibFrame(JReaper jreaper) {
        initComponents();
        this.jreaper = jreaper;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jPanel1 = new javax.swing.JPanel();
        advLab1 = new javax.swing.JLabel();
        fileField = new javax.swing.JTextField();
        advLab2 = new javax.swing.JLabel();
        rootPathField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        webRootField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        webURLField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        resultsField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dmindexfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        advLab1.setText("File");
        jPanel1.add(advLab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(fileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 160, -1));

        advLab2.setText("Root Path");
        jPanel1.add(advLab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanel1.add(rootPathField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 160, -1));

        jLabel1.setText("Website Root");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        webRootField.setText("~/public_html/");
        jPanel1.add(webRootField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, -1));

        jLabel2.setText("Website URL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        webURLField.setText("http://");
        jPanel1.add(webURLField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 160, -1));

        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jButton2.setText("Browse...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jButton3.setText("Browse...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jButton4.setText("Create");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, 50));

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 130, 50));

        jLabel3.setText("Results Root");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jPanel1.add(resultsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 160, -1));

        jLabel4.setText("DM Index File");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jPanel1.add(dmindexfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-431)/2, (screenSize.height-344)/2, 431, 344);
    }//GEN-END:initComponents
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fileChooser = new JFileChooser(new File(rootPathField.getText()));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setVisible(true);
        if(fileChooser.showOpenDialog(this) == fileChooser.APPROVE_OPTION){
            rootPathField.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser(new File(fileField.getText()));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setVisible(true);
        if(fileChooser.showSaveDialog(this) == fileChooser.APPROVE_OPTION){
            fileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //(File rootPath, File webRoot,URL webURL,File resultsRoot)
        try{
            PMDataLibrary dLib = new PMDataLibrary(new File(rootPathField.getText()),new File(webRootField.getText()),new URL(webURLField.getText()),new File(resultsField.getText()));
            dLib.setDmindexFile(new File(this.dmindexfield.getText()));
            jreaper.newDataLibrary(dLib,new File(fileField.getText()));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        
        
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser fileChooser = new JFileChooser(new File(webRootField.getText()));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setVisible(true);
        if(fileChooser.showOpenDialog(this) == fileChooser.APPROVE_OPTION){
            webRootField.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advLab1;
    private javax.swing.JLabel advLab2;
    private javax.swing.JTextField dmindexfield;
    private javax.swing.JTextField fileField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resultsField;
    private javax.swing.JTextField rootPathField;
    private javax.swing.JTextField webRootField;
    private javax.swing.JTextField webURLField;
    // End of variables declaration//GEN-END:variables
    
}
