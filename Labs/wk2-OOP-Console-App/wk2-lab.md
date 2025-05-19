# GymsRUs Fitness Analyzer

**GymsRUs** needs to provide fitness information to their clients, including BMI and maximum heart rate. Your task is to write a console program to analyze the user's input and provide:

- BMI index  
- BMI category  
- Maximum heart rate  

---

## Formulas

- **Maximum Heart Rate** = 220 - age  
- **Body Mass Index (BMI)** = weight (lbs) / (height (in))² × 703

---

## BMI Categories

| Category     | BMI Range          |
|--------------|--------------------|
| Underweight  | Less than 18.5     |
| Normal       | 18.5 to under 25   |
| Overweight   | 25 to under 30     |
| Obese        | 30 or more         |

---

## Functional Requirements

Design and code a class called `HealthProfile` to store information about clients and their fitness data. The attributes (name, age, weight, and height) are **private instance variables**. The class must include the following methods:

| Method              | Description                                              |
|---------------------|----------------------------------------------------------|
| `calculateBMI()`     | Calculates and returns BMI                              |
| `calculateCategory()`| Returns BMI category based on calculated BMI            |
| `calculateMaxHR()`   | Calculates and returns maximum heart rate               |
| `getName()`          | Returns the `name` instance variable                    |
| `setName(String)`    | Sets the `name` instance variable                       |
| `getAge()`           | Returns the `age` instance variable                     |
| `setAge(int)`        | Sets the `age` instance variable                        |
| `getWeight()`        | Returns the `weight` instance variable                  |
| `setWeight(double)`  | Sets the `weight` instance variable                     |
| `getHeight()`        | Returns the height in inches                           |
| `setHeight(int, int)`| Receives height in feet and inches, stores total inches|

---

## Main Class

Use a separate test class called `Main` to:

- Prompt for user input  
- Create a `HealthProfile` object  
- Display output using the `HealthProfile` class  
- Process multiple inputs using a loop (until user enters "X")  
- Assume all user input is valid  

---

## Sample Output

Enter name or X to quit: John Smith  
Enter age: 35  
Enter weight: 200  
Enter height - feet: 6  
Enter height - inches: 0  

Health Profile for John Smith  
BMI: 27.1  
BMI Category: Overweight  
Max heart rate: 185  

Enter name or X to quit: Ann Jones  
Enter age: 50  
Enter weight: 120  
Enter height - feet: 5  
Enter height - inches: 2  

Health Profile for Ann Jones  
BMI: 21.9  
BMI Category: Normal  
Max heart rate: 170  

Enter name or X to quit: X
