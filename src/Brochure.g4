grammar Brochure;

start : ('width'  ':' WIDTH
         'height' ':' HEIGHT)?
         'numColumns' ':' COLS (column){COLS} ;
column : COLNUMBER ('=')+
         (title)?
         (header)?
         (body)?
         (image)?
         | ;

title   : TITLE '{'  TEXT  '}' ;
header  : HEADER '{'  TEXT  '}' ;
footer  : FOOTER '{'  TEXT  '}' ;
section : SECTION '{'   '}';
body    : BODY '{' TEXT '}' ;
item    : ITEM '{' (DATE)? (TIME)? CONTENT '}';
image   : IMAGE '{' (TAG)? (URL) '}';


WIDTH   : NUM 'in' ;
HEIGHT  : NUM 'in' ;

TITLE   : ('T' | 'Title') ;
HEADER  : ('H' | 'Header' | 'Head') ;
FOOTER  : ('F' | 'Footer' | 'Foot') ;
SECTION : ('S' | 'Section' | 'Sect') ;
BODY    : ('B' | 'Body') ;

ITEM    : ('I' | 'Item') ;
DATE    :   ;
TIME    :   ;
CONTENT : TEXT ;

IMAGE   : ('IMG' | 'Image') ;
TAG     : TEXT ;
URL     :   ;

COLS : ('2' | '4' | '6') ;
COLNUMBER : [1-6] ;

NUM  : [0-9]+ ('.' [0-9]+ )? ;
TEXT : [a-zA-Z]+ ;
WS   : [ \t\r\n] -> skip;
