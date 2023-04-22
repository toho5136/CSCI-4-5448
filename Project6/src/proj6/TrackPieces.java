package proj6;
import java.util.concurrent.ThreadLocalRandom;
/*
Track class, for building the race track. Consists of two classes, Straight(straight aways) and Curve(Turns). Each piece
of track has two major qualities for now: distance(how long it is) and quality(what kind of condition it's in). Distance
is used for races so the horse knows how far it has to go. Quality is for maintaining the track, as the trackes degrade
they can cause issues for races, so they need to be repaired. Almost certainly we can add more stuff, but for now this is
what we need to make it function.
*/
public abstract class Track {
	private String position;
	private String sectionType;
	private int distance;
	private boolean obstacles;
	private int quality;

	public String getSection() {
		return this.sectionType;
	}

	public void setSection(String type) {
		this.sectionType = type
	}

	public String getType() {
		return this.sectionType;
	}

	public int getDistance() {
		return this.distance;
	}

	public void setDistance(int input) (this.distance =input)

	public int getQuality() {
		return this.quality;
	}

	public void setQuality(int input) {
		this.quality = input;
	}
}
class Straight extends Track(int length = 0){
	setSection("Straight");
	int distance = 0;
	if (distance == length){distance = ThreadLocalRandom.current().nextInt(100, 500);}
	else {distance = length;}
	setDistance(distance);
	setQuality(100);
}

class Curve extends Track(){
	setSection("Curve");
	int distance = ThreadLocalRandom.current().nextInt(50,250);
	setDistance(distance);
	setQuality(100);
}

