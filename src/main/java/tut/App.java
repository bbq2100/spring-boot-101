package tut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Component
    public static class Runner implements CommandLineRunner {

        @Autowired
        StereoAnlage stereoAnlage;

        @Override
        public void run(String...args) throws Exception {
            stereoAnlage.play();
        }
    }

}
