# ResortManagementSystem
Java Console Based Application used OOPS concepts


**Project Title:** Resort Management System

**Project Description:** The Resort Management System is a Java-based application designed to manage various aspects of a resort, including room booking, room availability, employee management, and food ordering. It provides both staff and guests with an easy-to-use interface to interact with the resort's services.

**Team Size:** The project was developed by a team of two developers.

**Project Purpose:** This project was developed as part of a university assignment to demonstrate our proficiency in Java programming and software development concepts. It served as a practical exercise in building a text-based application with features commonly found in real-world resort management systems.

**Your Role:** My role in the project was that of a developer. I was responsible for coding, testing, and refining various components of the application.

**Specific Tasks Performed:**
1. Designed and implemented the core classes for managing rooms, including luxury and deluxe twin rooms, as well as luxury and deluxe solo rooms.
2. Developed the booking and checkout logic for rooms, including handling multiple guests in twin rooms.
3. Implemented the food ordering system, allowing guests to order food items for their rooms.
4. Created the staff login system with options to display room details, room availability, and view staff details.
5. Participated in code reviews and collaborated with the team member to integrate different components of the system.
6. Assisted in testing and debugging to ensure the application's functionality and correctness.

**Key Technologies Used:**
- Java for the application's core logic and functionality.
- Eclipse IDE for Java development.
- Command-line interface for user interactions.

**Results/Impact of the Project:** The Resort Management System project successfully demonstrated our ability to create a functional and user-friendly application for managing various aspects of a resort. It showcased our skills in Java programming, object-oriented design, user input validation, and data management. While the project was developed for educational purposes, it provided valuable experience in software development that can be applied to real-world applications.

**Technology Used:**
- **Application**: Java
- **Database**: None (The project primarily relies on in-memory data structures)
- **Front End**: Command-line interface (CLI)
- **Back End**: Java application logic

**Functionality:**
The Resort Management System offers various functionalities, including:
1. **Room Management**: Users can view room details, check room availability, book rooms, and check out from rooms.
2. **Food Ordering**: Guests can order food items for their rooms.
3. **Employee Management**: Staff can view employee details.

**Data Flow of the Project:**
1. **User Interaction**: Users interact with the system through a command-line interface (CLI).
2. **User Authentication**: Users log in as either admin, regular users, or staff members.
3. **User Functionality**: Depending on the user type, they can access specific functionalities:
   - **Admin**: Room management (view details and availability), employee management.
   - **User**: Room management (view details, availability, book rooms, check out), food ordering.
   - **Staff**: View employee details.

**Module Functionalities:**

**Admin:**
- **Room Management**:
  - View details of different room types (Luxury Twin, Deluxe Twin, Luxury Solo, Deluxe Solo).
  - Check room availability.
- **Employee Management**:
  - View employee details.

**User:**
- **Room Management**:
  - View room details.
  - Check room availability.
  - Book rooms (Luxury Twin, Deluxe Twin, Luxury Solo, Deluxe Solo).
  - Check out from rooms.
- **Food Ordering**:
  - Order food items (Sandwich, Pasta, Noodles, Coke) for the room.
  
**Staff:**
- **Employee Management**:
  - View employee details.

This data flow allows different types of users to access specific functionalities of the system based on their roles, such as managing rooms, ordering food, and viewing employee information. The command-line interface serves as the front end, while the Java application logic handles the back-end functionalities. The project does not use a database but relies on in-memory data structures to store information about rooms, guests, and employees.

		 _______________________________________________________________________________________
		|											|
		|											|
		|											|
		|											|
		|											|
		|											|
		|			WELCOME TO RESORT MANAGEMENT SYSTEM			        |
		|											|
		|											|
		|											|
		|											|
		|											|
		|								-OWNED BY	        |
		| 						  SANDESH NINAWE AND MAYURI PATADE	|
		|											|
		|											|
		|_______________________________________________________________________________________|
		 _______________________________________________________________________________________
		|				1.Login as Admin					|
		|				2.Login as User					    	|
		|				3.Login as Staff					|
		|_______________________________________________________________________________________|
					Select your Login Type : 1
		 _______________________________________________________________________________________ 

		************************* WELCOME TO TREAT RESORT ************************************
		 _______________________________________________________________________________________ 


					------------------------------
						     LOGIN 
					------------------------------

					Enter the Password: admin


					Access Granted!
