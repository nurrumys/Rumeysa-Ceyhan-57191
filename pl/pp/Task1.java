public class Task1 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, -3, -2, -1};
        Result result = processArray(inputArray);

        if (result != null) {
            System.out.println("Number of negative values: " + result.negativeCount + ", Sum of positive values: " + result.positiveSum);
        } else {
            System.out.println("Empty array");
        }
    }

    public static Result processArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        int countNegatives = 0;
        int sumPositives = 0;

        for (int num : array) {
            if (num < 0) {
                countNegatives++;
            } else if (num > 0) {
                sumPositives += num;
            }
        }

        return new Result(countNegatives, sumPositives);
    }
}

class Result {
    int negativeCount;
    int positiveSum;

    Result(int negativeCount, int positiveSum) {
        this.negativeCount = negativeCount;
        this.positiveSum = positiveSum;
    }
}


















