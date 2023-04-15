public class MyClass {
  public static void main(String args[]) {
    int iloscPieter = 10;
    int iloscMieszkan = 5;
    int liczbaMieszkancow = 100;

    Mieszkanie[] mieszkanie = new Mieszkanie[iloscPieter * iloscMieszkan];

    for (int i = 0; i < iloscPieter * iloscMieszkan; i++) {
      mieszkanie[i] = new Mieszkanie();
    }

    int i = 0;

    while (true) {
      if (i == liczbaMieszkancow) {
        break;
      }

      int randomPietro = getRandomNumber(0, 10);
      int randomMieszkanie = getRandomNumber(0, 5);

      if (mieszkanie[randomPietro * iloscMieszkan + randomMieszkanie].setIloscMieszkancow()) {
        i++;
      }
    }

    /*
    for (int k = 0; k < iloscPieter; k++) {
      for (int j = 0; j < iloscMieszkan; j++) {
        System.out.println(String.format("W mieszkaniu %d na %d pietrze mieszka %d osob.", j + 1, k + 1, mieszkanie[k * iloscMieszkan + j].getIloscMieszkancow()));
      }      
    }
    */

    int liczbaPustychMieszkan = 0;
    int obliczonaLiczbaMieszkancow = 0;

    for (int k = 0; k < iloscPieter; k++) {
      for (int j = 0; j < iloscMieszkan; j++) {
        obliczonaLiczbaMieszkancow += mieszkanie[k * iloscMieszkan + j].getIloscMieszkancow();

        if (mieszkanie[k * iloscMieszkan + j].getIloscMieszkancow() == 0) {
          System.out.println(String.format("Mieszkanie %d na %d pietrze jest puste.", j + 1, k + 1));

          liczbaPustychMieszkan++;
        }
      }      
    }

    System.out.println(String.format("Ilosc pustych mieszkan: %d", liczbaPustychMieszkan));
    System.out.println(String.format("Obliczona liczba mieszkancow: %d", obliczonaLiczbaMieszkancow));
  }

  public static int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }
}
