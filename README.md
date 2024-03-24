## User Validation System Introduction

This Java application demonstrates a simple user validation system that reads user information from a file, allows users to log in with their credentials, and provides feedback on the login status. The user data is stored in a text file named data.txt in a comma-separated format.

Installation Clone the repository:

bash git clone <repository_url> Navigate to the project directory:

bash cd user-validation-system Compile and run the UserApplication class:

bash javac userValidation/UserApplication.java java userValidation.UserApplication Usage The application will prompt you to enter your username and password. You have up to 5 attempts to log in. If the login is successful, it will display a welcome message with the user's name. If the login fails, it will notify you of an invalid login, and you can try again. After 5 failed attempts, you will be locked out. Code Overview UserService Class readFile(): Reads user information from the data.txt file and creates an array of User objects. createUser(): Creates a User object with the provided username, password, and name. validateUser(): Validates user credentials against the stored user data. userLogin(): Initiates the user login process by reading user data, prompting for credentials, and handling login attempts. UserApplication Class main(): Entry point of the application, creates a UserService instance, and initiates the user login process. User Class Represents a user with properties: username, password, and name. Provides getter and setter methods for each property. File Format (data.txt) The data.txt file contains user information in the following format:

test@email.com,passwordTest!1,Test User

another@user.com,asdfasdf,Another User

john.doe@mydomain.net,Hdk398jf!,John Doe

jane.doe@myotherdomain.com,sunrise-sunset,Jane Doe

Each line corresponds to a user record with comma-separated values for username, password, and name.
