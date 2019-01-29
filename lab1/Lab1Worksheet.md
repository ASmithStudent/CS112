# Lab 1 Worksheet

1. What if 12 bits were used to store a signed integer. What is the biggest/smallest possible integer?
	- Largest: 111111111111 = 4095
	- Smallest: 000000000000 = 0

2. Think about possible values and their range, say what type of variable would be suitable for the following, and suggest a name for it too. 

- For example: the temperature of a room in degrees Fahrenheit. Room temperature is likely to vary between say 50 degrees F and 100 degrees F,  but it can take any value in between including non-integers, e.g 71.19 F, so the type must be float or double depending on the accuracy required. A suitable variable name would be roomTemp. 


[i] The number of pages in a books
	- type: integer
	- var name: pages

[ii] The number of atoms in a book; 
	- type: long
	- var name: numAtoms

[iii] The length of a side of a triangle in inches;
	- type: float
	- var name: triangleSideLen

[iv] Your name; 
	- type: String
	- var name: name

[v] Whether or not a nucleus has decayed; 
	- type: Boolean
	- var name: nucleusDecayed

[vi] The probability that it could have decayed. 
	- type: double or float
	- var name: decayProb

3. Start to do a little java programming! 
	- Follow the example of the Hello.java program and do some testing of Java int and float.
	- Write a short class called “Arithmetic” that in its main method does the following:

		- Creates 4 local variables
			- Two ints (call them a and b)
			- Two floats (call them x and y)
		- Performs the following arithmetic operations on every combination of two of these and output using System.out.println each of the results
			- Addition
			- Division (in both directions)

