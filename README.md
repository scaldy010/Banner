

##Ca 2 for  Algorithms and Constructs

## Project Title: AndroidsRus code name Banner

### Project Date: 27/03/2019

Assignment Compiler: Mark Morrissey 

* Weighting: Marked out of 100, worth 25% 

* Due Date: 24/04/2019 - 23:55 

* Method of Submission: Moodle Submission 


### Module Learning Outcome: 
1. identify and select appropriate algorithms and constructs for a given real-world
problem by differentiating between the complexity, scalability and efficiency of
different candidate solutions.
2. deconstruct a given construct and/or algorithm by analysing and criticising its space
and time complexity in terms of lower and upper theoretical bounds.
3. select and integrate multiple algorithms and constructs to solve a larger problem in
a real-world context while identifying and appraising the trade-offs of different
candidate approaches in terms of space and time complexity.



### The Project
write a programme to create robots

### AndroidsRus is a company that produces robots. They currently produce:
1. Android mk1 
2. Android mk2 
1. Android mk3  
1. Android mk4
1. Android mk5


### They are putting into production a new line of Androids:

1. Andy the Android
1. Betty the Busibot
1. Bobi the racedroid
1. Fred the Friendlybot

### you have been tasked to scavenge parts for this new line of Androids from the existing inventory list of the company.

- All Androids have the following parts:

1. brain : 2.5GHZ / 3.5GHZ / 4.5GHZ
1. mobility :catapilar tracks  / wheels / legs
1. vision : heat vision / full colour / night vision
1. arms : claws / grippers / articulated fingers
1. media center :sony / jvc / meridian
1. Power Plant : lithium / hydrogen / plasma (40 watt range)

- you must generate a data set of the existing line of Androids of at least 500 units.




### example output of existing Android:

        model : MK3

        serial number : 1098904 (randomly generated and unique)

        brain : 3.5GHZ

        mobility : Legs

        vision : Full Colour

        arms : articulated fingers

        media center : meridian

        Power Plant : Hydrogen

### randomly create a mix of existing inventory

use these products to gather parts for the new range
you must state which existing Android donated each part, no more than 2 parts from the same Android.

### example output of new product

        Model : Fred the Friendlybot

        SerialNum: 1234567(randomly generated and unique)
        
        Brain: 2.5GHZ (MK1 :serialNum : 2345354)
        
        Mobility: Caterpillar Track (MK3 :serialNum :5687935)
        
        Vision : Night Vision (MK5 : serialNum : 0980794)
        
        Arms: grippers (MK1 :serialNum : 2345354)
        
        Media Center : Meridian (MK2 : serialNum : 1239055)
        
        Power Plant : Plasma (MK5 : serialNum : 3542277)

### create 400 of the new line of Androids (random mix of models)



### You must provide a way for a user to search the new and donor inventory:
####A user can search for and view:
1. All available models of a particular type. (eg. View all Betty the Busibot models)
1. One model of a particular type (eg. Single Andy the Android)
1. Total counts of available types (eg how many Andy, how many Betty…etc.)
1. A model that donated a particular part (ie. output of donor model and part donated and receiving model)

1. You must design algorithms to generate the test data.
1. You must design algorithms to search the test data.
1. You must design algorithms to display the test data.
1. Your algorithm design must take into account the space (data structure) and time required for them to run (Big O) the decisions taken on this are to be explained in your documentation.

### Your submission must include:
1. Design document – analysis, class diagram, reasoning behind your design choices.
1. Personal report – document detailing your thoughts on the design and a reflection on the process (problems / what you would do differently next time). This document saved as :  your name_your student number. 
1. Netbeans project folder – working program (including dependencies if any)

### One submission file  – include all material in one zip file to be uploaded to moodle.

### Notes : (program must run, no debugging will be attempted)
Anything other than a Netbeans project will not be graded
Along with your report / documentation you must only submit a netbeans project folder; 
all submitted materials should be compressed into a folder named after a student and student number :eg first name_second name_studentNo.zip.
Documentation:
API documentation can be generated from within netbeans (uses comments on your code)
Requirements gathering and analysis (part of design doc): 
This needs to be a detailed account of the functions of the program (step by step walkthrough with a typical user) and the reasoning behind your design choices (classes, inheritance, data structures algorithmic design etc.).


### Marking scheme summary
1. Object Oriented design	0 – 10 marks
1. Algorithmic design	0 – 40 marks
1. Requirements gathering / analysis report	0 – 10 marks
1. Program functionality / fit for purpose	0 – 40 marks
1. Total	100%

