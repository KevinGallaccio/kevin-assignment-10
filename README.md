# Meal Planner Application

This project is a meal planner application that allows users to generate weekly or daily meal plans based on their dietary preferences and target calorie intake. It leverages the Spoonacular API to fetch recipe data.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Usage](#usage)
    - [Endpoints](#endpoints)

## Features

- Generate weekly or daily meal plans
- Specify dietary preferences and target calorie intake
- View detailed information about each meal, including nutritional content

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 8 or later
- Maven

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/meal-planner.git

2. **Navigate to the project directory:**

   ```bash
   cd meal-planner

3. **Build the project using Maven:**

   ```bash
   mvn clean install

4. **Run the application:**
 
    ```bash
   java -jar target/meal-planner-0.0.1-SNAPSHOT.jar

## Usage
### Endpoints
#### 1. Generate Weekly Meal Plan:

##### Endpoint: [/mealplanner/week](#)

###### . Method: GET

###### . Parameters:
- targetCalories (optional): Target calorie intake for the week
- diet (optional): Dietary preferences (e.g., vegan, vegetarian)
- exclude (optional): Excluded ingredients or categories

#### 2. Generate Daily Meal Plan:

##### Endpoint: [/mealplanner/day](#)

###### . Method: GET
###### . Parameters:
- targetCalories (optional): Target calorie intake for the day
- diet (optional): Dietary preferences (e.g., vegan, vegetarian)
- exclude (optional): Excluded ingredients or categories
    

