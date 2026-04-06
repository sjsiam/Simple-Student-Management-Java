/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author siamj
 */
public class RegisterPage extends JFrame {
    
    private Container container;
    
    private JMenuBar menubar;
    private JMenu menu1, menu2;
    
    private JLabel label;
    private Font font;
    private JTextField textField;
    private JPasswordField passField;
    private JTextArea areaField;
    private JRadioButton radioField;
    
    private JComboBox selectField;
    private String[] selectOptions = { "Admin", "User" };
    
    private JButton backButton, regButton, resetButton, exitButton;
    
    RegisterPage(){
        init();
        setVisible(true);
        setBounds(200, 100, 600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Sign-Up Form");
    }
    void init () {
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.GRAY);
        
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        menubar.setBackground(Color.CYAN);
        
        menu1 = new JMenu("File");
        menubar.add(menu1);
        
        font = new Font("Arial", Font.BOLD, 14);
        
        label = new JLabel();
        label.setText("ID :");
        label.setBounds(20, 20, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        textField = new JTextField();
        textField.setBounds(150, 20, 150, 20);
        container.add(textField);
        
        label = new JLabel();
        label.setText("First Name :");
        label.setBounds(20, 60, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        textField = new JTextField();
        textField.setBounds(150, 60, 150, 20);
        container.add(textField);
        
        label = new JLabel();
        label.setText("Last Name :");
        label.setBounds(20, 100, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        textField = new JTextField();
        textField.setBounds(150, 100, 150, 20);
        container.add(textField);
        
        label = new JLabel();
        label.setText("UserName :");
        label.setBounds(20, 140, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        textField = new JTextField();
        textField.setBounds(150, 140, 150, 20);
        container.add(textField);
        
        label = new JLabel();
        label.setText("Password :");
        label.setBounds(20, 180, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        passField = new JPasswordField();
        passField.setBounds(150, 180, 150, 20);
        container.add(passField);
        
        label = new JLabel();
        label.setText("Re-Type Password :");
        label.setBounds(20, 220, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        passField = new JPasswordField();
        passField.setBounds(150, 220, 150, 20);
        container.add(passField);
        
        label = new JLabel();
        label.setText("Contact No :");
        label.setBounds(20, 260, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        textField = new JTextField();
        textField.setBounds(150, 260, 150, 20);
        container.add(textField);
        
        label = new JLabel();
        label.setText("Gender :");
        label.setBounds(20, 300, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        radioField = new JRadioButton("Male");
        radioField.setBounds(150, 300, 100, 20);
        container.add(radioField);
        
        radioField = new JRadioButton("Female");
        radioField.setBounds(250, 300, 100, 20);
        container.add(radioField);
        
        label = new JLabel();
        label.setText("Address :");
        label.setBounds(20, 340, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        areaField = new JTextArea();
        areaField.setBounds(150, 340, 150, 40);
        container.add(areaField);
                
        label = new JLabel();
        label.setText("Select :");
        label.setBounds(20, 420, 100, 20);
        label.setFont(font);
        label.setHorizontalAlignment(JTextField.RIGHT);
        container.add(label);
        
        selectField = new JComboBox(selectOptions);
        selectField.setBounds(20, 460, 100, 20);
        selectField.setFont(font);
        container.add(selectField);
        
        
    }
    public static void main(String[] args) {
        RegisterPage view = new RegisterPage();
    }
    
}
