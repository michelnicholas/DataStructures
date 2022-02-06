import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    /*
    What is an Array List?
    ArrayList is an implementation of java.util.List interface.
    ArrayList is back by an Array.

    How ArrayList is different from Array?
    ArrayList:
    ArrayList size grows dynamically when we ADD MORE and MORE elements.
    ArrayList provides various methods to work with the elements.

    Array:
    Array is FIXED size but compartively faster.
    Array can be multi-dimensional like 2D and 3D arrays.

    Implement the method getUnAssignedCodes() in the following code.
    Such that, unAssignedCodes = allCodes - assignedCodes
     */

    public static void main(String[] args) {
        // Data
        String[] allcodes = {"001","002","003","004","005","006","007","008","009"};
        // Dynamic Data
        String[] assignedCodes = {"003","004"};
        // New String array  unAssignedCodes = allCodes - assignedCodes
        String[] unAssignedCodes = getUnAssignedCodes(allcodes,assignedCodes);
        //Printed out new array
        System.out.println(Arrays.toString(unAssignedCodes));


    }

    // Created GetUnassigned Function to parse in our two arrays in the parameters
    static String[] getUnAssignedCodes(String[] allcodes, String[] assignedCodes){
        // Used List <> to create new Array list and parsed in the string array allCodes to Arrays class with function
        // as list
        List<String> list = new ArrayList(Arrays.asList(allcodes));
        // Used List <> to create new Array list and parsed in the string array assignedCodes to Arrays class with function
        // as list
        List<String> list2 = new ArrayList(Arrays.asList(assignedCodes));
        // used list object to get methods inside and used removeAll from list2
        list.removeAll(list2);
        // returned the proper array size with a new string array without list 2
        return list.toArray(new String[list.size()]);


    }

}
