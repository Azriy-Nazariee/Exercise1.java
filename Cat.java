public class Cat extends Animal{   
    Cat(String name) { 
        super(name); 
        sound = "meow"; // can use directly as the sound from animal is public.
    }   
}