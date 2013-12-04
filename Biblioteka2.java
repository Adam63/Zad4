//package lab4;
//import lab4.Ksiazka;
//
//class Biblioteka2
//{
//	public int i=0;
//	public String adres;
//	public Ksiazka[] ksiazki = new Ksiazka[100];
//	
//	public Biblioteka2(String ADRES)
//	{
//		adres=ADRES;
//	}
//	public void dodajKsiazke(Ksiazka tyt)
//	{
//		ksiazki[i]=tyt;
//		i++;
//	}
//	public void wypiszDostepneKsiazki()
//	
//	{
//		
//		for(int i = 0; i<100; i++)
//		{
//			if(ksiazki[i] != null)
//			{
//				System.out.println(ksiazki[i].dajTytul());
//			}
//		}
//	}
//	
//	//Dodaj implementacje odpowiednich metod
//	public static void main( String[] argumenty )
//	{
//		//Stworz dwie biblioteki
//		Biblioteka2 pierwsza = new Biblioteka2( "Armi Krajowej 24" );
//		Biblioteka2 druga = new Biblioteka2( "Plac Grunwaldzki 6" );
//
//		//Dodaj cztery ksiazki do pierwszej biblioteki
//		pierwsza.dodajKsiazke( new Ksiazka( "Pan Tadeusz" ) );
//		pierwsza.dodajKsiazke( new Ksiazka( "Gra o Tron" ) );
//		pierwsza.dodajKsiazke( new Ksiazka( "Tozsamosc Bourne'a" ) );
//		pierwsza.dodajKsiazke( new Ksiazka( "Analiza Matematyczna" ) );
////
////		//Wypisz godziny urzedowania bibliotek
////		System.out.println( "Godziny otwarcia bibliotek ");
////		wypiszGodzinyOtwarcia();
////		System.out.println(); //pusta linijka
////
////		System.out.println( "Adresy bibliotek " );
////		pierwsza.wypiszAdres();
////		druga.wypiszAdres();
////		System.out.println(); //pusta linijka
////
////		//wypozycz Pana Tadeusza z obu bibliotek
////		System.out.println( "Wypozyczanie Pana Tadeusza" );
////		pierwsza.wypozyczKsiazke( "Pan Tadeusz" );
////
////		pierwsza.wypozyczKsiazke( "Pan Tadeusz" ); //sprobuj jeszcze raz
////
////		druga.wypozyczKsiazke( "Pan Tadeusz" );
////
////		System.out.println(); //pusta linijka
////
////		//Wypisz dostepne tytuly w obu bibliotekach
////		System.out.println( "Ksiazki dostepne w pierwszej bibliotece" );
//		pierwsza.wypiszDostepneKsiazki();
////		System.out.println(); //pusta linijka
////		System.out.println( "Ksiazki z drugiej biblioteki" );
////		druga.wypiszDostepneKsiazki();
////		System.out.println();
////
////		// zwroc Pana Tadeusza do biblioteki
////		System.out.println( "Zwrot Pana Tadeusza" );
////		pierwsza.oddajKsiazke( "Pan Tadeusz" );
////		System.out.println();
////
////		// Wypisz tytuly dostepne w pierwszej bibliotece
////		System.out.println( "Ksiazki dostepne w pierwszej bibliotece" );
////		pierwsza.wypiszDostepneKsiazki();
//	}
//}
//		
//
