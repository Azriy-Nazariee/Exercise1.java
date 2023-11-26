public class Snake extends Animal{   
    Snake(String name, int num) { 
        super(name); 
        for (int i=0; i<num; i++){
            sound += "s"; // can use directly as the sound from animal is public.
        }
    }   
}