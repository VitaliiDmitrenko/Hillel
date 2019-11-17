package les4;

public class less4 {

    public static boolean slip (boolean weekday, boolean vacation) {
        if(!weekday||vacation)
            return false;
        else return true;
    } //slipIn

    public static boolean monkeytrouble(boolean aSmile, boolean bSmile) {
    if (aSmile && bSmile)
        return true;
    if (!aSmile && !bSmile)
        return true;
    else return false;
    }// monkeyTrouble

    public static int diff21(int n){
    if (n<=21)
        return 21-n;
    else return (n-21)*2;
    } //diff21
    /**We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
     parrotTrouble(true, 6) → true
     parrotTrouble(true, 7) → false
     parrotTrouble(false, 6) → false*/
    public static boolean parrotTrouble (boolean talking, int hour) {
     if (talking==true && ((hour>=0 && hour<=6) ||(hour>=21 && hour<=23)))
         return true;
     else return false;
    } //parrotTrouble
    /**Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
     makes10(9, 10) → true
     makes10(9, 9) → false
     makes10(1, 9) → true*/
    public static boolean makes10(int a, int b) {
    if ((a==10 || b==10) || a+b==10)
        return true;
    else return false;
    }//makes10
/**Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
 nearHundred(93) → true
 nearHundred(90) → true
 nearHundred(89) → false*/
    public static boolean nearHundred(int n) {
        if (n)

    }//nearHundred


}
