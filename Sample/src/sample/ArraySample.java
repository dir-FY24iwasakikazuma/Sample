package sample;

import java.util.Iterator;

public class ArraySample {

    public static void main(String[] args) {
        var numbers = new int [5];
        
        for (var i = 0; i < numbers.length; i++) {
            numbers [i] = i * 2; //配列の各要素に値を代入
            System.out.println(numbers[i]);
        }
    }
}//各列の要素を表示
       
   

