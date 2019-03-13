grammar Brochure;

start   : 'columns' ':' COLS column
          ('width'  ':' NUM 'in'
          'height' ':' NUM 'in' )? ;


column  : COLNUM ('=')+
          (title)?
          (section)?
          (header)?
          (footer)?
          (body)?
          (item)?
          (image)?
          | ;

title   : TITLE   '{' TEXT '}' ;
section : SECTION '{' (title)? (header)? (footer)? (body)? (item)? (image)? '}' ;
header  : HEADER  '{' TEXT '}' ;
footer  : FOOTER  '{' TEXT '}' ;
body    : BODY    '{' TEXT '}' ;
item    : ITEM    '{' (DATE)? (TIME)? CONTENT '}' ;
image   : IMAGE   '{' (TAG)? (URL) '}' ;


TITLE   : ('T' | 'Title') ;
HEADER  : ('H' | 'Header' | 'Head') ;
FOOTER  : ('F' | 'Footer' | 'Foot') ;
SECTION : ('S' | 'Section' | 'Sect') ;
BODY    : ('B' | 'Body') ;

ITEM    : ('I' | 'Item') ;
DATE    : DIGIT DIGIT SEP DIGIT DIGIT SEP DIGIT DIGIT ;
SEP     : ('.' | '/' | '-') ;
TIME    : DIGIT DIGIT ':' DIGIT DIGIT ;
CONTENT : TEXT ;

IMAGE   : ('IMG' | 'Image') ;
TAG     : TEXT ;
URL     : ('http://'|'https://')? ('www.')? (TEXT)(.)(TEXT) ('/')?  ;

COLS    : ('2' | '4' | '6') ;
COLNUM  : [1-6] ;

NUM     : [0-9]+ ('.' [0-9]+)? ;
DIGIT   : [0-9] ;
TEXT    : [a-zA-Z]+ ;
WS      : [ \t\r\n] -> skip ;
