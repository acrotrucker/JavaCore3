package hw20;

public class Wolf extends Carnivores {
    public Wolf(String name, String type) {
        super(name, type);
    }

    @Override
    public String myName() {
        return null;
    }

    @Override
    public void ieatmilk() {

    }

    @Override
    public void ihavevertebrate() {

    }

    @Override
    public void ibreath() {

    }

    public void iamlive(){
        System.out.println("i am "+ name + "and i live");
    }
}