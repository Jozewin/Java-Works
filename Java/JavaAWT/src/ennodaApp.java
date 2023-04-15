import java.awt.*;
import java.awt.event.*;

public class ennodaApp {
    public static void main(String[] args) {
        Addition o = new Addition();

    }
}

class Addition extends Frame implements ActionListener
{

    TextField f1,f2;
    Button b1;
    Label l1,l2,l3;


    Addition()
    {
        // Frame
        super("Addition....");
        setSize(600,400);
        setLayout(null);
        setVisible(true);

        // Exit button

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Labels
        l1 = new Label("Enter number 1 :-");
        l1.setBounds(10,50,250,30);

        l2 = new Label("Enter number 2 :-");
        l2.setBounds(10,100,250,30);

        l3 = new Label("Result - ");
        l3.setBounds(10,200,250,30);

        // text field
        f1 = new TextField();
        f1.setBounds(250,55,60,15);

        f2 = new TextField();
        f2.setBounds(250,105,60,15);

        b1 = new Button("Click pannu da");
        b1.setBounds(150,150,100,30);
        b1.addActionListener(this);

        // Add them
        add(l1);
        add(l2);
        add(l3);
        add(f1);
        add(f2);
        add(b1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s1 = f1.getText();
        String s2 = f2.getText();

        if (s1.isEmpty() || s2.isEmpty())
        {
            l3.setText("Please enter the number");
        }else
        {
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a+b;
            String result = String.valueOf(c);
            l3.setText("Result - "+result);


        }

    }
}

