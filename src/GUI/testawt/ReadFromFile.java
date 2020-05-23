/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;

/**
 *
 * @author MyPC
 */
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ReadFromFile {

JPanel panel;
JFrame jf;
JLabel label1,label2;
JButton Browse;
JTextField textfield1,textfield2,textfield3;
JPasswordField passwordfield;
JTextArea textArea1;
public ReadFromFile() {
initComponents();
handlingEvents();
}

public void initComponents() {
jf=new javax.swing.JFrame();
jf.setTitle("Đọc File Txt");
jf.setLayout(null);
jf.setSize(800,500);
jf.show();
jf.setVisible(true);

JScrollPane scrollBar=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
jf.add(scrollBar);
label1=new javax.swing.JLabel("Chọn File");
label1.setFont(new Font("Times New Roman", Font.BOLD, 24));
label1.setBounds(50,80,200,40);
jf.add(label1);
textfield1=new javax.swing.JTextField();
textfield1.setFont(new Font("Times New Roman", Font.BOLD, 18));
textfield1.setBounds(250,80,200,30);
jf.add(textfield1);

textArea1=new javax.swing.JTextArea();
textArea1.setFont(new Font("Times New Roman", Font.BOLD, 18));
textArea1.setLineWrap(true);
textArea1.setWrapStyleWord(true);
JScrollPane scrollBar1=new JScrollPane(textArea1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
scrollBar1.setBounds(250,120,200,300);
jf.add(scrollBar1);
Browse=new javax.swing.JButton("Browse");
Browse.setFont(new Font("Times New Roman", Font.BOLD, 24));
Browse.setBounds(480,80,140,30);
jf.add(Browse);
}
public void handlingEvents() {
Browse.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent event) {
JFileChooser fc = new JFileChooser();
fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
String inputFile=fc.getSelectedFile().getPath();
String filename=fc.getSelectedFile().getName();
textfield1.setText(inputFile);

String s="";
String st="";
try {
FileReader f = new FileReader(inputFile);
BufferedReader br = new BufferedReader(f);
while((st = br.readLine()) != null) {
s = s + st;

}
f.close();
textArea1.setText(s);
}
catch (IOException e) {
System.out.println(e);
}
}
}
});
}

public static void main(String args[]) {
ReadFromFile rf = new ReadFromFile();
}

}
