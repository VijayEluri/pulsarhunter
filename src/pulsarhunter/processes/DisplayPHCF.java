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
 * DisplayPHCF.java
 *
 * Created on 25 January 2007, 16:58
 */
package pulsarhunter.processes;

import bookkeepr.xmlable.RawCandidate;
import coordlib.Beam;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import pulsarhunter.PulsarHunterProcess;
import pulsarhunter.datatypes.PulsarHunterCandidate;
import pulsarhunter.displaypanels.PHCFImagePlot;
import pulsarhunter.displaypanels.PHCFPlot;
import pulsarhunter.jreaper.Cand;
import pulsarhunter.jreaper.CandList;
import pulsarhunter.jreaper.Score;
import pulsarhunter.jreaper.Colourmap;
import pulsarhunter.jreaper.peckscorer.PeckScorer;

/**
 *
 * @author  mkeith
 */
public class DisplayPHCF extends javax.swing.JFrame implements PulsarHunterProcess {

    private PulsarHunterCandidate phcf = null;
    private RawCandidate rawc = null;
    private boolean makeImage = false;
    private String outputFileName = null;

    /** Creates new form DisplayPHCF */
    public DisplayPHCF(PulsarHunterCandidate phcf, boolean image) {
        initComponents();
        this.phcf = phcf;
        this.makeImage = image;

    }

    public DisplayPHCF(RawCandidate rawc, boolean image) {
        initComponents();
        this.rawc = rawc;
        this.makeImage = image;

    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }



    public void run() {

        CandList clist = new CandList("", new Cand[][]{new Cand[]{phcf.extractJReaperCand()}}, new Beam("", phcf.getHeader().getCoord()));

        clist.setFch1(phcf.getHeader().getFrequency());
        clist.setBand(phcf.getHeader().getBandwidth());

        Score score = new PeckScorer().score(clist.getCands()[0][0]);

        System.out.println(score.getBreakdown());

        if (this.makeImage) {
            try {

                // test
                BufferedImage img = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
                Graphics g = img.getGraphics();
                g.setColor(new Color(255, 255, 255, 0));
                //   g.drawLine(0,0,100,100);
                g.fillRect(0, 0, img.getWidth(), img.getHeight());

                PHCFImagePlot imgPlot = new PHCFImagePlot(Colourmap.defaultGreyColmap, Color.RED, Color.GREEN);
                imgPlot.draw(phcf, img);

                if(outputFileName == null){
                    outputFileName = phcf.getName() + ".png";
                }

                System.out.println("\nWriting " + outputFileName + "\n");
                ImageIO.write(img, "png", new File(outputFileName));
            // end test
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {


            JPanel plotPanel;

            
                plotPanel = new PHCFPlot(phcf, Colourmap.defaultGreyColmap, Color.RED, Color.GREEN);

            this.add(plotPanel, BorderLayout.CENTER);

            this.validate();
            this.setVisible(true);

        }



    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1024)/2, (screenSize.height-768)/2, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