Press Enter key to continue...

					Welcome Admin.

						Enter your choice :
						1.Display room details
						2.Display room availability 
						3.Book
						4.Checkout
						5.Exit

					Select your Choice : 1

						Choose room type :
						1.Luxury Twin Room 
						2.Deluxe Twin Room 
						3.Luxury Solo Room 
						4.Deluxe Solo Room

3
Number of single beds : 1
AC : Yes
Free breakfast : Yes
Charge per day:2000  

Continue : (y/n)
y

						Enter your choice :
						1.Display room details
						2.Display room availability 
						3.Book
						4.Checkout
						5.Exit

					Select your Choice : 2

						Choose room type :
						1.Luxury Twin Room 
						2.Deluxe Twin Room 
						3.Luxury Solo Room
						4.Deluxe Solo Room

3
Number of rooms available : 10

Continue : (y/n)
y

						Enter your choice :
						1.Display room details
						2.Display room availability 
						3.Book
						4.Checkout
						5.Exit

					Select your Choice : 3

						Choose room type :
						1.Luxury Twin Room 
						2.Deluxe Twin Room 
						3.Luxury Solo Room
						4.Deluxe Solo Room

3
Choose the room that you want to book: 
31,32,33,34,35,36,37,38,39,40,
Enter the room number that you want to select: 33

Enter customer name: Mick
Enter contact number: 849585858
Enter gender: Male
Room Booked

Continue : (y/n)
y

						Enter your choice :
						1.Display room details
						2.Display room availability 
						3.Book
						4.Checkout
						5.Exit

					Select your Choice : 4
Room Number: 
32
Room is already vaccant!!!

Continue : (y/n)
n
		 _______________________________________________________________________________________
		|				1.Login as Admin					|
		|				2.Login as User					    	|
		|				3.Login as Staff					|
		|_______________________________________________________________________________________|
					Select your Login Type : 2
		 _______________________________________________________________________________________ 

		************************* WELCOME TO TREAT RESORT ************************************
		 _______________________________________________________________________________________ 


					------------------------------
						     LOGIN 
					------------------------------

					Enter the Password: user


					Access Granted!
Press Enter key to continue...

					Welcome User.

						Enter your choice :
						1.Display room details
						2.Display room availability 
						3.Book
						4.Order food
						5.Checkout
						6.Exit

					Select your Choice : 4
Room Number: 
33

==========
   Menu:  
==========

1.Sandwich	Rs.100
2.Pasta		Rs.130
3.Noodles	Rs.150
4.Coke		Rs.60

Enter your choice- 1
Quantity- 1
Do you want to order anything else ? (y/n)
y
Enter your choice- 4
Quantity- 1
Do you want to order anything else ? (y/n)
n
Do you want to see the bill ? (y/n)
n

Continue : (y/n)
n
		 _______________________________________________________________________________________
		|				1.Login as Admin					|
		|				2.Login as User					    	|
		|				3.Login as Staff					|
		|_______________________________________________________________________________________|
					Select your Login Type : 2
		 _______________________________________________________________________________________ 

		************************* WELCOME TO TREAT RESORT ************************************
		 _______________________________________________________________________________________ 


					------------------------------
						     LOGIN 
					------------------------------

					Enter the Password: user


					Access Granted!
Press Enter key to continue...

					Welcome User.

						Enter your choice :
						1.Display room details
						2.Display room availability 
						3.Book
						4.Order food
						5.Checkout
						6.Exit

					Select your Choice : 5
Room Number: 
33
This room is occupied by Mick
Do you want to checkout ?(y/n)
y

*******
 Bill:-
*******
Room Charge - 2000

Food Charges:- 
===============
Item   Quantity    Price
-------------------------
Sandwich  1         100       
Coke      1         60        

Total Amount- 2160.0
Room CheckOut succesfully

