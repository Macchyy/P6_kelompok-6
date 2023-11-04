package p6;

public class job6 { 
 
 protected String code, namagame, lisensi; 
 
 public job6 (){ 
 
 } 
 public job6 (String kode, String game, String lisen){ 
 
 this.code = kode; 
 this.namagame = game; 
 this.lisensi = lisen; 
 } 
 public void setCode(String kode){ 
 this.code = kode; 
 } 
 
 public String getCode(){ 
 return code; 
 } 
 public void setNamagame(String game){ 
 this.namagame = game; 
 } 
 
 public String getNamagame(){ 
 return namagame; 
 } 
 public void setlisensi (String lisen){ 
 this.lisensi = lisen; 
 } 
 
 public String getlisensi(){ 
 return lisensi; 
 } 
}
package p6;

public class job6b extends job6{ 
 
 protected String jenis; 
 protected String type; 
 public job6b (String kode, String name, String lisen){ 
 super(kode, name, lisen); 
 } 
 
 public job6b(String jns, String tipe){ 
 this.jenis = jns; 
 this.type = tipe; 
 super.setCode(code); 
 super.setNamagame(namagame); 
 super.setlisensi(lisensi); 
 } 
 public String getCod(){ 
 return super.getCode(); 
 } 
 
 public String getNama(){ 
 return super.getNamagame(); 
 } 
 
 public String getlis (){ 
 return super.getlisensi(); 
 } 
 public String getJenis(){ 
 return jenis; 
 } 
 public String getType(){ 
 return type; 
 } 
}
package p6;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class job6c { 
 public static void main(String[] args) throws 
IOException{ 
 
 BufferedReader input = new BufferedReader (new 
InputStreamReader(System.in)); 
 String code; 
 String nama; 
 String jenis; 
 String tipe; 
 String lisen; 
 int pilihan; 
 
 job6b print = new job6b ("",""); 
 job6b $print = new job6b ("", "", ""); 
 
 System.out.println("+++++Game Pertama+++++"); 
 System.out.println("----------------------"); 
 
 System.out.println("Kode Game:"); 
 print.code = code = input.readLine(); 
 System.out.println("Nama :"); 
 print.namagame = nama = input.readLine(); 
 System.out.println("Jenis :"); 
 print.jenis = jenis = input.readLine(); 
 System.out.println("Type :"); 
 print.type = tipe = input.readLine(); 
 System.out.println("Lisensi :"); 
 print.lisensi = lisen = input.readLine(); 
 System.out.println(""); 
 
 System.out.println("*****Game Kedua*****"); 
 System.out.println("--------------------"); 
 System.out.println("Kode Game:"); 
 $print.code = code = input.readLine(); 
 System.out.println("Nama :"); 
 $print.namagame = nama = input.readLine(); 
 System.out.println("Jenis :"); 
 $print.jenis = jenis = input.readLine(); 
 System.out.println("Type :"); 
 $print.type = tipe = input.readLine(); 
 System.out.println("Lisensi :"); 
 $print.lisensi = lisen = input.readLine(); 
 System.out.println(""); 
 
 System.out.println("Lihat Data"); 
 System.out.println("1. Data Pertama\n" 
 + "2. Data Kedua\n" 
 + "0.Exit"); 
 System.out.println("Masukan Pilihan : "); 
 
 pilihan = Integer.parseInt(input.readLine()); 
 
 while (pilihan != 0) { 
 switch (pilihan) { 
 case 1: 
 System.out.println("Rincian Game" + 
print.getNama()); 
 
System.out.println("=============================="); 
 System.out.println("Kode Game :" + 
print.getCod()); 
 System.out.println("-------------------------------"); 
 System.out.println("Nama Game :" + 
print.getNama()); 
 System.out.println("-------------------------------"); 
 System.out.println("Jenis Game :" + 
print.getJenis()); 
 System.out.println("-------------------------------"); 
 System.out.println("Type Game :" + 
print.getType()); 
 System.out.println("-------------------------------"); 
 System.out.println("Lisensi Game :" + 
print.getlis()); 
 System.out.println("-------------------------------"); 
 break; 
 
 case 2: 
 System.out.println("Rincian Game" + 
$print.getNama()); 
 
System.out.println("=============================="); 
 System.out.println("Kode Game : " + 
$print.getCod()); 
 System.out.println("-------------------------------"); 
 System.out.println("Nama Game : " + 
$print.getNama()); 
 System.out.println("-------------------------------"); 
 System.out.println("Jenis Game : " + 
$print.getJenis()); 
 System.out.println("-------------------------------"); 
 System.out.println("Type Game : " + 
$print.getType()); 
 System.out.println("-------------------------------"); 
 System.out.println("Lisensi Game : " + 
$print.getlis()); 
 System.out.println("-------------------------------"); 
 break; 
 default: 
 } 
 System.out.println("Lihat Data"); 
 System.out.println("1. Data Pertama\n" 
 + "2. Data Kedua\n" 
 + "0.Exit"); 
 System.out.println("Masukan Pilihan : "); 
 pilihan = Integer.parseInt(input.readLine()); 
 } 
 } 
}
