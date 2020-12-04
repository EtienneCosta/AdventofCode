grammar Day3;

@header{
import java.util.*;
}

@members {

    int getNumberofTrees(int level,int position,List <String> map,int right,int down){
        int trees=0;

        if(down%2==0){
        int size = map.size()-1;
        while(level!=size) {
                position+=right;
                level+=down;
                 if( map.get(level).charAt(position)=='#')
                     trees++;
                }
        }

        else{

        int size = map.size()-2;
        int mapSize = map.size();

        while(size>=0 ){
                position+=right;
                level+=down;

                 if( map.get(level).charAt(position)=='#')
                     trees++;

                 size--;
                            }
        }
            return trees;
    }
}

lines returns [List <String> mapOut] 
            @init{
                $mapOut = new ArrayList<>();
            }
                                    : line[$mapOut] (line[$mapOut])*{

                                        int slope1 = getNumberofTrees(0,0,$mapOut,1,1); 
                                        int slope2 = getNumberofTrees(0,0,$mapOut,3,1);                                     
                                        int slope3 = getNumberofTrees(0,0,$mapOut,5,1); 
                                        int slope4 = getNumberofTrees(0,0,$mapOut,7,1); 
                                        int slope5 = getNumberofTrees(0,0,$mapOut,1,2); 
                                        
                                    System.out.println("Result : "+slope1*slope2*slope3*slope4*slope5);

                                    }                                                                        
                                         ;
line [List <String> mapIn] : MAP {

                            String s = $MAP.text;

                            for(int i=0;i<7;i++)
                                s = s.concat(s);
                            
                            $mapIn.add(s);
                            
                                }
                                      ;

// Lexer 
WS: [\t\r\n ]+ -> skip ;
MAP: [.#]+ ;