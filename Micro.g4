grammar Micro;


@lexer::members {
    int commentCount = 0;
    int lineCnt = 0;
}

WS : ('\t' | '\n' | '\r' | ' ')+
           -> skip;

TEXT : [a-zA-Z0-9]+ ':='*  '='* '>'* ;

//TEXT : .*;

COMMENT : '--' ~[\n\r]*  {{ System.out.println("Found a comment ... currnet = " + (++commentCount)); }}
        | '//' ~[\n\r]* {{ System.out.println("Found a comment ... currnet = " + (++commentCount)); }}
        | '#' ~[\n\r]*;


/* Program */
program :
    (TEXT | COMMENT) * EOF;
