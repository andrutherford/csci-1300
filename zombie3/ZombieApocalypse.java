import java.lang.*;


public class ZombieApocalypse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // set some number to be zombies
        int z = 1;
        //this is number of total ZombieTurtles, only z of which are initially zombies
        int zTurtles = 50;
        int N = 100;
        /*need a Universe object that we can put turtles into. turtles will be circles and change colors when they 
         * come in contact with other turtles that are inflicted with zombie-ism
         * 
         */
        Universe un = new Universe(N,zTurtles,z,300, 300);
        /*our simulation will run for N iterations */
        for(int i = 0; i < N; i++)
        {	
        	un.moveZombies();
        	un.zombieAttack(i);
        	try { Thread.sleep(100);}
        	catch (Exception e) { break;}
        }
        		
        		
        	
        	/*choose new random location for all Turtles in the Universe */
        	//un.moveZombies();
        	/*Convert new zombies from Turtle population */
        	//un.zombieAttack();        		    
        
            

	}

}
