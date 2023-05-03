package proj6;
import java.util.concurrent.ThreadLocalRandom;

public class TrackS {
    private int distance;
    private String trackShape;
    private boolean obstacles;
    private int quality;

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int dist) {
        distance = dist;
    }

    public String getShape() {
        return this.trackShape;
    }

    public void setShape(String shape) {
        trackShape = shape; 
    }

    public boolean getObstacles() {
        return this.obstacles;
    }

    public void setObstacles(boolean obstacle) {
        obstacles = obstacle;
    }

    public int getQuality() {
        return this.quality;
    }

    public void setQuality(int qualit) {
        quality = qualit;
    }

    public TrackS(boolean isFinish) {
        int trackRoll = ThreadLocalRandom.current().nextInt(0, 2);
        int obstacleRoll = ThreadLocalRandom.current().nextInt(0, 2);

        // Straight track generated
        if (trackRoll == 0 || isFinish == true) {
            int distRoll = ThreadLocalRandom.current().nextInt(100, 501);
            setShape("Straight");
            if (isFinish == true) {
                setDistance(0);
            }
            else {
                setDistance(distRoll);
            }
        }
        // Curve track generated
        else {
            int distRoll = ThreadLocalRandom.current().nextInt(50, 251);
            setShape("Curve");
            setDistance(distRoll);
        }

        // False obstacle roll
        if (obstacleRoll == 0) {
            setObstacles(false);
        }
        // True obstacle roll
        else {
            setObstacles(true);
        }

        // Hard coded to 10 for now...
        setQuality(10);
    }
}