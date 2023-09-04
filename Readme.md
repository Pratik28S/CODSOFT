# CODSOFT - Java Development Internship Project

## Introduction
I am a beginner in Java development and started working on this project recently. This readme documents my progress and the tasks I've completed.

## Tasks
**Task 1: Number Guessing Game**

**1. Introduction**
   - **Objective:** To create a Number Guessing Game where the player tries to guess a randomly generated secret number.
   - **Features:** Multiple difficulty levels, limited attempts, and the option to play again.

**2. Implementation**
   - **User Input:** The game starts by asking the player to choose a difficulty level (Hard, Medium, Easy, or Child).
   - **Difficulty Levels:**
     - Hard: 7 maximum attempts
     - Medium: 12 maximum attempts
     - Easy: 18 maximum attempts
     - Child: 50 maximum attempts
   - **Random Number Generation:** A random secret number between 1 and 100 is generated.
   - **Gameplay:**
     - The player has a limited number of attempts based on the chosen difficulty level.
     - After each guess, the game provides feedback:
       - If the guess is lower than the secret number, it suggests guessing higher.
       - If the guess is higher than the secret number, it suggests guessing lower.
       - If the guess is correct, it congratulates the player and updates the score.
     - If the player runs out of attempts, the game reveals the secret number and encourages them to try again.
   - **Play Again:** After each game, the player is asked if they want to play again. The game continues if the player chooses "Yes."

**3. Code Highlights**

- **User Input Handling:** The Scanner class is used to get user input for difficulty levels, guesses, and play again choices.
- **Random Number Generation:** The `Random` class generates a random number within the specified range.
- **Switch-Case:** The chosen difficulty level determines the maximum number of attempts using a switch-case statement.
- **Loop Structures:** A while loop controls the game flow, allowing the player to play again or exit.
- **Scoring:** The player's score is incremented after each correct guess.

**4. Improvements**
- You can add more user-friendly messages and instructions.
- Implement validation to handle invalid inputs.
- Consider providing a hint or range of possible numbers for each guess.
- Create a more visually appealing user interface if desired.

**5. Conclusion**
   - The Number Guessing Game provides an interactive and challenging experience for players of different skill levels.
   - It demonstrates the use of user input, random number generation, and control flow in Java.

This implementation serves as a functional Number Guessing Game and can be further enhanced with additional features and improvements.
<---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
**Task 2: Student Grade Calculator**

**1. Introduction**
   - **Objective:** Develop a program that calculates the total marks, average percentage, and assigns a grade based on the average percentage achieved in a set of subjects.
   - **Features:** User input for the number of subjects and their corresponding marks, grade assignment based on predefined criteria.

**2. Implementation**
   - **User Input:** The program begins by asking the user to input the total number of subjects.
   - **Subject Marks:** The user is then prompted to enter the marks obtained in each subject out of 100. These marks are stored in an array.
   - **Total Marks:** The program calculates the total marks by summing up the marks obtained in all subjects.
   - **Average Percentage:** The total marks are divided by the total number of subjects to calculate the average percentage. This is done as a double to ensure accuracy.
   - **Grade Calculation:** Based on the average percentage achieved, a grade is assigned using predefined criteria.
   - **Grade Criteria:** The grading system assigns grades 'A', 'B', 'C', 'D', or 'F' based on predefined percentage ranges.
   - **Display Results:** The program displays the total marks, average percentage, and the corresponding grade to the user.

**3. Code Highlights**

- **User Input Handling:** The Scanner class is used to get user input for the number of subjects and marks obtained in each subject.
- **Array for Marks:** An integer array is used to store marks obtained in each subject.
- **Total Marks Calculation:** The program calculates the total marks by summing up the array elements.
- **Average Percentage:** The average percentage is calculated as a double to ensure accuracy in the division.
- **Grade Assignment:** Grades 'A', 'B', 'C', 'D', or 'F' are assigned based on predefined percentage ranges using if-else conditions.
- **Result Display:** The program displays the total marks, average percentage, and the assigned grade to the user.

