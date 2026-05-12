public class C_NumbersStrings{public static void main(String[]args){

// Adding two integers - result is a number
int a=10;int b=20;int sum=a+b;System.out.println("Adding two integers (10 + 20): "+sum); // Output: 30

// Adding two strings that look like numbers - result is concatenation
String str1="10";String str2="20";String result1=str1+str2;System.out.println("Concatenating two strings (\"10\" + \"20\"): "+result1); // Output:
                                                                                                                                        // 1020

// Adding a string and a number - result is string concatenation
String str3="10";int num=20;String result2=str3+num;System.out.println("String + Number (\"10\" + 20): "+result2); // Output:
                                                                                                                   // 1020

// Adding number and string with reversed order also results in concatenation
String result3=num+str3;System.out.println("Number + String (20 + \"10\"): "+result3); // Output: 2010

// Mixing numbers and strings in a print statement
System.out.println("10 + 20 = "+10+20); // Output: 10 + 20 = 1020 (first string + 10 becomes a string, then adds 20 as a
                                        // string)
System.out.println("10 + 20 = "+(10+20)); // Output: 10 + 20 = 30 (10 + 20 is evaluated first due to parentheses)
}}