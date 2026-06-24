public class SmartTVMain {
    public static void main(String[] args) {
        String[] movies = {"Space Journey", "Mystery Mansion", "Ocean Quest"};
        String[] games = {"Laser Racer", "Puzzle Tower", "Battle Arena"};

        SmartTV tv = new SmartTV(movies, games);

        System.out.println("=== Multi-Service Smart TV ===");
        tv.showSubscriptionDetails();
        tv.displayAvailableContent();
    }
}

interface StreamingService {
    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("StreamingService: Subscription includes premium movie access.");
    }
}

interface GamingService {
    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("GamingService: Subscription includes premium game access.");
    }
}

class SmartTV implements StreamingService, GamingService {
    private final String[] movies;
    private final String[] games;

    public SmartTV(String[] movies, String[] games) {
        this.movies = movies;
        this.games = games;
    }

    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing game: " + game);
    }

    @Override
    public void showSubscriptionDetails() {
        System.out.println("SmartTV: Includes both streaming and gaming subscriptions.");
    }

    public void displayAvailableContent() {
        System.out.println("Available movies:");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }
        System.out.println("Available games:");
        for (String game : games) {
            System.out.println("- " + game);
        }
    }
}
