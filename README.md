<h1 align="center" id="title">🔨 Whack-A-Mole</h1>
    <p align="center">
        <img src="https://socialify.git.ci/Devansh501/whack-a-mole-java/image?font=Inter&language=1&name=1&owner=1&pattern=Circuit%20Board&theme=Dark" alt="Whack-a-mole-cover" width="640">
    </p>
    <p align="center">A fast-paced, dynamic desktop game built with Java Swing featuring real-time score tracking and adaptive difficulty.</p>
    <p align="center">
        <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
        <img src="https://img.shields.io/badge/Swing-blue?style=for-the-badge" alt="Swing">
        <img src="https://img.shields.io/badge/Desktop-App-green?style=for-the-badge" alt="Desktop">
    </p>
    <hr>
    <h2 id="gallery">📸 Project Gallery</h2>
    <div style="display: flex; flex-wrap: wrap; gap: 10px; justify-content: center; align-items: flex-start;">
        <img width="45%" src="https://github.com/user-attachments/assets/93c2ee3b-000a-41cf-ba96-7cd629193b70" alt="Game Start" style="min-width: 280px; border-radius: 8px; border: 1px solid #30363d;">
        <img width="45%" src="https://github.com/user-attachments/assets/cf135d45-c6df-4b97-9736-c21a2179c7cf" alt="High Score Gameplay" style="min-width: 280px; border-radius: 8px; border: 1px solid #30363d;">
    </div>
    <div align="center" style="margin-top: 20px;">
        <video src="https://github.com/user-attachments/assets/eb0e0dd1-27a7-47d3-bb2b-71f36d41a345" controls="controls" style="width: 91%; max-width: 1000px; border-radius: 8px; border: 1px solid #30363d;">
        </video>
    </div>
    <hr>
    <h2 id="features">🧐 Features</h2>
    <ul>
        <li><strong>Dynamic Difficulty:</strong> Game speed and mole "up-time" scale automatically as your score increases.</li>
        <li><strong>Swing Timer Engine:</strong> Smooth game loop implemented using <code>javax.swing.Timer</code> for precise mole spawning.</li>
        <li><strong>Custom UI:</strong> A clean, minimalist grid layout using modified <code>JButton</code> components.</li>
        <li><strong>Real-time Tracking:</strong> Instant score updates and randomized movement patterns.</li>
    </ul>
    <hr>
    <h2 id="how-to-run">🛠️ How to Run</h2>
    <h3>1. Clone the repository</h3>
    <pre><code>git clone https://github.com/Devansh501/whack-a-mole-java.git
cd whack-a-mole-java</code></pre>
    <h3>2. Compile the Source</h3>
    <pre><code>javac Main.java</code></pre>
    <h3>3. Launch the Game</h3>
    <pre><code>java Main</code></pre>
    <hr>
    <h2 id="architecture">💻 Technical Overview</h2>
    <p>The game utilizes a <strong>Model-View-Controller (MVC)</strong> inspired approach for the Swing components:</p>
    <ul>
        <li><strong>Logic:</strong> Randomized coordinate selection and difficulty scaling algorithms.</li>
        <li><strong>UI:</strong> Grid-based layout with event listeners attached to each cell.</li>
        <li><strong>Threading:</strong> Swing Timer manages the UI thread to ensure thread safety while updating the game state.</li>
    </ul>
    <hr>
    <p align="center">Whacked with ❤️ by <a href="https://github.com/Devansh501">Devansh</a></p>
