package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character < 65 || character > 122){
            System.out.println("wrong alphabet!");
        }else if(character == 91 || character == 92 ||character == 93 ||character == 94 ||character == 95 ||
                character == 96){
            System.out.println("wrong alphabet!");
        }else if(character == 65 || character == 69 || character == 73 || character == 79 || character == 85 ||
                character == 89 || character == 97 || character == 101 || character == 105 || character == 111 ||
                character == 117 || character == 121){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
