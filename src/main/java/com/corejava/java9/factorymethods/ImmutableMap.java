package com.corejava.java9.factorymethods;

import java.util.Map;

public class ImmutableMap {

	public static void main(String[] args) {
		
		Map<Integer,String> emptyImmutableMap = Map.of();
		
		// Non-Empty Map API Utility
		
		// static <K,V> Map<K,V> of(K k1, V v1)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9)
		// static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10)
		
		Map<Integer,String> nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
		
		
	}

}
