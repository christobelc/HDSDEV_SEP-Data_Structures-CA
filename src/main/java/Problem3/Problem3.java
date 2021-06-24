package Problem3;

public class Problem3 implements P3Interface{

        public Problem3(){
        }

        // remainder: starts off as the GOAL SUM, and we start taking elements away
        // index: which element of the array we are going to take away or skip this iteration
        // count: number of elements we have currently subtracted from remainder
        @Override
        public boolean hasQuadruplet(int[] arr, int remainder, int count, int index){

            // We have taken away four elements and remainder - this four elements equals 0
            // the sum of these four elements is the initial value of remainder
            if(count == 4 && remainder == 0){
                return true;
            }

            // We have subtracted more and 4 elements || the elements we have currently subtracted have
            // already summed to something greater than our goal || we have reached the last element in the array
            if(count > 4 || remainder < 0 || index == arr.length){
                return false;
            }

            // Left branch:
            // Take the element at index away from remainder
            // Bookkeep that we took an element by adding 1 to count
            // Add one to index so that we look at the next element in the array on the next call

            // Right branch:
            // Skip this element
            // Don't increase count since we skipped the element
            // Add one to index so we check the index on the next call
            return hasQuadruplet(arr, remainder - arr[index], count + 1, index + 1) ||
                    hasQuadruplet(arr, remainder, count, index + 1);
        }
}
