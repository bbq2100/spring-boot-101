package tut;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper'S Lonely Hearts Club Band";

    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by "  + artist);
    }
}
