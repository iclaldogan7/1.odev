
void main() {
    //Dört işlem ödevi
    int sayi1 = 16;
    int sayi2 = 8;
    IO.println("Sayıların toplamı:" + (sayi1 + sayi2));
    IO.println("Sayıların farkı:" + (sayi1 - sayi2));
    IO.println("Sayıların çarpımı:" + (sayi1 * sayi2));
    IO.println("Sayıların bölümü:" + (sayi1 / sayi2));


    //Eşkenar üçgenin çevresi ve alanı
    int birkenar = 23;
    int taban = 10;
    int yukseklik = 19;
    int cevre = birkenar * 3;
    int alan = taban * yukseklik / 2;
    IO.println("Üçgenin çevresi:" + (cevre));
    IO.println("Üçgenin alanı:" + (alan));
}