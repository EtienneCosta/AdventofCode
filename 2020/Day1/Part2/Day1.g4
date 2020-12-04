grammar Day1;

@header {
  import java.util.*;
}

day1 returns [   List <Integer> arrayOut ]
        @init{
          $arrayOut = new ArrayList<>();
         }
                                  :  digit[$arrayOut] (digit[$arrayOut])*    {
                                    
                                    int size = $arrayOut.size();
                                    int result=0;
                                    for(int i= 0 ; i<size;i++){
                                        int x = $arrayOut.get(i);
                                        for(int j = i+1 ; j <size; j++){
                                            int y = $arrayOut.get(j);
                                                for (int k =j+1;k<size;k++)      
                                                if(x+y+$arrayOut.get(k) == 2020){
                                                    result = x * y * $arrayOut.get(k);
                                                    System.out.println("X: " +x+ " + Y: "+y+ " + Z: "+$arrayOut.get(k) + " = 2020" );
                                                    System.out.println("X: " +x+ " * Y: "+y+ " * Z: "+$arrayOut.get(k) + " = "+result );
                                            }
                                    }          
                                }                                                            
        } ;

digit [List <Integer> arrayIn] : NUMBER  {
                $arrayIn.add($NUMBER.int);
           }
        ;
// Lexer 
NUMBER : [0-9]+;
WS: [\t\r\n ]+ -> skip ;