# Instructions
- Project is created using Java 8. JDK 1.8 required to build
- It is a maven project. Build project and run tests using command ```mvn clean install```
- Run the project using [Main.java](https://github.com/LaraibUMemon/AnimalsTask/blob/master/src/main/java/com/qiagen/Main.java) using command ```mvn exec:java -Dexec.mainClass="com.qiagen.Main"``` or by calling the main method directly through an IDE e.g. IntelliJ

# AnimalsTask
Using Strategy Pattern to display each category differently

This is the “animals” coding task.
It originates from http://www.starling-software.com/en/employment/interview-process   
It can be solved in different ways each depending which level of coding craftsmanship the programmer wishes to apply.

###### Level 1:

- As a general requirement: Please make sure I can execute the code on my local machine, i.e. please provide all required dependencies and installation documentation or a ready to use build configuration, e.g. a maven pom.xml, composer etc if needed.
- Please write a program that reads file input.txt.
- In this file you’ll find lines containing categories and data. The categories are “ANIMALS” and “NUMBERS”.
- Please note that categories are fix values, i.e. they are NOT determined by being written upper case.
- Each line following a category represents data items that belong to the previously read category (unless the new line represents a category itself)
- After reading and processing the file please output to the system console:
  - A sorted list of all unique data items of category “ANIMALS”, i.e.
  
ANIMALS:

cow

horse

moose

sheep

- A list of all unique data items of category “NUMBERS”, followed by “: “ and the number of occurrences of the respective data item
While there is a straightforward solution for Level 1 you can also try to reach higher levels if you like:

###### Level 2:
Provide Unit tests for your code.

###### Level 3:

- Please make sure you have correctly implemented code for categories NUMBERS and ANIMALS.
- Now, as a Change Request, you are to add functionality to your program that allows for processing a new category called "CARS"
- Read & process file „input2.txt“ which contains category „CARS“, as well as NUMBERS and ANIMALS.
- Data items are case insensitive, i.e. OPEL and Opel represent 1 unique data item
- Output the data for categories "ANIMALS" and "NUMBERS" as described in Level 1.
- Additionally, output the unique data items of category “CARS” as a backwards sorted list, each item written in lower case.
- Each data item output shall be followed by the item’s MD5 hash written in brackets.
  - Hint: using org.apache.commons.codec.digest.DigestUtils from commons-codec (or a similar library) for creating the hash is perfectly legal.
- I.e. the expected output for CARS shall be:

CARS:

vw (7336a2c49b0045fa1340bf899f785e70)

opel (f65b7d39472c52142ea2f4ea5e115d59)

bmw (71913f59e458e026d6609cdb5a7cc53d)

audi (4d9fa555e7c23996e99f1fb0e286aea8)

- Make sure the input file is read and processed only once (as if the file was large and expensive to process).
 

###### Level 4:

Do not use if/else, switch/case or Ternary Operations in your code.
The code should be written in a way that allows for adding more new categories (that might have even different logic and output formatting) without changing the existing code base (open closed principle).

