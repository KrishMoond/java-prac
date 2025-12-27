public class CharacterLoop {
    public static void main(String args[]){
         System.out.println("ASCII to Character (65-70):");
        for(int i = 65; i <= 70; i++){
            System.out.println(i + " -> " + (char)i);
        }
        
         System.out.println("\nCharacter to ASCII (a-e):");
        for(char ch = 'a'; ch <= 'e'; ch++){
            System.out.println(ch + " -> " + (int)ch);
        }
        
         System.out.println("\nEven ASCII values (98-106):");
        for(int i = 98; i <= 106; i += 2){
            System.out.println(i + " -> " + (char)i);
        }
    }
}