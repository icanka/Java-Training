package woods;


// Valid import.
import  static food.Grass.getGrass;
import static food.Grass.seeds;

// This type of import is used to import classes. pacakage_name.* imports all classes in package_name
// Also we can't use static when importing classes.
import static food.*;

// static is placed in wrong order.
static import food.Grass.*;


// This does not import static members
import food.Grass.*;

// static is wrongly placed.
static import food.Grass.getGrass;
static import food.Grass.seeds;

// valid import
import static food.Grass.*;

public class Deer {
	public void eat() {
		getGrass();
		System.out.print(seeds);
	}
}
