public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        int m = (int) ((Math.random() * maxHops) + 0.5);
        return m;
    }

    public boolean simulate() {
    }

    public double runSimulations(int num) {

    }
}
