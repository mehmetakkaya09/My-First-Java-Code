package day_24;

public class _02WrapperParseMethod {

    public static void main(String[] args) {

        String str = "90.0";
        Double num1 = Double.valueOf(str);

        Double num2 = Double.parseDouble(str);

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("(num1 + num2) = " + (num1 + num2));

        String strInt = "1000";
        System.out.println(strInt + strInt);
        int parseInt = Integer.parseInt(strInt);
        System.out.println(parseInt + parseInt);

        String infos = "John 2000 Wien Österreich";

        String[] infosArray = infos.split(" ");
        System.out.println("Vorname      : " + infosArray[0]);
        System.out.println("Alt          : " + (2025 - Integer.parseInt(infosArray[1])));
        System.out.println("Stadt        : " + infosArray[2]);
        System.out.println("Land         : " + infosArray[3]);

        String vorname = infosArray[0];

        System.out.println("(vorname instanceof String) = " + (vorname instanceof String));

        System.out.println("*****************");

        String[] infos2 = {"Joe 1990 London UK", "Jessica 1988 NewYork USA", "George 2001 Münich Germany"};

        for (String info : infos2) {
            String[] personInfo = info.split(" ");
            System.out.println("Vorname      : " + personInfo[0]);
            System.out.println("Alt          : " + (2025 - Integer.parseInt(personInfo[1])));
            System.out.println("Stadt        : " + personInfo[2]);
            System.out.println("Land         : " + personInfo[3]);

            System.out.println("*****************");
        }

        // aus Database kommt 2 werte
        // erste wert ist vorname (String)
        // zweite wert ist alt (Integer)
        String firstName = "Monika";
        Integer age = 23;

        if(firstName instanceof String){
            System.out.println("firstName = " + firstName);
        } else{
            System.out.println("Falsche Datatyp");
        }

        if(age instanceof Integer){
            System.out.println("age = " + age);
        }else {
            System.out.println("Falsche Datatyp");
        }


    }

}
