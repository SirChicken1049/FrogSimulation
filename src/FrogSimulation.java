public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        return (int) (Math.random() * 31) - 8;
    }

    public boolean simulate() {
        int total = 0;
        for (int i = 0; i < maxHops; i++){
            total += hopDistance();
            if (total < 0) {
                System.out.println(total);
                return false;
            }
            if (total >= goalDistance) {
                System.out.println(total);
                return true;
            }
        }
        System.out.println(total);
        return false;
    }

    public double runSimulations(int num) {
        int goalAchieved = 0;
        for (int i = 0; i <= num; i++) {
            boolean check = simulate();
            if (check) {
                goalAchieved += 1;
            }
        }
        return (goalAchieved / (double)num);
    }
}
