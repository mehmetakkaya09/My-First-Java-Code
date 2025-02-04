package day_17;

public class _04MathRandom {

    public static void main(String[] args) {

        // zwischen 18 - 100
                // 0 - 82
        int zufallZahlMitMathRandom = (int) (Math.random() * (100 - 18)) + 18;

        System.out.println("zufallZahlMitMathRandom = " + zufallZahlMitMathRandom);


    }


}
