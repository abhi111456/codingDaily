public class towerOfHanoi {
    public static void towwerOfHanoi(int n, String src, String help, String Dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + "from" + src + "to" + Dest);
        }
        towwerOfHanoi(n - 1, src, Dest, help);
        System.out.println("transfer disk " + n + "from" + src + "to" + Dest);
        towwerOfHanoi(n - 1, help, src, Dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towwerOfHanoi(n, null, null, null);

    }

}
