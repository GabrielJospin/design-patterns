package creational.builder.entities;

public class Builder {

    public static void main(String[] args) {
        System.out.println("Testing Builder");
        Director director = new Director();
        Character villager = director.constructVillager("GabrielJospin", "Max");
        System.out.println(villager);
        Character guardian = director.constructGuardian("GabrielJospin", "EXL");
        System.out.println(guardian);
        Character orcGuardian = director.constructOrcGuardian("GabrielJospin", "Owasle");
        System.out.println(orcGuardian);
    }
}
