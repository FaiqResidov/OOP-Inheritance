public class Dog extends Animal{


    public Dog(String Name,int age){
      super(Name,age);
    }
    @Override
    public  void eat(){
        System.out.println("Itler et yemeyi xoslayir");
    }
}
