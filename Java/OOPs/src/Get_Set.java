// Getter and Setter
public class Get_Set {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();

        a.setLen(100);    // Setting the value for length
        a.setWid(50);     // Setting the value for width
        System.out.println("Length    :- "+a.getLength());    // calling the length
        System.out.println("Width     :- "+a.getWidth());     // calling the width
        System.out.println("Perimeter :- "+a.Perimeter());


    }
}


class Rectangle{
    // Properties
    private int len,wid;

    // Setting the getter
    int getLength(){
        return len;   // Get for length
    }

    int getWidth(){
        return wid;
    }

    // Setting the setter
    void setLen(int l){
        len = l;
    }
    void setWid(int w){
        wid = w;
    }
    // Perimeter
    int Perimeter(){

        int perm=2*(len+wid);
        return perm;
    }
}


