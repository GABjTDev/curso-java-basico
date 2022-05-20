package com.ejercicio3;

public class Users {

    public static void main(String[] args) {

        String[] users = {"Gabriel", "Pedro", "Mario", "Lucas"};

        userFor(users);
        userForEach(users);

    }

    static void userFor(String[] users){

        for(int i = 0; i < users.length; i++){
            System.out.println("Recorrido con for: " + users[i]);
        }

    }

    static void userForEach(String[] users){

        for(String user : users){
            System.out.println("Recorrido con forEach: " + user);
        }

    }

}
