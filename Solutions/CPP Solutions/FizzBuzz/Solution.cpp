class Solution {
public:
   vector<string> fizzBuzz(int n) {
        vector<string> newVector; //create empty vector string
        for(int index=1; index<=n ; index++) {
            if(index % 3 == 0 && index % 5 == 0) { //if divisible by 3 and 5, add FizzBuzz to string
                newVector.push_back("FizzBuzz");
            }
            else if(index % 3 == 0) { //if divisible by 3 add Fizz to newVector
                newVector.push_back("Fizz");
            }
            else if(index % 5 == 0) { //if divisible by 5, add Buzz to newVector
                newVector.push_back("Buzz");
            }
            else { //otherwise, change current index to value of newVector
            newVector.push_back(to_string(index));
            }
        }
        return newVector;

    }
};

// Outputs: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]