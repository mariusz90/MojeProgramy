import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Main {

	public static void main(String[] args) {
		//for (int i = 0; i < 10; i++) //i += 2
		//{
		//	System.out.println(i);
		//}
		
		//licze a pobierasz od usera dopoki ne bedzie z przedzialu <10,20> a liczba b to dwukrotnosc iczby a
		//wypisz wszystkie elementy z przedzialu <a,b> ktore sa parzyste i podzielne przez 4
		
		//pobieram liczbe dopoki nie bedzie z przedzialu <10,20>
		System.out.println("PODAJ LICZBE");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		
		//aby zliczyc takie liczby jak mamy wypisac to stosujemy licznik
		int licznik = 0;
		//do sumowania dajemy kolejna zmienna
		int suma = 0;
		
		while (a < 10 || a > 20) //dopok jestem poza przedzialem to pobieram znowu liczbe i tak az bede w przedziale
		{
			System.out.println("NIEWLASCIWA LICZBA");
			a = sc.nextInt();
			sc.nextLine();
		}
		
		int b = 2 * a;
		
		//przegladmy przedzial <a,b>
		for (int i = a; i <= b; i++)
		{
			if (i % 2 == 0 && i % 4 ==0)
			{
				licznik++; //kiedy trafiasz na element ktory spelnia warunek to go zwiekszasz o 1
				suma += i; //sumownie kolejnych elementow liczby
				System.out.println("EL = " + i);
			}
		}
		
		System.out.println("LICZNIK = " + licznik);
		System.out.println("SUMA = " + suma);
		System.out.println("GIT");
	}

}
