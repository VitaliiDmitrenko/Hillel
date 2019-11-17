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
    public static boolean parrotTrouble (boolean talking, int hour) {
     if ((talking && (hour>=0 || hour<=6)) || (talking && (hour>=21 || hour<=23)))
         return true;
     else return false;
    } //parrotTrouble
}
