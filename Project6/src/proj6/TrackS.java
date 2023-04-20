package proj6;
import java.util.concurrent.ThreadLocalRandom;

public class TrackS {
    private int distance;
    private String trackShape;
    private String features;

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

    public String getFeatures() {
        return this.features;
    }

    public void setFeatures(String feature) {
        features = feature;
    }

    public TrackS(int dist, String shape, String feature) {
        setDistance(dist);
        setShape(shape);
        setFeatures(feature);
    }

}