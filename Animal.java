public abstract class Animal{
    private String name; // private as the question required
    public String sound;
    
    Animal(String name){
       this.name = name;
       this.sound = ""; 
    }
    
    public void speak(){
        System.out.println(name + " says " + sound + ".");
    }
}