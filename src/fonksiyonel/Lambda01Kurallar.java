package fonksiyonel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Sadece bir adet abstract methodu olan interface'lere fonksiyonel interface denir
//Kullanici isterse kendi fonksiyonel interface'ini yazabilir.Ama javada hali hazirda
//Consumer,Function,Supplier,Predicate gibi tanimlanmis interfaceler bulunmaktadir
//Ayrica bu interface'leri parametre olarak alabilen High Order Function(HDF)ler de bulunmaktadir
//foreach(),map(),filter(),reduce() gibi HDFler fonksiyonel interfaceler ile calistigi icin
//javada genelde bu gibi fonksiyonlar uzerinden Lambda ifadeleri kullanilmaktadir

public class Lambda01Kurallar {
    public static void main(String[] args) {

        List<Integer> liste = Arrays.asList(1,2,3,4,5);

 //foreach() bir collection'nin iterasyonu icin kullanilan HDF'dur.
 //Parametre olarak bir lambda fonksiyonu olabilir.

 //Dizinin elemanlarini yazdiralim
        liste.forEach(x-> System.out.println(x));//12345 Tek tek alip calistiriyor

        System.out.println("=============");//ikisini birbirinden ayirmak icin

   //Listenin elemanlarini 2 artirarak yazdir
   liste.forEach(t-> System.out.print(t+2+" "));

   liste.forEach(t->{
       int miktar = 2;
       System.out.println(t+miktar+" ");
   });

   }

}

