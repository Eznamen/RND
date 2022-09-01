

public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox(3);
        magicBox.add(888888888);
        magicBox.add("Moo");
        magicBox.add(Math.max(5, 300));

        magicBox.pick();

        MagicBox<Integer> magicBoxInt = new MagicBox<Integer>(3);
        magicBoxInt.add(22);
        magicBoxInt.add(58);
        magicBoxInt.add(698);

        magicBoxInt.pick();

        MagicBox<String> magicBoxStr = new MagicBox<String>(5);
        magicBoxStr.add("Moon");
        magicBoxStr.add("смеркалось");
        magicBoxStr.add("Словыаол");

        magicBoxStr.pick();



    }

}
