import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] sarr = new String[5];
        ArrayList<String> sArrLst = new ArrayList<>();

        sarr[0] = "hi"; // adds/replaces at a specific index
        sArrLst.add("hi"); // add at the "end"
        sArrLst.set(0, "hiReplaced"); // set at an index
        sArrLst.add("next");

        System.out.println(sarr.length);
        System.out.println(sArrLst.size());

        System.out.println(sarr);
        System.out.println(sArrLst);

        for(int i=0; i<sarr.length; i++){
            System.out.println(sarr[i]);
        }
        for(int i=0; i<sArrLst.size(); i++){
            System.out.println(sArrLst.get(i));
        }
        System.out.println();
        sArrLst.remove(1);
        System.out.println(sArrLst);





    }
}