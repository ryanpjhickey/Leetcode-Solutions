public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> newList = new ArrayList<String>(n);
        for(int index=1; index<=n; index++) {
            String empty = ""; //create an empty string
            if (index % 3 == 0 && index % 5 == 0) { //if divisible by 3 and 5, add FizzBuzz to string
               empty+="FizzBuzz";
            } else if (index % 3 == 0) { //if divisible by 3 add Fizz to string
               empty+="Fizz";
            } else if (index % 5 == 0) { //if divisible by 5, add Buzz to string
               empty+="Buzz";
            } else { //otherwise, change current index to value of empty
               empty=String.valueOf(index);
            }
            newList.add(empty);
        }
        return newList;
     }
}

// Outputs: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]