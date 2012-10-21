package GreatFairyWar;

public class GreatFairyWar {

	public static int minHP(int[] dps, int[] hp) {
		int totalDPS = 0;
		int totalDamageTaken = 0;
		for (int i = dps.length - 1; i >= 0; i--) {
			totalDPS += dps[i];
			totalDamageTaken += hp[i] * totalDPS;
		}
		
		return totalDamageTaken;
	}
}
