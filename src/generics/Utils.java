package generics;

public class Utils {
	//klasična metoda
	public static int max1(int first, int second) {
		return(first > second) ? first : second;
	}
	
	//generička metoda
	public static <T extends Comparable<T>> T max2(T first, T second) {
		return (first.compareTo(second) < 0) ? second : first;
	}
	
	public static<K,V> void print(K key, V value) {
		System.out.println(key + " = " + value);
	}

}