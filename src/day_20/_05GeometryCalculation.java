package day_20;

public class _05GeometryCalculation {

    public static void main(String[] args) {

        // kreisflache
        // kreisumfang
        // rechteckflache
        // rechteckumfang
        // hypotenuse
        // zylindervolumen

        double kreisFlache = berechneKreisFlache(3);
        System.out.println("KreisFlache: " + kreisFlache);

        double kreisUmfang = berechneKreisUmfang(3);
        System.out.println("KreisUmfang: " + kreisUmfang);

        double rechteckFlache = berechneRechteckFlache(4, 7);
        System.out.println("RechteckFlache: " + rechteckFlache);

        double rechteckUmfang = berechneRechteckUmfang(2, 3);
        System.out.println("RechteckUmfang: " + rechteckUmfang);

        double hypotenuse = berechneHypotenuse(4, 8);
        System.out.println("Hypotenuse: " + hypotenuse);

        double zylindervolumen = berechneZylindervolumen(5, 9);
        System.out.println("Zylindervolumen: " + zylindervolumen);

    }

    public static double berechneKreisFlache(double radius) {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    public static double berechneKreisUmfang(double radius) {
        return Math.round(2 * (radius * Math.PI));
    }

    public static double berechneRechteckFlache(int breite, int lange) {
        double flache = Math.multiplyExact(breite, lange);
        return Math.round(flache);
    }

    public static double berechneRechteckUmfang(int breite, int lange) {
        double umfang = 2 * Math.addExact(breite, lange);
        return Math.round(umfang);
    }

    public static double berechneHypotenuse(double a, double b) {
        return Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public static double berechneZylindervolumen(double radius, double hoehe) {
        return Math.round(Math.PI + Math.pow(radius, 2) * hoehe);
    }


}
