
class Solution {
    public int minimumRounds(int[] tasks) {
    
        Arrays.sort(tasks);
        int minRounds = 0;
        int taskCount = 0;
        int fail = -1;
        int length = tasks.length;
    
        for (int index = 0; index < length; index++) {
            taskCount++;
            if (index == length - 1 || tasks[index] != tasks[index + 1]) {
                if (taskCount == 1) {
                    return fail;
                }
                minRounds += taskCount / 3;
                if(taskCount % 3 != 0) minRounds++;
                taskCount = 0;
           }
        }
        return minRounds;
    }
}