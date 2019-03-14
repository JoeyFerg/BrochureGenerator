grammar Brochure;

start   : column ;
//          'columns' ':' (WS)? NL
//          ('width' ':' NUM 'in' NL
//          'height' ':' NUM 'in' NL)?

column  : DIGIT '='+
          (title)?
          (section)?
          (header)?
          (footer)?
          (body)?
          (item)?
          (image)? ;

title   : TITLE   WS* '{' text {System.out.println("title");} '}';
section : SECTION WS* '{' (title)? (header)? (footer)? (body)? (item)? (image)? '}' ;
header  : HEADER  WS* '{' text {System.out.println("header");} '}' ;
footer  : FOOTER  WS* '{' text {System.out.println("footer");} '}' ;
body    : BODY    WS* '{' text {System.out.println("body");} '}' ;
item    : ITEM    WS* '{' NL*
          (WS* 'D' WS* ':' WS* DATE NL*)?
          (WS* 'T' WS* ':' WS* TIME NL*)?
          text {System.out.println("item");} '}' ;
image   : IMAGE   WS* '{' NL*
          (WS* 'TAG' WS* ':' text NL*)?
          (WS* 'URL' WS* ':' text NL*)
          {System.out.println("image");} '}' ;
text    : (LETTER | DIGIT | OTHER | WS)+ ;

DIGIT   : [0-9] ;
LETTER  : [a-zA-Z] ;
OTHER   : ["#$%&'()*+,\-./:;<=>?@\\[\]^_`|~] ;
WS      : [ \t] ;
NL      : [\r\n] -> skip ;

TITLE   : ('T' | 'Title') ;
HEADER  : ('H' | 'Header' | 'Head') ;
FOOTER  : ('F' | 'Footer' | 'Foot') ;
SECTION : ('S' | 'Section' | 'Sect') ;
BODY    : ('B' | 'Body') ;

ITEM    : ('I' | 'Item') ;
DATE    : DIGIT DIGIT SEP DIGIT DIGIT SEP DIGIT DIGIT ;
SEP     : ('.' | '/' | '-') ;
TIME    : DIGIT DIGIT ':' DIGIT DIGIT WS* ('AM' | 'PM') ;

IMAGE   : ('IMG' | 'Image') ;
//URL     : ('http://'|'https://') ('www.') (TEXT)(.)(TEXT) ('/')? ;

COLS    : ('2' | '4' | '6') ;

NUM     : [0-9]+ ('.' [0-9]+)? ;
