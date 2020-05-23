/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt.applet;

import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.datatransfer.*;
 
public class calculator extends Applet
{
 public void init()
 {
  calf calWindow = new calf("Java Calculator");
  calWindow.setSize(200, 250);
  calWindow.setVisible(true);
  calWindow.setResizable(false);
 }
}
 
class calf extends Frame implements WindowListener, ActionListener, KeyListener
{
  String command, copy, arg, chg, txt;
  double result;
  String number = "123456789.0";
  String operator = "/*-+=";
  CopyPaste cp;
 
  Menu Menu1;
  MenuBar Menubar1;
  MenuItem menuitem1, menuitem2, menuitem3;
  TextField entrytext;
  Button numbut []; //Number buttons
  Button combut []; //Command buttons
  Panel companel, numpanel;
 /*
  public static void main(String[] arguments)
  {
   calf calWindow = new calf("Java Calculator");
   calWindow.setSize(200, 250);
   calWindow.setVisible(true);
  }
 */
  public calf(String title)
  {
   super(title);
   addWindowListener(this);
   addKeyListener(this);
 
   cp = new CopyPaste();
   //cp.clip = getToolkit().getSystemClipboard();
 
   setBackground(Color.blue);
   setLayout(new GridLayout(1, 1));
   Menubar1 = new MenuBar();
   Menu1 = new Menu("Edit");
   menuitem1 = new MenuItem("&Copy");
   Menu1.add(menuitem1);
   menuitem1.addActionListener(this);
   menuitem2 = new MenuItem("&Paste");
   Menu1.add(menuitem2);
   menuitem2.addActionListener(this);
   menuitem3 = new MenuItem("&Exit");
   Menu1.add(menuitem3);
   menuitem3.addActionListener(this);
   Menubar1.add(Menu1);
   setMenuBar(Menubar1);
   GridBagLayout gridbag = new GridBagLayout();
   GridBagConstraints constraints = new GridBagConstraints();
   setLayout(gridbag);
   constraints.weighty = 1;
   constraints.weightx = 1;
   //constraints.fill = GridBagConstraints.BOTH;
   Font bigFont = new Font("Courier",Font.BOLD, 14);
   entrytext = new TextField(20);
   constraints.gridwidth = GridBagConstraints.REMAINDER;
   gridbag.setConstraints(entrytext,constraints);
   add(entrytext);
   entrytext.setFont(bigFont);
   entrytext.setEditable(false);
   entrytext.setForeground(Color.black);
   entrytext.setBackground(Color.white);
   entrytext.addKeyListener(this);
   entrytext.requestFocus();
 
   constraints.weighty = 1;
   constraints.weightx = 1;
   companel = new Panel();
 
   constraints.gridwidth = GridBagConstraints.REMAINDER;
   gridbag.setConstraints(companel,constraints);
   /*
    Command GridLayout
    ---------------------
    | Back |  CE  |  C |
    ---------------------
   */
 
   companel.setLayout(new GridLayout(1,3,5,5));
 
   // Create the buttons
   Font comsFont = new Font("Arial",Font.BOLD, 12);
   String[] coms = { "Back","CE","C"
             };
   combut = new Button[3];
         for (int i=0; i<=2; i++)
      {
       combut[i] = new Button(coms[i]);
       companel.add(combut[i]);
    combut[i].addActionListener(this);
    combut[i].setFont(comsFont);
    combut[i].addKeyListener(this);
 
   }
   add(companel);
   companel.addKeyListener(this);
 
   constraints.weighty = 4;
   constraints.weightx = 1;
   numpanel = new Panel();
   constraints.gridwidth = GridBagConstraints.REMAINDER;
   gridbag.setConstraints(numpanel,constraints);
   /*
    Number GridLayout
    ---------------------
    | 7 | 8 | 9 | / |sqr|
    ---------------------
    | 4 | 5 | 6 | * | % |
    ---------------------
    | 1 | 2 | 3 | - |1/x|
    ---------------------
    | 0 |+/-| . | + | = |
    ---------------------
            */
   numpanel.setLayout(new GridLayout(4,5,3,3));
   // Create the buttons
   String[] nums = { "7","8","9","/","sqrt",
              "4","5","6","*","%",
              "1","2","3","-","1/x",
              "0","+/-",".","+","="
             };
   numbut = new Button[20];
   for (int i=0; i<=19; i++)
       {
       numbut[i] = new Button(nums[i]);
       numpanel.add(numbut[i]);
    numbut[i].addActionListener(this);
    numbut[i].addKeyListener(this);
    if(operator.indexOf(nums[i]) > -1)
    {
     numbut[i].setForeground(Color.red);
    }
    else
    {
     numbut[i].setForeground(Color.blue);
    }
 
   }
   add(numpanel);
   numpanel.addKeyListener(this);
 
   //initialize global variables.
   command = "+";
   copy = "";
   chg = "N";
   txt = "";
   arg = "";
   result = 0;
  }
 
