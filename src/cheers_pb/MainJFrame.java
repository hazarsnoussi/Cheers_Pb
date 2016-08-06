/*
 * This class is a frame that computes the overlap distance between  2 coasters
 * in conformity to CHEERS requirements.
 * It integrates also a visualization of the 2 overlapping coasters.
 */
package cheers_pb;

import mathematical_Functions.OverlapDistance;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author TeamD
 */
public class MainJFrame extends javax.swing.JFrame {
  
    /**
 *
 * @authors TeamD
 */



    public MainJFrame() {
        initComponents();
    }

                        
    private void initComponents() {

        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label1 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        button1 = new java.awt.Button();
        label7 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        label8 = new java.awt.Label();
        textField3 = new java.awt.TextField();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        button3 = new java.awt.Button();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("An approximation of CHEERS problem");
        setFont(new java.awt.Font("Calibri", 1, 12)); 
        setLocation(new java.awt.Point(250,250));

        label2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        label2.setText("         The CHEERS project aims to approximate  the distance from which two ");

        label3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        label3.setText("identical coasters need to be moved on top of each other such that the area");

        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); 
        label1.setText("of the overlapping region is half the area of any one of the coasters.");

        label4.setFont(new java.awt.Font("Algerian", 1, 14));
        label4.setText("Cheers");

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); 
        label5.setText("Radius of the coster in cm : ");
        

        button1.setFont(new java.awt.Font("Dialog", 1, 12)); 
        button1.setLabel("Compute");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Dialog", 1, 12)); 
        label7.setText("Approximation of the angle in Radians :");

        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Dialog", 1, 12)); 
        label8.setText("Approximation of the overlap distance : ");

        label9.setFont(new java.awt.Font("Dialog", 2, 12)); 
        label9.setText("N.B.Approximation based on a tolerence error equals to 1.0E-7.");

        label10.setFont(new java.awt.Font("Dialog", 2, 12)); 
        label10.setText("Radius should be between 1 and 20");

        button3.setFont(new java.awt.Font("Dialog", 1, 12)); 
        button3.setLabel("Visualize");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        label9.getAccessibleContext().setAccessibleName("f1");

        pack();
    }                      

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }                                          

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double epsilon=1.0E-6;
        double root=2.0d;
        
        OverlapDistance dis=new OverlapDistance(); 
        double radius=-1;
         
        try{
            radius=Double.parseDouble(textField1.getText()); 
        }
        catch(NumberFormatException e){
            label10.setForeground(new java.awt.Color(255, 0, 51));
            textField2.setText("0");
            textField3.setText("0");
            textField2.setEditable(false);
            textField3.setEditable(false);
        }
        finally{
            if ((radius>0)&&(radius<=20)){
            textField2.setText(dis.getFixedPointRadians(root,epsilon));
            textField3.setText(dis.getOverlapDistance(radius,root, epsilon));
            textField2.setEditable(false);
            textField3.setEditable(false);
            label10.setForeground(new java.awt.Color(0, 0, 0));
            }
            else{
            label10.setForeground(new java.awt.Color(255, 0, 51));
            textField2.setText("0");
            textField3.setText("0");
            textField2.setEditable(false);
            textField3.setEditable(false);
            }  
        }
    }                                       

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {    
    double radius=-1;   
        try{
            radius = Double.parseDouble(textField1.getText()); 
        }
        catch(NumberFormatException e){
            label10.setForeground(new java.awt.Color(255, 0, 51));
            textField2.setText("0");
            textField3.setText("0");
            textField2.setEditable(false);
            textField3.setEditable(false);
        }
          
        finally{
        if((radius>0)&&(radius<=20)){
        JFrame window = new JFrame("CHEERS Visualizatiion");
        DrawPanel drawingArea = new DrawPanel();
        drawingArea.setBackground(Color.white);
        window.setContentPane(drawingArea);
       
        drawingArea.setPreferredSize(new Dimension(660,660));
        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
        }
        }   
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame mainFrame =  new MainJFrame();
                       mainFrame.setVisible(true);
                
            }
        });
    }

    // Variables declaration                     
    private java.awt.Button button1;
    private java.awt.Button button3;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    public static java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
                    
}  