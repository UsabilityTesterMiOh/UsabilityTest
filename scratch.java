class Scratch {
    public static void main(String[] args) {
        System.out.println("This is a string:");
        System.out.println(printMe());
        System.out.println();
        System.out.println("This is Math:");
        System.out.println(mathMe());
    }

    private static String printMe(){
        return "Put what you want to print here.";
    }

    private static int mathMe(){
        int a = 1;
        int b = 2;
        return (a + b);
    }
}