import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Textfeild {


    public static void main(String[] args) {
        Text o = new Text();

    }
}

class Text extends Frame
{
    TextField txt;
    Label l1 ;


    public Text()
    {
        // Box
        super("Project1");
        setLayout(null);
        setVisible(true);
        setSize(600,400);

        // Closing button
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        txt = new TextField();
        txt.setBounds(300,50,600,30);

        l1 = new Label("Enter your name");
        l1.setBounds(10,50,250,30);

        add(txt);
        add(l1);


    }
}