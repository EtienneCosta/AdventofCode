grammar Day2;

passwords returns [List <Integer> resultOut ]
            @init{
                $resultOut= new ArrayList<>();
                 }
                 : password[$resultOut] (password[$resultOut])*{
                     
                                                                int result=$resultOut.stream().mapToInt(Integer::intValue).sum();
                                                                 System.out.println("Valid Passwords: "+result);
                                                          }
          ;
password [List <Integer> resultIn] : n1=NUMBER'-'n2=NUMBER key=WORD ':' pass=WORD {
                                            int count=0;
                                            int lowerBound= $n1.int;
                                            int upperBound= $n2.int;
                                            char key = $key.text.charAt(0);
                                            String p = $pass.text;

                                            for(char c : p.toCharArray())
                                                if(c==key)
                                                    count++;

                                            if(lowerBound<=count && count<=upperBound)
                                                $resultIn.add(1);                        
                                    }   
                                    ;                                                            
// Lexer 
NUMBER : [0-9]+;

WS: [\t\r\n ]+ -> skip ;

WORD: [a-z]+
    ;