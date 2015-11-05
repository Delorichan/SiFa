/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Zuajj
 */
public class LimitadorCaracter extends PlainDocument{
    private JTextField editor;
    private int num;

    public LimitadorCaracter(JTextField editor, int num) {
        this.editor = editor;
        this.num = num;
    }
    
    public void insertString(int arg0,String arg1,AttributeSet arg2){
        try {
            if((editor.getText().length()+arg1.length())>this.num){
                Toolkit.getDefaultToolkit().beep();
                return;
            }super.insertString(arg0, arg1, arg2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