  public void actionPerformed(ActionEvent e)
  {
   if (e.getActionCommand() == "&Exit")
   {
    setVisible(false);
    System.exit(0);
   }
   else if (e.getActionCommand() == "&Copy")
         {
    String txt = entrytext.getText();
    if (txt != null)
          {
              cp.doCopy(txt);
          }
   }
   else if (e.getActionCommand() == "&Paste")
         {
          cp.doPaste();
    if (cp.ctxt != null)
          {
     entrytext.setText(cp.ctxt);
    }
   }
   else if (e.getActionCommand() == "Back") back_space();
   else if (e.getActionCommand() == "CE") entrytext.setText("");
   else if (e.getActionCommand() == "C")
   {
    result = 0;
    command = "+";
    entrytext.setText("");
   }
   else
   {
    arg = e.getActionCommand();
    txt = entrytext.getText();
    if(number.indexOf(arg) > -1)
    {
     if (chg == "Y") txt = "";
     txt = txt + arg;
     entrytext.setText(txt);
     chg = "N";
    }
    else check_entry();
   }
  }
 
  public void keyPressed(KeyEvent k){}
  public void keyReleased(KeyEvent k)
  {
   int ikey = k.getKeyCode();
   if (ikey == 127) entrytext.setText("");
  }
  public void keyTyped(KeyEvent k)
  {
   int ikey = k.getKeyChar();
   if (ikey == 8) back_space();
   else if (ikey == 10)
   {
    arg = "=";
    txt = entrytext.getText();
    display_ans();
   }
   else
   {
    txt = entrytext.getText();
    char ckey = (char) ikey;
    arg = String.valueOf(ckey);
    if(number.indexOf(arg) > -1)
    {
     if (chg == "Y") txt = "";
     txt = txt + arg;
     entrytext.setText(txt);
     chg = "N";
    }
    else check_entry();
   }
  }
 
  public void back_space()
  {
   txt = entrytext.getText();
   int l = txt.length();
   if (l > 0)
   {
    txt = txt.substring(0,l-1);
    entrytext.setText(txt);
   }
  }
  public void display_ans()
  {
   entrytext.setText(compute_tot(txt,command));
   chg = "Y";
   command = "+";
   result = 0;
  }
  public void check_entry()
  {
   if(arg.equals("=")) display_ans();
   else if(arg.equals("%"))
   {
    entrytext.setText(compute_tot(txt,arg));
    chg = "Y";
   }
   else if(operator.indexOf(arg) > -1)
   {
    entrytext.setText(compute_tot(txt,command));
    command = arg;
    chg = "Y";
   }
   else if(arg == "sqrt")
   {
    entrytext.setText(compute_tot(txt,arg));
    chg = "Y";
    command = "";
   }
   else if(arg == "+/-")
   {
    Double tnum = Double.valueOf(txt);
    double num = tnum.doubleValue();
    num = num * -1;
    entrytext.setText(String.valueOf(num));
    chg = "Y";
   }
   else if(arg == "1/x")
   {
    entrytext.setText(compute_tot(txt,arg));
    chg = "Y";
   }
  }
  String compute_tot(String t, String c)
  {
   Double tnum = Double.valueOf(t);
   double num = tnum.doubleValue();
 
   if (c.equals("+")) result = result + num;
   else if (c.equals("-")) result = result - num;
   else if (c.equals("*")) result = result * num;
   else if (c.equals("/")) result = result / num;
   else if (c.equals("%")) result = num / 100;
   else if (c.equals("+/-")) result = num * -1;
   else if (c.equals("1/x")) result = 1.000 / num;
   else if (c.equals("sqrt")) result = Math.sqrt(num);
   return String.valueOf(result);
  }
 
  public void windowClosing(WindowEvent we)
  {
   setVisible(false);
   System.exit(0);
  }
  public void windowClosed(WindowEvent we) {}
  public void windowDeiconified(WindowEvent we) {}
  public void windowIconified(WindowEvent we) {}
  public void windowOpened(WindowEvent we) {}
  public void windowActivated(WindowEvent we) {}
  public void windowDeactivated(WindowEvent we) {}
}
 
 
class CopyPaste implements ClipboardOwner
{
 
    Clipboard clip;
    String ctxt;
 
    CopyPaste()
    {
  clip = new Clipboard("clip");
        ctxt = null;
    }
 
    void doCopy(String txt)
    {
        StringSelection trans = new StringSelection(txt);
        clip.setContents(trans, this);
    }
 
    void doPaste()
    {
  ctxt = null;
        Transferable toPaste = clip.getContents(this);
        if (toPaste != null)
        {
            try
            {
                ctxt = (String)toPaste.getTransferData(
                    DataFlavor.stringFlavor);
            }
            catch (Exception e)
            {
             System.out.println("Error -- " + e.toString());
   }
        }
 
    }
 
    public void lostOwnership(Clipboard clip,
        Transferable contents) {
    }
}