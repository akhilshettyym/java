public class D_SpecialChar{public static void main(String[]args){

// Using double quotes inside a string using escape sequence \"
String txt1="We are the so-called \"Vikings\" from the north.";System.out.println(txt1); // Output: We are the so-called
                                                                                         // "Vikings" from the north.

// Using single quote inside a string using escape sequence \'
String txt2="It\'s alright.";System.out.println(txt2); // Output: It's alright.

// Using a backslash inside a string using escape sequence \\
String txt3="The character \\ is called backslash.";System.out.println(txt3); // Output: The character \ is called
                                                                              // backslash.

// Using \n for new line
String txt4="First line\nSecond line";System.out.println(txt4);
// Output:
// First line
// Second line

// Using \t for a tab space
String txt5="Name:\tAkhil";System.out.println(txt5); // Output: Name: Akhil

// Using \r (carriage return)
String txt6="Hello\rWorld!";System.out.println(txt6); // Output: World! (may overwrite Hello depending on system)

// Using \b (backspace)
String txt7="Helloo\b!";System.out.println(txt7); // Output: Hello!

// Using \f (form feed)
String txt8="This is\fFormFeed";System.out.println(txt8); // Output depends on console (may not show visible difference)

}}