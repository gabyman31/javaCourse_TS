package chapter10;

public class Zoo {
    public static void main(String[] args){
        Dog rock = new Dog();
        rock.fetch();
        rock.makeSound();
        feed(rock);

        Animal sacha = new Dog();
        sacha.makeSound();
        feed(sacha);

        sacha = new Cat();
        sacha.makeSound();
        ((Cat)sacha).scratch();
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("here's your cat food");
        }


    }
}
