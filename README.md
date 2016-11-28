# softwaretp2
Dependecies:
These libraries must be added to your project. 
- Junit: 
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.8</version>
</dependency>


To launch the tests, just run the directory "test" as a whole or each of its file separately.

*Property File*
The configuration file located in *src/main/java/resources* accept the following properties:
- emergencyType=default|[flood , earthquake]
- letUserChooseLanguage=yes|no
- informLocalisation=yes|no
- guidingUser=yes|no

The property "**emergencyType**" sets the type of disaster that the software accept and thus will treat. "**letUserChooseLanguage**" lets the possibility or not to let the user switch language by using the interpreter. "**informLocalisation**" will show the map or not. The map indicates the location of the natural disasters and the safe places. "**guidingUser**" indicates the path the nearest safe location if it's activated.

Ex:
letUserChooseLanguage=no 
informLocalisation=no 
emergencyType=flood
guidingUser=no 

This configuration will only treat generic natural disaster (no particular type) and floods. It will not let the user the possibility to change the language. Also it will not display the map with the different locations of natural disasters and safe places and also it will not inform of the path to the nearest safe place.

*Interpreter*
The interpreter accepts the following set of commands:
- location add x y radius 
- location remove x y radius
- language set language_id
- location set x y radius new new_x new_y new_radius
- earthquake set x y radius magnitude scale

where :
- location = safe_place | natural_disaster |  flood | earthquake
- x, y are integers
- radius is a double
- magnitude is an integer

"**add**" is used when adding a location. "**remove**" when needing to remove a location. The command "**set**" is used for updating coordinates or raidus of a location. It can also be used to set the language or to set the scale of an earthquake.

The tests present in *src/test/java/testInterpreter.java* are good examples of how to use the interpreter.


