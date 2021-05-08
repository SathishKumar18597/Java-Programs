package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToGameProgram {
	static void gameboard(char gameboardsetup[][]) {

		for (char[] row : gameboardsetup) {
			for (char input : row) {
				System.out.print(input);

			}
			System.out.println();

		}
	}

	static boolean flag = true;

	static void placePosition(int pos, char gameboardsetup[][], String user) {
		char symbol = ' ';
		if (user.equals("player")) {
			symbol = '1';
			playerposition.add(pos);
		} else if (user.equals("CPU")) {
			symbol = '$';
			CPUposition.add(pos);
		}
		switch (pos) {
		case 1:
			gameboardsetup[0][0] = symbol;
			break;
		case 2:
			gameboardsetup[0][2] = symbol;
			break;
		case 3:
			gameboardsetup[0][4] = symbol;
			break;
		case 4:
			gameboardsetup[2][0] = symbol;
			break;
		case 5:
			gameboardsetup[2][2] = symbol;
			break;
		case 6:
			gameboardsetup[2][4] = symbol;
			break;
		case 7:
			gameboardsetup[4][0] = symbol;
			break;
		case 8:
			gameboardsetup[4][2] = symbol;
			break;
		case 9:
			gameboardsetup[4][4] = symbol;
			break;

		default:
			break;

		}

	}

	static ArrayList playerposition = new ArrayList<Integer>();
	static ArrayList CPUposition = new ArrayList<Integer>();

	public static String winCondition() {
		List<Integer> toprow = Arrays.asList(1, 2, 3);
		List<Integer> midrow = Arrays.asList(4, 5, 6);
		List<Integer> botrow = Arrays.asList(7, 8, 9);
		List<Integer> leftcol = Arrays.asList(1, 4, 7);
		List<Integer> midcol = Arrays.asList(2, 5, 8);
		List<Integer> rigcol = Arrays.asList(3, 6, 9);
		List<Integer> cross1 = Arrays.asList(1, 5, 9);
		List<Integer> cross2 = Arrays.asList(3, 5, 7);

		List<List> winner = new ArrayList<List>();

		winner.add(toprow);
		winner.add(midrow);
		winner.add(botrow);
		winner.add(leftcol);
		winner.add(midcol);
		winner.add(rigcol);
		winner.add(cross1);
		winner.add(cross2);

		for (List l : winner) {
			if (playerposition.containsAll(l)) {
				flag = false;
				return "Congratulations you won the Game";

			} else if (CPUposition.containsAll(l)) {
				flag = false;
				return "Cpu won the Game";

			}
			else if (playerposition.size() + CPUposition.size() == 9) {
				flag = false;
				return "Game ended in Tie";

			}

		}
		return "";
	}

	public static void main(String[] args) {

		char[][] gameboardsetup = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' },
				{ ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

		
		// gameboard(gameboardsetup);
		while (flag) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Positions (1-9):");
			int pos = scan.nextInt();
			while (playerposition.contains(pos) || CPUposition.contains(pos)) {
				System.out.println("position taken");
				pos = scan.nextInt();
			}

			placePosition(pos, gameboardsetup, "player");

			Random ran = new Random();
			int cpuposition = ran.nextInt(9) + 1;
			while (playerposition.contains(cpuposition) || CPUposition.contains(cpuposition)) {
				cpuposition = ran.nextInt(9) + 1;
			}
			placePosition(cpuposition, gameboardsetup, "CPU");

			gameboard(gameboardsetup);
			System.out.println(winCondition());
		}

	}

}
