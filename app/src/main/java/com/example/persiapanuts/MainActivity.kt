package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.pengertian,"SISTEM INFORMASI PEMILIHAN UMUM","PENGERTIAN ","Pemilihan umum yang kemudian disingkat menjadi pemilu, dan selanjutnya kata pemilu begitu akrab dengan masalah politik dan pergantian pemimpin, karena pemilu, politik dan pergantian pemimpin saling berkaitan. Pemilu yang diselenggarakan tidak lain adalah masalah politik yang berkaitan dengan masalah pergantian pemimpin.\n" +
                "Dalam sebuah negara demokrasi, pemilu merupakan salah satu pilar utama dari sebuah proses akumulasi kehendak masyarakat. Pemilu sekaligus merupakan prosedur demokrasi untuk memilih pemimpin. Diyakini pada sebagian besar masyarakat beradab di muka bumi ini, pemilu adalah mekanisme pergantian kekuasaan (suksesi) yang paling aman, bila dibandingkan dengan cara-cara lain. Sudah barang pasti jika dikatakan, pemilu merupakan pilar utama dari sebuah demokrasi.\n"))

        data?.add(DataModel(R.drawable.kpu,"SISTEM INFORMASI PEMILIHAN UMUM"," KOMISI PEMILIHAN UMUM", "Komisi Pemilihan Umum (KPU) adalah lembaga Penyelenggara Pemilu yang bersifat nasional, tetap, dan mandiri yang bertugas melaksanakan Pemilu. ... Dalam menjalankan tugasnya, KPU dibantu oleh Sekretariat Jenderal; KPU Provinsi dan KPU Kabupaten/Kota masing-masing dibantu oleh sekretariat."))

        data?.add(DataModel(R.drawable.bawaslu,"SISTEM INFORMASI PEMILIHAN UMUM","BAWASLU", "Badan Pengawas Pemilihan Umum (disingkat Bawaslu) adalah lembaga penyelenggara Pemilu yang bertugas mengawasi penyelenggaraan Pemilu di seluruh wilayah Negara Kesatuan Republik Indonesia. Bawaslu diatur dalam bab IV Undang-Undang Nomor 15 Tahun 2011 tentang Penyelenggara Pemilihan Umum. Jumlah anggota Bawaslu sebanyak 5 (lima) orang. Keanggotaan Bawaslu terdiri atas kalangan professional yang mempunyai kemampuan dalam melakukan pengawasan dan tidak menjadi anggota partai politik. Dalam melaksanakan tugasnya anggota Bawaslu didukung oleh Sekretariat Jenderal Badan Pengawas Pemilihan Umum."))

        data?.add(DataModel(R.drawable.parpol,"SISTEM INFORMASI PEMILIHAN UMUM","PARPOL ( PARTAI POLITIK )", "partai politik adalah organisasi politik yang menjalani ideologi tertentu atau dibentuk dengan tujuan umum. Definisi lainnya adalah kelompok yang terorganisir yang anggota-anggotanya mempunyai orientasi, nilai-nilai, dan cita-cita yang sama. Bisa juga di definisikan, perkumpulan (segolongan orang-orang) yang seasas, sehaluan, setujuan di bidang politik. Baik yang berdasarkan partai kader atau struktur kepartaian yang dimonopoli oleh sekelompok anggota partai yang terkemuka.\n" +
                "1.\tPartai Amanat Nasional (PAN)\n" +
                "2.\tPartai Berkarya\n" +
                "3.\tPartai Demokrasi Indonesia Perjuangan (PDIP)\n" +
                "4.\tPartai Demokrat\n" +
                "5.\tPartai Gerakan Indonesia Raya (Gerindra)\n" +
                "6.\tPartai Gerakan Perubahan Indonesia (Garuda)\n" +
                "7.\tPartai Golongan Karya (Golkar)\n" +
                "8.\tPartai Hati Nurani Rakyat (Hanura)\n" +
                "9.\tPartai Keadilan Sejahtera (PKS)\n" +
                "10.\tPartai Kebangkitan Bangsa (PKB)\n" +
                "11.\tDLL\n"))

        data?.add(DataModel(R.drawable.pemilu,"SISTEM INFORMASI PEMILIHAN UMUM","PEMILIHAN UMUM", "Pemilu adalah sarana pelaksanaan kedaulatan rakyat yang dilaksanakan secara langsung, umum, bebas, rahasia, jujur, dan adil dalam Negara Kesatuan Indonesia berdasarkan Pancasila dan Undang-undang Dasar Negara Republik Indonesia 1945."))

        data?.add(DataModel(R.drawable.tugaspokok,"SISTEM INFORMASI PEMILIHAN UMUM","TUGAS & FUNGSI", "1.\tTugas KPU :\n" +
                "-\tmenjabarkan program dan melaksanakan anggaran serta menetapkan jadwal di provinsi;\n" +
                "-\tmelaksanakan semua tahapan penyelenggaraan di provinsi berdasarkan peraturan perundang-undangan;\n" +
                "-\tmengoordinasikan, menyelenggarakan, dan mengendalikan tahapan penyelenggaraan oleh KPU Kabupaten/Kota;\n" +
                "2.\tTugas Bawaslu :\n" +
                "a. Menyusun standar tata laksana pengawasan Penyelenggaraan Pemilu untuk pengawas Pemilu di setiap tingkatan;\n" +
                "b. Melakukan pencegahan dan penindakan terhadap:\n" +
                "Pelanggaran Pemilu; dan\n" +
                "Sengketa proses Pemilu;\n" +
                "c. Mengawasi persiapan Penyelenggaraan Pemilu, yang terdiri atas:\n" +
                "Perencanaan dan penetapan jadwal tahapan Pemilu;\n" +
                "Perencanaan pengadaan logistik oleh KPU;\n" +
                "Sosialisasi Penyelenggaraan Pemilu; dan\n" +
                "Pelaksanaan persiapan lainnya dalam Penyelenggaraan Pemilu sesuai dengan ketentuan peraturan perundangundangan.\n"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }

    private fun DataModel(gambar: Int, lokasi: String, nama: String) {

    }
}