package extras;

public class binarySearch {
	
	static int[] sortBy(int[] list) {
		int aux;
		
		for(int i = 0; i < list.length; i++) {
			for(int j = i + 1; j < list.length; j++) {
				if(list[i] > list[j]) {
					aux = list[i];
					list[i] = list[j];
					list[j] = aux;
				}
			}
		}
		
		return list;
	}
	
	static int searchBy(int[] list, int num) {
		int esq, dir, mid;
		esq = 0;
		dir = list.length;
		
		while(esq < dir) {
			mid = (esq + dir) / 2;
			
			System.out.println("Mid: " + mid);
			
			if(list[mid] == num) {
				return mid;
			} else {
				if(num > list[mid]) {
					esq = mid;
				} else {
					dir = mid;
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {2, 3, 5, 7, 8 , 4, 10, 23, 55, 49, 22, 31, 100, 102, 203};
		
		int[] list2 = {2, 3, 5, 4, 1, 7};
		
		for(int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}
		
		System.out.println("\n Sorted \n");
		
		list2 = sortBy(list2);
		
		for(int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}
		
		int pos; 
		int elem = 1;
				
		pos = searchBy(list2, elem);
		
		System.out.println("Elemento " + elem + " encontrado na posição: " + pos);

	}

}
