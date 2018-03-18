package org.pdulvp.common.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapSet<K, V> implements Map<K, Collection<V>> {

  Map<K, Object> map = null;

  public HashMapSet() {
    super();
    map = new HashMap<K, Object>();
  }

  public HashMapSet(Map<K, Collection<V>> values) {
    super();
    map = (Map) values;
  }

  protected Collection<V> createInternalSet() {
    return new ArrayList<V>();
  }

  public Set<K> keySet() {
    return map.keySet();
  }

  /**
   * Retrieve the union between the current keySet and the given collection of keys
   * @param keys
   * @return
   */
  public Set<K> subKeySet(Collection<K> keys) {
    Set<K> subSet = new HashSet<K>();
    Set<K> set = keySet();
    for (K key : keys) {
      if (set.contains(key)) {
        subSet.add(key);
      }
    }
    return subSet;
  }


  public void putAll(K arg0_p, Collection<V> arg1_p) {
    for (V v : arg1_p) {
      put(arg0_p, v);
    }
  }

  /**
   * {@inheritDoc}
   */
  public boolean containsKey(Object key_p) {
    return map.keySet().contains(key_p);
  }

  /**
   * {@inheritDoc}
   */
  public Collection<V> get(Object key_p) {
    if (map.get(key_p) == null) {
      return new ArrayList<V>();
    }
    Object value = map.get(key_p);
    if (!(value instanceof Collection)) {
      Collection<V> result = createInternalSet();
      result.add((V) value);
      return result;
    }
    return (Collection<V>) value;
  }

  /**
   * {@inheritDoc}
   */
  public Collection<V> remove(Object key_p) {
    if (map.containsKey(key_p)) {
      Collection<V> v = get(key_p);
      map.remove(key_p);
      return v;
    }
    return null;
  }

  @SuppressWarnings("unchecked")
  public void put(K arg0_p, V arg1_p) {
    if (map.get(arg0_p) == null) {
      map.put(arg0_p, arg1_p);
    } else {
      if (!(map.get(arg0_p) instanceof Collection)) {
        Collection<V> a = createInternalSet();
        a.add((V) map.get(arg0_p));
        map.put(arg0_p, a);
      }
      if (!((Collection<V>) map.get(arg0_p)).contains(arg1_p)) {
        ((Collection<V>) map.get(arg0_p)).add(arg1_p);
      }
    }
  }

  /**
   * {@inheritDoc}
   */
  public int size() {
    return map.size();
  }

  /**
   * {@inheritDoc}
   */
  public boolean isEmpty() {
    return map.isEmpty();
  }

  /**
   * {@inheritDoc}
   */
  public boolean containsValue(Object value_p) {
    for (K key : keySet()) {
      Object value = map.get(key);
      if (value_p.equals(value)) {
        return true;
      } else if (value instanceof Collection) {
        return ((Collection) value).contains(value_p);
      }
    }
    return false;
  }

  /**
   * {@inheritDoc}
   */
  public Collection<V> put(K key_p, Collection<V> value_p) {
    for (V value : value_p) {
      put(key_p, value);
    }
    return get(key_p);
  }

  /**
   * {@inheritDoc}
   */
  public void putAll(Map<? extends K, ? extends Collection<V>> t_p) {
    for (K key : t_p.keySet()) {
      put(key, t_p.get(key));
    }
  }

  /**
   * {@inheritDoc}
   */
  public void clear() {
    map.clear();
  }

  /**
   * {@inheritDoc}
   */
  public Set<java.util.Map.Entry<K, Collection<V>>> entrySet() {
    HashSet<java.util.Map.Entry<K, Collection<V>>> entries = new HashSet<java.util.Map.Entry<K, Collection<V>>>();

    for (final K key : keySet()) {
      entries.add(new Map.Entry<K, Collection<V>>() {

        public K getKey() {
          return key;
        }

        public Collection<V> getValue() {
          return get(key);
        }

        public Collection<V> setValue(Collection<V> value_p) {
          return put(key, value_p);
        }
      });
    }
    return entries;
  }

  /**
   * {@inheritDoc}
   */
  public Collection<Collection<V>> values() {
    ArrayList<Collection<V>> values = new ArrayList<Collection<V>>();
    for (K key : keySet()) {
      values.add(get(key));
    }
    return values;
  }

}