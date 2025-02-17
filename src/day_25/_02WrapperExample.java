package day_25;

public class _02WrapperExample {

    public static void main(String[] args) {

        String str = "skajbcsajknaslk2938472389471896876897/&(/&/)(%/&+hhVVUYVyyıhbjn)(/&(%%+^^+'!jn7687";
        String[] chars = parseStr(str);

        String buchstaben = chars[0];
        String zahlen = chars[1];
        String spezialen = chars[2];

        System.out.println("buchstaben = " + buchstaben);

        System.out.println("zahlen = " + zahlen);

        System.out.println("spezialen = " + spezialen);

        //String letters = parseStr(str)[0];
        // erstellen eine String Array
        // verteilen jede char je nach Type
        // weisen jede Typegruppe zu dieser String array zu.
    }

    public static String[] parseStr(String str) {

        String[] result = new String[3];
//        result[0] = "";
//        result[1] = "";
//        result[2] = "";

        for (int i = 0; i < result.length; i++) {
            result[i] = "";
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result[0] += str.charAt(i);
            } else if (Character.isDigit(str.charAt(i))) {
                result[1] += str.charAt(i);
            }else {
                result[2] += str.charAt(i);
            }
        }

        return result;
    }


}
