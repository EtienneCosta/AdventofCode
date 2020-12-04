grammar Day3;

lines returns [List <String> mapOut] 
            @init{
                $mapOut = new ArrayList<>();
            }
                                    : line[$mapOut] (line[$mapOut])*{
                                
                                    int trees = 0;
                                    int level = 0;
                                    int position=0;
                                    int size = $mapOut.size()-2;

                                    while(size>=0 ){

                                       position+=3;
                                       level++;

                                        if($mapOut.get(level).charAt(position)=='#')
                                            trees++;

                                        size--;
                                    }

                                    System.out.println("Number of trees: "+trees);

                                    }                                                                        
                                         ;

line [List <String> mapIn] : MAP {

                            String s = $MAP.text;

                            for(int i=0;i<5;i++)
                                s = s.concat(s);
                              
                            $mapIn.add(s);
                            
                                }
                                      ;

// Lexer 
WS: [\t\r\n ]+ -> skip ;
MAP: [.#]+ ;