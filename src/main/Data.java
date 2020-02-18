package main;

public class Data {
    public void addList() {
        MyList<Integer> integerList1 = new MyList<>();
        MyList<Double> doubleList1 = new MyList<>();

        Integer int1 = 13333;
        Integer int2 = 52;
        Integer int3 = -489;

        Double double1 = 79.47d;
        Double double2 = 10.7d;
        Double double3 = -11.66d;

        integerList1.add(int1);
        integerList1.add(int2);
        integerList1.add(int3);

        doubleList1.add(double1);
        doubleList1.add(double2);
        doubleList1.add(double3);

        System.out.println('\n' + "MaxInt = " + integerList1.getMaxNumber(integerList1.getList()));
        System.out.println("MinInt = " + integerList1.getMinNumber(integerList1.getList()));
        System.out.println("=================");
        System.out.println("MaxDouble = " + doubleList1.getMaxNumber(doubleList1.getList()));
        System.out.println("MinDouble = " + doubleList1.getMinNumber(doubleList1.getList()));
    }
}
