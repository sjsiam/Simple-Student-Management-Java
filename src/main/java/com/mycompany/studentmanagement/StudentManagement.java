/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sjsiam
 */
public class StudentManagement extends JFrame {
    
    private Container container;
    private JLabel labelTitle, labelSelect, labelButton;
    
    private JComboBox selectField;
    private String[] selectOptions = { "Admin", "User" }; 
    
    private JButton loginButton, exitButton, registerButton;
    
    private Font headingFont, textFont;

    StudentManagement() {
        initialization();
        setVisible(true);
        setBounds(200, 100, 600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Student Management System");
    }
    
    public void initialization(){
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.PINK);
        
        headingFont = new Font("Arial", Font.BOLD, 20);
        textFont = new Font("Arial", Font.BOLD, 14);
        
        labelTitle = new JLabel("Student Management System");
        labelTitle.setBounds(0, 30, 600, 30);
        labelTitle.setHorizontalAlignment(JLabel.CENTER);
        labelTitle.setForeground(Color.BLACK);
        labelTitle.setFont(headingFont);
        container.add(labelTitle);
        
        labelSelect = new JLabel("Select Admin/User:");
        labelSelect.setBounds(100, 150, 200, 30);
        labelSelect.setForeground(Color.BLACK);
        labelSelect.setFont(textFont);
        container.add(labelSelect);
        
        selectField = new JComboBox(selectOptions);
        selectField.setBounds(250, 150, 100, 30);
        selectField.setFont(textFont);
        container.add(selectField);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(200, 200, 80, 30);
        container.add(loginButton);
        
        registerButton = new JButton("Register");
        registerButton.setBounds(300, 200, 90, 30);
        container.add(registerButton);
        
        exitButton = new JButton("Exit");
        exitButton.setBounds(410, 200, 60, 30);
        container.add(exitButton);
        
        
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String option = selectField.getSelectedItem().toString();
                
                if (option.equals("Admin")) {
                    dispose();
                    LoginRegPage view = new LoginRegPage("login", "admin");
                    view.setVisible(true);
                } else if (option.equals("User")) {
                    dispose();
                    System.out.println("User2");
                    LoginRegPage view = new LoginRegPage("login", "user");
                    view.setVisible(true);
                }
            }
        });
        
        registerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String option = selectField.getSelectedItem().toString();
                
                if (option.equals("Admin")) {
                    dispose();
                    LoginRegPage view = new LoginRegPage("register", "admin");
                    view.setVisible(true);
                } else if (option.equals("User")) {
                    dispose();
                    LoginRegPage view = new LoginRegPage("register", "user");
                    view.setVisible(true);
                }
            }
        });
        
        
        
        exitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
    }
    
    

    public static void main(String[] args) {
        StudentManagement frame = new StudentManagement();
    }
}
