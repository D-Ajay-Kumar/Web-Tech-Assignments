import java.util.ArrayList;
import java.util.Scanner;

public class StringConvert{
	static int dp[][];
	static ArrayList<ArrayList<String>> arrs = new ArrayList<ArrayList<String>>();

	static void printAllupdates(String str1, String str2, ArrayList<String> updates) {
		int i = str1.length();
		int j = str2.length();

		while (true) {
			if (i == 0 || j == 0) {
				arrs.add(updates);
				break;
			}

			if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
				i--;
				j--;
			}

			else {
				boolean if1 = false, if2 = false;
				if (dp[i][j] == dp[i - 1][j - 1] + 1) {

					updates.add("Change " + str1.charAt(i - 1)
								+ " to " + str2.charAt(j - 1));
					i--;
					j--;
					if1 = true;
				}

				if (dp[i][j] == dp[i - 1][j] + 1) {
					if (if1 == false) {
						updates.add("Delete " + str1.charAt(i - 1));
						i--;
					}
					else {
						ArrayList<String> updatestr2 = new ArrayList<String>();
						updatestr2.addAll(updates);
						updatestr2.remove(updates.size() - 1);
						updatestr2.add("Delete " + str1.charAt(i));
						printAllupdates(str1.substring(0, i),
										str2.substring(0, j + 1), updatestr2);
					}

					if2 = true;
				}

				if (dp[i][j] == dp[i][j - 1] + 1) {
					if (if1 == false && if2 == false) {
						updates.add("Add " + str2.charAt(j - 1));
						j--;
					}
					else {

						// Add steps
						ArrayList<String> updatestr2 = new ArrayList<String>();
						updatestr2.addAll(updates);
						updatestr2.remove(updates.size() - 1);
						updatestr2.add("Add " + str2.charAt(j));

						// Recursively call for the next steps
						printAllupdates(str1.substring(0, i + 1), str2.substring(0, j), updatestr2);
					}
				}
			}
		}
	}

	// Function to compute the DP matrix
	static void editDP(String str1, String str2)
	{
		int l1 = str1.length();
		int l2 = str2.length();
		int[][] DP = new int[l1 + 1][l2 + 1];

		// initialize by the maximum edits possible
		for (int i = 0; i <= l1; i++)
			DP[i][0] = i;
		for (int j = 0; j <= l2; j++)
			DP[0][j] = j;

		// Compute the DP matrix
		for (int i = 1; i <= l1; i++) {
			for (int j = 1; j <= l2; j++) {

				// if the characters are same
				// no updates required
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
					DP[i][j] = DP[i - 1][j - 1];
				else {
					// minimum of three operations possible
					DP[i][j] = min(DP[i - 1][j - 1], DP[i - 1][j], DP[i][j - 1]) + 1;
				}
			}
		}

		// initialize to global array
		dp = DP;
	}

	// Function to find the minimum of three
	static int min(int a, int b, int c)
	{
		int z = Math.min(a, b);
		return Math.min(z, c);
	}

	static void printWays(String str1, String str2, ArrayList<String> updates)
	{
		// Function to print all the ways
		printAllupdates(str1, str2, new ArrayList<String>());

		int i = 1;

		// print all the possible ways
		for (ArrayList<String> ar : arrs) {
			System.out.println("\nMethod " + i++ + " : \n");
			for (String s : ar) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);

        // Take the string that needs to be sorted as input
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        //function to show how to edit the string
		editDP(str1, str2);

        // This will print the pathways to the target
		printWays(str1, str2, new ArrayList<String>());
	}
}