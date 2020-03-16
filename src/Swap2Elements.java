import java.util.ArrayList;

public class Swap2Elements {


    public static void swapElements(ArrayList<String> arrayList,int pos1, int pos2){

        if(arrayList.get(pos1)==null||arrayList.get(pos2)==null){
            System.out.println("The position is not Valid please choose another positions ");

        }else{
            String temp=arrayList.get(pos1);
            arrayList.set(pos1, arrayList.get(pos2));
            arrayList.set(pos2,temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for (String i : cars) {
            System.out.println(i);
        }
        swapElements(cars,1,3);

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
