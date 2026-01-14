# Whack-A-Mole (Java Swing)

A fast-paced Whack-a-Mole game built with Java Swing featuring real-time score tracking and randomized mole patterns. The engine includes dynamic difficulty scaling that reduces mole "up-time" and increases spawn rates as your score climbs.

## Screenshots

<p align="center">
  <img width="45%" alt="Game Start" src="https://github.com/user-attachments/assets/93c2ee3b-000a-41cf-ba96-7cd629193b70" />
  <img width="45%" alt="High Score Gameplay" src="https://github.com/user-attachments/assets/cf135d45-c6df-4b97-9736-c21a2179c7cf" />
</p>
<video src="https://github.com/user-attachments/assets/eb0e0dd1-27a7-47d3-bb2b-71f36d41a345" controls="controls" style="display: block; margin-left: auto; margin-right: auto;">
</video>


## Features

* **Dynamic Difficulty:** Game speed increases automatically based on the player's score.
* **Custom UI:** Grid-based layout using `JButton` with background and borders removed for a clean aesthetic.
* **Game Loop:** Implemented using `javax.swing.Timer` for smooth animation handling.

## How to Run

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/Devansh501/whack-a-mole-java.git
2.  **Compile:**
    ```bash
    javac Main.java
    ```
3.  **Run:**
    ```bash
    java Main
    ```
