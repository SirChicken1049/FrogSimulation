public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        int total = 0;
        int check = 0;
        for (int i = 0; i <= (Math.random() * maxHops); i++){
            check =(int) (Math.random() * 32) - 8;
            //System.out.println(check);
            total += check;
        }
        //System.out.println(total);
        return total;
    }

    public boolean simulate() {
        if (hopDistance() >= goalDistance) {
            return true;
        }
        return false;
    }

    public double runSimulations(int num) {
        int goalAchieved = 0;
        for (int i = 0; i <= num; i++) {
            boolean check2 =simulate();
            if (check2 == true) {
                goalAchieved += 1;
            }
        }
        return (double)(goalAchieved / num);
    }
}
