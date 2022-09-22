This Repository is used for validating Json File Key and Value Pairs.


I have used Maven to build this Project
Please ensure whether Java and Maven is installed in the System.

<<Folder Name>>\SampleDemo\src\main\java\com\demo\test\SampleDemo

**This Project Consists of two Main Java Files**
1.BaseClass.java       
  This class is created to load the Json file and store the Json Objects
2.ReusableComponents.java   
  There are two methods in this class for  validating the Player's Country & Role.
  
**To Execute the Test Cases:**

1.ValidatePlayersCountry.java  <<<This class is created to validate whether team has 4 Foreign Players.>>>
2.ValidatePlayersRole.java     <<<This class is created to validate whether team has atleast 1 wicket-keeper.>>>


**Instructions to Run the project :**
1. Download the project and Open the Project in Eclipse IDE.
  
  <Folder Name>\SampleDemo\src\main\java\com\demo\test\SampleDemo
2. RightClick on the Project and Select->Maven->Update Project.
3. To Run the Project, 
  
  To Perform the the Tests, Navigate to the Path
      <Folder Name>\SampleDemo\src\test\java\com\demo\test\SampleDemo
    
  1.Test that Validates that the team has only 4 Foreign Players - 
     To perform this Test , Rightclick and Run this "ValidatePlayersCountry.java" File as "TestNG Test"
  
  2.Test that Vaidates that the team has atlease 1 Wicket-Keeper - 
     To perform this Test , Rightclick and Run this "ValidatePlayersRole.java" File as "TestNG Test"
        
  ********
