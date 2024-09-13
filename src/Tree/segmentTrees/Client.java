package Tree.segmentTrees;

public class Client {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 4};
        SBT sbt = new SBT(arr);
        System.out.println(sbt.query(1, 3));
        sbt.display();
        sbt.update(1, 10);
        System.out.println(sbt.query(1, 3));
        System.out.println(sbt.query(1, 1));
        sbt.display();


    }

}
