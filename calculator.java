import java.awt.*;
import java.awt.event.*;
import java.awt.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class calculator {
    public static void main(String[] args) {
        JFrame fm = new JFrame("New");
        JTextField tf = new JTextField();
        tf.setEditable(false);

        JButton btn = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        JButton btnplus = new JButton("+");
        JButton btnmin = new JButton("-");
        JButton btnmul = new JButton("*");
        JButton btnequal = new JButton("=");
        JButton btnclear = new JButton("Clear");

        fm.add(btn);
        fm.add(btn2);
        fm.add(btn3);
        fm.add(btn4);
        fm.add(btn5);
        fm.add(btn6);
        fm.add(btn7);
        fm.add(btn8);
        fm.add(btn9);
        fm.add(btn0);
        fm.add(btnplus);
        fm.add(btnmin);
        fm.add(btnmul);
        fm.add(btnequal);
        fm.add(btnclear);
        fm.add(tf);

        btn.setBounds(20, 100, 70, 39);
        btn2.setBounds(90, 100, 70, 39);
        btn3.setBounds(160, 100, 70, 39);
        btn4.setBounds(20, 150, 70, 39);
        btn5.setBounds(90, 150, 70, 39);
        btn6.setBounds(160, 150, 70, 39);
        btn7.setBounds(20, 200, 70, 39);
        btn8.setBounds(90, 200, 70, 39);
        btn9.setBounds(160, 200, 70, 39);
        btn0.setBounds(90, 250, 70, 39);
        btnplus.setBounds(235, 100, 50, 89);
        btnmin.setBounds(235, 200, 50, 39);
        btnmul.setBounds(235, 250, 50, 39);
        btnequal.setBounds(160, 250, 70, 39);
        btnclear.setBounds(20, 250, 70, 39);
        tf.setBounds(20, 50, 200, 40);

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        final boolean[] isAddition = {true};
        final boolean[] isMultiplication = {true};

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                num1.append("1");
                tf.setText(num1.toString());
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                num1.append("2");
                tf.setText(num1.toString());
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                num1.append("3");
                tf.setText(num1.toString());
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                num1.append("4");
                tf.setText(num1.toString());
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                num1.append("5");
                tf.setText(num1.toString());
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                num1.append("6");
                tf.setText(num1.toString());
            }
        });

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                num1.append("7");
                tf.setText(num1.toString());
            }
        });

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                num1.append("8");
                tf.setText(num1.toString());
            }
        });

        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                num1.append("9");
                tf.setText(num1.toString());
            }
        });
        
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent){
                num1.append("0");
                tf.setText(num1.toString());
            }
        });

        btnplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent){
                if (!num1.toString().isEmpty()) {
                    num2.append(num1);
                    num1.setLength(0);
                    tf.setText("");
                    isAddition[0] = true;
                }
            }
        });

        btnmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent){
                if (!num1.toString().isEmpty()) {
                    num2.append(num1);
                    num1.setLength(0);
                    tf.setText("");
                    isAddition[0] = false;
                    isMultiplication[0] = false;
                }
            }
        });

        btnmul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent){
                if(!num1.toString().isEmpty()){
                    num2.append(num1);
                    num1.setLength(0);
                    tf.setText("");
                    isMultiplication[0] = true;
                }
            }
        });

        btnequal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent){

                int result;
                if(isAddition[0]){
                    result = Integer.parseInt(num2.toString()) + Integer.parseInt(num1.toString());
                }else if(isMultiplication[0]){
                    result = Integer.parseInt(num2.toString()) * Integer.parseInt(num1.toString());
                }
                else {
                    result = Integer.parseInt(num2.toString()) - Integer.parseInt(num1.toString());
                }

                tf.setText(String.valueOf(result));
                num1.setLength(0);
                num2.setLength(0);
            }
        });

        btnclear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent){
                num1.setLength(0); 
                num2.setLength(0);
                tf.setText("");  
            }
        });

        fm.setSize(350, 400);
        fm.setLayout(null);
        fm.setVisible(true);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
