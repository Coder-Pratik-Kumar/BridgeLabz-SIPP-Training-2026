public class FitnessTrackerMain {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();

        device.logActivity("Running 5 km");
        device.logActivity("Yoga session");
        device.generateReport();
        device.sendAlert("Time to hydrate!");
        device.resetData();

        System.out.println();
        System.out.println("A single class can implement multiple interfaces, but Java classes cannot extend more than one class.");
    }
}

interface Trackable {
    void logActivity(String activity);

    default void resetData() {
        System.out.println("Trackable: Resetting tracked activity data.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    private final java.util.List<String> activities = new java.util.ArrayList<>();

    @Override
    public void logActivity(String activity) {
        activities.add(activity);
        System.out.println("Logged activity: " + activity);
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Device Report:");
        if (activities.isEmpty()) {
            System.out.println("No activities logged yet.");
        } else {
            for (String activity : activities) {
                System.out.println("- " + activity);
            }
        }
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }
}
