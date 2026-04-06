/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author siamj
 */
public class LoginRegPage extends JFrame {
    
    private Container container;
    private JLabel userLabel, passLabel, labelTitle;
    private Font headingFont, textFont;
    
    private JTextField textField;
    private JPasswordField passwordField;
    
    private JButton backButton, loginButton, resetButton, exitButton;
    
    public LoginRegPage(String type, String role) {
        initialization(type, role);
        
        setVisible(true);
        setBounds(200, 100, 600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle(role + " " + type + " page");
        
    }
    
    public void initialization(String type, String role) {
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.PINK);
        
        headingFont = new Font("Arial", Font.BOLD, 20);
        textFont = new Font("Arial", Font.BOLD, 14);
        
        labelTitle = new JLabel(role + " " + type + " page");
        
        labelTitle.setBounds(0, 30, 600, 30);
        labelTitle.setHorizontalAlignment(JLabel.CENTER);
        labelTitle.setForeground(Color.BLACK);
        labelTitle.setFont(headingFont);
        container.add(labelTitle);
        
        userLabel = new JLabel();
        userLabel.setText("User Name");
        userLabel.setBounds(150, 80, 100, 20);
        userLabel.setFont(textFont);
        userLabel.setForeground(Color.BLACK);
        container.add(userLabel);
        
        textField = new JTextField();
        textField.setBounds(250, 80, 150, 20);
        textField.setFont(textFont);
        container.add(textField);
        
        passLabel = new JLabel();
        passLabel.setText("Password");
        passLabel.setBounds(150, 140, 100, 20);
        passLabel.setFont(textFont);
        passLabel.setForeground(Color.BLACK);
        container.add(passLabel);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(250, 140, 150, 20);
        passwordField.setEchoChar('*');
        passwordField.setFont(textFont);
        container.add(passwordField);
        
        if (type.equals("login")) {
            loginButton = new JButton("Login");
        } else {
            loginButton = new JButton("Register");
        }
        loginButton.setBounds(250, 190, 130, 40);
        container.add(loginButton);
        
        backButton = new JButton("Back");
        backButton.setBounds(150, 250, 70, 24);
        container.add(backButton);
        
        resetButton = new JButton("Clear");
        resetButton.setBounds(250, 250, 70, 24);
        container.add(resetButton);
        
        exitButton = new JButton("Exit");
        exitButton.setBounds(350, 250, 70, 24);
        container.add(exitButton);
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                passwordField.setText("");
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                StudentManagement view = new StudentManagement();
                view.setVisible(true);
            }
        });
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String user = textField.getText();
                String password = passwordField.getText();
                
                if (user.equals("") || password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Some fields are empty");
                } else {
                    
                    if (type.equals("login")) {
                        if (user.equals("Siam") && password.equals("1234")) {
                            
                            if (role.equals("user")) {
                                JOptionPane.showMessageDialog(null, "Login Successfully by User");
                            } else {
                                JOptionPane.showMessageDialog(null, "Login Successfully by Admin");
                            }
                            
                            dispose();
                            Dashboard view = new Dashboard(user, role);
                            view.setVisible(true);
                            
                        } else if (!user.equals("Siam")) {
                            
                            JOptionPane.showMessageDialog(null, "Invalid username !!");
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(null, "Wrong Password !!");
                            
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Registration Succeed! You can now login");
                    }
                }
            }
        });
        
    }
    
    public static void main(String[] args) {
//        LoginRegPage admin = new LoginRegPage();
    }
    
}
