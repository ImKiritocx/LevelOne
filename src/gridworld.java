import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {
public static void main(String[] args) throws InterruptedException {
	World world = new World(); 
	world.show();
	Location flower1L = new Location(5,5);
	Flower flower1 = new Flower(Color.blue);
	world.add(flower1L ,flower1);
	Location bug1L = new Location(4,5);
	Bug bug1 = new Bug(Color.GREEN);
	world.add(bug1L, bug1);
	
	
	for (int i = 0; i < 15; i++) {
		
		int randomx = new Random().nextInt(10);
		int randomy = new Random().nextInt(10);
		Location bug2L = new Location(randomx,randomy);
		Bug bug2 = new Bug(Color.RED);
		world.add(bug2L, bug2); 
		Thread.sleep(3000);
		world.show();
	}
}
}
