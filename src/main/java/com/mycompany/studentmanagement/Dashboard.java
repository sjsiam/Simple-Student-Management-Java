/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author siamj
 */
public class Dashboard extends JFrame {
    
    private JLabel title;
    private Container container;
    private JMenuBar menubar;
    private JMenu st1, st2, st3;
    private JMenuItem menuitem1, edit, del;
    
    
    public Dashboard(String user, String role) {
        
        init();

        setTitle("Admin Panel");
        if(role.equals("admin")){
            setTitle("Admin Panel");
        }else if(role.equals("user")){
            setTitle("Admin Panel");
        }
        setBounds(200,100,400,200);
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new JLabel("Welcome " + user + " (" + role + ")");
        title.setBounds(80,60,300,30);
        title.setFont(new Font("Arial",Font.BOLD,18));
        container.add(title);

        setVisible(true);
    }
    
    public void init(){
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        menubar.setBackground(Color.red);
        
        st1 = new JMenu("Student Management");
        menubar.add(st1);
        
        
        menuitem1 = new JMenuItem ("Add Student");
        st1.add(menuitem1);
        
        del = new JMenuItem ("Delete Student");
        st1.add(del);
        
        edit = new JMenuItem ("Edit Student");
        st1.add(edit);
        
        st2 = new JMenu("Student Info");
        menubar.add(st2);
        
        st3 = new JMenu("Logout");
        menubar.add(st3);
        
        
    }
    
    public static void main(String[] args) {
        Dashboard view = new Dashboard("Siam", "admin");
    }
    
}
