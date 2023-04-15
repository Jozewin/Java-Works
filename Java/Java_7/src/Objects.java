class Rectangle {

    int length,width;  // properties

    // Getting information or behaviors
    void GetDetails (int x,int y){
        x = length;
        y = width;
    }

    // Finding Area
    int Area(){
        int a = length*width;
        return a;
    }


}

public class Objects {
    public static void main(String[] args) {
        Rectangle o1 = new Rectangle();   // Creating the object for the upbove shit

        o1.length = 100;
        o1.width = 2000;
        System.out.println("Area of Rectangle is "+o1.Area());

        Rectangle o2 = new Rectangle();

        o2.GetDetails(100,543);
        System.out.println(o2.Area());

    }
}
