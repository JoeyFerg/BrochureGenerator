grammar Brochure;

start       : 'columns' WS* ':' WS* DIGIT WS*
              'width'  WS* ':' WS* (DIGIT | TWODIGIT) WS*
              'height' WS* ':' WS* (DIGIT | TWODIGIT) WS*
              columns EOF ;

columns     : column (columns)? ;
column      : DIGIT '='+
             (titles | headers | footers | bodys | items | images)* ;

titles      : title  (titles)? ;
headers     : header (headers)? ;
footers     : footer (footers)? ;
bodys       : body   (bodys)? ;
items       : item   (items)? ;
images      : image  (images)? ;

title       : TITLE  '{' TEXT '}';
header      : HEADER '{' TEXT '}' ;
footer      : FOOTER '{' TEXT '}' ;
body        : BODY   '{' TEXT '}' ;
item        : ITEM   '{' ('DATE' ':' DATE)? ('TIME' ':' TIME)? TEXT '}' ;
image       : IMAGE  '{' ('TAG' ':' TEXT)? ('URL' ':' URL) '}' ;

TITLE       : ('T' | 'Title') ;
HEADER      : ('H' | 'Header' | 'Head') ;
FOOTER      : ('F' | 'Footer' | 'Foot') ;
BODY        : ('B' | 'Body') ;
ITEM        : ('I' | 'Item') ;
IMAGE       : ('IMG' | 'Image') ;

DATE        : (DIGIT | TWODIGIT) SEP (DIGIT | TWODIGIT) SEP (TWODIGIT | FOURDIGIT) ;
SEP         : ('.' | '/' | '-') ;
TIME        : (DIGIT | TWODIGIT) ':' (TWODIGIT) WS* ('AM' | 'PM') ;
URL         : ('http://'|'https://') .*? [ \n] ;

TEXT        : '"' .*?  '"' ;            // Matches any character (except double quotes)
DIGIT       : [0-9] ;                   // Matches one digit
TWODIGIT    : [0-9][0-9] ;              // Matches only two digits
FOURDIGIT   : [0-9][0-9][0-9][0-9] ;    // Matches only four digits
WS          : [ \t\r\n] -> skip ;       // Skip all whitespace