Continue : (y/n)
n
		 _______________________________________________________________________________________
		|				1.Login as Admin					|
		|				2.Login as User					    	|
		|				3.Login as Staff					|
		|_______________________________________________________________________________________|
					Select your Login Type : 3
		 _______________________________________________________________________________________ 

		************************* WELCOME TO TREAT RESORT ************************************
		 _______________________________________________________________________________________ 


					------------------------------
						     LOGIN 
					------------------------------

					Enter the Password: staff


					Access Granted!
Press Enter key to continue...

					Welcome Staff.

						Enter your choice :
						1.Display room details
						2.Display room availability 
						3.Display staff Details
						4.Exit

					Select your Choice : 3
View Staff Details
101       Sagar KulKarni                Floor Supervisor    Day Shift                     
102       Vidya Wagh                    Chef                Night Shift                   
103       Amay Bide                     H.R                 Day Shift                     
104       Usha Chavan                   Help Desk           Night Shift                   
105       Sanjay JagTap                 Front Office        Day Shift                     
106       Mahesh Deshpande              House Keeping       Night Shift                   
107       Sandesh Ninawe                House Keeping       Day Shift                     
108       Arun Ladi                     Chef                Night Shift                   
109       Mayuri Patade                 Help Desk           Day Shift                     
110       Jagdish Jain                  Manager             Night Shift                   


Continue : (y/n)
y

						Enter your choice :
						1.Display room details
						2.Display room availability 
						3.Display staff Details
						4.Exit

					Select your Choice : 1

						Choose room type :
						1.Luxury Twin Room 
						2.Deluxe Twin Room 
						3.Luxury Solo Room 
						4.Deluxe Solo Room

4
Number of single beds : 1
AC : No
Free breakfast : Yes
Charge per day:1200 

Continue : (y/n)
y

						Enter your choice :
						1.Display room details
						2.Display room availability 
						3.Display staff Details
						4.Exit

					Select your Choice : 4
		 _______________________________________________________________________________________
		|											|
		|											|
		|			Thank you For Visiting TO OUR RESORT				|
		|									        	|
		| 						  					|
		|_______________________________________________________________________________________|

 Principles and features  Resort Management System:

1. **Packages and Classes:**
   - Organize your project into packages such as `resort.domain` and `resort.ui` to structure your code.
   - Create classes like `TwinRoom`, `SoloRoom`, `Employee`, `Food`, `ResortSubMenu`, `Staff`, `User`, etc., to represent different entities and functionalities in your system.

2. **Inheritance:**
   - Use inheritance to model relationships like `TwinRoom` and `SoloRoom` inheriting properties and methods from the base class `SoloRoom`.

3. **Association:**
   - Use association to represent relationships between classes. For example, `TwinRoom` can have an association with the `Food` class to handle food orders.

4. **Exception Handling:**
   - Implement exception handling using `try-catch` blocks and custom exceptions like `NotAvailable` where applicable. For instance, when a user tries to book an already booked room, throw a custom exception.

5. **Data Storage:**
   - Keep data for rooms, employees, and food items in data structures like arrays or collections to test various functionalities.

6. **Multiple User Types:**
   - Introduce three types of users: Admin, Staff, and Regular User (Guest).

7. **Menu-Driven Interface:**
   - Create a menu-driven interface for each user type (Admin, Staff, and User) using a CLI where users can select operations like viewing room details, booking rooms, ordering food, checking out, and viewing employee details.

8. **Major OOPs Pillars:**
   - **Encapsulation:** Use private fields and provide getters and setters to encapsulate the data within classes.
   - **Abstraction:** Hide complex implementations and provide simple interfaces for user interaction.
   - **Inheritance:** Use inheritance for code reuse and modeling relationships.
   - **Polymorphism:** Implement polymorphic behavior where necessary, such as displaying different room details based on room types.

9. **Minor OOPs Pillars:**
   - **Aggregation and Composition:** Use aggregation to represent relationships like rooms containing food orders (composition).
   - **Method Overriding:** Override methods like `toString()` to provide custom string representations.
   - **Method Overloading:** Overload methods when appropriate, like having multiple constructors with different parameters.

10. **Library Classes:**
    - Utilize standard Java library classes for tasks like user input (`Scanner`) and date/time operations (`java.util.Date` or `java.time` classes).

By implementing these principles and features, your Resort Management System will be well-structured, maintainable, and capable of handling various user interactions and functionalities.
