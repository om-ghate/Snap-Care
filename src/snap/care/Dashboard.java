/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snap.care;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahmans
 */
public class Dashboard extends javax.swing.JFrame {

    static boolean maximized = true;
    int xMouse;
    int yMouse;
    
    public Dashboard() {
        initComponents();
        
        user_pic.setBackground(new java.awt.Color(0,0,0,1));
        
        
    }
    
    public Dashboard(String name) {
        initComponents();
        
        jlabel_uname.setText(name);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMaximize = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        user_pic = new javax.swing.JLabel();
        jlabel_uname = new javax.swing.JLabel();
        btn_consultnow = new javax.swing.JButton();
        lblTimeline = new javax.swing.JLabel();
        btn_workwithus = new javax.swing.JButton();
        lblNews = new javax.swing.JLabel();
        btnabout_us = new javax.swing.JButton();
        lblTrending = new javax.swing.JLabel();
        btnyourqueries = new javax.swing.JButton();
        lblQA = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        jspTimeline = new javax.swing.JScrollPane();
        pnlTimeline = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        consult_btn = new javax.swing.JLabel();
        pnlWork_with_us = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        query_submit1 = new javax.swing.JButton();
        pnlabout_us = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pnlYour_queries = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        query_username = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        query_email = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        query_query = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        query_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cube UI");
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 600));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeader.setForeground(new java.awt.Color(255, 255, 255));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Exit.png"))); // NOI18N
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusable(false);
        btnExit.setOpaque(true);
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Exit (2).png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnMaximize.setBackground(new java.awt.Color(255, 255, 255));
        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Maximize.png"))); // NOI18N
        btnMaximize.setContentAreaFilled(false);
        btnMaximize.setFocusable(false);
        btnMaximize.setOpaque(true);
        btnMaximize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Maximize (2).png"))); // NOI18N
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseExited(evt);
            }
        });
        btnMaximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizeActionPerformed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Minimize.png"))); // NOI18N
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setFocusable(false);
        btnMinimize.setOpaque(true);
        btnMinimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Minimize (2).png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnExit))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnMaximize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));

        user_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/male user.png"))); // NOI18N

        jlabel_uname.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        jlabel_uname.setForeground(new java.awt.Color(44, 62, 80));
        jlabel_uname.setText("Welcome User!");

        btn_consultnow.setBackground(new java.awt.Color(255, 255, 255));
        btn_consultnow.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btn_consultnow.setForeground(new java.awt.Color(44, 62, 80));
        btn_consultnow.setText("Consult Now");
        btn_consultnow.setContentAreaFilled(false);
        btn_consultnow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consultnow.setFocusable(false);
        btn_consultnow.setOpaque(true);
        btn_consultnow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultnowActionPerformed(evt);
            }
        });

        lblTimeline.setBackground(new java.awt.Color(204, 41, 54));
        lblTimeline.setOpaque(true);

        btn_workwithus.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btn_workwithus.setForeground(new java.awt.Color(44, 62, 80));
        btn_workwithus.setText("Work With Us");
        btn_workwithus.setContentAreaFilled(false);
        btn_workwithus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_workwithus.setFocusable(false);
        btn_workwithus.setPreferredSize(new java.awt.Dimension(100, 27));
        btn_workwithus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_workwithusActionPerformed(evt);
            }
        });

        lblNews.setBackground(new java.awt.Color(255, 255, 255));
        lblNews.setOpaque(true);

        btnabout_us.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnabout_us.setForeground(new java.awt.Color(44, 62, 80));
        btnabout_us.setText("About us");
        btnabout_us.setContentAreaFilled(false);
        btnabout_us.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnabout_us.setFocusable(false);
        btnabout_us.setPreferredSize(new java.awt.Dimension(100, 27));
        btnabout_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabout_usActionPerformed(evt);
            }
        });

        lblTrending.setBackground(new java.awt.Color(255, 255, 255));
        lblTrending.setOpaque(true);
        lblTrending.setPreferredSize(new java.awt.Dimension(100, 0));

        btnyourqueries.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btnyourqueries.setForeground(new java.awt.Color(44, 62, 80));
        btnyourqueries.setText("Your Queries");
        btnyourqueries.setContentAreaFilled(false);
        btnyourqueries.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnyourqueries.setFocusable(false);
        btnyourqueries.setPreferredSize(new java.awt.Dimension(100, 27));
        btnyourqueries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyourqueriesActionPerformed(evt);
            }
        });

        lblQA.setBackground(new java.awt.Color(255, 255, 255));
        lblQA.setOpaque(true);
        lblQA.setPreferredSize(new java.awt.Dimension(100, 0));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(127, 140, 141));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("You are logged in ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(52, 152, 219));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Logout ?");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_consultnow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_workwithus, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(lblNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnabout_us, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTrending, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnyourqueries, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(lblQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(225, Short.MAX_VALUE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(user_pic)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18))
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlabel_uname)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultnow)
                    .addComponent(btn_workwithus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnabout_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNews, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jlabel_uname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnyourqueries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrending, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlBody.setLayout(new java.awt.CardLayout());

        jspTimeline.setBorder(null);
        jspTimeline.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlTimeline.setBackground(new java.awt.Color(245, 245, 245));

        jLabel20.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(44, 62, 80));
        jLabel20.setText("Consult Now!");

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setBackground(new java.awt.Color(245, 245, 245));
        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("<html>We Are Now Open! Our service will help you locate the nearest hospital/clinic in your locality, also we'll suggest you some home remedies based on the issues you are facing (only if possible) also we'll provide you the contact info of the doctors availabe for<br>consulting through a audio call!</html>");
        jLabel1.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consut now strip 843.png"))); // NOI18N

        consult_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consult now button non hover.png"))); // NOI18N
        consult_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consult_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consult_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consult_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(consult_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(consult_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlTimelineLayout = new javax.swing.GroupLayout(pnlTimeline);
        pnlTimeline.setLayout(pnlTimelineLayout);
        pnlTimelineLayout.setHorizontalGroup(
            pnlTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimelineLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTimelineLayout.setVerticalGroup(
            pnlTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimelineLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jspTimeline.setViewportView(pnlTimeline);

        pnlBody.add(jspTimeline, "card2");

        pnlWork_with_us.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(44, 62, 80));
        jLabel18.setText("Work With US!");
        pnlWork_with_us.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 30));
        pnlWork_with_us.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 870, 10));

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("<html><p>If you have 3 quarters, 4 dimes, and 4 pennies, you have $1.19. You also have the largest amount of money in coins without being able to make change for a dollar. The numbers '172' can be found on the back of the U.S. $5 dollar bill in the bushes at the base of the Lincoln Memorial.  President Kennedy was the fastest random speaker in the world with upwards of 350 words per minute.  In the average lifetime, a person will walk the equivalent of 5 times around the equator.  Odontophobia is the fear of teeth.  The 57 on Heinz ketchup bottles represents the number of varieties of pickles the company once had.  In the early days of the telephone, operators would pick up a call and use the phrase, \"Well, are you there?\". It wasn't until 1895 that someone suggested answering the phone with the phrase \"number please?\"</p></html>");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlWork_with_us.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 96, 870, 163));

        query_submit1.setBackground(new java.awt.Color(204, 41, 54));
        query_submit1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        query_submit1.setForeground(new java.awt.Color(255, 255, 255));
        query_submit1.setText("Submit Your Application!");
        query_submit1.setBorderPainted(false);
        query_submit1.setContentAreaFilled(false);
        query_submit1.setOpaque(true);
        query_submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                query_submit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                query_submit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                query_submit1MouseExited(evt);
            }
        });
        query_submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                query_submit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(query_submit1)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(query_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlWork_with_us.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 400, -1));

        pnlBody.add(pnlWork_with_us, "card4");

        jLabel19.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(44, 62, 80));
        jLabel19.setText("About us!");

        javax.swing.GroupLayout pnlabout_usLayout = new javax.swing.GroupLayout(pnlabout_us);
        pnlabout_us.setLayout(pnlabout_usLayout);
        pnlabout_usLayout.setHorizontalGroup(
            pnlabout_usLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlabout_usLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlabout_usLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pnlabout_usLayout.setVerticalGroup(
            pnlabout_usLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlabout_usLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        pnlBody.add(pnlabout_us, "card4");

        pnlYour_queries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(44, 62, 80));
        jLabel21.setText("Ask your Queries here!");
        pnlYour_queries.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 30));
        pnlYour_queries.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 870, 10));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Username: ");
        pnlYour_queries.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        query_username.setBackground(new java.awt.Color(240, 240, 240));
        query_username.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        query_username.setBorder(null);
        query_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                query_usernameActionPerformed(evt);
            }
        });
        pnlYour_queries.add(query_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 430, 30));
        pnlYour_queries.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 320, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Your query: ");
        pnlYour_queries.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        query_email.setBackground(new java.awt.Color(240, 240, 240));
        query_email.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        query_email.setBorder(null);
        query_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                query_emailActionPerformed(evt);
            }
        });
        pnlYour_queries.add(query_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 430, 30));
        pnlYour_queries.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 320, -1));

        query_query.setColumns(20);
        query_query.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        query_query.setRows(5);
        jScrollPane1.setViewportView(query_query);

        pnlYour_queries.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 320, 110));

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("Email: ");
        pnlYour_queries.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        query_submit.setBackground(new java.awt.Color(204, 41, 54));
        query_submit.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        query_submit.setForeground(new java.awt.Color(255, 255, 255));
        query_submit.setText("Submit");
        query_submit.setBorderPainted(false);
        query_submit.setContentAreaFilled(false);
        query_submit.setOpaque(true);
        query_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                query_submitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                query_submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                query_submitMouseExited(evt);
            }
        });
        query_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                query_submitActionPerformed(evt);
            }
        });
        pnlYour_queries.add(query_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 130, 40));

        pnlBody.add(pnlYour_queries, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(232,17,35));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMaximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseEntered
        btnMaximize.setBackground(new Color(229,229,229));
    }//GEN-LAST:event_btnMaximizeMouseEntered

    private void btnMaximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseExited
        btnMaximize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnMaximizeMouseExited

    private void btnMaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizeActionPerformed
        if(maximized){
            //handle fullscreen - taskbar
            Dashboard.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Dashboard.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_btnMaximizeActionPerformed

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        btnMinimize.setBackground(new Color(229,229,229));
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        btnMinimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        if(maximized){
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xMouse, y - yMouse);
        }
    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void btn_workwithusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_workwithusActionPerformed
        lblNews.setBackground(new Color(204,41,24));
        
        lblTimeline.setBackground(new Color(255,255,255));
        lblTrending.setBackground(new Color(255,255,255));
        lblQA.setBackground(new Color(255,255,255));
        
        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        pnlBody.add(pnlWork_with_us);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btn_workwithusActionPerformed

    private void btnabout_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabout_usActionPerformed
        lblTrending.setBackground(new Color(204,41,54));
        
        lblTimeline.setBackground(new Color(255,255,255));
        lblNews.setBackground(new Color(255,255,255));
        lblQA.setBackground(new Color(255,255,255));
        
        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        pnlBody.add(pnlabout_us);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btnabout_usActionPerformed

    private void btnyourqueriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyourqueriesActionPerformed
        lblQA.setBackground(new Color(204,41,54));
        
        lblTimeline.setBackground(new Color(255,255,255));
        lblNews.setBackground(new Color(255,255,255));
        lblTrending.setBackground(new Color(255,255,255));
        
        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        pnlBody.add(pnlYour_queries);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btnyourqueriesActionPerformed

    private void btn_consultnowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultnowActionPerformed
        lblTimeline.setBackground(new Color(204,41,54));
        
        lblQA.setBackground(new Color(255,255,255));
        lblNews.setBackground(new Color(255,255,255));
        lblTrending.setBackground(new Color(255,255,255));
        
        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        pnlBody.add(jspTimeline);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btn_consultnowActionPerformed

    private void consult_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consult_btnMouseEntered
        consult_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consult now button hover.png")));
    }//GEN-LAST:event_consult_btnMouseEntered

    private void consult_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consult_btnMouseExited
        consult_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consult now button non hover.png")));
    }//GEN-LAST:event_consult_btnMouseExited

    private void query_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_query_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_query_usernameActionPerformed

    private void query_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_query_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_query_emailActionPerformed

    private void query_submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query_submitMouseEntered
        
    }//GEN-LAST:event_query_submitMouseEntered

    private void query_submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query_submitMouseExited
        
    }//GEN-LAST:event_query_submitMouseExited

    private void query_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_query_submitActionPerformed
        String uname = query_username.getText();
        String email = query_email.getText();
        String query = query_query.getText();
        
        PreparedStatement ps;
        ResultSet rs;
        String registerquerryQuery = "INSERT INTO `queries`(`username`, `email`, `query`) VALUES (?,?,?)";
        
        try {
            ps = My_CNX_FOR_QUERIES.getConnection().prepareStatement(registerquerryQuery);
            
            ps.setString(1, uname);
            ps.setString(2, email);
            ps.setString(3, query);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Successfully Submitted Your Query! Wait For The Admins Response!");                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "error! Check your info!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_query_submitActionPerformed

    private void consult_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consult_btnMouseClicked
                main_form form = new main_form();                
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                
    }//GEN-LAST:event_consult_btnMouseClicked

    private void query_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query_submitMouseClicked
        
    }//GEN-LAST:event_query_submitMouseClicked

    private void query_submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query_submit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_query_submit1MouseClicked

    private void query_submit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query_submit1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_query_submit1MouseEntered

    private void query_submit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query_submit1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_query_submit1MouseExited

    private void query_submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_query_submit1ActionPerformed
                RegisterForm form = new RegisterForm();                
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
    }//GEN-LAST:event_query_submit1ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
                Login_form form = new Login_form();                
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMaximize;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btn_consultnow;
    private javax.swing.JButton btn_workwithus;
    private javax.swing.JButton btnabout_us;
    private javax.swing.JButton btnyourqueries;
    private javax.swing.JLabel consult_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlabel_uname;
    private javax.swing.JScrollPane jspTimeline;
    private javax.swing.JLabel lblNews;
    private javax.swing.JLabel lblQA;
    private javax.swing.JLabel lblTimeline;
    private javax.swing.JLabel lblTrending;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTimeline;
    private javax.swing.JPanel pnlWork_with_us;
    private javax.swing.JPanel pnlYour_queries;
    private javax.swing.JPanel pnlabout_us;
    private javax.swing.JTextField query_email;
    private javax.swing.JTextArea query_query;
    private javax.swing.JButton query_submit;
    private javax.swing.JButton query_submit1;
    private javax.swing.JTextField query_username;
    private javax.swing.JLabel user_pic;
    // End of variables declaration//GEN-END:variables
}
