interface LearnToSpeak {
    void speak(String sound);
}

class DuckHelper {
    public static void teacher(String name, LearnToSpeak trainer) {

        // other exercise

        trainer.speak(name);
    }
}

class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learner = s -> System.out.println(s);
        DuckHelper.teacher(sound, learner);
    }
}

class OtherExamples {
    public static void main(String[] args) {

    }
}