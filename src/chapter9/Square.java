package chapter9;

public class Square extends Rectangle {

    public double calculatePerimeter (){
        return sides * length;
    }
    public void print(String what){
        System.out.println("I am a " + what);
    }
}
