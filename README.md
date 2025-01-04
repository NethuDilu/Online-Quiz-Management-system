# Online Quiz Management System

## Introduction
The **Online Quiz Management System** is a Java-based project developed to provide a seamless platform for conducting quizzes. It connects teachers and students online, automating the evaluation process and reducing the manual workload. The system ensures accuracy, reduces plagiarism through shuffled questions, and provides instant results.

## Features
- **User Authentication**: Secure login using predefined credentials.
- **Quiz Functionality**: Support for multiple-choice and true/false questions.
- **Time Management**: Tracks time remaining and calculates time taken for quizzes.
- **Results Calculation**: Automatic evaluation with detailed score reports.
- **Plagiarism Prevention**: Shuffled questions and answers to deter cheating.

## Class Structure
The project employs Object-Oriented Programming (OOP) concepts like inheritance, encapsulation, and polymorphism. Key classes include:
1. **Login**: Handles user authentication.
2. **User**: Stores user details (username and password).
3. **Rule**: Displays and enforces quiz rules.
4. **Time**: Manages quiz duration and timing.
5. **Quiz**: Contains quiz details and methods to start quizzes.
6. **Question**: Abstract base class for questions.
7. **MultipleChoiceQuestion**: Manages multiple-choice question logic.
8. **TrueFalseQuestion**: Manages true/false question logic.
9. **Result**: Displays quiz results.
10. **Main**: Entry point for the program.

## OOP Principles
- **Inheritance**: `Question` is the parent class for `MultipleChoiceQuestion` and `TrueFalseQuestion`.
- **Polymorphism**:
  - Method Overriding: `toString()` in subclasses for customized output.
  - Method Overloading: Constructors in the `Quiz` class.
- **Encapsulation**: Private data members accessed via getters.

## Sample Workflow
1. Users log in using valid credentials.
2. The system displays quiz rules, which users must agree to.
3. Users answer shuffled questions within a set time limit.
4. Results are displayed immediately after submission.

## Challenges and Solutions
- **No Database**: Used arrays to store user credentials.
- **Complex Features**: Simplified GUI development due to time constraints.
- **Invalid Inputs**: Added exception handling for user-friendly error messages.

## Modifications from Initial Plan
- Added six new classes and removed two redundant classes.
- Integrated Exception Handling and additional OOP concepts.

## Development Tools
- **Language**: Java
- **IDE**: IntelliJ IDEA

## Team Members
- G.W. Kaushalya
- W.H. Sewwandi
- G.V.N.D. Silva
- J.A.R. Prabodha
- R.V.P.I. Sewwandi

## Source Code
The complete source code is available on [Google Drive](https://drive.google.com/drive/folders/17-MwALmGURXjW_Jnhx3HHJJi09mCZSBN?usp=sharing).

---

Feel free to modify this file as needed!
