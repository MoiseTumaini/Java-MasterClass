package JavaMasterClass.TimBuchalka.SwitchStatement;

public class EnhancedSwitchStatement {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            printDayOfWeek(i);
        }
    }

//    My solution
//    public static String printDayOfWeek(int day){
//
//        return switch (day){
//            case 0 -> "Sunday";
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            default -> {
//                String message = "Invalid Day";
//                yield message;}
//        };
//    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

}
