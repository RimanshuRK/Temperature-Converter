import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class TempCa3
{
    JButton b1,b2;
    JLabel l,l1,l2,l3;
    JTextField tf;
    JFrame f;
    //JComboBox cb1,cb2;


    TempCa3()
    {
        JFrame f = new JFrame("Temperature");

        //LineBorder line = new LineBorder(Color.decode("#B64B39"), 10, true);

        l = new JLabel("Convert Temperature",JLabel.CENTER);
        l.setBounds(0,10,400,30);
        l.setBackground(Color.decode("#B64B39"));//#B64B39;
        l.setOpaque(true);
        l.setFont(new Font("Verdana",Font.BOLD,16));
        l.setForeground(Color.WHITE);


        //l.setBorder(new LineBorder(Color.decode("#B64B39")));

        tf=new JTextField();
        tf.setBounds(100,100,150,30);
        tf.setFont(new Font("Verdana",Font.BOLD,13));
        tf.setToolTipText("Enter Value");

        l1 = new JLabel("Value to Convert:");
        l1.setFont(new Font("Verdana",Font.BOLD,13));
        l1.setBounds(110,70,140,20);

        l2 = new JLabel("From:");
        l2.setBounds(70,140,60,25);

        l3 = new JLabel("To:");
        l3.setBounds(70,180,60,25);



        JComboBox cb1 = new JComboBox();
        cb1.setBounds(130,140,120,25);
        cb1.addItem("Celsius");
        cb1.addItem("Fahrenheit");
        cb1.setToolTipText("Select Option");

        JComboBox cb2 = new JComboBox();
        cb2.setBounds(130,180,120,25);
        cb2.addItem("Fahrenheit");
        cb2.addItem("Celsius");
        cb2.setToolTipText("Select Option");

        b1 = new JButton("clear");
        b1.setBounds(30,250,110,30);

        b2 = new JButton("calculate");
        b2.setBounds(220,250,110,30);


        JTextArea l4 = new JTextArea();
        l4.setBounds(60,320,250,30);
        l4.setFont(new Font("Verdana",Font.BOLD,13));
        l4.setBackground(Color.LIGHT_GRAY);
        l4.setEditable(false);
       //l4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        //l4.setAlignmentX(JTextArea.RIGHT_ALIGNMENT);


//     ----------------------------------Action Performed---------------------------------------------------------
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0)
            {

                String box1 = (String)cb1.getSelectedItem();
                String box2 = (String)cb2.getSelectedItem();

                // Celsius to Fahrenheit
                if (box1.equals("Celsius") && box2.equals("Fahrenheit"))
                {
                    double c = Double.parseDouble(tf.getText());
                    double f = (double) (c * 1.8 + 32);

                    l4.setText(String.valueOf(f+" Fahrenheit(°F)"));

                }
//                else
//                {
//                    JOptionPane.showMessageDialog(null, "Invalid value.");
//                }

                // Fahrenheit to Celsius
               else if (box1.equals("Fahrenheit") && box2.equals("Celsius"))
                {
                    double f = Double.parseDouble(tf.getText());
                    double c = (double) ((f - 32)*5/9);

                    l4.setText(String.valueOf(c+" Celsius(°C)"));
                }

               // Fahrenheit to Fahrenheit
                else if (box1.equals("Fahrenheit") && box2.equals("Fahrenheit"))
                {
                    double f = Double.parseDouble(tf.getText());
                    //double c = (double) ((f - 32)*5/9);

                    l4.setText(String.valueOf(f+" Fahrenheit(°F)"));
                }

                // Celsius to Celsius
                else if (box1.equals("Celsius") && box2.equals("Celsius"))
                {
                    double c = Double.parseDouble(tf.getText());
                    //double f = (double) ((f - 32)*5/9);

                    l4.setText(String.valueOf(c+" Celsius(°C)"));
                }

//                else if(tf.equals("") && l4.equals(""))
//                {
//                    JOptionPane.showMessageDialog(null, "Invalid value.");
//                }

            }
        });
//__________________________________________________________________________________________

        // ActionPerforms CLEAR
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ac)
            {
                l4.setText(String.valueOf(""));
                tf.setText(String.valueOf(""));

            }
        });



        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(tf);
        f.add(cb1);
        f.add(cb2);
        f.add(b1);
        f.add(b2);
        f.add(l4);

        f.setLayout(null);
        f.setSize(400,450);
        f.setVisible(true);

    }

    public static void main(String[] args)
    {
        new TempCa3();
    }

}