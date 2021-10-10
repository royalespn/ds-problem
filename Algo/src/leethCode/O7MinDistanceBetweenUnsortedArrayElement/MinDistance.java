package leethCode.O7MinDistanceBetweenUnsortedArrayElement;

public class MinDistance {

    int minDistance(int[] arr, int x, int y){
        int minValue = Integer.MAX_VALUE;

        for(int i =0; i< arr.length; i++){

            for(int j =0; j <  arr.length; j++){

                if (arr[i]==x && arr[j]==y || arr[i] ==y && arr[j] ==x
                && minValue > Math.abs(i-j))
                {
                    minValue = Math.abs(i-j);
                }


            }
        }
        return minValue;
    }
}
