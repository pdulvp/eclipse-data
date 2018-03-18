package org.pdulvp.common.helpers;

public class Couple<K,V> {
	K k;
	V v;
	public K getK() {
		return k;
	}
	public V getV() {
		return v;
	}
	public Couple(K k, V v) {
		super();
		this.k = k;
		this.v = v;
	}
	
}
