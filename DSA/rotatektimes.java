import java.util.ArrayList;

public class rotatektimes {
    public static void rotateArray(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=k;i<arr.size();i++){
            temp.add(arr.get(i));
        }
        for(int i=0;i<k;i++){
            temp.add(arr.get(i));
        }
        for(int i:temp){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
            l.add(1);
            l.add(2);
            l.add(3);
            l.add(4);
            l.add(5);
            l.add(6);
            l.add(7);
            rotateArray(l, 3);

    }
}

