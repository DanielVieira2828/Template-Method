package semPadrao;

public class SimpleFootballWithoutTemplate {
    public void play() {
        initialize();
        startPlay();
        endPlay();
    }

    private void initialize() {
        System.out.println("Football Game Initialized. Start playing.");
    }

    private void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    private void endPlay() {
        System.out.println("Football Game Finished!");
    }

    public static void main(String[] args) {
        SimpleFootballWithoutTemplate football = new SimpleFootballWithoutTemplate();
        football.play();
    }
}
