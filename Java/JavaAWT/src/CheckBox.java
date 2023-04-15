import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CheckBox {

    public static void main(String[] args) {
        Lusu o =new Lusu();
    }
}

class Lusu extends Frame
{
    Button b1,b2;
    Lusu()
    {
        // Frame
        super("panels");
        setLayout(null);
        setVisible(true);
        setSize(600,400);


        // close button
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        // Setting the Panel
        Panel p = new Panel();
        p.setBackground(Color.BLACK);
        p.setBounds(40,80,200,200);
        add(p);

        // Buttons
        b1 = new Button("Button 1");
        b1.setBounds(50,100,80,20);
        b1.setBackground(Color.green);
        p.add(b1);


        b2 = new Button("Button 2");
        b2.setBounds(100,100,80,20);
        b2.setBackground(Color.green);
        p.add(b2);
    }
}
