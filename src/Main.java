

public class Main {
// ARRAY OF OBJECTS
	
	// Array of Object represents storing multiple objects in a single name 
	
	// The data can be accessed randomly by using  index number.
	
	// Reduce the TIME and MEMORY by storing the data in a single variable
	
	public static void main(String[] args) {
		
		//array of objects 
		Food[] refrigerator = new Food[3];
		
		// instantiating  objects from class Food
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Hamburger");
		Food food3 = new Food("Hotdog");
		
		
		//OR
		
		//Food [] refrigerFoods = {food1,food2,food3};
		//better method 
		
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
		}
	}