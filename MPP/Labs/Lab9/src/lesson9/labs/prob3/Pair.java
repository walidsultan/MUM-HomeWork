package lesson9.labs.prob3;

public class Pair<T, U> {
	private T first;
	private U second;

	public Pair(T t, U u) {
		first = t;
		second = u;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}
}
