package com.bimbi.maps_kotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bimbi.maps_kotlin.adapter.AdapterWisata
import com.bimbi.maps_kotlin.model.ModelWisata

class ListWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_wisata)

        //data list wisata
        val listWisata = listOf<ModelWisata>(
               ModelWisata("Wisata Istana Pagaruyuang","Batusangkar",
                   R.drawable.destinasi_wisata1,"Istano Basa Pagaruyung yang lebih terkenal dengan nama Istana Besar Kerajaan Pagaruyung adalah museum berupa replika istana Kerajaan Pagaruyung terletak di Nagari Pagaruyung, Kecamatan Tanjung Emas, Kabupaten Tanah Datar, Sumatera Barat. Istana ini berjarak lebih kurang 5 kilometer dari Batusangkar. Istana ini merupakan objek wisata budaya yang terkenal di Sumatera Barat.Istana Pagaruyung pada mulanya di Bukit Batu Patah dan terbakar saat terjadi Perang Padri pada tahun 1804. Istana baru sempat dibangun kembali, tetapi terbakar pada tahun 1966.\n" +
                           "\n" +
                           "Istana baru dibangun lagi pada tahun 1976. Meski demikian, gagasan pembangunan kembali Istana Pagaruyung sudah dicetuskan pada tahun 1968 oleh Gubernur Sumatera Barat Harun Zain. Harun Zain merasa diperlukannya warisan yang bisa mempersatukan orang Minang setelah peristiwa Pemerintahan Revolusioner Republik Indonesia (PRRI).[3]\n" +
                           "\n" +
                           "Pada tanggal 1 November 1975, disepakatilah sebuah perjanjian pendirian bangunan replika Istana Pagaruyung. Istana ini tidak dibangun pada situs aslinya tetapi berpindah lebih selatan dari situs aslinya. Pembangunan dimulai pada 27 Desember 1976 dengan upacara penamanam tonggak tuo dan baru selesai secara keseluruhan pada tahun 1985.[3]\n" +
                           "\n" +
                           "Istana Pagaruyung dimaksudkan untuk menjadi ikon Sumatera Barat. Setelah selesai dibangun, istana menjadi dikenal publik sebagai tempat kunjungan wisata dan museum.[3]",
                   0.47110328699869397,100.62142635248782),

               ModelWisata("Pulau Pasumpahan","Teluk kabung",
                   R.drawable.destinasi_wisata2,"Pulau Pasumpahan adalah sebuah pulau yang berada di perairan kecamatan Bungus Teluk Kabung Kota Padang provinsi Sumatera Barat, Indonesia. Klaim akan keindahan lautnya membuat pulau ini mulai dikenal oleh wisatawan lokal dan internasional.\n" +
                           "\n" +
                           "Pulau Pasumpahan berada sekitar 200 meter dari Pulau Sikuai. Pulau ini memiliki objek wisata pantai pasir putih dengan terumbu karang yang masih terjaga.\n" +
                           "\n" +
                           "Pulau ini diharapkan akan menjadi daerah tujuan wisata unggulan di provinsi Sumatera Barat. Pulau ini terletak di sebelah barat Pulau Setan Kecil, untuk menempuh pulau ini memakan waktu 10 menit dari Sungai Pisang dengan mesin 45 PK.\n" +
                           "\n" +
                           "Potensi wisata bawah laut di kawasan wisata bahari pantai barat Kota Padang adalah kawasan ekosistem terumbu karang yang terdapat hampir di setiap pulau, di antaranya di Pulau Gosong. Selain dari terumbu karang berbagai jenis ikan karang/ikan-ikan hias juga sangat menarik untuk dinikmati oleh wisatawan. Di perairan Kota Padang ditemukan 21 jenis ikan kepe-kepe yang didominasi oleh Chaetodon trifascialis. Lokasi-Iokasi penyelaman yang sudah mulai dipasarkan kepada wisatawan antara lain Pulau Sironjong, Pulau Ular, Pulau Sirandah, dan Pulan Pandan.\n" +
                           "\n" +
                           "Pasumpahan kini tengah dikembangkan sebagai objek wisata yang di unggulkan di daerah sumatera barat. Fasilitas pendukung untuk itu tengah dibangun di pulau ini.",
                   1.1594329193188708,100.34956428317727),

                ModelWisata("Bukittinggi","Agam",
                 R.drawable.destinasi_wisata3,"Kota Bukittinggi semula merupakan pasar (pekan) bagi masyarakat Agam Tuo. Setelah kedatangan Belanda, kota ini menjadi kubu pertahanan mereka untuk melawan Kaum Padri.[11] dan kota Bukittinggi sebelumnya bernama nagari kurai limo jorong. Pada tahun 1825, Belanda mendirikan benteng di salah satu bukit yang terdapat di dalam kota ini. Tempat ini dikenal sebagai benteng Fort de Kock, sekaligus menjadi tempat peristirahatan opsir-opsir Belanda yang berada di wilayah jajahannya. Pada masa pemerintahan Hindia Belanda, kawasan ini selalu ditingkatkan perannya dalam ketatanegaraan yang kemudian berkembang menjadi sebuah stadsgemeente (kota),[12] dan juga berfungsi sebagai ibu kota Afdeeling Padangsche Bovenlanden dan Onderafdeeling Oud Agam.[13]\n" +
                            "\n" +
                            "Pada masa pendudukan Jepang, Bukittinggi dijadikan sebagai pusat pengendalian pemerintahan militernya untuk kawasan Sumatra, bahkan sampai ke Singapura dan Thailand. Kota ini menjadi tempat kedudukan komandan militer ke-25 Kempetai, di bawah pimpinan Mayor Jenderal Hirano Toyoji.[14][15] Kemudian kota ini berganti nama dari Stadsgemeente Fort de Kock menjadi Bukittinggi Si Yaku Sho yang daerahnya diperluas dengan memasukkan nagari-nagari sekitarnya seperti Sianok Anam Suku, Gadut, Kapau, Ampang Gadang, Batu Taba, dan Bukit Batabuah. Sekarang nagari-nagari tersebut masuk ke dalam wilayah Kabupaten Agam.\n" +
                            "\n" +
                            "Setelah kemerdekaan Indonesia, Bukittinggi ditetapkan sebagai Ibu Kota Provinsi Sumatra, dengan gubernurnya Mr. Teuku Muhammad Hasan.[16] Kemudian Bukittinggi juga ditetapkan sebagai wilayah pemerintahan kota berdasarkan Ketetapan Gubernur Provinsi Sumatra Nomor 391 tanggal 9 Juni 1947.\n" +
                            "\n" +
                            "Pada masa mempertahankan kemerdekaan Indonesia, Kota Bukitinggi berperan sebagai kota perjuangan, ketika pada tanggal 19 Desember 1948 kota ini ditunjuk sebagai Ibu Kota Negara Indonesia setelah Yogyakarta jatuh ke tangan Belanda atau dikenal dengan Pemerintahan Darurat Republik Indonesia (PDRI). Di kemudian hari, peristiwa ini ditetapkan sebagai Hari Bela Negara, berdasarkan Keputusan Presiden Republik Indonesia tanggal 18 Desember 2006.[17][18]\n" +
                            "\n" +
                            "Selanjutnya Kota Bukittinggi menjadi kota besar berdasarkan Undang-undang Nomor 9 Tahun 1956 tentang pembentukan daerah otonom kota besar dalam lingkungan daerah Provinsi Sumatra Tengah masa itu,[19] yang meliputi wilayah Provinsi Sumatera Barat, Jambi, Riau, dan Kepulauan Riau sekarang.\n" +
                            "\n" +
                            "Dalam rangka perluasan wilayah kota, pada tahun 1999 pemerintah menerbitkan Peraturan Pemerintah Nomor 84 Tahun 1999 yang isinya menggabungkan nagari-nagari di sekitar Bukittinggi ke dalam wilayah kota. Nagari-nagari tersebut yaitu Cingkariang, Gaduik, Sianok Anam Suku, Guguak Tabek Sarojo, Ampang Gadang, Ladang Laweh, Pakan Sinayan, Kubang Putiah, Pasia, Kapau, Batu Taba, dan Koto Gadang.[20] Namun, sebagian masyarakat Kabupaten Agam menolak untuk bergabung dengan Bukittinggi sehingga, peraturan tersebut hingga saat ini belum dapat dilaksanakan.[21]\n" +
                            "\n" +
                            "Pemerintah Kota menetapkan hari jadi Kota Bukittinggi pada tanggal 22 Desember 1784.[22]",
                    0.30497775468964,100.36951865248705),

                ModelWisata("Puncak Gagoan","Solok",
                R.drawable.destinasi_wisata4,"Lokasi Puncak Gagoan berada di Solok, Sumatera Barat sebuah provinsi yang memiliki terkenal akan keindahan alamnya sehingga mampu menarik minat wisatawan baik di tingkat nasional maupun mancanegara.\n" +
                            "\n" +
                            "Tidak main-main, di tahun 2017 pernah tercatat jumlah kunjungan wisatawan ke Sumatera Barat sampai menembus angka 7,8 juta orang.\n" +
                            "\n" +
                            "Salah-satu kota yang ada di Sumatera Barat yang turut andil menghadirkan objek wisata yang mempesona adalah Kabupaten Solok. Jumlah kunjungan wisatawan di tahun 2017 pernah menembus angka 500 ribu lebih.\n" +
                            "\n" +
                            "Berikut ulasan Puncak Gagoan sebagai referensi wisata alam yang indah untuk ngadem sejenak melupakan rasa penat dan gundah dalam diri.",
                0.6740071846064174,1100.50898515248883),

                ModelWisata("Danau Atas Danau Bawah","Alahan Panjang",
                R.drawable.destinasi_wisata5,"Secara administratif lokasi Danau Kembar berada di daerah Bungo Tanjung, Alahan Panjang, Kabupaten Solok, Sumatera Barat. Danau Diatas sendiri terletak di tepi jalan Padang-Muara Labuh, sementara Danau Dibawah terletak di nagari Bukit Sileh, Kecamatan Lembang Jaya. Jika datang dari Kota Padang, para pengunjung bisa menggunakan transportasi umum atau kendaraan pribadi. Untuk transportasi umum para pengunjung dari Kota Padang bisa menumpangi bus menuju Alahan Panjang dengan jarak sekitar 60 km, dengan ongkos kurang lebih 20 ribu rupiah. Meskipun harus menempuh perjalanan panjang, namun pemandangan yang disajikan berupa hamparan perkebunan teh dan pegunungan dijamin tak akan membuatmu merasa bosan. Setelah sampai di Alahan Panjang bus akan berhenti di Pasar Simpang, dan dari sana kamu bisa menumpang ojek menuju ke Danau Kembar. Dari Simpang, kamu bisa mengambil jalan ke kanan menuju ke Danau Diatas atau ke simpang yang lainnya untuk menuju ke Danau Dibawah.",
                    1.0515900043015098,100.71143929666955),

        )

        //panggil adapter
        val adapterWisata = AdapterWisata(listWisata)
        //Recycler View
        val rvWisata: RecyclerView = findViewById(R.id.rvWisata)
        rvWisata.adapter = adapterWisata
        //set layout untuk recyler view
        rvWisata.apply{
            layoutManager = LinearLayoutManager(this@ListWisataActivity)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}