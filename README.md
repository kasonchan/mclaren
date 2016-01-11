# Mclaren #

### Task ###

Write an application that finds the 3 longest unique palindromes in a supplied 
string. For the 3 longestpalindromes, report the palindrome, start index and 
length, in descending order of length.

### Example Output ###

Given the input string: `sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop`, the 
output should be:

```scala
Text: hijkllkjih, Index: 23, Length: 10

Text: defggfed, Index: 13, Length: 8

Text: abccba, Index: 5 Length: 6
```

### Deliverables ###

-  Your solution may be submitted in a language of your choice.
-  Please include instructions for how to build and run your code.
-  Don't forget to include any tests in the package.

### Guidance ###

-  You shouldn't spend more than a couple of hours on the solution.
-  We expect candidates to create code that is production quality - the solution 
should be correct, reliable, maintainable, reusable, portable and efficient.
-  For further guidance see Clean Code: A Handbook of Agile Software 
Craftsmanship by Robert C.Martin.

### Development ###

This application is built with the following:

-  [Scala](http://www.scala-lang.org/) version 2.11.7
-  [SBT](http://www.scala-sbt.org/) version 0.13.8

### Assumption ###

I assume the following when developing the code:

-  "a" single character is not a palindrome.
-  The program will only print the number of longest unique palindromes in a supplied string that it can find.
If the number of longest unique palindromes that the program can find is less than the number provided, 
then the program will not print the rest of the empty string.

```
> sbt "run sqrrqapop 3"

Text: qrrq, Index: 1 Length: 4
Text: pop, Index: 6 Length: 3
```

### Execution ###

Follow these steps to run the code:

1. Download this repository.
2. `Unzip` the downloaded repository.
3. `cd` into the this directory.
4. Enter `sbt "run <supplied string> <number of longest unique palindromes>"` to execute.

```
> sbt "run sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop 3"

Text: hijkllkjih, Index: 23 Length: 10
Text: defggfed, Index: 13 Length: 8
Text: abccba, Index: 5 Length: 6
```

### Testing ###

Follow these steps to run the code:

1. Download this repository.
2. `Unzip` the downloaded repository.
3. `cd` into the this directory.
4. Enter `sbt test` to test.
