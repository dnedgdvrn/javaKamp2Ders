public class Main {
    public static void main(String[] args) {
        int toplam = t(3,5);
        System.out.println(toplam);

        int tt = toplamlar(53,6,8,3,3);
        System.out.println(tt);
    }

    public static void get(){
   System.out.println("Gönder");
    }

    public static void set(){
        System.out.println("Ekle");
    }

    public static void delete(){
        System.out.println("Sil");
    }


    public static void update(){
        System.out.println("Güncelle");
    }

    public static int t ( int sayi1,int sayi2){

        return sayi1+sayi2;
    }

    public static  int toplamlar (int ... sayilar){
        int topla=0;
        for ( int sayi:sayilar){
            topla+=sayi;
        }
        return topla;
}


}