import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Form {
    public static void main(String[] args) {

        RegForm o = new RegForm();

    }
}


class RegForm extends Frame
{
    Label reg,name,fname,gen,co,ad,hb,age;
    TextField namet,fnamet,aget;
    Choice cco;
    TextArea taad;
    CheckboxGroup cbg;
    Checkbox cmale,cfemale,h1,h2,h3,h4;

    Button b1,b2;

    RegForm()
    {

        // Frame
        super("Registration Form");
        setLayout(null);
        setVisible(true);
        setSize(1000,800);
        Color formColor = new Color(0, 26, 77);
        setBackground(formColor);

        // Close
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Font
        Font Title = new Font("arial",Font.BOLD,25);
        Font lbl = new Font("arial",Font.PLAIN,18);
        Font box = new Font("arial",Font.PLAIN,15);

        // Labels

        // Title
        reg = new Label("Registration Form");
        reg.setBounds(400,50,1000,50);
        reg.setFont(Title);
        reg.setForeground(Color.ORANGE);
        add(reg);

        // Name
        name = new Label("Name");
        name.setBounds(200,150,100,20);
        name.setFont(lbl);
        name.setForeground(Color.WHITE);
        add(name);

        namet = new TextField();
        namet.setBounds(400,150,400,20);
        namet.setFont(box);
        namet.setBackground(Color.white);
        namet.setForeground(Color.black);
        add(namet);

        // Father name
        fname = new Label("Father's Name");
        fname.setBounds(200,200,200,20);
        fname.setFont(lbl);
        fname.setForeground(Color.WHITE);
        add(fname);

        fnamet = new TextField();
        fnamet.setBounds(400,200,400,20);
        fnamet.setFont(box);
        fnamet.setBackground(Color.white);
        fnamet.setForeground(Color.black);
        add(fnamet);

        // Age

        age = new Label("Age");
        age.setBounds(200,250,200,20);
        age.setFont(lbl);
        age.setForeground(Color.WHITE);
        add(age);

        aget = new TextField();
        aget.setBounds(400,250,400,20);
        aget.setFont(box);
        aget.setBackground(Color.white);
        aget.setForeground(Color.black);
        add(aget);

        // Gender
        gen = new Label("Gender ");
        gen.setBounds(200,300,200,20);
        gen.setFont(lbl);
        gen.setForeground(Color.WHITE);
        add(gen);

        cbg = new CheckboxGroup();

        // Male
        cmale = new Checkbox("Male",cbg,true);
        cmale.setBounds(400,300,50,25);
        cmale.setFont(lbl);
        cmale.setForeground(Color.WHITE);
        add(cmale);

        // Female
        cfemale = new Checkbox("Female",cbg,false);
        cfemale.setBounds(475,300,100,25);
        cfemale.setFont(lbl);
        cfemale.setForeground(Color.WHITE);
        add(cfemale);

        // Courses

        co = new Label("Course ");
        co.setBounds(200,350,200,20);
        co.setFont(lbl);
        co.setForeground(Color.WHITE);
        add(co);

        // Choice for course
        cco = new Choice();
        cco.setBounds(400,350,100,20);
        cco.add("Java");
        cco.add("C");
        cco.add("C++");
        cco.add("Python");
        cco.add("Others");
        add(cco);


        // Hobbies
        hb = new Label("Hobbies ");
        hb.setBounds(200,400,200,20);
        hb.setFont(lbl);
        hb.setForeground(Color.WHITE);
        add(hb);

        //Checkbox for hobbies
        h1 = new Checkbox("Cricket");
        h1.setBounds(400,400,75,20);
        h1.setFont(lbl);
        h1.setForeground(Color.WHITE);
        add(h1);

        h2 = new Checkbox("Football");
        h2.setBounds(495,400,80,20);
        h2.setFont(lbl);
        h2.setForeground(Color.WHITE);
        add(h2);

        h3 = new Checkbox("Chess");
        h3.setBounds(590,400,75,20);
        h3.setFont(lbl);
        h3.setForeground(Color.WHITE);
        add(h3);

        h4 = new Checkbox("Others");
        h4.setBounds(680,400,75,20);
        h4.setFont(lbl);
        h4.setForeground(Color.WHITE);
        add(h4);

        // Address
        ad = new Label("Address ");
        ad.setBounds(200,450,200,20);
        ad.setFont(lbl);
        ad.setForeground(Color.WHITE);
        add(ad);

        taad = new TextArea(10,10);
        taad.setBounds(400,450,400,75);
        add(taad);

        // Button

        b1 = new Button("Save");
        b1.setBounds(350,600,100,30);
        b1.setFont(box);
        b1.setBackground(Color.YELLOW);
        add(b1);

        b2 = new Button("Clear All");
        b2.setBounds(475,600,100,30);
        b2.setFont(box);
        b2.setBackground(Color.RED);
        add(b2);


    }
}