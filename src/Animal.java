public class Animal {
 public String Name;
 public int age;

 public Animal(String Name,int age){
     this.age=age;
     this.Name=Name;
 }

    public  void eat(){
        System.out.println("Heyvanlar yemek yeyir");
    }

    @Override
    public String toString(){
     return "Name: %s Age: %d".formatted(Name,age);
    }
    public void sleep(){

    }


}
