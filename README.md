# LEESAH Quiz Starter-app

**System overview**
```bash
┌──────────────┐       ┌──────────────┐
│              │       │              │
│              │       │              │
│  Quizboard   │       │  Quizmaster  │
│              │       │              │
│              │       │              │
└──────────────┘       └──────────────┘
│  ▲                   │  ▲
│  │                   │  │
│  │                   │  │
▼  │                   ▼  │
┌──────────────────────────────────────────────────────────────┐
│                      Kafka                                   │
└──────────────────────────────────────────────────────────────┘
▲    │                           ▲    │
│    │                           │    │
│    ▼                           │    ▼
┌──────────────┐                 ┌──────────────┐
│              │                 │              │
│              │                 │              │
│    Team 1    │      .  .  .    │    Team n    │
│              │                 │              │
│              │                 │              │
└──────────────┘                 └──────────────┘
```

## Setup 📝

To get started, either clone with git or download the repository:

**git clone**
```
git clone https://github.com/navikt/leesah-game-starter.git
```

## Developing your quiz participant 🤖

Your challenge is to implement a QuizParticipant that answers all the question messages that are
published by the quizmaster 🧙. You are free to develop your application as you want but this starter project comes with
som useful boilerplate so you can focus on the fun part, answering questions! 🎉

The code you need to extend is all located in `src/main/kotlin/no/nav/QuizApplication.kt`.

From the command-line in the project root run:

**To build the app locally**
```bash
 ./gradlew build
```

**To run the app locally**
```bash
java -jar build/libs/app.jar
```

Good luck! Remember to ask questions! ❤️