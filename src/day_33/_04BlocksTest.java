package day_33;

public class _04BlocksTest {

    public static void main(String[] args) {

        _03StaticAndInitBlocks obj = new _03StaticAndInitBlocks("Berlin");

        System.out.println(obj.stadt);

        //_03StaticAndInitBlocks.laender = "England";

        System.out.println(_03StaticAndInitBlocks.laender.toLowerCase());

        _03StaticAndInitBlocks obj2 = new _03StaticAndInitBlocks("Frankfurt");

        System.out.println(obj2.stadt);

        _03StaticAndInitBlocks obj3 = new _03StaticAndInitBlocks();
        System.out.println(obj3.stadt.toLowerCase());


    }

}
