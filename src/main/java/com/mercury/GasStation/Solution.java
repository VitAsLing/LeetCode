package com.mercury.GasStation;

public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currTank = 0;
        int startingStation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalTank += gas[i] - cost[i];
            currTank += gas[i] - cost[i];
            // 如果无法到达下一个加油站
            if (currTank < 0) {
                // 从下一个加油站重新开始
                startingStation = i + 1;
                // 重置当前油箱
                currTank = 0;
            }
        }
        return totalTank >= 0 ? startingStation : -1;
    }
}
