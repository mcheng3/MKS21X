#AgriPlanner


AgriPlanner uses historical weather data to give farming directions on fertilizing, watering, and harvesting, given the location, area, soil conditions, and date. It works on corn and wheat.

Working features:
Try changing the latitude of the city (Must be in the U.S.), and note the harvest date difference.
Try changing the city to a city of a different climate, and note the irrigation difference.
Try changing the soil type, and note the fertilization difference.


Unresolved bugs:
Compiling issues on Linux (e.g. git bash, Ubuntu).
Unreliable results when sowed in the winter, or close to winter.

Compiling Directions:
Running on a Windows command window is GREATLY preferred.

Linux:

javac -cp .:json-20160810.jar AgriPlannerUI.java

java -cp .:json-20160810.jar AgriPlannerUI

Windows:

javac -cp .;json-20160810.jar AgriPlannerUI.java

java -cp .;json-20160810.jar AgriPlannerUI


How to use:
Please DO NOT run more than two times in a minute, as the API call limit will be exceeded. 
Enter the information for as many of the 4 plots as you wish.
Enter the location information (Must be in the U.S.)
A typical amount of N is anywhere from 10-200 lb. N/acre
Press Submit
The directions are then printed in the terminal.
