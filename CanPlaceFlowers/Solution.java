package CanPlaceFlowers;

public class Solution {
    // public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    //     int l = flowerbed.length;
    //     int count = 0;
    //     if(l < 2 && n > 1)
    //         return false;
    //     if(l == 1){
    //         if(flowerbed[0] == 1 && n == 1)
    //             return false;
    //         else
    //             return true;
    //     }
    //     for(int i = 0; i < l; i++) {
    //         int next = i + 1;
    //         int prev = i - 1;
    //         if( i == 0 && l > 1) {
    //             if(flowerbed[i] == 0 && flowerbed[next] == 0){
    //                 flowerbed[i] = 1;
    //                 count++;
    //             }
    //         }
    //         if(i == l-1) {
    //             if(flowerbed[i] == 0 && flowerbed[prev] == 0) {
    //                 flowerbed[i] = 1;
    //                 count++;
    //             }
    //         }
    //         else {
    //             if(flowerbed[i] == 0){
    //             if(flowerbed[next] == 0 && flowerbed[prev] == 0){
    //                 flowerbed[i] = 1;
    //                 count++;
    //             }
                
    //         }  
    //         }
    //     }
    //     if(count >= n){
    //         return true;
    //     }
    //     return false;
    // }

    public static boolean canPlaceFlowers(int [] flowerbed, int n){
        int l = flowerbed.length;
        int i = 0;
        int count = 0;
        if(l == 1){
            if(n != flowerbed[0])
                return true;
            return false;
        }
        else{
            while(i < l){
                if(count == n)
                break;
            int prev = i - 1;
            int next = i + 1;
            if(i == 0){
                if(flowerbed[i] == 0 && flowerbed[next] == 0){
                    flowerbed[i] = 1;
                    count++;
                }
                i = i + 2;
                continue;
            }
            if(i == l - 1){
                if(flowerbed[i] == 0 && flowerbed[prev] == 0){
                    flowerbed[i] = 1;
                    count++;
                }
                break;
            }
            else{
            if(flowerbed[i] == 0){
                if(flowerbed[prev] == 0 && flowerbed[next] == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
            if(i + 2 < l)
                    i = i+2;
            else{
                if(i+1 == l-1)
                    i = i + 1;
                else
                    break;
            }
            }
            
        }
        }
        if(count >= n)
            return true;
        return false;
    }


    public static void main(String[] args) {
        int [] arr = {0,1,0,1,0,1,0,0};
        System.out.println(canPlaceFlowers(arr, 2));
    }
    
}
