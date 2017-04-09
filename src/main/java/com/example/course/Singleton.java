package main.java.com.example.course;

public class Singleton {
	private Singleton instance;

	public Singleton() {
	}

	public Singleton getInstance() {
		if (instance != null) {
			instance = new Singleton();
		}
		return instance;
	}

}
