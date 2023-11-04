package p6;

public class job8 { 
 
 public String nama; 
 public int umur; 
 
 public void makan() 
 { 
 System.out.println("Sedang Makan"); 
 } 
 
 public void mengeluarkanSuara() 
 { 
 System.out.println("Sedang Bersuara"); 
 } 
}
package p6;

public class job8b extends job8{ 
 
 @Override 
 public void mengeluarkanSuara() 
 { 
 System.out.println("Meong"); 
 } 
}
package p6;

public class job8c 
{ 
 
 public static void main(String[] args) 
 { 
 job8 animal1 = new job8(); 
 animal1.nama = "Binatang Abstrak"; 
 animal1.mengeluarkanSuara(); 
 
 job8b kucing1 = new job8b(); 
 kucing1.nama = "Kitten"; 
 kucing1.mengeluarkanSuara(); 
 
 job8d animal2 = new job8d(); 
 animal2.nama = "p"; 
 animal2.mengeluarkanSuara();
 } 
}
package p6;

public class job8d extends job8{ 
 
 @Override 
 public void mengeluarkanSuara() 
 { 
 System.out.println("kukkurukuk"); 
 } 
}