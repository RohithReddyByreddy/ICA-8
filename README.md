# ICA-8
testing (individual)

Problem statement: 

How many urinals are free? 

In men's public toilets with urinals, there is this unwritten rule that you leave at least one urinal free between you and 
the next person peeing. For example if there are 3 urinals and one person is already peeing in the left one, you will 
choose the urinal on the right and not the one in the middle. That means that a maximum of 3 people can pee at the 
same time on public toilets with 5 urinals when following this rule (Only 2 if the first person pees into urinal 2 or 4).

Input 

A String containing 1s and 0s (Example:  10001 ) (1 <= Length <= 20). This string can come from the keyboard, or a file 
called urinal.dat. The program will continue processing until a -1 or <eof> is reached. (This means you handle unusual 
input without crashing.) 
  
A one stands for a taken urinal and a zero for a free one. 
  
Output 
  
If input is the keyboard, print the results to the screen. If input is from a file, output to rule.txt. If the file rule.txt already 
exists, increment a counter and rename the file using the following rule pattern:  rule1.txt, rule2.txt, etc. The output is 
JUST THE NUMBER of free urinals.
  
Test Examples

10001 returns 1  

1001 returns 0 

00000 returns 3 

0000 returns 2  

01000 returns 1 

src/ contains main and test java files.
Main

Select method through which you want to give input 
1.command line
2.text file
For CMD input Urinals count is displayed on screen
For Files then output is generated in src/ folder with incrementing number appended to file. If multiple Files are present, file with (rule(X).txt) highest X value is the latest output.
Test

Execute test in IntelliJ and all the test cases will be passed. If input is changed then test case need to be written

