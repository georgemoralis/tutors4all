package tutorials.regexpart1;


public class regex1 {
    public static void main(String[] args)
    {
        String data = "Apple Orange Banana Grapefruit";
        String[] fruits = data.split(" "); 
        
        for(String str : fruits)
        {
            System.out.println(str);
        }
        
        String datawithspaces ="Apple    Orange     Banana    Grapefruit";
        String[] fruits2 = datawithspaces.split("\\s+"); //s for space  , + for one or more spaces
        
        for(String str : fruits2)
        {
            System.out.println(str);
        }
        String datawithdots ="Apple.Orange.Banana.Grapefruit";
        String[] fruits3 = datawithdots.split("\\."); //split in dots
        
        for(String str : fruits3)
        {
            System.out.println(str);
        }
        String onlynumbers ="Apple.123Orange.456Banana.789Grapefruit"; 
        System.out.println(onlynumbers.replaceAll("\\d", "")); //all numbers
        System.out.println(onlynumbers.replaceAll("\\D", "")); //all non-numbers
        System.out.println(onlynumbers.replaceAll("[^0-9]+", "")); //NOT multiple numbers
        System.out.println(onlynumbers.replaceAll("[a-zA-Z]+", "")); //all letters
        System.out.println(onlynumbers.replaceAll("[^a-zA-Z]+", "")); //all non-letters
        
    }
}
