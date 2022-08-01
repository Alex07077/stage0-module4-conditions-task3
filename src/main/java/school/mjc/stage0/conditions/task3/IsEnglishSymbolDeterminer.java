package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (symbol == 91 || symbol == 92 ||symbol == 93 ||symbol == 94 ||symbol == 95 || symbol == 96) {
            System.out.println("Non English");
        }else if (symbol > 65 && symbol < 122){
            System.out.println("English");
        }else{
            System.out.println("Non English");
        }
    }
}
