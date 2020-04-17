import java.util.ArrayList;

public class Permutation {

//This class finds permutations of number
    ArrayList<String> permutation = new ArrayList<String>();

    public ArrayList<String> permutate(String str, int start, int end) {
        if (start == end)
            permutation.add(str);
        else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                permutate(str, start + 1, end);
                str = swap(str, start, i);
            }
        }

        return permutation;
    }

    /**
     * Swap Characters at position
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
