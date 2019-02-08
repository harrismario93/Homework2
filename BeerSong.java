public class BeerSong 
{ 
    public static void Ninety_Nine_Bottles_of_Beer()
    {
    	int i=99;
    	for (i=3;i>1;i--) {
    		System.out.format("%d bottles of beer on the wall, %d bottles of beer\n",i,i);
    		if (i-1 != 1)
    			System.out.format("take one down, pass it around, %d bottles of beer on the wall.\n", i-1);
    		else
    			System.out.format("take one down, pass it around, %d bottle of beer on the wall.\n", i-1);
    	}
    	System.out.format("%d bottle of beer on the wall, %d bottle of beer\n",i,i);
    	System.out.format("take one down, pass it around, no more bottles of beer on the wall.\n", i-1);
    }
    public static void main(String args[]) 
    { 
    	Ninety_Nine_Bottles_of_Beer();
    } 
} 