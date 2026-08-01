package akhilshettyym.JAVA.leet.ToKnow.Practice.Java_Basics;

public class ZF_Unique3 {
    public static void main(String[] args) {
        int amt = 0;
        for (int i=1; i<=4; i++){
            for (int j=1; j<=4; j++){
                for (int k=1; k<=4; k++){
                    if(k!=i && k!=j && i!=j){
                        amt++;
                        System.out.println(i+ "" +j+ "" +k);
                    }
                }
            }
        }
        System.out.println("Total number of three digit number is " + amt);
    }
}