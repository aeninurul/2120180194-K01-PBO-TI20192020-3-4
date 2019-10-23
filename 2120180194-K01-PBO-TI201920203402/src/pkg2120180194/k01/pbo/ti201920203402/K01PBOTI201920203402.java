/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180194.k01.pbo.ti201920203402;

/**
 *
 * @author angel
 */
public class K01PBOTI201920203402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //intansiasi dari class mahasiswa
        //membuat object baru dengan class mahasiswa
        //membuat object mhs1 dengan class mahasiswa
        mahasiswa mhs1=new mahasiswa();
        //membuat object mhs2 dengan class mahasiswa
        mahasiswa mhs2=new mahasiswa();
        //membuat object baru mhs3 dengan class mahasiswa 
        mahasiswa mhs3=new mahasiswa();
        //membuat object baru mhs4 dengan class mahasiswa
        mahasiswa mhs4=new mahasiswa();
        //membuat object baru mhs5 dengan class mahasiswa
        mahasiswa mhs5=new mahasiswa();

        //menampilkan teks biasa diatas hasil method
        //membuat baris baru (\n)
        System.out.println("Biodata Mahasiswa    :\n");       

        //memangakses object
        //memasukan biodata mhs1-mhs5 kedalam 3 variabel alamat,nim dan nama dengan mengakses method
        mhs1.tampilBiodata(" Bojonegoro "," Nuruz Zilviana Nur Biadah","2120180196\n");
        mhs2.tampilBiodata(" Bojonegoro", " Nur Eka Yulia Riana ", " 2120180196\n");
        mhs3.tampilBiodata(" Tuban ", " Rahma Melyana ", " 2120180198\n");
        mhs4.tampilBiodata(" Bojonegoro ", " Siti Ghurotul Badriyah", " 2120180201\n");
        mhs5.tampilBiodata(" Tuban ", " Siti Lutfiatun N ", " 2120180202\n");
    }
    
}
