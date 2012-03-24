package aima.core.search.framework;

import java.util.HashMap;
import java.util.Set;

/**
 * Stores key-value pairs for efficiency analysis.
 * @author Ravi Mohan
 * @author Ruediger Lunde
 */
public class Metrics {
	private HashMap<String, String> hash;

	public Metrics() {
		this.hash = new HashMap<String, String>();
	}

	public void set(String name, int i) {
		hash.put(name, Integer.toString(i));
	}

	public void set(String name, double d) {
		hash.put(name, Double.toString(d));
	}

	public int getInt(String name) {
		return new Integer(hash.get(name)).intValue();
	}

	public double getDouble(String name) {
		return new Double(hash.get(name)).doubleValue();
	}

	public String get(String name) {
		return hash.get(name);
	}

	public Set<String> keySet() {
		return hash.keySet();
	}
	
	public String toString() {
		return hash.toString();
	}
}
