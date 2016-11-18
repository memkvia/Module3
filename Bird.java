/**
 * Created by Me Mkvia on 18.11.2016.
 */
public class Bird {
    int size;
    String name;
    String LiveArea;


    void sing(String word){
        System.out.println("I am "+word);
    }

    public Bird(int size, String name, String liveArea) {
        this.size = size;
        this.name = name;
        this.LiveArea = liveArea;
    }
}

