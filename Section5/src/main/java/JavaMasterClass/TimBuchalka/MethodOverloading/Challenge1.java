package JavaMasterClass.TimBuchalka.MethodOverloading;

public class Challenge1 {

    /**
     * Create two methods with the same name: convertToCentimeters.
     * <ul>
     *      <li> The first method has one parameter of type int, which represents the entire height in inches.
     *         You'll convert inches to centimeters, in this method, and pass back the number of centimeters, as a double. </li>
     *      <li> The second method has two parameters of type int, one to represents height in feet, and one to represent the remaining
     *          height in inches. </li>
     *          <ul>
     *              <li> So if a person is 5 foot, 8 inches. This method will convert feet and inches to just inches, then call the first
     *                  first method, to get the number in centimeter, also returning the value as a double. </li>
     *          </ul>
     *      <li> The conversion formula from inches to centimeters is 1 inch = 2.54 cm. </li>
     *      <li> Alse, 1 foot = 12 inches. </li>
     * </ul>
     */

    public static double convertToCentimeter(int height_inch){
        return height_inch*2.54;
    }

    public static double convertToCentimeter(int height_feet, int height_inches){
        int totalHeight = height_feet*12 + height_inches;
        return convertToCentimeter(totalHeight);
    }

    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeter(5,8) + "cm");
    }

}
