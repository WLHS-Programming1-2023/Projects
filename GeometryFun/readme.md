# Geometry Fun - Project 1

The purpose of this assignment is to get some experience working with numeric data as well as demonstrating an understanding of good coding practices (writing clear, self-documenting code and following typical programming conventions).

## Overview

Write a program named geometry_fun.py which prompts a user for a positive whole number and outputs the following:
- The perimeter and area of a square whose side length is the entered number
- The radius, circumference, and area of a circle whose diameter is the entered number
- The perimeter and area of an equilateral triangle whose side length is equal to the entered number.

The program will use the command line for its input and output (I/O).

## Sample Output

Output should look like this (assuming 7 was entered):

*Please enter a whole number: 7*

*A square with side length of 7*

&nbsp;&nbsp;&nbsp;&nbsp; *has a perimeter of 28*

&nbsp;&nbsp;&nbsp;&nbsp; *has an area of 49*

*A circle with a diameter of 7*

&nbsp;&nbsp;&nbsp;&nbsp; *has a radius of 3.5*

&nbsp;&nbsp;&nbsp;&nbsp; *has a circumference of 21.991*

&nbsp;&nbsp;&nbsp;&nbsp; *has an area of 38.485*

*An equilateral triangle with side length of 7*

&nbsp;&nbsp;&nbsp;&nbsp;    *has a perimeter of 21*

&nbsp;&nbsp;&nbsp;&nbsp;    *has an area of 21.218*

## Technical details
- PI should be declared as a constant with 5 digits of precision: 3.1416.
- User input (the whole number) should be stored in an int.
- Results of all computations should be stored in variables (don’t do calculations and output at the same time).
- Program should use integer math when appropriate and floating point math when appropriate.
- The program should demonstrate the use of the tab character (\t)
- The program should demonstrate the use of the pow() and sqrt() functions.
- Decimal numbers should be output with 3 digits after the decimal point

As with all programs written in this course, maintainability is as important as functionality, so your code should be clear and easy to follow.  Make sure it follows the class coding conventions, and double check your code against this checklist before submitting.

- PEP-8: [https://peps.python.org/pep-0008/](https://peps.python.org/pep-0008/) or in a stylized form [https://pep8.org/](https://pep8.org/)
- Summary of PEP-8 for this class - coming soon
- Program Checklist - coming soon

## Extension - up to 5 pts extra credit
In addition to all the above, prompt for a number of sides and calculate and display the perimeter and area of a regular polygon with that number of sides (of the entered length). Note: the perimeter is easy, it’s the area that’s a challenge. While you may use Python functions (such as trig functions or pow), you may not use any built-in Python functions for directly calculating the perimeter or area of a regular polygon.

Note: Before attempting this portion, verify the rest of the program is correct, well written, and follows the programming guidelines. Extra credit will not be awarded unless the rest of the program is 100% correct.

## Submitting

Upload your .py file into Google Classroom along with your pseudocode
