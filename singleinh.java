//single inheritance :- it is use to derived class  form one base class that is called S.I

public class singleinh {

    public static void main(String[] args) {

        son obj = new son();

        obj.getdata(10, 20);

        obj.disp();

    }

}

class father // super, , parent ,base class

{

    int a, b;

    void getdata(int x, int y) // instance methode create

    {

        a = x;

        b = y;

    }

}

class son extends father // sub,drive,child class

{

    int add() // method

    {

        int sum = a + b;

        return sum;

    }

    void disp() // methode

    {

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("sum=" + add());

    }

}
