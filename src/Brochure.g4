grammar Brochure;

start     : page1 page2 EOF ;
page1     : column column column ;
page2     : column column column ;
column    : DIGIT '='+
           (titles | headers | footers | bodys | items | images)* ;

titles    : title  (titles)? ;
headers   : header (headers)? ;
footers   : footer (footers)? ;
bodys     : body   (bodys)? ;
items     : item   (items)? ;
images    : image  (images)? ;

title     : TITLE  O TEXT C ;
header    : HEADER O TEXT C ;
footer    : FOOTER O TEXT C ;
body      : BODY   O TEXT C ;
item      : ITEM   O ('Date' ':' DATE)? ('Time' ':' TIME)? TEXT C ;
image     : IMAGE  O ('Tag' ':' TEXT)? ('URL' ':' URL) C ;

O         : ('{' | '[' | 'begin') ;
C         : ('}' | ']' | 'end') ;
TITLE     : ('T' | 'Title') ;
HEADER    : ('H' | 'Header' | 'Head') ;
FOOTER    : ('F' | 'Footer' | 'Foot') ;
BODY      : ('B' | 'Body') ;
ITEM      : ('I' | 'Item') ;
IMAGE     : ('IMG' | 'Image') ;

DATE      : (DIGIT | TWODIGIT) SEP (DIGIT | TWODIGIT) SEP (TWODIGIT | FOURDIGIT) ;
SEP       : ('.' | '/' | '-') ;
TIME      : (DIGIT | TWODIGIT) ':' (TWODIGIT) WS* ('AM' | 'PM') ;
URL       : ('http://'|'https://') .*? [ \n] ;

TEXT      : '"' .*?  '"' ;            // Matches any character (except double quotes)
DIGIT     : [0-9] ;                   // Matches one digit
TWODIGIT  : [0-9][0-9] ;              // Matches only two digits
FOURDIGIT : [0-9][0-9][0-9][0-9] ;    // Matches only four digits
WS        : [ \t\r\n] -> skip ;       // Skip all whitespace
