import net.matt.entity.Asteroid;
import net.matt.util.AsteriskParser;
import net.matt.util.asteroid.AsteroidAggregator;


public class Tester {

	public static void main(String[] args) {
		
		AsteriskParser asteriskParser = new AsteriskParser();
		
		asteriskParser.add(new AsteroidAggregator());
		asteriskParser.add(new Asteroid("wodk", 34.53));

	}

}
