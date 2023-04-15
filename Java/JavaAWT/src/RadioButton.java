import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RadioButton {
    public static void main(String[] args) {

        Radio o = new Radio();

    }
}


class Radio extends Frame

{
    Checkbox c1,c2;
    Label l1,l2;
    CheckboxGroup csg;

    public Radio()
    {
        // Setting the box
        super("Project");
        setLayout(null);
        setSize(400,250);
        setVisible(true);

        // Setting the close button

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Setting radiobutton setting
        csg = new CheckboxGroup();

        c1 = new Checkbox("Male",csg,false);
        c1.setBounds(10,50,250,30);

        l1 = new Label("Not selected");
        l1.setBounds(300,50,600,30);

        c2 = new Checkbox("Female",csg,false);
        c2.setBounds(10,100,250,30);

        l2 = new Label("Not selected");
        l2.setBounds(300,100,600,30);

        // Setting the type

        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l1.setText((e.getStateChange()==1)?"Checked":"Not checked");
                l2.setText("Not Checked");
            }
        });

        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent c) {
                l2.setText((c.getStateChange()==1)?"Checked":"Not checked");
                l1.setText("Not Checked");
            }
        });

        // Adding the buttons

        add(c1);
        add(l1);
        add(l2);
        add(c2);





    }
}