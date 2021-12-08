package BouncingBall;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        int count = 0;
        double resh = h;
        if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
            while (resh > window) {
                resh = resh * bounce;
                if(resh > window){
                    count += 2;
                } else {
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }
}