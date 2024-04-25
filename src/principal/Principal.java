package principal;


import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		int counter = sc.nextInt();
		String cadena = sc.next();
		System.out.print(cadena);
		for(int i=0; i<counter-1;i++) {
			String cad = "";
			cad += cadena.charAt(i);
			cad += cadena.charAt(i+1);
			map.put(cad, map.getOrDefault(cad,0)+1);
			map.get(cad);
			
		}
		for(String cad : map.containsKey()) {
			
		}
		System.out.println(map);
		
	}
}
