import java.util.Random;
import java.util.Scanner;
class Daice{
public static void main(String[] args){

System.out.println("Rolling the dice...");

Random rand = new Random();

int daice1 = rand.nextInt(6)+1;
int daice2 = rand.nextInt(6)+1;
System.out.println("Dai 1:"+ daice1);
System.out.println("Dai 2:"+ daice2);

int ans = daice1+daice2;
System.out.println("total value : "+ans);
  }
}

