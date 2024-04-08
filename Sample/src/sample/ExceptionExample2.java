package sample;

import java.security.PublicKey;

public class ExceptionExample2 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            //ここに例外が発生する可能性のあるコードを書きます
            System.out.println("割り算開始");
            int a = divide(10, 0);
            System.out.println(a);
        } catch (ArithmeticException e) {
            //ArithmeticExceptionが発生した場合の処理を除きます
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } 
        finally {
            //例外の有無にかかわらず、実行されるコードを開く(オプション)
            System.out.println("割り算終了"); }
    }
    
        
      
    
    
        
            
            
         
       }
public static int divide(int a, int b) throws ArithmeticException {
    if (b ==0) {
        //0での除算を求めてみた場合,
        throw new ArithmeticException("ゼロ除算エラーです");
        
    }
    return a / b;
}
    }
    



