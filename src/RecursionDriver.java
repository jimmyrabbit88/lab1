public class RecursionDriver {
    public static void main(String[] args) {
        CP3LinkedList<String> testList = new CP3LinkedList();
        testList.addLast("test");
        testList.addLast("test2");
        testList.addLast("test3");
        testList.addLast("test4");
        testList.addLast("test5");
        testList.printRec();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        testList.printRecReverse();
    }
}
