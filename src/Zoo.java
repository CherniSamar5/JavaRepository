import java.util.Arrays;

public class Zoo {

    Animal [] animals ;
    String name ;
    String city ;
    int nbrCages ;

    Zoo(){}


    @Override
    public String toString(){
        String [] nameOfAnimals = new String[animals.length] ;
        int index = 0  ;
        for (Animal myAnimal : animals){
            nameOfAnimals[index] = myAnimal.name;
            index++;
        }
        return  "Name of zoo : " + name + " ,the city : " + city + " ,number of cages : " + nbrCages + " ,has as animals : " + Arrays.toString(nameOfAnimals) ;
    }
}
