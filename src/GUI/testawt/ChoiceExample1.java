/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;
 
import java.awt.Choice;
import java.awt.Frame;
 
public class ChoiceExample1 {
    public ChoiceExample1() {
        Frame frame = new Frame("Các học phần tự chọn");
        Choice choice = new Choice();
        choice.setBounds(100, 100, 150, 150);
        choice.add("Lịch sử ĐCSVN");
        choice.add("Triết học Mác - Lenin");
        choice.add("Điều tra tội phạm trong lĩnh vực CNTT");
        choice.add("Tác chiến mạng");
        choice.add("Các vấn đề hiện đại của CNTT");
        frame.add(choice);
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
 
    public static void main(String args[]) {
        new ChoiceExample1();
    }
}