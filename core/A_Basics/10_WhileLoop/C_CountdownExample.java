public class C_CountdownExample {
    public static void main(String[] args) {
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");
    }
}

/* 
3
2
1
Happy New Year!!
*/