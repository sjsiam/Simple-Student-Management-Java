/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author siamj
 */
public class Dashboard extends JFrame {
    
    private JLabel title;
    
    public Dashboard(String user, String role) {

        setTitle("Admin Panel");
        if(role.equals("admin")){
            setTitle("Admin Panel");
        }else if(role.equals("user")){
            setTitle("Admin Panel");
        }
        setBounds(200,100,400,200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new JLabel("Welcome " + user + " (" + role + ")");
        title.setBounds(80,60,300,30);
        title.setFont(new Font("Arial",Font.BOLD,18));
        add(title);

        setVisible(true);
    }
    
}
