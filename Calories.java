public class Calories{
public static void main(String[] args){
String userName = "Balakrishnan";
int stepsWalked = 8005;
double caloriesPerStep = 0.0100;
double totalCalories = stepsWalked * caloriesPerStep;

System.out.println("User: "+userName);
System.out.println("Steps Walked: "+stepsWalked);
System.out.println("CaloriesBurn: "+totalCalories);

}
}