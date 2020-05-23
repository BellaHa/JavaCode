/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt.applet;

/**
 *
 * @author MyPC
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class AppletCalculator extends Applet implements ActionListener, ItemListener{
	
	private Label lblNumFirst;
	private Label lblNumSecond;
	private Label lblOperator;
	private Label lblResult;
	
	private TextField txtNumFirst;
	private TextField txtNumSecond;
	private Choice choOperator;
	private TextField txtResult;
	
	private Button btnCal;
	private Button btnReset;
	
	private Panel pnlNumFirst;
	private Panel pnlNumSecond;
	private Panel pnlOperator;
	private Panel pnlResult;
	private Panel pnlButton;
	private int numOperator;
	
	public void init(){
		this.setSize(500, 500);
		lblNumFirst= new Label("Num 1:");
		lblNumSecond= new Label("Num 2:");
		lblOperator= new Label("Operator:");
		lblResult= new Label("Result:");
		
		txtNumFirst= new TextField(12);
		txtNumSecond= new TextField(12);
		choOperator= new Choice();
		txtResult= new TextField(12);
		
		btnCal=   new Button("Calculator");
		btnReset= new Button("  Reset  ");
		
		
		pnlNumFirst = new Panel();
		pnlNumSecond = new Panel();
		pnlOperator = new Panel();
		pnlResult = new Panel();
		pnlButton = new Panel();
		numOperator=0;	
               
	}
	
	
	public void paint(Graphics g){
	//	g.d;
		this.setLayout(new GridLayout(5,1));
		this.add(pnlNumFirst);
		pnlNumFirst.setLayout(new FlowLayout());
		pnlNumFirst.add(lblNumFirst);
		pnlNumFirst.add(txtNumFirst);
		lblNumFirst.setSize(80,23);
		txtNumFirst.setSize(90,23);
		
		this.add(pnlNumSecond);
		pnlNumSecond.setLayout(new FlowLayout());
		pnlNumSecond.add(lblNumSecond);
		pnlNumSecond.add(txtNumSecond);
		lblNumSecond.setSize(80,23);
		txtNumSecond.setSize(90,23);
		
		this.add(pnlOperator);
		pnlOperator.setLayout(new FlowLayout());
		pnlOperator.add(lblOperator);
		pnlOperator.add(choOperator);
		lblOperator.setSize(70,23);
		choOperator.setSize(90,23);
		choOperator.addItem("             +           ");
		choOperator.addItem("             -           ");
		choOperator.addItem("             *           ");
		choOperator.addItem("             /           ");
		choOperator.addItemListener(this);
		this.add(pnlResult);
		pnlResult.setLayout(new FlowLayout());
		pnlResult.add(lblResult);
		pnlResult.add(txtResult);
		lblResult.setSize(80,23);
		txtResult.setSize(90,23);
		
		this.add(pnlButton);
		pnlButton.setLayout(new FlowLayout());
		pnlButton.add(btnCal);
		pnlButton.add(btnReset);
		btnCal.addActionListener(this);
		btnReset.addActionListener(this);
               /*
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)	
			{
				dispose();
			}
		});
            */
	}
	
	public void itemStateChanged(ItemEvent e){
	
		numOperator= choOperator.getSelectedIndex();
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnCal){			
			if(txtNumFirst.getText().equals("")||txtNumFirst.getText().equals("")){
                                Frame f= new Frame();
                                f.add(this);
				MyDialog note = new MyDialog(f, "Nhap so");
				note.setInfor("       Ban phai nhap hai so de thuc hien phep tinh!  ");
				note.setBounds(250,200,300,120);
				note.setVisible(true);
			}
			else{
				double f_num = Double.parseDouble(txtNumFirst.getText());
				double s_num = Double.parseDouble(txtNumSecond.getText());
				String result = "";	
				switch(numOperator)
				{
					case 0:
					result= String.valueOf(f_num + s_num);
					break;
					
					case 1:
					result= String.valueOf(f_num - s_num);
					break;
					
					case 2:
					result= String.valueOf(f_num * s_num);
					break;
					
					case 3:
					result= String.valueOf(f_num / s_num);
					break;
				}
				txtResult.setText(result);
                                Frame f= new Frame();
                                f.add(this);
				MyDialog note = new MyDialog(f, "Ket Qua");
				note.setInfor("        Ket qua la: "+ result);
				note.setBounds(250,200,150,120);
				note.setVisible(true);			
			}
		}
		if(e.getSource() == btnReset){
			txtNumFirst.setText("");
			txtNumSecond.setText("");
			txtResult.setText("");
			
		}
	
	}
}	

