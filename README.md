# Airline-Reservation-System

An Airline Reservation System which provides options for both customers as well as admin. The system interface is designed in such a way that the user/admin can return to the previous screen at any point of time.

Customer can signup/login throught their account and can check their previous bookings as well as they can also look for new flights to book their new tickets.

Admin has the privilege of adding new flights and also he/she can modify the details of existing flights. The login details of admin are as follows->

**Admin ID->** admin

**Password->** admin

## Technology Stack

***Languages->*** Java

***Tools and Frameworks->*** Java Swing and Eclipse

***Database->*** Files

## Run

In your Eclipse Software or any other software which supports Java and Swing, run HomeScreen.java file.

jcalendar.jar file is required additionaly for date UI.


## Interface of the System

![Home Screen of system](https://user-images.githubusercontent.com/70293103/111221530-a0c02100-8600-11eb-9664-5c434891e142.png)
                                             
**Interface of Admin Side**

![Admin Login Page](https://user-images.githubusercontent.com/70293103/111221577-b0d80080-8600-11eb-9334-83addf0ddec2.png)

*I have also handled the cases like empty field and wrong id/password in the admin login section.*

*Facility of show/unshow password is also provided.*

![Admin Login Successful](https://user-images.githubusercontent.com/70293103/111221604-b897a500-8600-11eb-820b-b17f866b1e29.png)
![Admin Home Screen](https://user-images.githubusercontent.com/70293103/111221617-bc2b2c00-8600-11eb-92aa-50c2906dea97.png)
![Add Flights Screen](https://user-images.githubusercontent.com/70293103/111221630-bf261c80-8600-11eb-8d36-d197ff93723c.png)
![Modify Flights Screen](https://user-images.githubusercontent.com/70293103/111221643-c4836700-8600-11eb-8f74-fd05cbf2c6e5.png)

**Interface of Customer Side**

*A customer needs to signup before logging into the system.*

*I have handled several cases in the signup screen. Also the facility of show/unshow password is also provided.*

*Cases which are handled are->*

*● Password and Confirm Password fields should be same.*

*● No Fields can be left empty.*

*● Invalid email formats are not accepted.*

![Empty Field](https://user-images.githubusercontent.com/70293103/111223786-9f442800-8603-11eb-990c-c9161421c630.png)
![Invalid email](https://user-images.githubusercontent.com/70293103/111223797-a23f1880-8603-11eb-8dbf-abf51be4c584.png)
![Successful signup](https://user-images.githubusercontent.com/70293103/111223804-a408dc00-8603-11eb-9b3d-999ff567745b.png)

*After Signup, Customer needs to login.*

*Email id and Password are verified in database and login is allowed.*

![Login](https://user-images.githubusercontent.com/70293103/111225969-7bceac80-8606-11eb-815e-ebf2ebabdad1.png)

*This is the home screen of a customer through which he can search flights or check previous bookings*

![Home Screen customer](https://user-images.githubusercontent.com/70293103/111226268-dcf68000-8606-11eb-92d4-1ede7a9364db.png)

![Screenshot (330)](https://user-images.githubusercontent.com/70293103/111226350-fa2b4e80-8606-11eb-89ac-155c8a106943.png)

*In Search flights Screen,if no such flights are available in database, so it will display the message*

![Screenshot (329)](https://user-images.githubusercontent.com/70293103/111226359-fd263f00-8606-11eb-9ed7-f56cf4d261c6.png)

*A list of flights for given source and destination are displayed. Customer can select any one of those flights for booking and provide the required details*

![Screenshot (333)](https://user-images.githubusercontent.com/70293103/111226588-5b532200-8607-11eb-81fe-cd63704ee7c7.png)

*After Completion of booking, Boarding pass is generated for the same*

![Screenshot (335)](https://user-images.githubusercontent.com/70293103/111227080-0bc12600-8608-11eb-952a-bbaa66cd1d6b.png)

*Customer can also check Previous Bookings in which he will be displayed list of flight id's of hos previous booking*

![Screenshot (336)](https://user-images.githubusercontent.com/70293103/111227074-082d9f00-8608-11eb-9a9e-76aad21abbd5.png)

*After selcting the required flight, customer can check boarding pass of his previous booking*

![Screenshot (335)](https://user-images.githubusercontent.com/70293103/111227080-0bc12600-8608-11eb-952a-bbaa66cd1d6b.png)

## Author

Kirti Kunj Bajpai

Interests-> Development and Data Structures and Algorithm

If you have any queries/doubts regarding the project, mail me at kkbajpai.kk@gmail.com

If you liked the repo then please support it by giving it a star ⭐!
