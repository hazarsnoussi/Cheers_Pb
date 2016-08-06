/*
 * DrawPanel class is a JPanel designed to draw the 2 disks and visualize 
 * the overlap ellipse generated
 */
package cheers_pb;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mathematical_Functions.OverlapDistance;

/**
 *
 * @author TeamD
 */
public class DrawPanel extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates DrawPanel
     */
    public DrawPanel() {
        initComponents();
    }
                      
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label5 = new java.awt.Label();
        label4 = new java.awt.Label();

        setName(""); // NOI18N

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); 
        label1.setForeground(new java.awt.Color(255, 0, 0));
        label1.setText("Coaster A,");

        label2.setFont(new java.awt.Font("Dialog", 1, 14));
        label2.setForeground(new java.awt.Color(0, 0, 255));
        label2.setText("Coaster B");

        label3.setFont(new java.awt.Font("Dialog", 1, 14));
        label3.setForeground(new java.awt.Color(127, 0, 127));
        label3.setText("& Overlap distance");

        textField1.setEditable(false);
        textField1.setText(Integer.toString((int)Math.round(Double.parseDouble(MainJFrame.textField1.getText()))));

        label5.setFont(new java.awt.Font("Dialog", 1, 14)); 
        label5.setText("Radius  =");

        label4.setFont(new java.awt.Font("Dialog", 3, 12)); 
        label4.setText("N.B. Radius in decimals is rounded to the nearest integer value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }                       

    
    
    public void drawFrame(Graphics g, int frameNumber, int width, int height) {
	//int radius;       
	int centerX=0;     // The x-coord of the center of a disk.
	int centerY=0;     // The y-coord of the center of a disk.
     
        int radius = (int)Math.round(Double.parseDouble(MainJFrame.textField1.getText()));
       
        OverlapDistance dis = new OverlapDistance(); 
        int overlapDistance = (int)Math.round(Double.parseDouble(dis.getOverlapDistance(radius,2,1.0E-6)));
        //dis.getOverlapDistance(radius, 2, 1.0E-6);
	//AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,.8f);
        // g.setComposite(ac);
        int alpha = 20;
        
       // drawOval takes in charge only integer radius
       //the visualization of a radius < 1.5 will not show 2 overlapping disks
       // Following is an adjustement of the coordinates of the 1 st disk
        if ((radius >= 0) && (radius <= 5)){
        centerX =(int)(width/3);
        centerY =(int)(height/3);
        }
        else if ((radius >  5)&& (radius <= 12)){
                centerX = (int)(width/(alpha/5));
                centerY = (int)(height/(alpha/5));
             }else if ((radius > 12)&&(radius <= 17)){
                       centerX = (int)(width/(alpha/2));
                       centerY = (int)(height/(alpha/5));
                    }else if((radius <= 20 )&& (radius > 17)){
                              centerX = (int)(width/(7.5*alpha));
                              centerY = (int)(height/(alpha/5));
                            }
       
        //1ST DISK
        Color mycolour = new Color(255,0,0,127);
        g.setColor(mycolour); 
	g.fillOval( centerX, centerY, alpha*radius, alpha*radius );
        g.setColor(Color.BLACK);
        g.drawOval( centerX, centerY, alpha*radius, alpha*radius);
        //2ND DISK
        mycolour=new Color(0,0,255,127); 
        g.setColor(mycolour);
	g.fillOval(centerX + alpha*overlapDistance, centerY, alpha*radius, alpha*radius);
	g.setColor(Color.BLACK);
	g.drawOval(centerX + alpha*overlapDistance, centerY, alpha*radius, alpha*radius);          
	}
	    
    private int frameNum;
 
    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }


    // Variables declaration                    
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField textField1;                   
}
