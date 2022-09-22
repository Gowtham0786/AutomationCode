package com.demo.test.SampleDemo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ReusableComponents extends BaseClass{
	// This Method is used to check whether the player is an Indian or a Foreigner.

		public static void verifyPlayers() {
			
			System.out.println("\nValidation check of maximum 4 Foreign Players in a Team");
			System.out.println("Players Json: ");
			JSONArray jsonArrayCountry = (JSONArray) jsonObject.get("player");
			System.out.println("Players: " + jsonArrayCountry);
			System.out.println("\n");
			int count = 0;

			for (int i = 0; i < jsonArrayCountry.size(); i++) {
				JSONObject country = (JSONObject) jsonArrayCountry.get(i);
				String country1 = (String) country.get("country");

				// To Check whether the Player is an Indian or Foreigner

				// If he is a Foreign Player then the Count value is incremented by 1

				if (!country1.equals("India")) {
					count++;
					// System.out.println(" " + count + " Foreign Player Found");
				} else {
					// System.out.println("***Indian Player***");
				}

			}
			System.out.println("Final Count of Foreign Players: " + count);
			System.out.println("Comparing the Maximum Count and Final Count:");

			// Specified the Limit of Foreign Player maxLimit to 4
			int maxLimit = 4;
			if (count == maxLimit) {
				System.out.println("Atleast " + count + " Foreign Players Found");

			} else {
				System.out.println("\t++++++++Foreign Players Less Than / Greater than " + maxLimit);
			}

		}

		// This Method is used to check whether the player is a Wicket-Keeper or Not.

		public static void verifyRole() {
			System.out.println("\nValidation check of atleast 1 Wicket Keeper in a Team");
			System.out.println("Players Json: ");
			JSONArray jsonArrayCountry = (JSONArray) jsonObject.get("player");
			System.out.println("Players: " + jsonArrayCountry);
			System.out.println("\n");
			int count = 0;

			for (int i = 0; i < jsonArrayCountry.size(); i++) {
				JSONObject country = (JSONObject) jsonArrayCountry.get(i);
				String role = (String) country.get("role");

				if (role.equals("Wicket-keeper")) {
					count++;
					//count = count + 1;
					// System.out.println("Role: Wicket Keeper Found");

				} else {
					// System.out.println("************Player: Not a
					// Wicket-keeper");
				}

			}
			System.out.println("Final Count of Wicket Keepers in a Team: " + count);
			System.out.println("Comparing the Maximum Count and Final Count:");

			// Specified the Limit of Wicket-keeper maxLimit to 1
			int maxLimit = 1;
			if (count == maxLimit) {
				System.out.println("Atleast " + count + " Wicket Keeper Found");

			} else {
				System.out.println("++++++++\tWicket Keeper Less Than or Greater than " + maxLimit);
			}
			System.out.println("\n");
		}
}
