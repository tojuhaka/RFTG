package rftg.game.utils;

import java.util.ArrayList;

/**
 * Simple stack used in Deck-object
 * 
 * @author Toni Haka-Risku <tojuhaka@gmail.com>
 */
public class Stack<T> extends ArrayList<T> {

    public void push(T o) {
        add(o);
    }

    public T pop() {
        return remove(size() - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public ArrayList<T> pop(int amount) {

        ArrayList<T> list = new ArrayList<T>();
        for (int i=0; i < amount; i++) {
            list.add(this.pop());
        }
        return list;
    }
}
