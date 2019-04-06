import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.*;

public class Win {
    Win() {
        JFrame jfrm = new JFrame("Calculate");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350, 100);
        jfrm.setLocation(500, 200);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        JLabel jlab = new JLabel();
        JTextField jtext1 = new JTextField(4);
        JTextField jtext2 = new JTextField(4);
        JButton jbtn1 = new JButton("+");
        JButton jbtn2 = new JButton("-");
        JButton jbtn3 = new JButton("/");
        JButton jbtn4 = new JButton("*");
        JButton jbtn5 = new JButton("^");
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfrm, "Сумма " + jtext1.getText() + " + " + jtext2.getText() + " = " +
                        (parseDouble(jtext1.getText()) + parseDouble(jtext2.getText())));
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfrm, "Разница " + jtext1.getText() + " и " + jtext2.getText() + " = " +
                        (parseDouble(jtext1.getText()) - parseDouble(jtext2.getText())));
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfrm, "Деление " + jtext1.getText() + " на " + jtext2.getText() + " = " +
                        (parseDouble(jtext1.getText()) / parseDouble(jtext2.getText())));
            }
        });
        jbtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfrm, "Произведение " + jtext1.getText() + " на " + jtext2.getText() + " = " +
                        (parseDouble(jtext1.getText()) * parseDouble(jtext2.getText())));
            }
        });
        jbtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfrm, jtext1.getText() + " в степени " + jtext2.getText() + " равно " +
                        Math.pow(parseDouble(jtext1.getText()), parseDouble(jtext2.getText())));
            }
        });
        jfrm.add(jtext1);
        jfrm.add(jtext2);
        jfrm.add(jbtn1);
        jfrm.add(jbtn2);
        jfrm.add(jbtn3);
        jfrm.add(jbtn4);
        jfrm.add(jbtn5);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Win();
            }
        });
    }
}
