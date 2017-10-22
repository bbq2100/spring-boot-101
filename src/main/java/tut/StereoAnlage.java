package tut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StereoAnlage {

    @Autowired
    private SgtPeppers sgtPeppers;

    public void play(){
        sgtPeppers.play();
    }

}
