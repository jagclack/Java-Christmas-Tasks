# Java-Christmas-Tasks

Action 1: A test run was performed initially on the Main.java object to assess the code's capability. The program returned the following statement: "boolean cannot be converted to int" with a reference to the line of code the issue was present.
Solution 1: On line 14, the word "false" was replaced with the integer "0" as the variable is not a boolean. 

Action 2: The code was rerun and this time a result was succesfully outputted. However, no "Fizz's" and no "Buzz's" were present in the array list sequences and "FizzBuzz" was present in parts of the sequences where it was not required. It was noticed on line 15 that the return statement was asking the program to return when the remainder of the numerator divided by the denominator was equal to 2. As the sequences would only consist of whole numbers, this seemed innapropriate. 
Solution 2: The return statement on line 15 was set equal to 0. 

Action 3: The code was rerun and this time "FizzBuzz" was present in all parts of the sequence where the number was divisible by 3 or 5, but no "Fizz's" or Buzz's" were present. It was also noticed this time that both sequences only ran up to 99 and 49 respectively. This was due to the condition statement in the for loop on line 21 not including the "endNumber".
Solution 3: The condition statement in the loop on line 21 was changed from "i < endNumber" to "i <= endNumber" to include the end numbers of 100 and 50 in the two sequences.

Action 4: The code was rerun and placeholders for 100 and 50 were present in the two sequences. In the first if statement on line 22 it was noticed that a not "!" operator was used for both cases of the denominator being 3 and the denominator being 5. This seemed innapropriate, as the code was required to return "FizzBuzz" when both statements were true. It also didnt't make sense that the "fizzBuzzList.add("FizzBuzz")" statement for was not included in this line, as "FizzBuzz" is what needed to be returned when both these statements were true.
Solution 5: The two not "!" operators on line 22 were removed. The "fizzBuzzList.add("FizzBuzz")" statement on line 31 was moved to the end of the statement on line 22. The "else" was removed from line 30.

Action 5: Rerunning the code this time returned "Fizz's" in the sequences for numbers divisible by 3, "Buz's" in the sequences for numbers divisible by 5 and "FizzBuzz's" in the the sequences for numbers divisible by 3 &  5.
Solution 5: Line 26 was updated to say "Buzz" not "Buz" in the add statement. The code was rerun and "Buzz" was returned in the sequences for numbers divisble by 5.
