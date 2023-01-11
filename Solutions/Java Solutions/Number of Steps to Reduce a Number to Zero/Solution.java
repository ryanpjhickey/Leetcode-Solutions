class Solution {
    public int numberOfSteps (int num) {

        int steps = 0; //define initial steps as 0

        while (num != 0) //while num is not 0, do the following until num = 0
        {
            if (num % 2 == 0)  //if num divded by 2 has no remaider, divide by 2
            {
                num /= 2;
            } 
            else //otherwise, set num to num-1
            {
                num--;
            }
            steps++; //steps + 1
        }
        return steps; //return value of steps needed to reduce to 0
    }
}