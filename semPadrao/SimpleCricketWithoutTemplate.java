package semPadrao;

public class SimpleCricketWithoutTemplate {
    public void play() {
        initialize();
        startPlay();
        endPlay();
    }

    private void initialize() {
        System.out.println("Cricket Game Initialized. Start playing.");
    }

    private void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    private void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    public static void main(String[] args) {
        SimpleCricketWithoutTemplate cricket = new SimpleCricketWithoutTemplate();
        cricket.play();
    }
}
