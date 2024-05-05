public class Cat extends Animal{
    public Cat(String Name, int age) {
        super(Name, age);
    }

    @Override
    public  void eat(){
        System.out.println("Pisikler sumuk yemeyi xoslayir");
    }

}
