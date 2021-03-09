import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "HELLO WORLD HELLO";
		
		String str[] = s.split(" ");
		
		System.out.println("Original string array: " 
                + Arrays.toString(str));
    
    /*
     * convert array to list and then add all
     * elements to LinkedHashSet. LinkedHashSet
     * will automatically remove all duplicate elements. 
     */
    LinkedHashSet<String> lhSet1 =  
            new LinkedHashSet<String>(Arrays.asList(str));
    
    //create array from the LinkedHashSet
    String[] newArray = lhSet1.toArray(new String[ lhSet1.size() ]);
    
    System.out.println("Array after removing duplicates: " 
            + Arrays.toString(newArray));

}

	}

