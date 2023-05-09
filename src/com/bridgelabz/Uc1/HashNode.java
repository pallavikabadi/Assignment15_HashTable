package com.bridgelabz.Uc1;

public class HashNode<K,V> {
    K key;
    V value;
    HashNode<K,V> next;

    public HashNode(K key, V value) {
        /*
         Parameter Constructor
        */
        this.key = key;
        this.value = value;
    }
}