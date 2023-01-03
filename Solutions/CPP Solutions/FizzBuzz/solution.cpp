class Solution {
public:
   vector<string> fizzBuzz(int n) {
        vector<string> newVector;
        for(int index=1; index<=n ; index++) {
            if(index % 3 == 0 && index % 5 == 0) {
                newVector.push_back("FizzBuzz");
            }
            else if(index % 3 == 0) {
                newVector.push_back("Fizz");
            }
            else if(index % 5 == 0) {
                newVector.push_back("Buzz");
            }
            else {
            newVector.push_back(to_string(index));
            }
        }
        return newVector;

    }
};