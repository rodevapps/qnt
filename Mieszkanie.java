public class Mieszkanie {
  int iloscMieszkancow = 0;

  public int getIloscMieszkancow() {
    return iloscMieszkancow;
  }

  public boolean setIloscMieszkancow() {
    if (this.iloscMieszkancow < 3) {
      this.iloscMieszkancow++;

      return true;
    } else {
      return false;
    }
  }
}
