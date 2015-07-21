package lesson11.lecture.generics;

public class SimplePair<K,V> {
	private K key;
    private V value;

    public SimplePair(K key, V value) {
		this.key = key;
		this.value = value;
    }
    public K getKey()	{ return key; }
    public V getValue() { return value; }
}
