package Utility;

import java.util.*;

class RailwayPlatforms {
    static int findPlatforms(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms_needed = 0, max_platforms = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms_needed++;
                max_platforms = Math.max(max_platforms, platforms_needed);
                i++;
            } else {
                platforms_needed--;
                j++;
            }
        }
        return max_platforms;
    }

    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        System.out.println("Minimum Platforms Needed = " + findPlatforms(arr, dep, n));
    }
}

