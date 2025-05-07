package JavaMasterClass.TimBuchalka.MethodOverloading;

public class Challenge2 {
    /**
     * <h2>Seconds and Minutes Challenge </h2>
     * <p> Create a method, that takes time, represented in seconds, as a parameter.
     * Then transform the seconds into hours, Next, you'll display the time in hours
     * with the remaining minutes and seconds in a String. </p>
     *
     * We want to create two methods with the same name: getDurationString
     * <ul>
     *     <li> The first method has one parameter of type int, named second. </li>
     *     <li> The second method has two parameters, named minutes and seconds, both ints. </li>
     *     <li> Both methods return a String in the format shown: </li>
     * </ul>
     * <h3> 'XXh YYm ZZs' </h3>
     * Where XX >> hours, YY >> minutes, ZZ >> seconds
     */

//    public static String getDurationString(int seconds){
//        if (seconds < 0) return "Error: The seconds parameter can not be less than 0";
//        int hour = seconds/3600;
//        int minute = (seconds%3600)/60;
//        int second = seconds%60;
//        return hour +"h " + minute + "m " + second + "s";
//    }
//
//    public static String getDurationString(int minutes, int seconds){
//        if (minutes < 0 || minutes > 59) System.out.println("The minutes parameter should be inbetween 0 and 59");
//        int second = seconds + minutes*60;
//        return getDurationString(second);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getDurationString(2,70));
//    }

    public static void main(String[] args) {
        System.out.println(getDurationString(-3945)); // first test case
        System.out.println(getDurationString(-65, 45)); // second test case
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return "Invalid data for seconds (" + seconds +"), must be a positive integer value";
        }
        // two step approach to get hours
        int minutes = seconds/60;
        return getDurationString(minutes, seconds%60);
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59){
            return "Invalid data for seconds (" + seconds + "), must be a between 0 and 59";
        }

        int hours = minutes/60;
        int remainingMinutes = minutes%60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }


}
