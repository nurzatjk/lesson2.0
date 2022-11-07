import java.util.random.RandomGenerator;

public class Main {

    public static void main(String [] args ) {
        System.out.println(temperature(46,-40));
        System.out.println(temperature(43,-23));
        System.out.println(temperature(14,4));
        System.out.println(temperature(9,32));
        System.out.println(temperature(20,18));


    }
    public static String temperature (int age,int temperant) {
      if (age >= 20 && age <= 45 && temperant >= -20 && temperant <= 30) {
        return ("можно идти гулять");
      }else if (age < 20 && temperant >= 0 && temperant <= 28) {
        return("можно идти гулять");
        
      }else if(age  > 45 && temperant >= -10 && temperant<= 30) {
    return("можно идти гулять");

      }else{
    return("оставайтесь дома");
        }
    }
}