**4. Improvements**
- You can enhance the program by allowing the user to input grade criteria or custom ranges for grading.
- Provide more detailed feedback or suggestions for improvement based on the grade assigned.
- Implement error handling to handle invalid inputs gracefully.

**5. Conclusion**
   - The Student Grade Calculator provides a quick way to calculate and assign grades based on input marks and average percentage.
   - It demonstrates the use of user input, array handling, and conditional statements in Java.

This implementation serves as a functional Student Grade Calculator and can be further improved and extended with additional features and enhancements.
<---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
**Task 3: Currency Converter with API Integration**

**1. Introduction**
   - **Objective:** Develop a program that allows the user to convert an amount from one currency to another using real-time exchange rates from an external API.
   - **Features:** User input for base and target currencies, input for the amount to convert, retrieval of exchange rates from an API, currency conversion, and result display.

**2. Implementation**
   - **User Input:** The program starts by asking the user to input the base currency (e.g., USD) and the target currency (e.g., EUR).
   - **Currency Conversion:** It then sends a request to the Open Exchange Rates API to fetch real-time exchange rates. The exchange rate between the base and target currencies is extracted from the JSON 
     response.
   - **Amount Input:** The user is prompted to enter the amount they want to convert in the base currency.
   - **Conversion Calculation:** The program calculates the converted amount by multiplying the input amount by the retrieved exchange rate.
   - **Result Display:** It displays the original amount, base currency, converted amount, and target currency to the user.
   - **Error Handling:** The program handles exceptions that may occur during API requests and provides feedback if the "rates" field is not found in the JSON response.

**3. Code Highlights**

- **User Input Handling:** The Scanner class is used to get user input for the base and target currencies as well as the amount to convert.
- **HTTP Client:** The Apache HttpClient library is used to send HTTP requests to the API and retrieve responses.
- **API Integration:** The program fetches real-time exchange rates from the Open Exchange Rates API using the provided API key.
- **JSON Parsing:** It parses the JSON response from the API to extract exchange rates.
- **Currency Conversion:** The program performs the currency conversion calculation based on the retrieved exchange rate.
- **Result Display:** It formats and displays the original and converted amounts along with the currencies.

**4. Improvements**
- You can add error handling for invalid currency codes or amount inputs.
- Implement support for multiple API providers for redundancy.
- Create a more user-friendly interface with additional options like historical rates or currency code lookup.

**5. Conclusion**
   - The Currency Converter with API Integration provides a practical tool for users to perform currency conversions using real-time exchange rates.
   - It demonstrates the use of HTTP client libraries, JSON parsing, user input handling, and currency conversion logic in Java.

This implementation serves as a functional Currency Converter and can be further improved and extended with additional features and enhancements.
<---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->

## Project Structure
CodSoft
│
├── NumberGuessingGame
│   ├── src
│   │   ├── NumberGuessingGame.java
│   │   └── (Other Java files for the game)
│   ├── README.md
│
├── StudentGradeCalculator
│   ├── src
│   │   ├── StudentGradeCalculator.java
│   │   └── (Other Java files for the calculator)
│   ├── README.md
│
├── CurrencyConverter
│   ├── src
│   │   ├── CurrencyConverter.java
│   │   └── (Other Java files for the converter)
│   ├── README.md
│
├── README.md(Details of entire project)



## Installation and Usage
- Provide instructions on how to install and run your code.

## Acknowledgments
- Mention any external resources, libraries, or tutorials you used.

## Future Improvements
- Outline future enhancements or features you plan to add to your code.

## Images
- Attach hand-drawn notes or diagrams that illustrate your ideas for each task.

---

**Update: 29/08 21:45**
- Completed the first task.
- Uploaded the code for the Number Game.
- Attached hand-written notes.

**Update: 30/08 18:30**
- Second task (Student Grade Calculator) completed.
- Displayed Total marks, Average percentage, and Grade.

**Update: 4/09 10:07**
- Final task (Currency Converter with API) completed.

