public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
    
    }
}


class Pen{
    private String color;

    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
    }
}
