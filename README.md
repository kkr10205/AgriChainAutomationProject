Problem 1:

import java.util.*;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar)) {
                continue;
            }
            map.put(currentChar, i);
        }

        return map.size();
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=scan.next();
        System.out.println("Longest substring length (str): " + lengthOfLongestSubstring(str)); 
    
    }
}




Problem 2:


Manual Test cases:

TestCaseId                     Summary                                                                                  Expected Result
TC_01                             Check Alignment of Input and Submit Button                                            Alignment  should be proper
TC_02                             Check user able to enter text in Input field or not.                                  User should be able to enter text in Input field
TC_03                             Check Submit Button is working or not  with valid input                               Clicking on Submit button it should redirect to result page
TC_04.                            Verify  Browser back button after reaching result page                                Should navigate back to Input page with input cleared or preserved
TC_05                             Cross browser testing on Chrome, Firefox, Safari, Edge.                               Application should behave same across different browser
TC_06.                            Check mobile view and responsiveness                                                  Application should work properly in mobile view

Automation Test cases:
TestCaseId                     Summary                                                                                  Expected Result
TC_01                              Submit valid input like "abcabcbb"                                                   Result page shows abc (length 3)
Tc_02                              Submit string with all unique characters "abcdef"                                    Result Shows as abcdef (length 6)
TC_03                             Submit string with all repeating characters "aaaa"                                    Result shows a (length 1)
TC_04.                            Submit string with numbers and symbols "a1b2c3"                                       Result shows as  a1b2c3 (Length   6)                     
TC_05                             Verify output with empty string                                                       User should not be able to click on Submit Button
TC_06                             Verify output with white space                                                        application should work as per the requirement
