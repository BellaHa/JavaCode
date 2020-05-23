/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt.applet;

import java.awt.*;
import java.awt.event.*;

class MyDialog extends Dialog
{
	Label lblInfor;
	public MyDialog(Frame owner,String title)
	{		
		super(owner,title,true);
		lblInfor = new Label();
		this.add(lblInfor);
		this.setSize(150,100);
		
		// add window listener for the dialog
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)	
			{
				dispose();
			}
		});
		
	}
	public void setInfor(String infor)
	{
		lblInfor.setText(infor)	;
	}
}
