package p6;

abstract class Pulau { 
 static final String NEGARA = "Indonesia"; 
 public abstract String nama(); 
 public String ambilNegara(){ 
 return NEGARA; 
 } 
} 
class Jawa extends Pulau { 
 String namap; 
 public String nama(){ 
 namap = "Pulau Jawa"; 
 return namap; 
 } 
} 
class Kalimantan extends Pulau { 
 String namap; 
 public String nama(){ 
 namap = "Pulau Kalimantan"; 
 return namap; 
 } 
} 
class NTB extends Pulau { 
 String namap; 
 public String nama(){ 
 namap = "Pulau NTB"; 
 return namap; 
 } 
} 

class JawaBarat extends Jawa { 
 void namaProv(){ 
 System.out.println("Ini Pulau Berada di "+ 
ambilNegara()); 

 System.out.println("Ini "+ nama()); 
 System.out.println("Ini Provinsi Jawa Barat"); 
 System.out.println("Jumlah Penduduk : 232342 Jiwa"); 
 } 
} 
class KalimantanTimur extends Kalimantan { 
 void namaProv(){ 
 System.out.println("Ini Pulau Berada di "+ 
ambilNegara()); 
 System.out.println("Ini "+ nama()); 
 System.out.println("Ini Provinsi Kalimantan Timur"); 
 System.out.println("Jumlah Penduduk : 32421 Jiwa"); 
 } 
} 
class Lombok extends NTB { 
 void namaProv(){ 
 System.out.println("Ini Pulau Berada di "+ 
ambilNegara()); 

 System.out.println("Ini "+ nama()); 
 System.out.println("Ini Provinsi Mataram"); 
 System.out.println("Jumlah Penduduk : 2333899 Jiwa"); 
 } 
}
 
public class job5 { 
 public static void main (String [] args){ 
 JawaBarat JB = new JawaBarat(); 
 KalimantanTimur KT = new KalimantanTimur(); 
 Lombok LB = new Lombok();
 JB.namaProv(); 
 System.out.println(""); 
 KT.namaProv(); 
 System.out.println(""); 
 LB.namaProv();
 } 
}

