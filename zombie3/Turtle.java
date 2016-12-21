import java.awt.Color;

public class Turtle {

	/**
	 *
	 * @author user
	 */
	    private int x;
	    private int y;
	    private boolean zombie;
	    private boolean recovered;
	    
	    public Turtle(boolean z)
	    {
	        this.zombie = z;
	    }
	    public void setLocation(int xIn, int yIn)
	    {
	        //erase old zombie location
	        StdDraw.setPenColor(StdDraw.WHITE);
	        StdDraw.filledCircle((double)this.x, (double)this.y, 6);

	        if (this.zombie == true) 
	        {
	            StdDraw.setPenColor(StdDraw.RED);
	            
	        }
	        
	        /*//****************
	        if (this.recovered == true && this.zombie == false)
	        {
	        	//StdDraw.setPenColor(StdDraw.GREEN);
	        }
	        //****************/	
	        
	        else
	        {
	        	//*******************
	        	if (this.recovered == true && this.zombie == false)
	        	{
	        		StdDraw.setPenColor(StdDraw.GREEN);
	        	}
	        	//********************
	        	else
	        	{
	        		StdDraw.setPenColor(Color.BLUE);
	        	}
	            
	        }
	         
	        this.x = xIn;
	        this.y = yIn;
	        StdDraw.filledCircle((double)this.x, (double)this.y, 5);
	        //StdDraw.show(1);
	    }
	    public boolean isZombie()
	    {
	        return this.zombie;
	    }
	    public void makeZombie()
	    {
	    	this.zombie = true;
	    }
	    
	    //************************
	    public boolean isRecovered()
	    {
	    	return this.recovered;
	    }
	    public void makeRecovered()
	    {
	    	this.zombie = false;
	    	this.recovered = true;
	    }
	    //************************
	    
	    public int getXLocation()
	    {
	        return this.x;
	    }
	    
	    public int getYLocation()
	    {
	        return this.y;
	    }

}
