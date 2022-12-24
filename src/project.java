import java.util.ArrayList;

public class project {
    public static void main(String[] args) {
        ArrayList<int[]> Stopgo= new ArrayList<int[]>();
        Stopgo.add(new int[]{10,0});
        Stopgo.add(new int[]{3,5});
        Stopgo.add(new int[]{2,5});

        System.out.println(getPassanger(Stopgo));


    }
    public static int getPassanger(ArrayList<int[]>Buskota){
        int totalpenumpang= 0;
        for ( int i= 0; i<Buskota.size(); i++){
            totalpenumpang+= Buskota.get(i)[0]-Buskota.get(i)[1];


        }
        return totalpenumpang;
    }
}
