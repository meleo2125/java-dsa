import java.util.*;

public class InfosysOne { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int e = in.nextInt();
		int[] monster_power = new int[n];
		int[] bonus = new int[n];
		
		for(int i = 0;i < n;i++){
			monster_power[i] = in.nextInt();
		}

		for(int i = 0;i < n;i++){
			bonus[i] = in.nextInt();
		}

		int monsters_defeated = 0;
		List<Integer> defeatedIndex = new ArrayList<>();
		for(int i = 0;i < n;i++){
			int minIndex = -1;
			for(int j = 0;j < monster_power.length;j++){
				 if (!defeatedIndex.contains(j) && (minIndex == -1 || monster_power[j] < monster_power[minIndex])) {
                    minIndex = j;
                }
			} 
			defeatedIndex.add(minIndex);

			if(e >= monster_power[minIndex]){
				monsters_defeated++;
				e += bonus[minIndex];
			}
			else break;
		}
		System.out.println();
		System.out.println(monsters_defeated);
	}
}