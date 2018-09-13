package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner kbin = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int in = kbin.nextInt();
        System.out.println(((in % 2) == 0) ? "The integer \"" + in + "\" is even." : "The integer \"" + in + "\" is odd." );

    }
}
