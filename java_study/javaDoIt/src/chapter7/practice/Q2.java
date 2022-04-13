package chapter7.practice;

public class Q2 {
    public static void main(String[] args){
        char[] alpahbets = new char[26];
        char ch = 'a';

        for(int i = 0; i < alpahbets.length; i++, ch++){
            alpahbets[i] = ch;
        }

        for(int i = 0; i<alpahbets.length; i++){
            System.out.println(alpahbets[i] + " : " + (char)((int)alpahbets[i]-32));
        }
    }
}
