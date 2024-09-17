//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        /*
        Animal lion = new Animal();
        lion.family = "big lions";
        lion.name = "myLion";
        lion.age = 12;
        lion.isMammal = true;
        System.out.println("the lion is :  \n" + lion);
        System.out.println("****************************************************");
        Zoo myZoo = new Zoo();
        myZoo.animals = new Animal[]{lion};
        myZoo.name = "myZoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 12;
        System.out.println("the Zoo is :  \n" + myZoo);
        */
        Animal lion = new Animal("big lions" , "myLion" , 12 , true);
        Animal tigre = new Animal("big Tigre" , "myTigre" , 3 , true);

        System.out.println("the lion is :  \n" + lion);
        System.out.println("the tigre is :  \n" + tigre);
        System.out.println("****************************************************");

        Animal [] animals = {lion , tigre};
        Zoo myZoo = new Zoo(animals, "Tunisia Zoo", "Tunisia", 6);
        System.out.println(myZoo);





    }
}