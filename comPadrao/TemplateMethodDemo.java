package comPadrao;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();  // Playing a football game

        System.out.println();

        game = new Cricket();
        game.play();  // Playing a cricket game
    }
}