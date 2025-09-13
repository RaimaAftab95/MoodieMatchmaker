# Moodie Matchmaker

## 🌈 Overview
Moodie Matchmaker is a Java application designed to teach core Object-Oriented Programming (OOP) concepts and Test-Driven Development (TDD). This project transforms a single-word mood input into a comprehensive "Moodie Card" containing an emoji, a color, and a positive message—essentially creating an emotional care card through code.

## 🎯 Educational Objectives
This project serves as a Code Kata to help students learn:
- Object-Oriented Programming fundamentals
- Test-Driven Development methodology
- Java programming basics
- Class design and relationships
- Unit testing practices

## ✨ Features
- **Custom Mood Cards:** Generate personalized cards with emojis, colors, and messages for different moods
- **Instant Mood Boost:** Input a mood and receive a tailored response to brighten your day
- **Variety of Emotions:** Support for multiple moods ranging from happy to tired
- **Extensible Design:** Framework allows for easy addition of new moods and customizations

## 🧩 Core Concepts Taught

### OOP Concepts
- **Encapsulation:** Proper data hiding and access control
- **Inheritance:** Potential for mood hierarchies or extending functionality
- **Polymorphism:** Different behaviors based on mood types
- **Abstraction:** Simplifying complex emotional responses into discrete components

### TDD Approach
- Write tests before implementation
- Red-Green-Refactor cycle
- Test coverage for all functionality
- Edge case handling

## 📋 Supported Moods

| Mood | Emoji | Unicode | Color | Message |
|------|-------|---------|-------|---------|
| Happy | 😊 | \uD83D\uDE0A | Yellow | You're glowing! Keep smiling |
| Sad | 😢 | \uD83D\uDE22 | Blue | It's okay to feel this way. |
| Excited | 🤩 | \uD83E\uDD29 | Pink | So much joy in you! |
| Angry | 😡 | \uD83D\uDE21 | Red | Take a deep breath. You got this |
| Shy | 🙈 | \uD83D\uDE48 | Peach | You're lovely just the way you are |
| Tired | 😴 | \uD83D\uDE34 | Lavender | Rest is magical. Dream sweetly |
| Proud | 🥰 | \uD83E\uDD70 | Gold | You should be! You're amazing |
| In Love | 💖 | \uD83D\uDC96 | Rose | Love looks good on you |

## 🏗️ Project Structure

```
moodie-matchmaker/
├── src/
│   ├── main/java/com/moodiematchmaker/
│   │   ├── model/
│   │   │   ├── com.moodieMatchmaker.domain.MoodieCard.java
│   │   │   └── Mood.java
│   │   ├── service/
│   │   │   └── MoodieMatchmakerService.java
│   │   └── MoodieMatchmakerApp.java
│   └── test/java/com/moodiematchmaker/
│       ├── model/
│       │   ├── MoodieCardTest.java
│       │   └── MoodTest.java
│       └── service/
│           └── MoodieMatchmakerServiceTest.java
└── pom.xml (or build.gradle)
```

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Maven or Gradle build tools
- JUnit 5 for testing

### Setup Instructions
1. Clone the repository
2. Open the project in your preferred Java IDE
3. Run tests to ensure everything is working properly
4. Start implementing the requirements following TDD principles

## 💻 Development Process

### Phase 1: Setup and Initial Tests
1. Create the basic project structure
2. Write initial tests for the `Mood` class
3. Implement the `Mood` class to pass tests

### Phase 2: Core Functionality
1. Write tests for the `com.moodieMatchmaker.domain.MoodieCard` class
2. Implement the `com.moodieMatchmaker.domain.MoodieCard` class
3. Create tests for the `MoodieMatchmakerService`
4. Implement the service layer

### Phase 3: Extensions and Refinements
1. Add support for custom moods
2. Implement additional features
3. Refine the implementation

## 📝 Implementation Guidelines

### The Mood Class
- Should contain properties for emoji, unicode representation, color, and message
- Include appropriate getters and setters
- Consider using enums for predefined moods

### The com.moodieMatchmaker.domain.MoodieCard Class
- Should encapsulate the concept of a mood response
- Include methods to format and display the card

### The MoodieMatchmakerService
- Should contain the logic to match input moods to appropriate responses
- Handle edge cases (unknown moods, null inputs, etc.)

## 🧪 Testing Requirements
- Write comprehensive tests for all classes
- Follow the TDD cycle: write tests first, then implement
- Test edge cases and error conditions
- Aim for high test coverage

## 🎓 Learning Extensions
- Add a simple UI for interacting with the application
- Implement mood persistence (save favorite moods)
- Create a recommendation system based on past mood patterns
- Build a web API to expose the functionality

## 📚 Resources
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Test-Driven Development by Example (Kent Beck)](https://www.amazon.com/Test-Driven-Development-Kent-Beck/dp/0321146530)

## 🤔 Reflection Questions for Students
1. How does encapsulation help in managing the mood data?
2. What benefits did TDD provide during implementation?
3. How might you extend this application using inheritance?
4. What design patterns could be applied to improve the code structure?

---

Happy coding! Remember, even your code deserves to be in a good mood! 😊
