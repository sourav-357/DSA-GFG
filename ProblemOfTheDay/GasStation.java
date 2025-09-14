package ProblemOfTheDay;

class GasStation {
    public int startStation(int[] gas, int[] cost) {
        int totalGas = 0;   // total gas across all stations
        int totalCost = 0;  // total cost to travel all stations
        int tank = 0;       // current fuel in the tank
        int start = 0;      // candidate starting index

        // Step 1: Traverse all stations
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];   // total gas available
            totalCost += cost[i]; // total cost required
            tank += gas[i] - cost[i]; // gain/loss at this station

            // If tank becomes negative, we cannot reach next station
            if (tank < 0) {
                // Restart from next station
                start = i + 1;
                tank = 0; // reset the tank
            }
        }

        // Step 2: If total gas < total cost, no solution
        if (totalGas < totalCost) {
            return -1;
        }

        // Step 3: Otherwise, the start index is the answer
        return start;
    }
}