package hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Барсик", "Черный");
        cat.setFood("Молоко и мясо");
        cat.setLocation("Квартира");

        Cat cat2 = new Cat("Рыжик", "рыжий");
        cat2.setFood("Молоко и мясо");
        cat2.setLocation("Улица");

        Horse horse = new Horse("Буцефал", 89);
        horse.setFood("Овес и яблоки");
        horse.setLocation("Ипподром");

        Dog dog = new Dog("Шарик", "дворняга");
        dog.setFood("Каша и мясо");
        dog.setLocation("Двор");

        Class clazzCat = Cat.class;
        Class clazzDog = Dog.class;

        Animal[] animals = new Animal[] {cat, cat2, horse, dog};

        Class clazz = Class.forName("hw6.Veterinarian");

        //Constructor constr = clazz.getConstructor();
        //Object vet = constr.newInstance();

        Constructor constr = clazz.getConstructor(String.class);
        Object vet = constr.newInstance("Айболит");

        Method treatAnimal = clazz.getMethod("treatAnimal", Animal.class);

        for(Animal animal: animals) {
            treatAnimal.invoke(vet, animal);
        }

        //Veterinarian.class.newInstance().treatAnimal(cat);
        Class catClazz = Cat.class;
        Class catClazz2 = cat2.getClass();
    }
}
