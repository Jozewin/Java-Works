import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class textArea {
    public static void main(String[] args) {
        ttf o = new ttf();

    }
}

class ttf extends Frame implements ActionListener
{

    Label l1,l2;
    TextArea ta;
    Button b;

    public ttf()
    {
        // Frame
        super("Jozewin");
        setLayout(null);
        setVisible(true);
        setSize(600,600);

        // Exit
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        l1 = new Label("White Spaces :- ___");
        l1.setBounds(10,20,250,30);
        add(l1);

        l2 = new Label("Letter         :- ___");
        l2.setBounds(10,40,250,30);
        add(l2);

        ta = new TextArea(30,15);
        ta.setBounds(10,100,400,250);
        add(ta);

        b = new Button("Ammuku da");
        b.setBounds(150,400,100,70);
        add(b);
        b.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = ta.getText();
        String white [] = text.split("\\s");

        l1.setText("White Spaces :- "+white.length);
        l2.setText("Letter       :- "+text.length());

    }
}

