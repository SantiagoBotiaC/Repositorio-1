import java.awt.BorderLayout;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class Server extends JFrame implements Constants {
	public static void main(String[] args) {
		Server frame = new Server();
	}

	public Server() {
		JTextArea jtaLog = new JTextArea();

		// Create a scroll pane to hold text area
		JScrollPane scrollPane = new JScrollPane(jtaLog);

		// Add the scroll pane to the frame
		add(scrollPane, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setTitle("Server");
		setVisible(true);

		try {
			// Create a server socket
			ServerSocket serverSocket = new ServerSocket(8000);
			jtaLog.append(new Date() + ": Server started at socket 8000\n");

			// Number a session
			int sessionNo = 1;

			// Ready to create a session for every two players
			while (true) {
				jtaLog.append(new Date() + ": Wait for players to join session " + sessionNo + '\n');

				// Connect to player 1
				Socket player1 = serverSocket.accept();

				jtaLog.append(new Date() + ": Player 1 joined session " + sessionNo + '\n');
				jtaLog.append("Player 1's IP address" + player1.getInetAddress().getHostAddress() + '\n');

				// Notify that the player is Player 1
				new DataOutputStream(player1.getOutputStream()).writeInt(PLAYER1);

				// Connect to player 2
				Socket player2 = serverSocket.accept();

				jtaLog.append(new Date() + ": Player 2 joined session " + sessionNo + '\n');
				jtaLog.append("Player 2's IP address" + player2.getInetAddress().getHostAddress() + '\n');

				// Notify that the player is Player 2
				new DataOutputStream(player2.getOutputStream()).writeInt(PLAYER2);

				// Display this session and increment session number
				jtaLog.append(new Date() + ": Start a thread for session " + sessionNo++ + '\n');

				// Create a new thread for this session of two players
				HandleASession task = new HandleASession(player1, player2);

				// Start the new thread
				new Thread(task).start();
			}
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}

}

// Define the thread class for handling a new session for two players
class HandleASession implements Runnable, Constants {
	private Socket player1;
	private Socket player2;

	private DataInputStream fromPlayer1;
	private DataOutputStream toPlayer1;
	private DataInputStream fromPlayer2;
	private DataOutputStream toPlayer2;

	// Continue to play
	private boolean continueToPlay = true;

	/** Construct a thread */
	public HandleASession(Socket player1, Socket player2) {
		this.player1 = player1;
		this.player2 = player2;
		
	}

	/** Implement the run() method for the thread */
	public void run() {
		try {
			// Create data input and output streams
			DataInputStream fromPlayer1 = new DataInputStream(player1.getInputStream());
			DataOutputStream toPlayer1 = new DataOutputStream(player1.getOutputStream());
			DataInputStream fromPlayer2 = new DataInputStream(player2.getInputStream());
			DataOutputStream toPlayer2 = new DataOutputStream(player2.getOutputStream());

			// Write anything to notify player 1 to start
			// This is just to let player 1 know to start
			toPlayer1.writeInt(1);

			// Continuously serve the players and determine and report
			// the game status to the players
			while (true) {
				// Receiving positions from both players
				int x1 = fromPlayer1.readInt();
				int y1 = fromPlayer1.readInt();
				toPlayer2.writeInt(x1);
				toPlayer2.writeInt(y1);
				int x2 = fromPlayer2.readInt();
				int y2 = fromPlayer2.readInt();
				toPlayer1.writeInt(x2);
				toPlayer1.writeInt(y2);
				boolean continueGame = fromPlayer1.readBoolean();
				continueGame = fromPlayer2.readBoolean();
				if (continueGame == false) {
					break;
				}

			}
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}	
}
