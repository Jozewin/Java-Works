import java.awt.*;
import java.awt.event.*;

public class App
{
    public static void main(String[] args) {
        Sub o = new Sub();

    }
}

class Sub extends Frame
{
    Sub()
    {
        // Frame
        super("canvas");
        setSize(600,400);
        setLayout(null);
        setVisible(true);

        // Exit
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(new MyCanva());

    }

}

class MyCanva extends Canvas
{
    MyCanva()
    {
        setBackground(Color.BLACK);
        setSize(300,200);
    }

    public void paint (Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillOval(75,75,150,75);

    }
}