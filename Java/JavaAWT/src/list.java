import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class list {
    public static void main(String[] args) {
        Planets o = new Planets();

    }
}

class Planets extends Frame implements ActionListener
{
    List lt;
    Button b;
    Label l1,l2,l3;

    public Planets()
    {
        // Frame
        super ("Planets");
        setLayout(null);
        setVisible(true);
        setSize(800,600);


        //close button
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        // Adding the list
        lt = new List(4,true);
        lt.add("Mercury");
        lt.add("Venus");
        lt.add("Earth");
        lt.add("Mars");
        lt.add("Jupiter");
        lt.add("Saturn");
        lt.add("Uranus");
        lt.add("Neptune");
        lt.setBounds(10,75,100,100);
        add(lt);

        // Adding labels bruhhh
        l1 = new Label("Select Planets....");
        l1.setBounds(10,50,100,20);
        add(l1);

        l2 = new Label("Selected Planets are :- ");
        l2.setBounds(10,200,500,20);
        add(l2);

        // Button

        b = new Button("Click to Confirm");
        b.setBounds(150,110,120,25);
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String [] l = lt.getItems();
                String data = "Selected Planets are :- ";

                for (String x :l)
                {
                    data += x +",";
                }
                l2.setText(data);


            }
        });



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
