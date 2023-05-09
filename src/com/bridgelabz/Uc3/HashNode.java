package com.bridgelabz.Uc3;

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