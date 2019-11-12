// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
// Assumes the string contains only lowercase letters.

public class FirstUniqueChar { // Finds first unique character of an array and returns its index if it exists
	    public int firstUniqChar(String s) {
	        int[] countArr = new int[26]; // Array to correspond to each letter
	        for(int i = 0; i < s.length(); i++) // Fills array with count of each letter in string
	            countArr[s.charAt(i)-'a']++;
	        for(int j = 0; j < s.length(); j++){
	            if(countArr[s.charAt(j)-'a'] == 1)
	                return j;
	        }
	        return -1;
	    }
}


