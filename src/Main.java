import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> printNumbers(){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 11;i++){
            if (i == 9 || i==0){
                continue;
            }
            array.add(i);
        }
        System.out.println(array);
        return array;
    }
    public static String area(Triangle t){
        float area = 0;
        if (t != null){
            float s = (t.getL1()+t.getL2()+t.getL3())/2;
            area = (float)Math.sqrt((s*(s-t.getL1())*(s-t.getL2())*(s-t.getL3())));
        }

        System.out.println(String.format("%.02f",area));
        return String.format("%.02f",area);
    }


    public static void main(String[] args) {
        Main.printNumbers();
        Main.area(new Triangle(12,13,2));
    }
}