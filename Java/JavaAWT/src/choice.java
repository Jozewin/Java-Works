import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class choice {
    public static void main(String[] args) {

        Loli o = new Loli();

    }
}


class Loli extends Frame implements ActionListener
{
    Choice c;
    Label l,a;
    Button b;

    Loli ()
    {
        // Frame
        super("Choice ....");
        setLayout(null);
        setVisible(true);
        setSize(1000,600);

        // Close button
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding choice button
        c = new Choice();
        c.setBounds(200,50,100,20);
        c.add("Not Selected");
        c.add("Male");
        c.add("Female");
        c.add("TransGender");

        add(c);

        // Adding the Lable
        l = new Label("Select your gender :- ");
        l.setBounds(10,50,150,20);
        add(l);

        // Button
        b = new Button("Confirm");
        b.setBounds(350,50,75,20);
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Gender - "+ c.getItem(c.getSelectedIndex());
                a.setText(data);
            }
        });

        // Label 2
         a = new Label("Gender - ");
         a.setBounds(200,75,100,20);
         add(a);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}