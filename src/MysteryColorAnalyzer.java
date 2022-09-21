
import java.util.*;

interface MysteryColour {
     int noOfDistinctColors(List<Color> mysteryColours);
     int colorOccurrence(List<Color> mysteryColors, Color color);
    }
enum Color{
    RED, GREEN, BLUE
}
public class MysteryColorAnalyzer implements MysteryColour{

    @Override
    public int noOfDistinctColors(List<Color> mysteryColours) {
       HashSet<Color> hs = new HashSet<>(mysteryColours);
       return hs.size();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int occurrenceOfColor = 0;
        for (Color item: mysteryColors)
            if(item.equals(color))
                occurrenceOfColor++;
        return occurrenceOfColor;

    }

    public static void main(String[] args) {
       List<Color> list = new ArrayList<>();
       list.add(Color.RED);
       list.add(Color.BLUE);
       list.add(Color.GREEN);
       list.add(Color.GREEN);
       MysteryColorAnalyzer analyzer = new MysteryColorAnalyzer();
        System.out.println("Number of Distinct colors are : "+analyzer.noOfDistinctColors(list));
        System.out.println("The color occurred "+analyzer.colorOccurrence(list, Color.GREEN)+" times");


    }
}