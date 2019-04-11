package com.depaul.edu.cs447.worksheet1;

import java.util.Iterator;

public class Main {

    static class Node {
        int item;
        Node next;

        public Node (int item, Node next)
        {
            this.item = item;
            this.next = next;
        }
    }


    static int sumWhile (Node data)
    {
        int result = 0;
        while( data.next != null)
        {
            result += data.item;
            data = data.next;
        }
        result += data.item;
        return result;
    }


    static int sumFor (Node data)
    {
        return 0;
    }


    static int sumRecursive (Node data)
    {
        if( data.next == null)
        {
            return data.item;
        }
        return data.item + sumRecursive(data.next);
    }


    public static void main (String[] args) {
        Node data = null;
        for (int i = args.length - 1; i >= 0; i--)
        {
            data = new Node (Integer.parseInt (args[i]), data);
        }

        System.out.printf ("sumWhile     = %d%n", sumWhile (data));
        System.out.printf ("sumFor       = %d%n", sumFor (data));
        System.out.printf ("sumRecursive = %d%n", sumRecursive (data));
    }
}