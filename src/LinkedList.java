import java.util.ArrayList;

public class LinkedList {
    public static void main(String[] args) {
        ArrayList Hewan = new ArrayList();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.println("Hewan : " + Hewan);
        System.out.println("Hewan yang dihapus : \n" + DeleteHewan);

        Hewan.remove("Kelinci");
        Hewan.remove("Kambing");
        Hewan.remove("Unta");

        System.out.println("Output Hewan : ");
        System.out.println(Hewan);
    }
}
