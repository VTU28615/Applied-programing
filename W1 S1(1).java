class Solution {

    public int[] sortedSquares(int[] nums) {

        int arrayLength = nums.length;

        // Stores the squared values in sorted order.
        int[] sortedSquares = new int[arrayLength];

        // Two pointers starting from both ends.
        int leftIndex = 0;
        int rightIndex = arrayLength - 1;

        /*
         * Fill the result array from right to left
         * because the largest square will always come
         * from one of the two ends of the input array.
         */
        for (
            int resultIndex = arrayLength - 1;
            resultIndex >= 0;
            resultIndex--
        ) {

            int leftSquare = nums[leftIndex] * nums[leftIndex];
            int rightSquare = nums[rightIndex] * nums[rightIndex];

            // Place the larger square at the current result position.
            if (leftSquare > rightSquare) {

                sortedSquares[resultIndex] = leftSquare;
                leftIndex++;

            } else {

                sortedSquares[resultIndex] = rightSquare;
                rightIndex--;
            }
        }

        return sortedSquares;
    }
}
