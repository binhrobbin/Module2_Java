package th1_animal_edible;

import th1_animal_edible.animal.Animal;
import th1_animal_edible.animal.Chicken;
import th1_animal_edible.animal.Tiger;
import th1_animal_edible.fruit.Apple;
import th1_animal_edible.fruit.Fruit;
import th1_animal_edible.fruit.Orange;
import th1_animal_edible.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Chicken chicken = (Chicken) animals[1];
        System.out.println( chicken.howToEat());

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
