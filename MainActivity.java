package com.example.afiq.alquaran_qu2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lvalquran;



    private String[] namasurah = {
            "An-naba"
            , "An-Naziat"
            , "Abasa"
            , "Atakwir"
            , "Al-infitar"
            , "Al-Muthafifin"
            , "Al-insyiqoq"
            , "AlBuruj"
            , "At-Tariq"
            , "Al-Ala"
            , "Alghsiyah"
            , "Al-fajar"
            , "Al-Balad"
            , "Asy-Syam"
            , "Al-Lail"
            , "Ad-dhuha"
            , "Al-Insyirah"
            , "At-Tin"
            , "Al-Alaq"
            , "Al-Qodr"
            , "AlBayinnah"
            , "Az-Zalzalah"
            , "Al-Adiyat"
            , "Al-Qoriah"
            , "At-Takasur"
            , "Al-Asr"
            , "AlHumazah"
            , "Al-fill"
            , "Al-Quraisyh"
            , "Al-Maun"
            , "Al-Kausar"
            , "Alkafirun"
            , "An-Nasr"
            , "Al-Lahab"
            , "Al-Ikhlas"
            , "Alfaq"
            , "An-Nas"






    };

    private Integer[] gambar = {
            R.drawable.satu,
            R.drawable.dua,
            R.drawable.tiga,
            R.drawable.empat,
            R.drawable.lima,
            R.drawable.nam,
            R.drawable.tujuh,
            R.drawable.lapan,
            R.drawable.bilan,
            R.drawable.puluh,
            R.drawable.belas,
            R.drawable.duabe,
            R.drawable.tigabe,
            R.drawable.patbe,
            R.drawable.limabe,
            R.drawable.enambe,
            R.drawable.tujuhbe,
            R.drawable.lapanbe,
            R.drawable.sembilanbe,
            R.drawable.duabe,
            R.drawable.duasat,
            R.drawable.duadua,
            R.drawable.duatig,
            R.drawable.duapat,
            R.drawable.dualim,
            R.drawable.duanam,
            R.drawable.duajuh,
            R.drawable.duapan,
            R.drawable.dualan,
            R.drawable.tigapuluh,
            R.drawable.tusa,
            R.drawable.tidu,
            R.drawable.titi,
            R.drawable.tipad,
            R.drawable.tima,
            R.drawable.tinam,
            R.drawable.tijuh,
    };

    Integer[] gambar2 = {
            R.drawable.r,
            R.drawable.k,
            R.drawable.r,
            R.drawable.k,
            R.drawable.q,
            R.drawable.r,
            R.drawable.zein,
            R.drawable.afiq,
            R.drawable.afiq,
            R.drawable.zein,
            R.drawable.r,
            R.drawable.k,
            R.drawable.q,
            R.drawable.afiq,
            R.drawable.zein,
            R.drawable.r,
            R.drawable.k,
            R.drawable.q,
            R.drawable.afiq,
            R.drawable.kaligrafi,
            R.drawable.r,
            R.drawable.q,
            R.drawable.afiq,
            R.drawable.zein,
            R.drawable.zein,
            R.drawable.afiq,
            R.drawable.zein,
            R.drawable.afiq,
            R.drawable.zein,
            R.drawable.afiq,
            R.drawable.zein,
            R.drawable.zein,
            R.drawable.zein,
            R.drawable.zein,
            R.drawable.zein,
            R.drawable.zein,
            R.drawable.afiq,
    };

    private Integer[] suaraAlquran = {
            R.raw.annaba
            ,R.raw.annaziat
            ,R.raw.abasa
            ,R.raw.attakwir
            ,R.raw.alinfithar
            ,R.raw.almutaffifin
            ,R.raw.alnsyiqaq
            ,R.raw.alburuj
            ,R.raw.attariq
            ,R.raw.alalala
            ,R.raw.alghasiyah
            ,R.raw.alfajr
            ,R.raw.albalad
            ,R.raw.assyayams
            ,R.raw.allail
            ,R.raw.adhdhuha
            ,R.raw.alinsyirah
            ,R.raw.attin
            ,R.raw.alalq
            ,R.raw.alqodr
            ,R.raw.albayinnah
            ,R.raw.alzalzalah
            ,R.raw.aladiyat
            ,R.raw.alqoriah
            ,R.raw.attakatsur
            ,R.raw.alashr
            ,R.raw.alhumazah
            ,R.raw.alfil
            ,R.raw.alquraisy
            ,R.raw.almaun
            ,R.raw.alkautsar
            ,R.raw.alkaafirun
            ,R.raw.annasr
            ,R.raw.allahab
            ,R.raw.alikhlas
            ,R.raw.alfalaq
            ,R.raw.annas
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvalquran = (ListView) findViewById(R.id.lvalquran);
        Adapteralquran adapter = new Adapteralquran(this, namasurah, gambar);
        lvalquran.setAdapter(adapter);
        final DetailaLquran deskripsialquran = new DetailaLquran();
        lvalquran.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent mbakIn = new Intent(MainActivity.this, percobaanActivity.class);
                mbakIn.putExtra("namasurah", namasurah[position]);
                mbakIn.putExtra("gambar", gambar2[position]);
                mbakIn.putExtra("suaraAlquran", suaraAlquran[position]);
                mbakIn.putExtra("detailalquran", deskripsialquran.detailalquran[position]);
                startActivity(mbakIn);

            }
        });

    }

}

class DetailaLquran {
    public String[] detailalquran = {
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
                    "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
                    "\n" +
                    "عَمَّ يَتَسَآءَلُوْنَ ۚ ١\n" +
                    "1. Tentang apakah mereka saling bertanya tanya?\n" +
                    "\n" +
                    "عَنِ النَّبَإِ الْعَظِيْمِ ۙ ٢\n" +
                    "2. Tentang berita yang besar, *1\n" +
                    "\n" +
                    "الَّذِيْ هُمْ فِيْهِ مُخْتَلِفُوْنَ ۗ ٣\n" +
                    "3. yang mereka perselisihkan tentang ini.\n" +
                    "\n" +
                    "كَلَّا سَيَعْلَمُوْنَ ۙ ٤\n" +
                    "4. Sekali-kali tidak, kelak mereka akan mengetahui,\n" +
                    "\n" +
                    "ثُمَّ كَلَّا سَيَعْلَمُوْنَ ٥\n" +
                    "5. Kemudian sekali-kali tidak *2*, kelak mereka akan mengetahui.\n" +
                    "\n" +
                    "أَلَمْ نَجْعَلِ الْاَرْضَ مِهٰدًا ۙ ٦\n" +
                    "6. Bukankah Kami telah menjadikan bumi itu sebagai hamparan,\n" +
                    "\n" +
                    "وَّالْجِبَالَ أَوْتَادًاۖ ٧\n" +
                    "7. dan gunung gungung sebagai pasak, \n" +
                    "\n" +
                    "وَّخَلَقْنٰكُمْ أَزْوَاجًاۙ ٨\n" +
                    "8. dan Kami jadikan kamu berpasang-pasangan,\n" +
                    "\n" +
                    "وَّجَعَلْنَا نَوْمَكُمْ سُبَاتًاۙ ٩\n" +
                    "9. dan Kami jadikan tidurmu untuk istirahat,\n" +
                    "\n" +
                    "وَّجَعَلْنَا الَّيْلَ لِبَاسًاۙ ١٠\n" +
                    "10. dan Kami jadikan malam sebagai pakaian, *3\n" +
                    "\n" +
                    "وَّجَعَلْنَا النَّهَارَ مَعَاشًاۚ ١١\n" +
                    "11. dan Kami jadikan siang untuk mencari penghidupan,\n" +
                    "\n" +
                    "وَبَنَيْنَا فَوْقَكُمْ سَبْعًا شِدَادًاۙ ١٢\n" +
                    "12. dan Kami bangun diatas kamu tujuh lapis (langit) yang kokoh,\n" +
                    "\n" +
                    "وَجَعَلْنَا سِرَاجًا وَّهَّاجًاۖ ١٣\n" +
                    "13. dan Kami jadikan pelita yang amat terang (matahari),\n" +
                    "\n" +
                    "وَأَنْزَلْنَا مِنَ الْمُعْصِرٰتِ مَآءً ثَجَّاجًاۙ ١٤\n" +
                    "14. dan Kami turunkan dari awan, air yang banyak tercurah,\n" +
                    "\n" +
                    "لِنُخْرِجَ بِهِ حَبًّا وَّنَبَاتًاۙ ١٥\n" +
                    "15. supaya Kami tumbuhkan dengan air itu biji-bijian dan tumbuh-tumbuhan,\n" +
                    "\n" +
                    "وَجَنّٰتٍ أَلْفَافًا ١٦\n" +
                    "16. dan kebun-kebun yang lebat?\n" +
                    "\n" +
                    "إِنَّ يَوْمَ الْفَصْلِ كَانَ مِيْقَاتًاۙ ١٧\n" +
                    "17. Sesungguhnya hari Keputusan adalah suatu waktu yang ditetapkan,\n" +
                    "\n" +
                    "يَوْمَ يُنْفَخُ فِي الصُّوْرِ فَتَأْتُوْنَ أَفْوَاجًاۙ ١٨\n" +
                    "18. yaitu hari (yang pada waktu itu) ditiup sangkakala, lalu kamu datang berkelompok-kelompok,\n" +
                    "\n" +
                    "وَفُتِحَتِ السَّمَآءُ فَكَانَتْ أَبْوَابًاۙ ١٩\n" +
                    "19. dan dibukalah langit, maka terdapatlah beberapa pintu,\n" +
                    "\n" +
                    "وَسُيِّرَتِ الْجِبَالُ فَكَانَتْ سَرَابًاۗ ٢٠\n" +
                    "20. dan dijalankanlah gunung-gunung, maka menjadi fatamorgana.\n" +
                    "\n" +
                    "إِنَّ جَهَنَّمَ كَانَتْ مِرْصَادًاۙ ٢١\n" +
                    "21. Sesungguhnya Neraka Jahannam itu (padanya) ada tempat pengintai, *4\n" +
                    "\n" +
                    "لِّطّٰغِيْنَ مَاٰبًاۙ ٢٢\n" +
                    "22. lagi menjadi tempat kembali bagi orang-orang yang melampui batas,\n" +
                    "\n" +
                    "لّٰبِثِيْنَ فِيْهَآ اَحْقَابًا ٢٣\n" +
                    "23. mereka tinggal di dalamnya berabad-abad lamanya,\n" +
                    "\n" +
                    "لَا يَذُوْقُوْنَ فِيْهَا بَرْدًا وَّلَا شَرَابًاۙ ٢٤\n" +
                    "24. mereka tidak merasakan kesejukkan di dalamnya dan tidak (pula mendapat) minum,\n" +
                    "\n" +
                    "اِلَّا حَمِيْمًا وَّغَسَّاقًاۙ ٢٥\n" +
                    "25. selain air yang mendidih dan nanah,\n" +
                    "\n" +
                    "جَزَآءً وِّفَاقًاۗ ٢٦\n" +
                    "26. sebagai pembalasan yang setimpal.\n" +
                    "\n" +
                    "اِنَّهُمْ كَانُوْا لَا يَرْجُوْنَ حِسَابًاۙ ٢٧\n" +
                    "27. Sesungguhnya mereka tidak takut kepada hisab,\n" +
                    "\n" +
                    "وَّكَذَّبُوْا بِاٰيٰتِنَا كِذَّابًا ٢٨\n" +
                    "28. dan mereka mendustakan ayat-ayat Kami dengan sesungguh-sungguhnya.\n" +
                    "\n" +
                    "وَكُلَّ شَيْءٍ أَحْصَيْنٰهُ كِتٰبًاۙ ٢٩\n" +
                    "29. Dan segala sesuatu telah Kami catat dalam suatu kitab.*5\n" +
                    "\n" +
                    "فَذُوْقُوْا فَلَنْ نَزِيْدَكُمْ اِلَّا عَذَابًاؑ ٣٠\n" +
                    "30. Karena itu rasakanlah. Dan Kami sekali-kali tidak akan menambah kepadamu selain dari adzab.\n" +
                    "\n" +
                    "اِنَّ لِلْمُتَّقِيْنَ مَفَازًاۙ ٣١\n" +
                    "31. Sesungguhnya orang-orang yang bertakwa mendapat kemenangan,\n" +
                    "\n" +
                    "حَدَآئِقَ وَأَعْنَابًاۙ ٣٢\n" +
                    "32. (yaitu) kebun-kebun dan buah anggur,\n" +
                    "\n" +
                    "وَّكَوَاعِبَ أَتْرَابًاۙ ٣٣\n" +
                    "33. dan gadis-gadis remaja yang sebaya,\n" +
                    "\n" +
                    "وَّكَأْسًا دِهَاقًاۗ ٣٤\n" +
                    "34. dan gelas-gelas yang penuh (berisi minuman).\n" +
                    "\n" +
                    "لَّا يَسْمَعُوْنَ فِيْهَا لَغْوًا وَّلَا كِذَّابًا ٣٥\n" +
                    "35. Di dalamnya mereka tidak mendengar perkataan yang sia-sia dan tidak (pula perkataan) dusta.\n" +
                    "\n" +
                    "جَزَآءً مِّنْ رَّبِّكَ عَطَآءً حِسَابًاۙ ٣٦\n" +
                    "36. Sebagai balasan dari Rabb-mu dan pemberian yang cukup banyak,\n" +
                    "\n" +
                    "رَّبِّ السَّمٰوٰتِ وَالْاَرْضِ وَمَا بَيْنَهُمَا الرَّحْمٰنِ لَا يَمْلِكُوْنَ مِنْهُ خِطَابًاۚ ٣٧\n" +
                    "37. Rabb yang memelihara langit dan bumi dan apa yang ada di antara keduanya, Yang Maha Pemurah. Mereka tidak dapat berbicara dengan-Nya.\n" +
                    "\n" +
                    "يَوْمَ يَقُوْمُ الرُّوْحُ وَالْمَلٰٓئِكَةُ صَفًّاۚ لَّا يَتَكَلَّمُوْنَ إِلَّا مَنْ أَذِنَ لَهُ الرَّحْمٰنُ وَقَالَ صَوَابًا ٣٨\n" +
                    "38. Pada hari ketika ruh *6* dan para Malaikat berdiri bershaff-shaff, mereka tidak berkata-kata, kecuali siapa yang telah diberi izin kepadanya oleh Rabb Yang Maha Pemurah, dan ia mengucapkan kata yang (benar).\n" +
                    "\n" +
                    "ذٰلِكَ الْيَوْمُ الْحَقُّ ۚ فَمَنْ شَآءَ اتَّخَذَ إِلٰى رَبِّهِ مَاٰبًا ٣٩\n" +
                    "39. Itulah hari yang pasti terjadi. Maka barang siapa yang menghendaki, niscaya ia menempuh jalan kembali kepada Rabb-nya.\n" +
                    "\n" +
                    "اِنَّآ اَنْذَرْنٰكُمْ عَذَابًا قَرِيْبًاۙ يَّوْمَ يَنْظُرُ الْمَرْءُ مَا قَدَّمَتْ يَدَاهُ وَيَقُوْلُ الْكٰفِرُ يٰلَيْتَنِيْ كُنْتُ تُرَابًاؑ ٤٠ \n" +
                    "40. Sesungguhnya Kami telah memberi peringatan kepadamu (hai orang kafir) akan siksa yang dekat, pada hari manusia melihat apa yang telah diperbuat oleh kedua tangannya, dan orang kafir berkata: \"Alangkah baiknya sekiranya aku dahulu adalah tanah.\""



            ,"سۡمِ ٱللَّهِ ٱلرَّحۡمَٰنِ ٱلرَّحِيمِ\n" +
            "\n" +
            "Bismillahirrahmaanirrahiim(i)\n" +
            "Dengan menyebut nama Allah Yang Maha Pemurah lagi Maha Penyayang\n" +
            "\n" +
            "وَٱلنَّٰزِعَٰتِ غَرۡقٗا\n" +
            "\n" +
            "Wannaazi'aati gharqaa(n)\n" +
            "1. \"Demi (malaikat-malaikat) yang mencabut (nyawa) dengan keras,\"\n" +
            "\n" +
            "وَٱلنَّٰشِطَٰتِ نَشۡطٗا\n" +
            "\n" +
            "Wannaasyithaati nasythaa(n)\n" +
            "2. \"dan (malaikat-malaikat) yang mencabut (nyawa) dengan lemah-lembut,\"\n" +
            "\n" +
            "وَٱلسَّٰبِحَٰتِ سَبۡحٗا\n" +
            "\n" +
            "Wassaabihaati sabhaa(n)\n" +
            "3. \"dan (malaikat-malaikat) yang turun dari langit dengan cepat,\"\n" +
            "\n" +
            "فَٱلسَّٰبِقَٰتِ سَبۡقٗا\n" +
            "\n" +
            "Fassaabiqaati sabqaa(n)\n" +
            "4. \"dan (malaikat-malaikat) yang mendahului dengan kencang,\"\n" +
            "\n" +
            "فَٱلۡمُدَبِّرَٰتِ أَمۡرٗا\n" +
            "\n" +
            "Falmudabbiraati amraa(n)\n" +
            "5. \"dan (malaikat-malaikat) yang mengatur urusan (dunia) [1550].\"\n" +
            "\n" +
            "يَوۡمَ تَرۡجُفُ ٱلرَّاجِفَةُ\n" +
            "\n" +
            "Yauma tarjufu rraajifah(tu)\n" +
            "6. \"(Sesungguhnya kamu akan dibangkitkan) pada hari ketika tiupan pertama menggoncang alam,\"\n" +
            "\n" +
            "تَتۡبَعُهَا ٱلرَّادِفَةُ\n" +
            "\n" +
            "Tatba'uhaa rraadifah(tu)\n" +
            "7. \"tiupan pertama itu diiringi oleh tiupan kedua.\"\n" +
            "\n" +
            "قُلُوبٌ يَوۡمَئِذٖ وَاجِفَةٌ\n" +
            "\n" +
            "Quluubun yauma-idzin waajifah(tun)\n" +
            "8. \"Hati manusia pada waktu itu sangat takut,\"\n" +
            "\n" +
            "أَبۡصَٰرُهَا خَٰشِعَةٌ\n" +
            "\n" +
            "Abshaaruhaa khaasyi'ah(tun)\n" +
            "9. \"Pandangannya tunduk.\"\n" +
            "\n" +
            "يَقُولُونَ أَءِنَّا لَمَرۡدُودُونَ فِي ٱلۡحَافِرَةِ\n" +
            "\n" +
            "Yaquuluuna a-innaa lamarduuduuna fii lhaafirah(ti)\n" +
            "10. (Orang-orang kafir) berkata: \"Apakah sesungguhnya kami benar-benar dikembalikan kepada kehidupan semula? [1551],\"\n" +
            "\n" +
            "أَءِذَا كُنَّا عِظَٰمٗا نَّخِرَةٗ\n" +
            "\n" +
            "A-idzaa kunnaa 'izhaaman nakhirah(tan)\n" +
            "11. \"Apakah (akan dibangkitkan juga) apabila kami telah menjadi tulang belulang yang hancur lumat?\"\n" +
            "\n" +
            "قَالُواْ تِلۡكَ إِذٗا كَرَّةٌ خَاسِرَةٌ\n" +
            "\n" +
            "Qaaluu tilka idzan karratun khaasirah(tun)\n" +
            "12. Mereka berkata: \"Kalau demikian, itu adalah suatu pengembalian yang merugikan.\"\n" +
            "\n" +
            "فَإِنَّمَا هِيَ زَجۡرَةٌ وَٰحِدَةٌ\n" +
            "\n" +
            "Fa-innamaa hiya zajratun waahidah(tun)\n" +
            "13. \"Sesungguhnya pengembalian itu hanyalah satu kali tiupan saja,\"\n" +
            "\n" +
            "فَإِذَا هُم بِٱلسَّاهِرَةِ\n" +
            "\n" +
            "fa-idzaa hum bissaahirah(ti)\n" +
            "14. \"maka dengan serta merta mereka hidup kembali di permukaan bumi.\"\n" +
            "\n" +
            "هَلۡ أَتَىٰكَ حَدِيثُ مُوسَىٰٓ\n" +
            "\n" +
            "Hal ataaka hadiitsu muusaa\n" +
            "15. \"Sudah sampaikah kepadamu (ya Muhammad) kisah Musa.\"\n" +
            "\n" +
            "إِذۡ نَادَىٰهُ رَبُّهُۥ بِٱلۡوَادِ ٱلۡمُقَدَّسِ طُوًى\n" +
            "\n" +
            "Idz naadaahu rabbuhuu bilwaadi lmuqaddasi thuwaa\n" +
            "16. \"Tatkala Tuhannya memanggilnya di lembah suci ialah Lembah Thuwa;\"\n" +
            "\n" +
            "ٱذۡهَبۡ إِلَىٰ فِرۡعَوۡنَ إِنَّهُۥ طَغَىٰ\n" +
            "\n" +
            "Idzhab ilaa fir'auna innahuu thaghaa\n" +
            "17. \"Pergilah kamu kepada Fir'aun, sesungguhnya dia telah melampaui batas,\"\n" +
            "\n" +
            "فَقُلۡ هَل لَّكَ إِلَىٰٓ أَن تَزَكَّىٰ\n" +
            "\n" +
            "Faqul hal laka ilaa an tazakkaa\n" +
            "18. dan katakanlah (kepada Fir'aun): \"Adakah keinginan bagimu untuk membersihkan diri (dari kesesatan).\"\n" +
            "\n" +
            "وَأَهۡدِيَكَ إِلَىٰ رَبِّكَ فَتَخۡشَىٰ\n" +
            "\n" +
            "Wa ahdiyaka ilaa rabbika fatakhsyaa\n" +
            "19. \"Dan kamu akan kupimpin ke jalan Tuhanmu agar supaya kamu takut kepada-Nya?\"\n" +
            "\n" +
            "فَأَرَىٰهُ ٱلۡأٓيَةَ ٱلۡكُبۡرَىٰ\n" +
            "\n" +
            "Fa-araahul aayatal kubraa\n" +
            "20. \"Lalu Musa memperlihatkan kepadanya mukjizat yang besar.\"\n" +
            "\n" +
            "فَكَذَّبَ وَعَصَىٰ\n" +
            "\n" +
            "Fa kadzdzaba wa'ashaa\n" +
            "21. \"Tetapi Fir´aun mendustakan dan mendurhakai.\"\n" +
            "\n" +
            "ثُمَّ أَدۡبَرَ يَسۡعَىٰ\n" +
            "\n" +
            "Tsumma adbara yas'aa\n" +
            "22. \"Kemudian dia berpaling seraya berusaha menantang (Musa).\"\n" +
            "\n" +
            "فَحَشَرَ فَنَادَىٰ\n" +
            "\n" +
            "Fa hasyara fanaadaa\n" +
            "23. \"Maka dia mengumpulkan (pembesar-pembesarnya) lalu berseru memanggil kaumnya.\"\n" +
            "\n" +
            "فَقَالَ أَنَا۠ رَبُّكُمُ ٱلۡأَعۡلَىٰ\n" +
            "\n" +
            "Fa qaala anaa rabbukumul a'laa\n" +
            "24. (Seraya) berkata:\"Akulah tuhanmu yang paling tinggi.\"\n" +
            "\n" +
            "فَأَخَذَهُ ٱللَّهُ نَكَالَ ٱلۡأٓخِرَةِ وَٱلۡأُولَىٰٓ\n" +
            "\n" +
            "Fa akhadzahullaahu nakaalal aakhirati wal-uulaa\n" +
            "25. \"Maka Allah mengazabnya dengan azab di akhirat dan azab di dunia.\"\n" +
            "\n" +
            "إِنَّ فِي ذَٰلِكَ لَعِبۡرَةٗ لِّمَن يَخۡشَىٰٓ\n" +
            "\n" +
            "Inna fii dzaalika la'ibratan liman yakhsyaa\n" +
            "26. \"Sesungguhnya pada yang demikian itu terdapat pelajaran bagi orang yang takut (kepada Tuhannya).\"\n" +
            "\n" +
            "ءَأَنتُمۡ أَشَدُّ خَلۡقًا أَمِ ٱلسَّمَآءُۚ بَنَىٰهَا\n" +
            "\n" +
            "A-antum asyaddu khalqan ami ssamaau banaahaa\n" +
            "27. \"Apakah kamu lebih sulit penciptaanya ataukah langit? Allah telah membinanya,\"\n" +
            "\n" +
            "رَفَعَ سَمۡكَهَا فَسَوَّىٰهَا\n" +
            "\n" +
            "Rafa'a samkahaa fasawwaahaa\n" +
            "28. \"Dia meninggikan bangunannya lalu menyempurnakannya,\"\n" +
            "\n" +
            "وَأَغۡطَشَ لَيۡلَهَا وَأَخۡرَجَ ضُحَىٰهَا\n" +
            "\n" +
            "Wa-aghthasya laylahaa wa akhraja dhuhaahaa\n" +
            "29. \"dan Dia menjadikan malamnya gelap gulita, dan menjadikan siangnya terang benderang.\"\n" +
            "\n" +
            "وَٱلۡأَرۡضَ بَعۡدَ ذَٰلِكَ دَحَىٰهَآ\n" +
            "\n" +
            "Wal ardha ba'da dzaalika dahaahaa\n" +
            "30. \"Dan bumi sesudah itu dihamparkan-Nya.\"\n" +
            "\n" +
            "أَخۡرَجَ مِنۡهَا مَآءَهَا وَمَرۡعَىٰهَا\n" +
            "\n" +
            "Akhraja minhaa maa-ahaa wamar'aahaa\n" +
            "31. \"Ia memancarkan daripadanya mata airnya, dan (menumbuhkan) tumbuh-tumbuhannya.\"\n" +
            "\n" +
            "وَٱلۡجِبَالَ أَرۡسَىٰهَا\n" +
            "\n" +
            "Wal jibaala arsaahaa\n" +
            "32. \"Dan gunung-gunung dipancangkan-Nya dengan teguh,\"\n" +
            "\n" +
            "مَتَٰعٗا لَّكُمۡ وَ لِأَنۡعَٰمِكُمۡ\n" +
            "\n" +
            "Mataa'an lakum wali-an'aamikum\n" +
            "33. \"(semua itu) untuk kesenanganmu dan untuk binatang-binatang ternakmu.\"\n" +
            "\n" +
            "فَإِذَا جَآءَتِ ٱلطَّآمَّةُ ٱلۡكُبۡرَىٰ\n" +
            "\n" +
            "Fa idzaa jaa-ati ththaammatul kubraa\n" +
            "34. \"Maka apabila malapetaka yang sangat besar (hari kiamat) telah datang.\"\n" +
            "\n" +
            "يَوۡمَ يَتَذَكَّرُ ٱلۡإِنسَٰنُ مَا سَعَىٰ\n" +
            "\n" +
            "Yauma yatadzakkarul insaanu maa sa'aa\n" +
            "35. \"Pada hari (ketika) manusia teringat akan apa yang telah dikerjakannya,\"\n" +
            "\n" +
            "وَبُرِّزَتِ ٱلۡجَحِيمُ لِمَن يَرَىٰ\n" +
            "\n" +
            "Waburrizati ljahiimu liman yaraa\n" +
            "36. \"dan diperlihatkan neraka dengan jelas kepada setiap orang yang melihat.\"\n" +
            "\n" +
            "فَأَمَّا مَن طَغَىٰ\n" +
            "\n" +
            "Fa-ammaa man thaghaa\n" +
            "37. \"Adapun orang yang melampaui batas,\"\n" +
            "\n" +
            "وَءَاثَرَ ٱلۡحَيَوٰةَ ٱلدُّنۡيَا\n" +
            "\n" +
            "Wa-aatsara lhayaata ddunyaa\n" +
            "38. \"dan lebih mengutamakan kehidupan dunia,\"\n" +
            "\n" +
            "فَإِنَّ ٱلۡجَحِيمَ هِيَ ٱلۡمَأۡوَىٰ\n" +
            "\n" +
            "fa-innal jahiima hiyal ma`waa\n" +
            "39. \"maka sesungguhnya nerakalah tempat tinggal(nya).\"\n" +
            "\n" +
            "وَأَمَّا مَنۡ خَافَ مَقَامَ رَبِّهِۦ وَنَهَى ٱلنَّفۡسَ عَنِ ٱلۡهَوَىٰ\n" +
            "\n" +
            "Wa amama man khaafa maqaama rabbihi wanahaa nnafsa 'anil hawaa\n" +
            "40. \"Dan adapun orang-orang yang takut kepada kebesaran Tuhannya dan menahan diri dari keinginan hawa nafsunya,\"\n" +
            "\n" +
            "فَإِنَّ ٱلۡجَنَّةَ هِيَ ٱلۡمَأۡوَىٰ\n" +
            "fa innal jannata hiyal ma`waa\n" +
            "41. \"maka sesungguhnya syurgalah tempat tinggal(nya).\"\n" +
            "\n" +
            "يَسۡ\u200Dَٔلُونَكَ عَنِ ٱلسَّاعَةِ أَيَّانَ مُرۡسَىٰهَا\n" +
            "\n" +
            "Yas-aluunaka 'ani ssaa'ati ayyaana mursaahaa\n" +
            "42. \"(Orang-orang kafir) bertanya kepadamu (Muhammad) tentang hari kebangkitan, kapankah terjadinya? [1552],\"\n" +
            "\n" +
            "فِيمَ أَنتَ مِن ذِكۡرَىٰهَآ\n" +
            "\n" +
            "Fiima anta min dzikraahaa\n" +
            "43. \"Siapakah kamu (maka) dapat menyebutkan (waktunya)?\"\n" +
            "\n" +
            "إِلَىٰ رَبِّكَ مُنتَهَىٰهَآ\n" +
            "\n" +
            "Ilaa rabbika muntahaahaa\n" +
            "44. \"Kepada Tuhanmulah dikembalikan kesudahannya (ketentuan waktunya).\"\n" +
            "\n" +
            "إِنَّمَآ أَنتَ مُنذِرُ مَن يَخۡشَىٰهَا\n" +
            "\n" +
            "Innamaa anta mundziru man yakhsyaahaa\n" +
            "45. \"Kamu hanyalah pemberi peringatan bagi siapa yang takut kepadanya (hari berbangkit)\"\n" +
            "\n" +
            "كَأَنَّهُمۡ يَوۡمَ يَرَوۡنَهَا لَمۡ يَلۡبَثُوٓاْ إِلَّا عَشِيَّةً أَوۡ ضُحَىٰهَا\n" +
            "\n" +
            "Ka-annahum yauma yaraunahaa lam yalbatsuu illaa 'asyiyyatan au dhuhaahaa\n" +
            "46. \"Pada hari mereka melihat hari berbangkit itu, mereka merasa seakan-akan tidak tinggal (di dunia) melainkan (sebentar saja) di waktu sore atau pagi hari [1553].\""
            ,"Sakaran- Bismillah, ketemu lagi dengan kami untuk ngaji online bareng. Sekarang saatnya kita ngaji online bareng dengan Surat 'Abasa. Merupakan Surat Makkiyah karena Surat 'Abasa diturunkan di Mekkah. Surat Abasa ini merupakan surat yang ke 80 dan masuk dalam Juz 30 yang terdiri dari 42 ayat. Abasa berarti bermuka masam, Surat 'Abasa ini berisikan peringatan atau teguran kepada Nabi SAW. Selain itu juga berisi peringatan kepada manusia yang tidak mengetahui hakikat dirinya.\n" +
            "\n" +
            "Dan berikut ini bacaan Surat 'Abasa dengan tulisan Arab yang benar harakatnya (panjang pendeknya) serta terjemahnya.\n" +
            "\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "عَبَسَ وَتَوَلّٰٓى ١\n" +
            "1. Dia (Muhammad) bermuka masam dan berpaling,\n" +
            "\n" +
            "اَنْ جَآءَهُ الْاَعْمٰى ٢\n" +
            "2. karena telah datang seorang yang buta kepadanya. *1\n" +
            "\n" +
            "وَمَا يُدْرِيكَ لَعَلَّهٗ يَزَّكّٰى ٣\n" +
            "3. Tahukah kamu barangkali dia ingin membersihkan dirinya (dari dosa),\n" +
            "\n" +
            "اَوْ يَذَّكَّرُ فَتَنْفَعَهُ الذِّكْرٰى ٤\n" +
            "4. atau dia (ingin) mendapatkan pengajaran, lalu pengajaran itu memberi manfaat kepadanya?\n" +
            "\n" +
            "اَمَّا مَنِ اسْتَغْنٰى ٥\n" +
            "5. Adapun orang yang merasa dirinya cukup, *2\n" +
            "\n" +
            "فَأَنْتَ لَهٗ تَصَدّٰى ٦\n" +
            "6. maka kamu melayaninya.\n" +
            "\n" +
            "وَمَا عَلَيْكَ اَلَّا يَزَّكّٰى ٧\n" +
            "7. Padahal tidak ada (celaan) atasmu kalau dia tidak membersihkan diri (beriman).\n" +
            "\n" +
            "وَاَمَّا مَنْ جَآءَكَ يَسْعٰى ٨\n" +
            "8. Dan adapun orang yang datang kepadamu dengan bersegera (untuk mendapatkan pengajaran),\n" +
            "\n" +
            "وَهُوَ يَخْشٰى ٩\n" +
            "9. sedang ia takut kepada (Allah),\n" +
            "\n" +
            "فَاَنْتَ عَنْهُ تَلَهّٰى ١٠\n" +
            "10. maka kamu mengabaikannya.\n" +
            "\n" +
            "كَلَّآ اِنَّهَا تَذْكِرَةٌ ١١\n" +
            "11. Sekali-kali jangan (demikian)! Sesungguhnya ajaran-ajaran Allah itu adalah suatu peringatan,\n" +
            "\n" +
            "فَمَنْ شَآءَ ذَكَرَهٗ  ١٢\n" +
            "12. maka barang siapa yang menghendaki, tentulah ia memperhatikannya,\n" +
            "\n" +
            "فِيْ صُحُفٍ مُّكَرَّمَةٍ ١٣\n" +
            "13. di dalam kitab-kitab yang dimuliakan, *3\n" +
            "\n" +
            "\n" +
            "مَرْفُوْعَةٍ مُّطَهَّرَةٍ ١٤\n" +
            "14. yang ditinggikan lagi disucikan,\n" +
            "\n" +
            "بِاَيْدِيْ سَفَرَةٍ ١٥\n" +
            "15. di tangan para penulis (Malaikat),\n" +
            "\n" +
            "كِرَامٍ بَرَرَةٍ ١٦\n" +
            "16. yang mulia lagi berbakti.\n" +
            "\n" +
            "قُتِلَ الْاِنْسَانُ مَآ اَكْفَرَهٗ ١٧\n" +
            "17. Binasalah manusia, amatlah sangat kekafirannya?\n" +
            "\n" +
            "مِنْ اَيِّ شَيْءٍ خَلَقَهٗ ١٨\n" +
            "18. Dari apakah Allah menciptakannya?\n" +
            "\n" +
            "مِنْ نُّطْفَةٍ ۗ خَلَقَهٗ فَقَدَّرَهٗ ١٩\n" +
            "19. Dari setetes mani, Allah menciptakannya lalu menentukannya. *4\n" +
            "\n" +
            "ثُمَّ السَّبِيْلَ يَسَّرَهٗ ٢٠\n" +
            "20. Kemudian Dia memudahkan jalannya. *5\n" +
            "\n" +
            "ثُمَّ أَمَاتَهٗ فَأَقْبَرَهٗ ٢١\n" +
            "21. Kemudian Dia mematikannya dan memasukkannya ke dalam kubur,\n" +
            "\n" +
            "ثُمَّ إِذَا شَآءَ أَنْشَرَهٗ ٢٢\n" +
            "22. kemudian bila Dia menghendaki, Dia membangkitkannya kembali.\n" +
            "\n" +
            "كَلَّا لَمَّا يَقْضِ مَآ اَمَرَهٗ ٢٣\n" +
            "23. Sekali-kali jangan, manusia itu belum melaksanakan apa yang diperintahkan Allah kepadanya,\n" +
            "\n" +
            "فَلْيَنْظُرِ الْاِنْسَانُ إِلٰى طَعَامِهٖ ٢٤\n" +
            "24. maka hendaklah manusia itu memperhatikan makanannya.\n" +
            "\n" +
            "اَنَّا صَبَبْنَا الْمَآءَ صَبًّاۙ ٢٥\n" +
            "25. Sesungguhnya Kami benar-benar mencurahkan air (dari langit),\n" +
            "\n" +
            "ثُمَّ شَقَقْنَا الْاَرْضَ شَقًّاۙ ٢٦  \n" +
            "26. kemudian Kami belah bumi dengan sebaik-baiknya,\n" +
            "\n" +
            "\n" +
            "فَأَنْبَتْنَا فِيْهَا حَبًّاۙ ٢٧\n" +
            "27. lalu Kami tumbuhkan biji-bijian di bumi itu,\n" +
            "\n" +
            "وَّعِنَبًا وَّقَضْبًاۙ ٢٨\n" +
            "28. anggur dan sayur-sayuran,\n" +
            "\n" +
            "وَّزَيْتُوْنًا وَّنَخْلًاۙ ٢٩\n" +
            "29. zaitun dan pohon kurma,\n" +
            "\n" +
            "وَحَدَآئِقَ غُلْبًاۙ ٣٠\n" +
            "30. kebun-kebun (yang) lebat,\n" +
            "\n" +
            "وَفَاكِهَةً وَّاَبًّاۙ ٣١\n" +
            "31. dan buah-buahan serta rumput-rumputan,\n" +
            "\n" +
            "مَّتَاعًا لَّكُمْ وَلْاَنْعَامِكُمْ ۗ ٣٢\n" +
            "32. untuk kesenanganmu dan untuk binatang-binatang ternakmu.\n" +
            "\n" +
            "فَاِذَا جَآءَتِ الصَّآخَّةُ ۖ ٣٣\n" +
            "33. Dan apabila datang suara yang memekikkan telinga (suara sangkakala yang kedua),\n" +
            "\n" +
            "يَوْمَ يَفِرُّ الْمَرْءُ مِنْ أَخِيْهِ ۙ ٣٤\n" +
            "34. pada hari ketika manusia lari dari saudaranya,\n" +
            "\n" +
            "وَاُمِّهٖ وَأَبِيْهِ ۙ ٣٥\n" +
            "35. dari ibu dan bapaknya,\n" +
            "\n" +
            "وَصَاحِبَتِهٖ وَبَنِيْهِ ٣٦\n" +
            "36. dari istri dan anak-anaknya.\n" +
            "\n" +
            "لِكُلِّ امْرِئٍ مِّنْهُمْ يَوْمَئِذٍ شَأْنٌ يُغْنِيْهِ ٣٧\n" +
            "37. Setiap orang dari mereka pada hari itu mempunyai urusan yang cukup menyibukkannya.\n" +
            "\n" +
            "وُجُوهٌ يَّوْمَئِذٍ مُّسْفِرَةٌ ٣٨\n" +
            "38. Banyak muka pada hari itu berseri-seri,\n" +
            "\n" +
            "ضَاحِكَةٌ مُّسْتَبْشِرَةٌ ۚ ٣٩\n" +
            "39. tertawa dan bergembira ria,\n" +
            "\n" +
            "وَوُجُوهٌ يَّوْمَئِذٍ عَلَيْهَا غَبَرَةٌ ۙ ٤٠\n" +
            "40. dan banyak (pula) muka pada hari itu tertutup debu,\n" +
            "\n" +
            "تَرْهَقُهَا قَتَرَةٌ ۗ ٤١\n" +
            "41. dan ditutup lagi oleh kegelapan. *6\n" +
            "\n" +
            "اُولٰٓئِكَ هُمُ الْكَفَرَةُ الْفَجَرَةُ ٤٢\n" +
            "42. Mereka itulah orang-orang kafir lagi durhaka."
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "إِذَا الشَّمْسُ كُوِّرَتْ ١\n" +
            "1. Apabila matahari digulung,\n" +
            "\n" +
            "وَإِذَا النُّجُوْمُ انْكَدَرَتْ ٢\n" +
            "2. dan apabila bintang-bintang berjatuhan,\n" +
            "\n" +
            "وَإِذَا الْجِبَالُ سُيِّرَتْ ٣\n" +
            "3. dan apabila gunung-gunung dihancurkan,\n" +
            "\n" +
            "وَإِذَا الْعِشَارُ عُطِّلَتْ ٤\n" +
            "4. dan apabila unta-unta yang bunting ditinggalkan (tidak dipedulikan),\n" +
            "\n" +
            "وَإِذَا الْوُحُوْشُ حُشِرَتْ ٥\n" +
            "5. dan apabila binatang-binatang liar dikumpulkan,\n" +
            "\n" +
            "وَإِذَا الْبِحَارُ سُجِّرَتْ ٦\n" +
            "6. dan apabila lautan dijadikan meluap,\n" +
            "\n" +
            "وَإِذَا النُّفُوْسُ زُوِّجَتْ ٧7\n" +
            "dan apabila ruh-ruh dipertemukan (dengan tubuh),\n" +
            "\n" +
            "وَإِذَا الْمَوْءٗدَةُ سُئِلَتْ ٨\n" +
            "8. dan apabila bayi-bayi perempuan yang dikubur hidup-hidup ditanya,\n" +
            "\n" +
            "بِأَيِّ ذَنْبٍ قُتِلَتْ ٩\n" +
            "9. karena dosa apakah dia dibunuh,\n" +
            "\n" +
            "وَإِذَا الصُّحُفُ نُشِرَتْ ١٠\n" +
            "10. dan apabila catatan-catatan (amal perbuatan manusia) dibuka,\n" +
            "\n" +
            "وَإِذَا السَّمَآءُ كُشِطَتْ ١١\n" +
            "11. dan apabila langit dilenyapkan,\n" +
            "\n" +
            "وَإِذَا الْجَحِيْمُ سُعِّرَتْ ١٢\n" +
            "12. dan apabila Neraka Jahim dinyalakan,\n" +
            "\n" +
            "وَإِذَا الْجَنَّةُ أُزْلِفَتْ ١٣\n" +
            "13. dan apabila Surga didekatkan,\n" +
            "\n" +
            "عَلِمَتْ نَفْسٌ مَّآ أَحْضَرَتْ ١٤\n" +
            "14. maka tiap-tiap jiwa akan mengetahui apa yang telah dikerjakannya.\n" +
            "\n" +
            "فَلَآ أُقْسِمُ بِالْخُنَّسِ ١٥\n" +
            "15. Sungguh, Aku bersumpah dengan bintang-bintang,\n" +
            "\n" +
            "الْجَوَارِ الْكُنَّسِ ١٦\n" +
            "16. yang beredar dan terbenam,\n" +
            "\n" +
            "وَالَّيْلِ إِذَا عَسْعَسَ ١٧\n" +
            "17. demi malam apabila telah hampir meninggalkan gelapnya,\n" +
            "\n" +
            "وَالصُّبْحِ إِذَا تَنَفَّسَ ١٨\n" +
            "18. dan demi subuh apabila fajarnya mulai menyingsing,\n" +
            "\n" +
            "إِنَّهٗ لَقَوْلُ رَسُولٍ كَرِيْمٍ ١٩\n" +
            "19. sesungguhnya Al-Quran itu benar-benar firman (Allah yang dibawa) utusan yang mulia (Jibril),\n" +
            "\n" +
            "ذِيْ قُوَّةٍ عِنْدَ ذِي الْعَرْشِ مَكِيْنٍ ٢٠\n" +
            "20. yang mempunyai kekuatan, dan mempunyai kedudukan disisi Allah yang mempunyai 'Arsy,\n" +
            "\n" +
            "مُّطَاعٍ ثَمَّ أَمِيْنٍ ٢١\n" +
            "21. yang ditaati disana (di Alam Malaikat) lagi dipercaya.\n" +
            "\n" +
            "وَمَا صَاحِبُكُمْ بِمَجْنُوْنٍ ٢٢\n" +
            "22. Dan temanmu (Muhammad) bukanlah seorang yang bakhil untuk menerangkan yang ghaib.\n" +
            "\n" +
            "وَلَقَدْ رَاٰهُ بِالأفُقِ الْمُبِيْنِ ٢٣\n" +
            "23. Dan sesungguhnya Muhammad itu melihat Jibril di ufuk yang terang.\n" +
            "\n" +
            "وَمَا هُوَ عَلَى الْغَيْبِ بِضَنِيْنٍ ٢٤\n" +
            "24. Dan dia (Muhammad) bukanlah seorang yang bakhil untuk menerangkan yang ghaib.\n" +
            "\n" +
            "وَمَا هُوَ بِقَوْلِ شَيْطَانٍ رَّجِيْمٍ ٢٥\n" +
            "25. Dan Al-Quran itu bukanlah perkataan syetan yang terkutuk,\n" +
            "\n" +
            "فَأَيْنَ تَذْهَبُوْنَ ٢٦\n" +
            "26. kemanakah kamu akan pergi? *1\n" +
            "\n" +
            "إِنْ هُوَ إِلَّا ذِكْرٌ لِّلْعٰلَمِيْنَ ٢٧\n" +
            "27. Al-Quran itu tiada lain hanyalah peringatan bagi semesata alam,\n" +
            "\n" +
            "لِمَنْ شَآءَ مِنْكُمْ أَنْ يَّسْتَقِيْمَ ٢٨\n" +
            "28. (yaitu) bagi siapa di antara kamu yang mau menempuh jalan yang lurus.\n" +
            "\n" +
            "وَمَا تَشَآءُوْنَ إِلَّآ أَنْ يَّشَآءَ اللّٰهُ رَبُّ الْعٰلَمِيْنَ ٢٩  \n" +
            "29. Dan kamu tidak dapat menghendaki (menempuh jalan itu) kecuali apabila dikehendaki Allah, Rabb semesta alam."
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "إِذَا السَّمَآءُ انْفَطَرَتْ ١\n" +
            "1. Apabila langit terbelah,\n" +
            "\n" +
            "وَإِذَا الْكَوَاكِبُ انْتَثَرَتْ ٢\n" +
            "2. dan apabila bintang-bintang jatuh berserakan,\n" +
            "\n" +
            "وَإِذَا الْبِحَارُ فُجِّرَتْ ٣\n" +
            "3. dan apabila lautan dijadikan meluap,\n" +
            "\n" +
            "وَإِذَا الْقُبُوْرُ بُعْثِرَتْ ٤\n" +
            "4. dan apabila kuburan-kuburan dibongkar,\n" +
            "\n" +
            "عَلِمَتْ نَفْسٌ مَّا قَدَّمَتْ وَأَخَّرَتْ ٥\n" +
            "5. maka tiap-tiap jiwa akan mengetahui apa yang telah dikerjakan dan yang dilalaikannya.\n" +
            "\n" +
            "يٰآ أَيُّهَا الْاِنْسَانُ مَا غَرَّكَ بِرَبِّكَ الْكَرِيْمِ ٦\n" +
            "6. Hai manusia, apakah yang telah memperdayakan kamu (berbuat durhaka) terhadap Rabb-mu yang Maha Pemurah.\n" +
            "\n" +
            "الَّذِي خَلَقَكَ فَسَوّٰكَ فَعَدَلَكَ ٧\n" +
            "7. Yang telah menciptakanmu, lalu menyempurnakan kejadianmu dan menjadikan (susunan tubuh)mu seimbang,\n" +
            "\n" +
            "فِيْ أَيِّ صُوْرَةٍ مَّا شَاءَ رَكَّبَكَ ٨\n" +
            "8. dalam bentuk apa saja yang Dia kehendaki, Dia menyusun tubuhmu.\n" +
            "\n" +
            "كَلّا بَلْ تُكَذِّبُوْنَ بِالدِّيْنِ ٩\n" +
            "9. Bukan hanya durhaka saja, bahkan kamu mendustakan Hari Pembalasan.\n" +
            "\n" +
            "وَإِنَّ عَلَيْكُمْ لَحٰفِظِيْنَ ١٠\n" +
            "10. Padahal sesungguhnya bagimu ada (Malaikat-malaikat) yang mengawasi (amalmu).\n" +
            "\n" +
            "كِرَامًا كَاتِبِيْنَ ١١\n" +
            "11. Yang mulia (di sisi Allah) dan yang mencatat (amal-amalmu itu),\n" +
            "\n" +
            "يَعْلَمُوْنَ مَا تَفْعَلُوْنَ ١٢\n" +
            "12. mereka mengetahui apa yang kamu kerjakan.\n" +
            "\n" +
            "إِنَّ الْاَبْرَارَ لَفِيْ نَعِيْمٍ ١٣\n" +
            "13. Sesungguhnya orang-orang yang banyak berbakti benar-benar berada dalam Surga yang penuh dengan kenikmatan,\n" +
            "\n" +
            "وَإِنَّ الْفُجَّارَ لَفِيْ جَحِيْمٍ ١٤\n" +
            "14. dan sesungguhnya orang-orang yang durhaka benar-benar berada dalam Neraka.\n" +
            "\n" +
            "يَصْلَوْنَهَا يَوْمَ الدِّيْنِ ١٥\n" +
            "15. Mereka masuk ke dalamanya pada Hari Pembalasan.\n" +
            "\n" +
            "وَمَا هُمْ عَنْهَا بِغَآئِبِيْنَ ١٦\n" +
            "16. Dan mereka sekali-kali tidak dapat keluar dari Neraka itu.\n" +
            "\n" +
            "وَمَا أَدْرٰكَ مَا يَوْمُ الدِّيْنِ ١٧\n" +
            "17. Tahukah kamu apa Hari Pembalasan itu?\n" +
            "\n" +
            "ثُمَّ مَآ أَدْرٰكَ مَا يَوْمُ الدِّيْنِ ١٨\n" +
            "18. Sekali lagi, tahukah kamu apa Hari Pembalasan itu?\n" +
            "\n" +
            "يَوْمَ لَا تَمْلِكُ نَفْسٌ لِّنَفْسٍ شَيْئًا وَالْاَمْرُ يَوْمَئِذٍ لِّلّٰهِ ١٩ \n" +
            "19. (Yaitu) hari (ketika) seseorang tidak berdaya sedikutpun untuk menolong orang lain. Dan segala urusan pada hari itu berada dalam kekuasaan Allah."
            ,"Bismillahirrahmaanirrahiim(i)\n" +
            "\"Dengan menyebut nama Allah Yang Maha Pemurah lagi Maha Penyayang\"\n" +
            "\n" +
            "وَيۡلٌ لِّلۡمُطَفِّفِينَ\n" +
            "\n" +
            "Wailul(n) lilmuthaffifiin(a)\n" +
            "1. \"Kecelakaan besarlah bagi orang-orang yang curang[1561],\"\n" +
            "\n" +
            "ٱلَّذِينَ إِذَا ٱكۡتَالُواْ عَلَى ٱلنَّاسِ يَسۡتَوۡفُونَ\n" +
            "\n" +
            "Al-ladziina idzaaaktaaluuu 'alannaasi yastaufuun(a)\n" +
            "2. \"(yaitu) orang-orang yang apabila menerima takaran dari orang lain mereka minta dipenuhi,\"\n" +
            "\n" +
            "وَإِذَا كَالُوهُمۡ أَو وَّزَنُوهُمۡ يُخۡسِرُونَ\n" +
            "\n" +
            "Wa idzaa kaaluuhum au wazanuuhum yukhsiruun(a)\n" +
            "3. \"dan apabila mereka menakar atau menimbang untuk orang lain, mereka mengurangi.\"\n" +
            "\n" +
            "أَلَا يَظُنُّ أُوْلَٰٓئِكَ أَنَّهُم مَّبۡعُوثُونَ\n" +
            "\n" +
            "Alaa yazhunnu uulaa-ika annahum mab'uutsuun(a)\n" +
            "4. \"Tidaklah orang-orang itu menyangka, bahwa sesungguhnya mereka akan dibangkitkan,\"\n" +
            "\n" +
            "لِيَوۡمٍ عَظِيمٍ\n" +
            "\n" +
            "Liyaumin 'azhiim(in)\n" +
            "5. \"pada suatu hari yang besar,\"\n" +
            "\n" +
            "يَوۡمَ يَقُومُ ٱلنَّاسُ لِرَبِّ ٱلۡعَٰلَمِينَ\n" +
            "\n" +
            "Yauma yaquumunnaasu lirabbil 'aalamiin(a)\n" +
            "6. \"(yaitu) hari (ketika) manusia berdiri menghadap Tuhan semesta alam?\"\n" +
            "\n" +
            "كَلَّآ إِنَّ كِتَٰبَ ٱلۡفُجَّارِ لَفِي سِجِّينٍ\n" +
            "\n" +
            "Kallaa inna kitaabal fujjaari lafii sijjiin(in)\n" +
            "7. \"Sekali-kali jangan curang, karena sesungguhnya kitab orang yang durhaka tersimpan dalam sijjin [1562].\"\n" +
            "\n" +
            "وَمَآ أَدۡرَىٰكَ مَا سِجِّينٌ\n" +
            "\n" +
            "Wa maa adraaka maa sijjiin(un)\n" +
            "8. \"Tahukah kamu apakah sijjin itu?\"\n" +
            "\n" +
            "كِتَٰبٌ مَّرۡقُومٌ\n" +
            "\n" +
            "Kitaabun marquum(un)\n" +
            "9. \"(Ialah) kitab yang bertulis.\"\n" +
            "\n" +
            "وَيۡلٌ يَوۡمَئِذٖ لِّلۡمُكَذِّبِينَ\n" +
            "\n" +
            "Wailun yauma-idzil(n)-lilmukadz-dzibiin(a)\n" +
            "10. \"Kecelakaan yang besarlah pada hari itu bagi orang-orang yang mendustakan,\"\n" +
            "\n" +
            "ٱلَّذِينَ يُكَذِّبُونَ بِيَوۡمِ ٱلدِّينِ\n" +
            "Al-ladziina yukadz-dzibuuna biyaumiddiin(i)\n" +
            "11. \"(yaitu) orang-orang yang mendustakan hari pembalasan.\"\n" +
            "\n" +
            "وَمَا يُكَذِّبُ بِهِۦٓ إِلَّا كُلُّ مُعۡتَدٍ أَثِيمٍ\n" +
            "\n" +
            "Wa maa yukadz-dzibu bihii illaa kullu mu'tadin atsiim(in)\n" +
            "12. \"Dan tidak ada yang mendustakan hari pembalasan itu melainkan setiap orang yang melampaui batas lagi berdosa,\"\n" +
            "\n" +
            "إِذَا تُتۡلَىٰ عَلَيۡهِ ءَايَٰتُنَا قَالَ أَسَٰطِيرُ ٱلۡأَوَّلِينَ\n" +
            "\n" +
            "Idzaa tutlaa 'alaihi aayaatunaa qaala asaathiirul awwaliin(a)\n" +
            "13. yang apabila dibacakan kepadanya ayat-ayat Kami, ia berkata: \"Itu adalah dongengan orang-orang yang dahulu\"\n" +
            "\n" +
            "كَلَّاۖ بَلۡۜ رَانَ عَلَىٰ قُلُوبِهِم مَّا كَانُواْ يَكۡسِبُونَ\n" +
            "\n" +
            "Kallaa bal raana 'alaa quluubihim maa kaanuu yaksibuun(a)\n" +
            "14. \"Sekali-kali tidak (demikian), sebenarnya apa yang selalu mereka usahakan itu menutupi hati mereka.\"\n" +
            "\n" +
            "كَلَّآ إِنَّهُمۡ عَن رَّبِّهِمۡ يَوۡمَئِذٖ لَّمَحۡجُوبُونَ\n" +
            "\n" +
            "Kallaa innahum 'an rabbihim yauma-idzin lamahjuubuun(a)\n" +
            "15. \"Sekali-kali tidak [1563], sesungguhnya mereka pada hari itu benar-benar tertutup dari (rahmat) Tuhan mereka.\"\n" +
            "\n" +
            "ثُمَّ إِنَّهُمۡ لَصَالُواْ ٱلۡجَحِيمِ\n" +
            "\n" +
            "Tsumma innahum lashaaluul jahiim(i)\n" +
            "16. \"Kemudian, sesungguhnya mereka benar-benar masuk neraka.\"\n" +
            "\n" +
            "ثُمَّ يُقَالُ هَٰذَا ٱلَّذِي كُنتُم بِهِۦ تُكَذِّبُونَ\n" +
            "\n" +
            "Tsumma yuqaalu haadzaal-ladzii kuntum bihii tukadz-dzibuun(a)\n" +
            "17. \"Kemudian, dikatakan (kepada mereka): \"Inilah azab yang dahulu selalu kamu dustakan.\"\n" +
            "\n" +
            "كَلَّآ إِنَّ كِتَٰبَ ٱلۡأَبۡرَارِ لَفِي عِلِّيِّينَ\n" +
            "\n" +
            "Kallaa inna kitaabal abraari lafii 'illii-yiin(a)\n" +
            "18. \"Sekali-kali tidak, sesungguhnya kitab orang-orang yang berbakti itu (tersimpan) dalam 'Illiyyin. [1564],\"\n" +
            "\n" +
            "وَمَآ أَدۡرَىٰكَ مَا عِلِّيُّونَ\n" +
            "Wa maa adraaka maa 'illii-yuun(a)\n" +
            "19. \"Tahukah kamu apakah 'Illiyyin itu?\"\n" +
            "\n" +
            "ٌكِتَٰبٌ مَّرۡقُومٞ\n" +
            "\n" +
            "Kitaabun marquum(un)\n" +
            "20. \"(Yaitu) kitab yang bertulis,\"\n" +
            "\n" +
            "يَشۡهَدُهُ ٱلۡمُقَرَّبُونَ\n" +
            "\n" +
            "Yasyhaduhul muqarrabuun(a)\n" +
            "21. \"yang disaksikan oleh malaikat-malaikat yang didekatkan (kepada Allah).\"\n" +
            "\n" +
            "إِنَّ ٱلۡأَبۡرَارَ لَفِي نَعِيمٍ\n" +
            "\n" +
            "Innal abraara lafii na'iim(in)\n" +
            "22. \"Sesungguhnya orang yang berbakti itu benar-benar berada dalam kenikmatan yang besar (syurga),\"\n" +
            "\n" +
            "عَلَى ٱلۡأَرَآئِكِ يَنظُرُونَ\n" +
            "\n" +
            "'Alal araa-iki yanzhuruun(a)\n" +
            "23. \"mereka (duduk) di atas dipan-dipan sambil memandang.\"\n" +
            "\n" +
            "تَعۡرِفُ فِي وُجُوهِهِمۡ نَضۡرَةَ ٱلنَّعِيمِ\n" +
            "\n" +
            "Ta'rifu fii wujuuhihim nadhratanna'iim(i)\n" +
            "24. \"Kamu dapat mengetahui dari wajah mereka kesenangan mereka yang penuh kenikmatan.\"\n" +
            "\n" +
            "يُسۡقَوۡنَ مِن رَّحِيقٍ مَّخۡتُومٍ\n" +
            "\n" +
            "Yusqauna min rahiiqin makhtuum(in)\n" +
            "25. \"Mereka diberi minum dari khamar murni yang dilak (tempatnya),\"\n" +
            "\n" +
            "خِتَٰمُهُۥ مِسۡكٞۚ وَفِي ذَٰلِكَ فَلۡيَتَنَافَسِ ٱلۡمُتَنَٰفِسُونَ\n" +
            "\n" +
            "Khitaamuhu misk(un), wafii dzaalika falyatanaafasil mutanaafisuun(a)\n" +
            "26. \"laknya adalah kesturi; dan untuk yang demikian itu hendaknya orang berlomba-lomba.\"\n" +
            "\n" +
            "وَمِزَاجُهُۥ مِن تَسۡنِيمٍ\n" +
            "\n" +
            "Wa mizaajuhu min tasniim(in)\n" +
            "27. \"Dan campuran khamar murni itu adalah dari tasnim,\"\n" +
            "\n" +
            "عَيۡنٗا يَشۡرَبُ بِهَا ٱلۡمُقَرَّبُونَ\n" +
            "\n" +
            "'Ainan yasyrabu bihaal muqarrabuun(a)\n" +
            "28. \"(yaitu) mata air yang minum daripadanya orang-orang yang didekatkan kepada Allah.\"\n" +
            "\n" +
            "إِنَّ ٱلَّذِينَ أَجۡرَمُواْ كَانُواْ مِنَ ٱلَّذِينَ ءَامَنُواْ يَضۡحَكُونَ\n" +
            "\n" +
            "Innal-ladziina ajramuu kaanuu minal-ladziina aamanuu yadhhakuun(a)\n" +
            "29. \"Sesungguhnya orang-orang yang berdosa, adalah mereka yang menertawakan orang-orang yang beriman.\"\n" +
            "\n" +
            "وَإِذَا مَرُّواْ بِهِمۡ يَتَغَامَزُونَ\n" +
            "\n" +
            "Wa idzaa marruu bihim yataghaamazuun(a)\n" +
            "30. \"Dan apabila orang-orang yang beriman lalu di hadapan mereka, mereka saling mengedip-ngedipkan matanya.\"\n" +
            "\n" +
            "وَإِذَا ٱنقَلَبُوٓاْ إِلَىٰٓ أَهۡلِهِمُ ٱنقَلَبُواْ فَكِهِينَ\n" +
            "\n" +
            "Wa idzaaanqalabuu ilaa ahlihimuunqalabuu fakihiin(a)\n" +
            "31. \"Dan apabila orang-orang yang berdosa itu kembali kepada kaumnya, mereka kembali dengan gembira.\"\n" +
            "\n" +
            "وَإِذَا رَأَوۡهُمۡ قَالُوٓاْ إِنَّ هَٰٓؤُلَآءِ لَضَآلُّونَ\n" +
            "\n" +
            "Wa idzaa ra-auhum qaaluuu inna haa-ulaa-i ladhaalluun(a)\n" +
            "32. \"Dan apabila mereka melihat orang-orang mukmin, mereka mengatakan: \"Sesungguhnya mereka itu benar-benar orang-orang yang sesat\",\"\n" +
            "\n" +
            "وَمَآ أُرۡسِلُواْ عَلَيۡهِمۡ حَٰفِظِينَ\n" +
            "\n" +
            "Wa maa ursiluu 'alaihim haafizhiin(a)\n" +
            "33. \"padahal orang-orang yang berdosa itu tidak dikirim untuk penjaga bagi orang-orang mukmin.\"\n" +
            "\n" +
            "فَٱلۡيَوۡمَ ٱلَّذِينَ ءَامَنُواْ مِنَ ٱلۡكُفَّارِ يَضۡحَكُونَ\n" +
            "\n" +
            "Fal yaumal-ladziina aamanuu minal kuffaari yadhhakuun(a)\n" +
            "34. \"Maka pada hari ini, orang-orang yang beriman menertawakan orang-orang kafir,\"\n" +
            "\n" +
            "عَلَى ٱلۡأَرَآئِكِ يَنظُرُونَ\n" +
            "\n" +
            "'Alal araa-iki yanzhuruun(a)\n" +
            "35. \"mereka (duduk) di atas dipan-dipan sambil memandang.\"\n" +
            "\n" +
            "هَلۡ ثُوِّبَ ٱلۡكُفَّارُ مَا كَانُواْ يَفۡعَلُونَ\n" +
            "\n" +
            "Hal tsuu-wibal kuffaaru maa kaanuu yaf'aluun(a)\n" +
            "36. 'Sesungguhnya orang-orang kafir telah diberi ganjaran terhadap apa yang dahulu mereka kerjakan.\""
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "إِذَا السَّمَآءُ انْشَقَّتْ ١\n" +
            "1. Apabila langit terbelah,\n" +
            "\n" +
            "وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ ٢\n" +
            "2. dan patuh kepada Rabb-nya dan sudah semestinya langit itu patuh,\n" +
            "\n" +
            "وَإِذَا الْاَرْضُ مُدَّتْ ٣\n" +
            "3. dan apabila bumi diratakan,\n" +
            "\n" +
            "وَأَلْقَتْ مَا فِيْهَا وَتَخَلَّتْ ٤\n" +
            "4. dan memuntahkan apa yang ada di dalamnya dan menjadi kosong,\n" +
            "\n" +
            "وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ ٥\n" +
            "5. dan patuh kepada Rabb-nya, dan sudah semestinya bumi itu patuh, (pada waktu itu, manusia akan mengetahui akibat dari perbuatannya).\n" +
            "\n" +
            "يٰاَ أَيُّهَا الْاِنْسَانُ إِنَّكَ كَادِحٌ إِلٰى رَبِّكَ كَدْحًا فَمُلٰقِيْهِ ٦\n" +
            "6. Hai manusia, sesungguhnya kamu telah bekerja dengan sungguh-sungguh menuju Rabb-mu, maka kamu pasti akan menemuinya. *1\n" +
            "\n" +
            "فَأَمَّا مَنْ أُوتِيَ كِتٰبَهُ بِيَمِيْنِهِ ٧\n" +
            "7. Adapun orang-orang yang diberikan kitabnya dari sebelah kanannya,\n" +
            "\n" +
            "فَسَوْفَ يُحَاسَبُ حِسَابًا يَسِيْرًا ٨\n" +
            "8. maka dia akan diperiksa dengan pemeriksaan yang mudah,\n" +
            "\n" +
            "وَّيَنْقَلِبُ إِلٰى أَهْلِهِ مَسْرُورًا ٩\n" +
            "9. dan dia kembali kepada kaumnya (yang sama-sama beriman) dengan gembira.\n" +
            "\n" +
            "وَأَمَّا مَنْ أُوتِيَ كِتٰبَهُ وَرَاءَ ظَهْرِهِ ١٠\n" +
            "10. Adapun orang-orang yang diberikan kitabnya dari belakang,\n" +
            "\n" +
            "فَسَوْفَ يَدْعُوْ ثُبُوْرًا ١١\n" +
            "11. maka dia akan berteriak:\"Celakalah aku.\"\n" +
            "\n" +
            "وَّيَصْلٰى سَعِيْرًا ١٢\n" +
            "12. Dan dia akan dimasukkan ke dalam api yang menyala-nyala (Neraka).\n" +
            "\n" +
            "إِنَّهُ كَانَ فِيْ أَهْلِهِ مَسْرُوْرًا ١٣\n" +
            "13. Sesungguhnya dia dahulu (di dunia) bergembira di kalangan kaumnya (yang sama-sama kafir).\n" +
            "\n" +
            "اِنَّهُ ظَنَّ أَنْ لَّنْ يَّحُوْرَ ١٤\n" +
            "14. Sesungguhnya dia yakin bahwa dia sekali-kali tidak akan kembali (kepada Rabb-nya).\n" +
            "\n" +
            "بَلٰى إِنَّ رَبَّهُ كَانَ بِهِ بَصِيْرًا ١٥\n" +
            "15. (Bukan demikian) yang benar, sesungguhnya Rabb-nya selalu melihatnya.\n" +
            "\n" +
            "فَلَآ أُقْسِمُ بِالشَّفَقِ ١٦\n" +
            "16. Maka sesungguhnya Aku bersumpah dengan cahaya merah di waktu senja,\n" +
            "\n" +
            "وَالَّيْلِ وَمَا وَسَقَ ١٧\n" +
            "17. dan dengan malam dan apa yang diselubunginya,\n" +
            "\n" +
            "وَالْقَمَرِ إِذَا اتَّسَقَ ١٨\n" +
            "18. dan dengan bulan apabila menjadi purnama,\n" +
            "\n" +
            "لَتَرْكَبُنَّ طَبَقًا عَنْ طَبَقٍ ١٩\n" +
            "19. sesungguhnya kamu melalui tingkat demi tingkat (dalam kehidupan). *1\n" +
            "\n" +
            "فَمَا لَهُمْ لَا يُؤْمِنُوْنَ ٢٠\n" +
            "20. Mengapa mereka tidak mau beriman?\n" +
            "\n" +
            "وَإِذَا قُرِئَ عَلَيْهِمُ الْقُرْاٰنُ لَا يَسْجُدُونَ ٢١\n" +
            "21. dan apabila Al-Quran dibacakan kepada mereka, mereka tidak bersujud,\n" +
            "\n" +
            "بَلِ الَّذِيْنَ كَفَرُوْا يُكَذِّبُوْنَ ٢٢\n" +
            "22. bahkan orang-orang kafir itu mendustakan(nya).\n" +
            "\n" +
            "وَاللّٰهُ أَعْلَمُ بِمَا يُوْعُوْنَ ٢٣\n" +
            "23. Padahal Allah mengetahui apa yang mereka sembunyikan (dalam hati mereka).\n" +
            "\n" +
            "فَبَشِّرْهُمْ بِعَذَابٍ أَلِيمٍ ٢٤\n" +
            "24. Maka beri kabar gembiralah mereka dengan adzab yang pedih.\n" +
            "\n" +
            "إِلَّا الَّذِيْنَ اٰمَنُوْا وَعَمِلُوا الصّٰلِحٰتِ لَهُمْ أَجْرٌ غَيْرُ مَمْنُوْنٍ ٢٥\n" +
            "25. Tetapi orang-orang yang beriman dan beramal shalih, bagi mereka pahala yang tidak putus-putusnya."
            ,"\n" +
            "بِسۡمِ ٱللَّهِ ٱلرَّحۡمَٰنِ ٱلرَّحِيمِ\n" +
            "\n" +
            "Bismillahirrahmaanirrahiim(i)\n" +
            "\"Dengan menyebut nama Allah Yang Maha Pemurah lagi Maha Penyayang\"\n" +
            "\n" +
            "وَٱلسَّمَآءِ ذَاتِ ٱلۡبُرُوجِ\n" +
            "\n" +
            "Wassamaa-i dzaatil buruuj(i)\n" +
            "1. \"Demi langit yang mempunyai gugusan bintang,\"\n" +
            "\n" +
            "وَٱلۡيَوۡمِ ٱلۡمَوۡعُودِ\n" +
            "\n" +
            "Wal yaumil mau'uud(i)\n" +
            "2. \"dan hari yang dijanjikan,\"\n" +
            "\n" +
            "وَشَاهِدٍ وَمَشۡهُودٍ\n" +
            "\n" +
            "Wasyaahidin wamasyhuud(in)\n" +
            "3. \"dan yang menyaksikan dan yang disaksikan.\"\n" +
            "\n" +
            "قُتِلَ أَصۡحَٰبُ ٱلۡأُخۡدُودِ\n" +
            "\n" +
            "Qutila ashhaabul ukhduud(i)\n" +
            "4. \"Binasa dan terlaknatlah orang-orang yang membuat parit [1567],\"\n" +
            "\n" +
            "ٱلنَّارِ ذَاتِ ٱلۡوَقُودِ\n" +
            "\n" +
            "Annaari dzaatil waquud(i)\n" +
            "5. \"yang berapi (dinyalakan dengan) kayu bakar,\"\n" +
            "\n" +
            "إِذۡ هُمۡ عَلَيۡهَا قُعُودٌ\n" +
            "\n" +
            "Idz hum 'alaihaa qu'uud(un)\n" +
            "6. \"ketika mereka duduk di sekitarnya,\"\n" +
            "\n" +
            "وَهُمۡ عَلَىٰ مَا يَفۡعَلُونَ بِٱلۡمُؤۡمِنِينَ شُهُودٌ\n" +
            "\n" +
            "Wa hum 'alaa maa yaf'aluuna bil mu'miniina syuhuud(un)\n" +
            "7. \"sedang mereka menyaksikan apa yang mereka perbuat terhadap orang-orang yang beriman.\"\n" +
            "\n" +
            "وَمَا نَقَمُواْ مِنۡهُمۡ إِلَّآ أَن يُؤۡمِنُواْ بِٱللَّهِ ٱلۡعَزِيزِ ٱلۡحَمِيدِ\n" +
            "\n" +
            "Wa maa naqamuu minhum illaa an yu'minuu billahil 'aziizil hamiid(i)\n" +
            "8. \"Dan mereka tidak menyiksa orang-orang mukmin itu melainkan karena orang-orang mukmin itu beriman kepada Allah Yang Maha Perkasa lagi Maha Terpuji,\"\n" +
            "\n" +
            "ٱلَّذِي لَهُۥ مُلۡكُ ٱلسَّمَٰوَٰتِ وَٱلۡأَرۡضِۚ وَٱللَّهُ عَلَىٰ كُلِّ شَيۡءٖ شَهِيدٌ\n" +
            "\n" +
            "Al-ladzii lahu mulkus-samaawaati wal ardhi wallahu 'alaa kulli syai-in syahiid(un)\n" +
            "9. \"Yang mempunyai kerajaan langit dan bumi; dan Allah Maha Menyaksikan segala sesuatu.\"\n" +
            "\n" +
            "إِنَّ ٱلَّذِينَ فَتَنُواْ ٱلۡمُؤۡمِنِينَ وَٱلۡمُؤۡمِنَٰتِ ثُمَّ لَمۡ يَتُوبُواْ فَلَهُمۡ عَذَابُ جَهَنَّمَ وَلَهُمۡ عَذَابُ ٱلۡحَرِيقِ\n" +
            "\n" +
            "Innal-ladziina fatanuul mu'miniina wal mu'minaati tsumma lam yatuubuu falahum 'adzaabu jahannama walahum 'adzaabul hariiq(i)\n" +
            "10. \"Sesungguhnya orang-orang yang mendatangkan cobaan [1568] kepada orang-orang yang mukmin laki-laki dan perempuan kemudian mereka tidak bertaubat, maka bagi mereka azab Jahannam dan bagi mereka azab (neraka) yang membakar.\"\n" +
            "\n" +
            "إِنَّ ٱلَّذِينَ ءَامَنُواْ وَعَمِلُواْ ٱلصَّٰلِحَٰتِ لَهُمۡ جَنَّٰتٌ تَجۡرِي مِن تَحۡتِهَا ٱلۡأَنۡهَٰرُۚ ذَٰلِكَ ٱلۡفَوۡزُ ٱلۡكَبِيرُ\n" +
            "\n" +
            "\n" +
            "Innal-ladziina aamanuu wa'amiluush-shaalihaati lahum jannaatun tajrii min tahtihaal anhaaru dzaalikal fauzul kabiir(u)\n" +
            "11. \"Sesungguhnya orang-orang yang beriman dan mengerjakan amal-amal yang saleh bagi mereka surga yang mengalir di bawahnya sungai-sungai; itulah keberuntungan yang besar.\"\n" +
            "\n" +
            "إِنَّ بَطۡشَ رَبِّكَ لَشَدِيدٌ\n" +
            "\n" +
            "Inna bathsya rabbika lasyadiid(un)\n" +
            "12. \"Sesungguhnya azab Tuhanmu benar-benar keras.\"\n" +
            "\n" +
            "إِنَّهُۥ هُوَ يُبۡدِئُ وَيُعِيدُ\n" +
            "\n" +
            "Innahuu huwa yubdi-u wayu'iid(u)\n" +
            "13. \"Sesungguhnya Dia-lah Yang menciptakan (makhluk) dari permulaan dan menghidupkannya (kembali).\"\n" +
            "\n" +
            "وَهُوَ ٱلۡغَفُورُ ٱلۡوَدُودُ\n" +
            "\n" +
            "Wa huwal ghafuurul waduud(u)\n" +
            "14. \"Dia-lah Yang Maha Pengampun lagi Maha Pengasih,\"\n" +
            "\n" +
            "ذُو ٱلۡعَرۡشِ ٱلۡمَجِيدُ\n" +
            "\n" +
            "Dzuul 'arsyil majiid(u)\n" +
            "15. yang mempunyai 'Arsy, lagi Maha Mulia,\"\n" +
            "\n" +
            "فَعَّالٌ لِّمَا يُرِيدُ\n" +
            "\n" +
            "Fa'_'aalun limaa yuriid(u)\n" +
            "16. \"Maha Kuasa berbuat apa yang dikehendaki-Nya.\"\n" +
            "\n" +
            "هَلۡ أَتَىٰكَ حَدِيثُ ٱلۡجُنُودِ\n" +
            "\n" +
            "Hal ataaka hadiitsul junuud(i)\n" +
            "17. \"Sudahkah datang kepadamu berita kaum-kaum penentang,\"\n" +
            "\n" +
            "فِرۡعَوۡنَ وَثَمُودَ\n" +
            "\n" +
            "Fir'auna watsamuud(a)\n" +
            "18. \"(yaitu kaum) Fir'aun dan (kaum) Tsamud?\"\n" +
            "\n" +
            "بَلِ ٱلَّذِينَ كَفَرُواْ فِي تَكۡذِيبٍ\n" +
            "\n" +
            "Balil-ladziina kafaruu fii takdziib(in)\n" +
            "19. \"Sesungguhnya orang-orang kafir selalu mendustakan,\"\n" +
            "\n" +
            "وَٱللَّهُ مِن وَرَآئِهِم مُّحِيطُۢ\n" +
            "\n" +
            "Wallahu min waraa-ihim muhiith(un)\n" +
            "20. \"padahal Allah mengepung mereka dari belakang mereka [1569].\"\n" +
            "\n" +
            " بَلۡ هُوَ قُرۡءَانٌ مَّجِيدٌ\n" +
            "\n" +
            "Bal huwa qur-aanun majiid(un)\n" +
            "21. \"Bahkan yang didustakan mereka itu ialah Al Quran yang mulia,\"\n" +
            "\n" +
            "فِي لَوۡحٍ مَّحۡفُوظِۢ\n" +
            "\n" +
            "Fii lauhin mahfuuzh(in)\n" +
            "22. \"yang (tersimpan) dalam Lauh Mahfuzh.\""
            ,"\n" +
            "\n" +
            "Bismillahirrahmaanirrahiim(i)\n" +
            "\"Dengan menyebut nama Allah Yang Maha Pemurah lagi Maha Penyayang\"\n" +
            "\n" +
            "وَٱلسَّمَآءِ وَٱلطَّارِقِ\n" +
            "\n" +
            "Wassamaa-i wath-thaariq(i)\n" +
            "1. \"Demi langit dan yang datang pada malam hari,\"\n" +
            "\n" +
            "وَمَآ أَدۡرَىٰكَ مَا ٱلطَّارِقُ\n" +
            "\n" +
            "Wa maa adraaka maa alth-thaariq(u)\n" +
            "2. \"tahukah kamu apakah yang datang pada malam hari itu?\"\n" +
            "\n" +
            "ٱلنَّجۡمُ ٱلثَّاقِبُ\n" +
            "\n" +
            "Alnnajmu altstsaaqib(u)\n" +
            "3. \"(yaitu) bintang yang cahayanya menembus,\"\n" +
            "\n" +
            "إِن كُلُّ نَفۡسٖ لَّمَّا عَلَيۡهَا حَافِظٌ\n" +
            "\n" +
            "In kullu nafsin lammaa ‘alaihaa haafizh(un)\n" +
            "4. \"tidak ada suatu jiwapun (diri) melainkan ada penjaganya.\"\n" +
            "\n" +
            "فَلۡيَنظُرِ ٱلۡإِنسَٰنُ مِمَّ خُلِقَ\n" +
            "\n" +
            "Falyanzhuril insaanu mimma khuliq(a)\n" +
            "5. \"Maka hendaklah manusia memperhatikan dari apakah dia diciptakan?\"\n" +
            "\n" +
            "خُلِقَ مِن مَّآءٖ دَافِقٍ\n" +
            "\n" +
            "Khuliqa min maa-in daafiq(in)\n" +
            "6. \"Dia diciptakan dari air yang dipancarkan,\"\n" +
            "\n" +
            "يَخۡرُجُ مِنۢ بَيۡنِ ٱلصُّلۡبِ وَٱلتَّرَآئِبِ\n" +
            "\n" +
            "Yakhruju min baini shshulbi waalttaraa-ib(i)\n" +
            "7. \"yang keluar dari antara tulang sulbi laki-laki dan tulang dada perempuan.\"\n" +
            "\n" +
            "إِنَّهُۥ عَلَىٰ رَجۡعِهِۦ لَقَادِرٌ\n" +
            "\n" +
            "Innahuu ‘alaa raj’ihi laqaadir(un)\n" +
            "8. \"Sesungguhnya Allah benar-benar kuasa untuk mengembalikannya (hidup sesudah mati).\"\n" +
            "\n" +
            "يَوۡمَ تُبۡلَى ٱلسَّرَآئِرُ\n" +
            "\n" +
            "Yauma tublaas saraa-ir(u)\n" +
            "9. \"Pada hari dinampakkan segala rahasia,\"\n" +
            "\n" +
            "فَمَا لَهُۥ مِن قُوَّةٖ وَلَا نَاصِرٍ\n" +
            "\n" +
            "Famaa lahuu min quwwatin walaa naasir(in)\n" +
            "10. \"maka sekali-kali tidak ada bagi manusia itu suatu kekuatanpun dan tidak (pula) seorang penolong.\"\n" +
            "\n" +
            "وَٱلسَّمَآءِ ذَاتِ ٱلرَّجۡعِ\n" +
            "\n" +
            "Waalssamaa-i dzaatir raj’i\n" +
            "11. \"Demi langit yang mengandung hujan [1570],\"\n" +
            "\n" +
            "وَٱلۡأَرۡضِ ذَاتِ ٱلصَّدۡعِ\n" +
            "\n" +
            "Waal-ardhi dzaati sh-shad’i\n" +
            "12. \"dan bumi yang mempunyai tumbuh-tumbuhan,\"\n" +
            "\n" +
            "إِنَّهُۥ لَقَوۡلٞ فَصۡلٌ\n" +
            "\n" +
            "Innahuu laqaulun fashl(un)\n" +
            "13. \"sesungguhnya Al Quran itu benar-benar firman yang memisahkan antara yang hak dan yang bathil.\"\n" +
            "\n" +
            "وَمَا هُوَ بِٱلۡهَزۡلِ\n" +
            "\n" +
            "Wa maa huwa bilhaz(li)\n" +
            "14. \"dan sekali-kali bukanlah dia senda gurau.\"\n" +
            "\n" +
            "إِنَّهُمۡ يَكِيدُونَ كَيۡدٗا\n" +
            "\n" +
            "Innahum yakiiduuna kaydaa(n)\n" +
            "15. \"Sesungguhnya orang kafir itu merencanakan tipu daya yang jahat dengan sebenar-benarnya.\"\n" +
            "\n" +
            "وَأَكِيدُ كَيۡدٗا\n" +
            "\n" +
            "Wa akiidu kaydaa(n)\n" +
            "16. \"Dan Akupun membuat rencana (pula) dengan sebenar-benarnya.\"\n" +
            "\n" +
            "فَمَهِّلِ ٱلۡكَٰفِرِينَ أَمۡهِلۡهُمۡ رُوَيۡدَۢا\n" +
            "\n" +
            "Fa mahhilil kaafiriina amhilhum ruwaidaa(n)\n" +
            "17. \"Karena itu beri tangguhlah orang-orang kafir itu yaitu beri tangguhlah mereka itu barang sebentar.\""
            ,"\n" +
            "بِسۡمِ ٱللَّهِ ٱلرَّحۡمَٰنِ ٱلرَّحِيمِ\n" +
            "\n" +
            "Bismillahirrahmaanirrahiim(i)\n" +
            "\"Dengan menyebut nama Allah Yang Maha Pemurah lagi Maha Penyayang\"\n" +
            "\n" +
            "سَبِّحِ ٱسۡمَ رَبِّكَ ٱلۡأَعۡلَى\n" +
            "\n" +
            "Sabbihiisma rabbikal a'laa\n" +
            "1. \"Sucikanlah nama Tuhanmu Yang Maha Tinggi,\"\n" +
            "\n" +
            "ٱلَّذِي خَلَقَ فَسَوَّىٰ\n" +
            "\n" +
            "Al-ladzii khalaqa fasawwaa\n" +
            "2. \"yang menciptakan, dan menyempurnakan (penciptaan-Nya),\"[*]\n" +
            "\n" +
            "وَٱلَّذِي قَدَّرَ فَهَدَىٰ\n" +
            "\n" +
            "Wal ladzii qaddara fahadaa\n" +
            "3. \"dan yang menentukan kadar (masing-masing) dan memberi petunjuk,\"[*]\n" +
            "\n" +
            "وَٱلَّذِيٓ أَخۡرَجَ ٱلۡمَرۡعَىٰ\n" +
            "\n" +
            "Wal ladzii akhrajal mar-'aa\n" +
            "4. \"dan yang menumbuhkan rumput-rumputan,\"[*]\n" +
            "\n" +
            "فَجَعَلَهُۥ غُثَآءً أَحۡوَىٰ\n" +
            "\n" +
            "Faja'alahuu ghutsaa-an ahwaa\n" +
            "5. \"lalu dijadikan-Nya rumput-rumput itu kering kehitam-hitaman.\"[*]\n" +
            "\n" +
            "سَنُقۡرِئُكَ فَلَا تَنسَىٰٓ\n" +
            "\n" +
            "Sanuqri-uka falaa tansaa\n" +
            "6. \"Kami akan membacakan (Al Quran) kepadamu (Muhammad) maka kamu tidak akan lupa,\"[*]\n" +
            "\n" +
            "إِلَّا مَا شَآءَ ٱللَّهُۚ إِنَّهُۥ يَعۡلَمُ ٱلۡجَهۡرَ وَمَا يَخۡفَىٰ\n" +
            "\n" +
            "Illaa maa syaa-allahu innahu ya'lamul jahra wamaa yakhfaa\n" +
            "7. \"kecuali kalau Allah menghendaki. Sesungguhnya Dia mengetahui yang terang dan yang tersembunyi.\"\n" +
            "\n" +
            "وَنُيَسِّرُكَ لِلۡيُسۡرَىٰ\n" +
            "\n" +
            "Wa nuyassiruka lilyusraa\n" +
            "8. \"dan Kami akan memberi kamu taufik ke jalan yang mudah [1571],\"\n" +
            "\n" +
            "فَذَكِّرۡ إِن نَّفَعَتِ ٱلذِّكۡرَىٰ\n" +
            "\n" +
            "Fa dzakkir in nafa'atidz-dzikraa\n" +
            "9. \"oleh sebab itu berikanlah peringatan karena peringatan itu bermanfaat,\"\n" +
            "\n" +
            "سَيَذَّكَّرُ مَن يَخۡشَىٰ\n" +
            "\n" +
            "Sayadz-dzakkaru man yakhsyaa\n" +
            "10. \"orang yang takut (kepada Allah) akan mendapat pelajaran,\"\n" +
            "\n" +
            "وَيَتَجَنَّبُهَا ٱلۡأَشۡقَى\n" +
            "\n" +
            "Wa yatajannabuhaal asyqaa\n" +
            "11. \"dan orang-orang yang celaka (kafir) akan menjauhinya.\"\n" +
            "\n" +
            "ٱلَّذِي يَصۡلَى ٱلنَّارَ ٱلۡكُبۡرَىٰ\n" +
            "\n" +
            "Al-ladzii yashlannaaral kubraa\n" +
            "12. \"(Yaitu) orang yang akan memasuki api yang besar (neraka).\"\n" +
            "\n" +
            " ثُمَّ لَا يَمُوتُ فِيهَا وَلَا يَحۡيَىٰ\n" +
            "\n" +
            "Tsumma laa yamuutu fiihaa walaa yahyaa\n" +
            "13. \"Kemudian dia tidak akan mati di dalamnya dan tidak (pula) hidup.\"\n" +
            "\n" +
            "قَدۡ أَفۡلَحَ مَن تَزَكَّىٰ\n" +
            "\n" +
            "Qad aflaha man tazakkaa\n" +
            "14. \"Sesungguhnya beruntunglah orang yang membersihkan diri (dengan beriman),\"\n" +
            "\n" +
            "وَذَكَرَ ٱسۡمَ رَبِّهِۦ فَصَلَّىٰ\n" +
            "\n" +
            "Wa dzakaraasma rabbihii fashallaa\n" +
            "15. \"dan dia ingat nama Tuhannya, lalu dia sembahyang.\"\n" +
            "\n" +
            "بَلۡ تُؤۡثِرُونَ ٱلۡحَيَوٰةَ ٱلدُّنۡيَا\n" +
            "\n" +
            "Bal tu`tsiruunal hayaataddunyaa\n" +
            "16. \"Tetapi kamu (orang-orang kafir) memilih kehidupan duniawi.\"\n" +
            "\n" +
            "وَٱلۡأٓخِرَةُ خَيۡرٞ وَأَبۡقَىٰٓ\n" +
            "\n" +
            "Wal-aakhiratu khairun wa-abqaa\n" +
            "17. \"Sedang kehidupan akhirat adalah lebih baik dan lebih kekal.\"\n" +
            "\n" +
            "إِنَّ هَٰذَا لَفِي ٱلصُّحُفِ ٱلۡأُولَىٰ\n" +
            "\n" +
            "Inna haadzaa lafiish-shuhufil uulaa\n" +
            "18. \"Sesungguhnya ini benar-benar terdapat dalam kitab-kitab yang dahulu,\"\n" +
            "\n" +
            " صُحُفِ إِبۡرَٰهِيمَ وَمُوسَىٰ\n" +
            "\n" +
            "Shuhufi ibraahiima wamuusaa\n" +
            "19. \"(yaitu) Kitab-kitab Ibrahim dan Musa\"\n"
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "هَلْ أَتٰكَ حَدِيْثُ الْغَاشِيَةِ ١\n" +
            "1. Sudah datangkah kepadamu berita (tentang) Hari Pembalasan?\n" +
            "\n" +
            "وُجُوهٌ يَّوْمَئِذٍ خَاشِعَةٌ ٢\n" +
            "2. Banyak muka pada hari itu tunduk terhina,\n" +
            "\n" +
            "عَامِلَةٌ نَّاصِبَةٌ ٣\n" +
            "3. bekerja keras lagi kepayahan,\n" +
            "\n" +
            "تَصْلٰى نَارًا حَامِيَةً ٤\n" +
            "4. memasuki api yang sangat panas (Neraka),\n" +
            "\n" +
            "تُسْقٰى مِنْ عَيْنٍ اٰنِيَةٍ ٥\n" +
            "5. diberi minum (dengan air) dari sumber yang sangat panas.\n" +
            "\n" +
            "لَيْسَ لَهُمْ طَعَامٌ إِلَّا مِنْ ضَرِيْعٍ ٦\n" +
            "6. Mereka tidak memperoleh makanan selain dari pohon yang berduri,\n" +
            "\n" +
            "لَّا يُسْمِنُ وَلَا يُغْنِيْ مِنْ جُوْعٍ ٧\n" +
            "7. yang tidak menggemukkan dan tidak pula menghilangkan lapar.\n" +
            "\n" +
            "وُجُوهٌ يَّوْمَئِذٍ نَّاعِمَةٌ ٨\n" +
            "8. Banyak muka pada hari itu berseri-seri,\n" +
            "\n" +
            "لِّسَعْيِهَا رَاضِيَةٌ ٩\n" +
            "9. merasa senang karena usahanya,\n" +
            "\n" +
            "فِيْ جَنَّةٍ عَالِيَةٍ ١٠\n" +
            "10. dalam surga yang tinggi,\n" +
            "\n" +
            "لَّا تَسْمَعُ فِيْهَا لَاغِيَةً ١١\n" +
            "11. di dalamnya kamu tidak mendengar perkataan yang tidak berguna.\n" +
            "\n" +
            "فِيْهَا عَيْنٌ جَارِيَةٌ ١٢\n" +
            "12. Di dalamnya terdapat mata air yang mengalir.\n" +
            "\n" +
            "فِيْهَا سُرُرٌ مَّرْفُوْعَةٌ ١٣\n" +
            "13. Di dalamnya ada tahta-tahta yang ditinggikan,\n" +
            "\n" +
            "وَأَكْوَابٌ مَّوْضُوْعَةٌ ١٤\n" +
            "14. dan gelas gelas yang terletak (di dekatnya),\n" +
            "\n" +
            "وَّنَمَارِقُ مَصْفُوْفَةٌ ١٥\n" +
            "15. dan bantal-bantal sandaran yang tersusun,\n" +
            "\n" +
            "وَزَرَابِيُّ مَبْثُوْثَةٌ ١٦\n" +
            "16. dan permadani-permadani yang terhampar.\n" +
            "\n" +
            "أَفَلَا يَنْظُرُوْنَ إِلَى الْاِبِلِ كَيْفَ خُلِقَتْ ١٧\n" +
            "17. Maka apakah mereka tidak memperhatikan unta bagaimana dia diciptakan,\n" +
            "\n" +
            "وَإِلَى السَّمَآءِ كَيْفَ رُفِعَتْ ١٨\n" +
            "18. Dan langit, bagaimana ia ditinggikan?\n" +
            "\n" +
            "وَإِلَى الْجِبَالِ كَيْفَ نُصِبَتْ ١٩\n" +
            "19. Dan gunung-gunung, bagaimana ia ditegakkan?\n" +
            "\n" +
            "وَإِلَى الْاَرْضِ كَيْفَ سُطِحَتْ ٢٠\n" +
            "20. Dan bumi, bagaimana ia dihamparkan?\n" +
            "\n" +
            "فَذَكِّرْ إِنَّمَآ أَنْتَ مُذَكِّرٌ ٢١\n" +
            "21. Maka berilah peringatan, karena sesungguhnya kamu hanyalah orang yang memberi peringatan.\n" +
            "\n" +
            "لَسْتَ عَلَيْهِمْ بِمُصَيْطِرٍ ٢٢\n" +
            "22. Kamu bukanlah orang yang berkuasa atas mereka,\n" +
            "\n" +
            "إِلَّا مَنْ تَوَلّٰى وَكَفَرَ ٢٣\n" +
            "23. tetapi orang yang berpaling dan kafir,\n" +
            "\n" +
            "فَيُعَذِّبُهُ اللّٰهُ الْعَذَابَ الْاَكْبَرَ٢٤\n" +
            "24. maka Allah akan mengadzabnya dengan adzab yang besar.\n" +
            "\n" +
            "إِنَّ إِلَيْنَآ إِيَابَهُمْ ٢٥\n" +
            "25. Sesungguhnya kepada Kami-lah kembali kepada mereka,\n" +
            "\n" +
            "ثُمَّ إِنَّ عَلَيْنَا حِسَابَهُمْ ٢٦ \n" +
            "26. kemudian sesungguhnya kewajiban Kami-lah menghisab mereka."
            ,"\n" +
            "\n" +
            "Bismillahirrahmaanirrahiim(i)\n" +
            "\"Dengan menyebut nama Allah Yang Maha Pemurah lagi Maha Penyayang\"\n" +
            "\n" +
            "وَٱلۡفَجۡرِ\n" +
            "\n" +
            "Wal fajr(i)\n" +
            "1. \"Demi fajar,\"\n" +
            "\n" +
            "وَلَيَالٍ عَشۡرٍ\n" +
            "\n" +
            "Walayaalin 'asyr(in)\n" +
            "2. \"dan malam yang sepuluh [1572],\"\n" +
            "\n" +
            "وَٱلشَّفۡعِ وَٱلۡوَتۡرِ\n" +
            "\n" +
            "Wasy-syaf'i wal watr(i)\n" +
            "3. \"dan yang genap dan yang ganjil,\"\n" +
            "\n" +
            "وَٱلَّيۡلِ إِذَا يَسۡرِ\n" +
            "\n" +
            "Wal laili idzaa yasr(i)\n" +
            "4. \"dan malam bila berlalu.\"\n" +
            "\n" +
            "هَلۡ فِي ذَٰلِكَ قَسَمٌ لِّذِي حِجۡرٍ\n" +
            "\n" +
            "Hal fii dzaalika qasamun lidzii hijr(in)\n" +
            "5. \"Pada yang demikian itu terdapat sumpah (yang dapat diterima) oleh orang-orang yang berakal.\"\n" +
            "\n" +
            "أَلَمۡ تَرَ كَيۡفَ فَعَلَ رَبُّكَ بِعَادٍ\n" +
            "\n" +
            "Alam tara kaifa fa'ala rabbuka bi'aad(in)\n" +
            "6. \"Apakah kamu tidak memperhatikan bagaimana Tuhanmu berbuat terhadap kaum 'Aad?\"\n" +
            "\n" +
            "إِرَمَ ذَاتِ ٱلۡعِمَادِ\n" +
            "\n" +
            "Irama dzaatil 'imaad(i)\n" +
            "7. \"(yaitu) penduduk Iram yang mempunyai bangunan-bangunan yang tinggi [1573],\" \n" +
            "\n" +
            "ٱلَّتِي لَمۡ يُخۡلَقۡ مِثۡلُهَا فِي ٱلۡبِلَٰدِ\n" +
            "\n" +
            "Allatii lam yukhlaq mitsluhaa fiil bilaad(i)\n" +
            "8. \"yang belum pernah dibangun (suatu kota) seperti itu, di negeri-negeri lain,\"\n" +
            "\n" +
            "وَثَمُودَ ٱلَّذِينَ جَابُواْ ٱلصَّخۡرَ بِٱلۡوَادِ\n" +
            "\n" +
            "Wa tsamuudal-ladziina jaabuush-shakhra bil waad(i)\n" +
            "9. \"dan kaum Tsamud yang memotong batu-batu besar di lembah [1574],\"\n" +
            "\n" +
            "وَفِرۡعَوۡنَ ذِي ٱلۡأَوۡتَادِ\n" +
            "\n" +
            "Wafir'auna dziil autaad(i)\n" +
            "10. \"dan kaum Fir'aun yang mempunyai pasak-pasak (tentara yang banyak),\"\n" +
            "\n" +
            "ٱلَّذِينَ طَغَوۡاْ فِي ٱلۡبِلَٰدِ\n" +
            "\n" +
            "Al-ladziina thaghau fiil bilaad(i)\n" +
            "11. \"yang berbuat sewenang-wenang dalam negeri,\"\n" +
            "\n" +
            "فَأَكۡثَرُواْ فِيهَا ٱلۡفَسَادَ\n" +
            "\n" +
            "Fa-aktsaruu fiihaal fasaad(a)\n" +
            "12. \"lalu mereka berbuat banyak kerusakan dalam negeri itu,\"\n" +
            "\n" +
            "فَصَبَّ عَلَيۡهِمۡ رَبُّكَ سَوۡطَ عَذَابٍ\n" +
            "\n" +
            "Fashabba 'alaihim rabbuka sautha 'adzaab(in)\n" +
            "13. \"karena itu Tuhanmu menimpakan kepada mereka cemeti azab,\"\n" +
            "\n" +
            "إِنَّ رَبَّكَ لَبِٱلۡمِرۡصَادِ\n" +
            "\n" +
            "Inna rabbaka labil mirshaad(i)\n" +
            "14. \"sesungguhnya Tuhanmu benar-benar mengawasi.\"\n" +
            "\n" +
            "فَأَمَّا ٱلۡإِنسَٰنُ إِذَا مَا ٱبۡتَلَىٰهُ رَبُّهُۥ فَأَكۡرَمَهُۥ وَنَعَّمَهُۥ فَيَقُولُ رَبِّيٓ أَكۡرَمَنِ\n" +
            "\n" +
            "Fa-ammaal insaanu idzaa maaabtalaahu rabbuhuu fa-akramahu wana'_'amahu fayaquulu rabbii akraman(i)\n" +
            "15. \"Adapun manusia apabila Tuhannya mengujinya lalu dia dimuliakan-Nya dan diberi-Nya kesenangan, maka dia akan berkata: \"Tuhanku telah memuliakanku.\"\n" +
            "\n" +
            " وَأَمَّآ إِذَا مَا ٱبۡتَلَىٰهُ فَقَدَرَ عَلَيۡهِ رِزۡقَهُۥ فَيَقُولُ رَبِّيٓ أَهَٰنَنِ\n" +
            "\n" +
            "Wa ammaa idzaa maaabtalaahu faqadara 'alaihi rizqahuu fayaquulu rabbii ahaanan(i)\n" +
            "16. Adapun bila Tuhannya mengujinya lalu membatasi rizkinya maka dia berkata: \"Tuhanku menghinakanku\" [1575].\n" +
            "\n" +
            "كَلَّاۖ بَل لَّا تُكۡرِمُونَ ٱلۡيَتِيمَ\n" +
            "\n" +
            "Kallaa, bal laa tukrimuunal yatiim(a)\n" +
            "17. \"Sekali-kali tidak (demikian), sebenarnya kamu tidak memuliakan anak yatim [1576],\"\n" +
            "\n" +
            "وَلَا تَحَٰٓضُّونَ عَلَىٰ طَعَامِ ٱلۡمِسۡكِينِ\n" +
            "\n" +
            "Walaa tahaadh-dhuuna 'alaa tha'aamil miskiin(i)\n" +
            "18. \"dan kamu tidak saling mengajak memberi makan orang miskin,\"\n" +
            "\n" +
            "وَتَأۡكُلُونَ ٱلتُّرَاثَ أَكۡلٗا لَّمّٗا\n" +
            "\n" +
            "Wa ta'kuluunatturaatsa aklan lammaa(n)\n" +
            "19. \"dan kamu memakan harta pusaka dengan cara mencampur baurkan (yang halal dan yang bathil),\"\n" +
            "\n" +
            "وَتُحِبُّونَ ٱلۡمَالَ حُبّٗا جَمّٗا\n" +
            "\n" +
            "Wa tuhibbuunal maala hubban jammaa(n)\n" +
            "20. \"dan kamu mencintai harta benda dengan kecintaan yang berlebihan.\"\n" +
            "\n" +
            "كَلَّآۖ إِذَا دُكَّتِ ٱلۡأَرۡضُ دَكّٗا دَكّٗا\n" +
            "\n" +
            "Kallaa, idzaa dukkatil ardhu dakkan dakkaa(n)\n" +
            "21. \"Jangan (berbuat demikian). Apabila bumi digoncangkan berturut-turut,\"\n" +
            "\n" +
            "وَجَآءَ رَبُّكَ وَٱلۡمَلَكُ صَفّٗا صَفّٗا\n" +
            "\n" +
            "Wa jaa-a rabbuka wal malaku shaffan shaffaa(n)\n" +
            "22. \"dan datanglah Tuhanmu; sedang malaikat berbaris-baris.\"\n" +
            "\n" +
            "وَجِاْيٓءَ يَوۡمَئِذِۢ بِجَهَنَّمَۚ يَوۡمَئِذٖ يَتَذَكَّرُ ٱلۡإِنسَٰنُ وَأَنَّىٰ لَهُ ٱلذِّكۡرَىٰ\n" +
            "\n" +
            "\n" +
            "Wa jii-a yauma-idzin bijahannama yauma-idzin yatadzakkarul insaanu wa-annaa lahudz-dzikr(a)\n" +
            "23. \"Dan pada hari itu diperlihatkan neraka Jahannam; dan pada hari itu ingatlah manusia, akan tetapi tidak berguna lagi mengingat itu baginya.\"\n" +
            "\n" +
            "  يَقُولُ يَٰلَيۡتَنِي قَدَّمۡتُ لِحَيَاتِي\n" +
            "\n" +
            "Yaquulu yaa laitanii qaddamtu lihayaatii\n" +
            "24. Dia mengatakan: \"Alangkah baiknya kiranya aku dahulu mengerjakan (amal saleh) untuk hidupku ini.\"\n" +
            "\n" +
            "فَيَوۡمَئِذٖ لَّا يُعَذِّبُ عَذَابَهُۥٓ أَحَدٌ\n" +
            "\n" +
            "Fayauma-idzin laa yu'adz-dzibu 'adzaabahuu ahadun\n" +
            "25. \"Maka pada hari itu tiada seorangpun yang menyiksa seperti siksa-Nya [1577].\"\n" +
            "\n" +
            "وَلَا يُوثِقُ وَثَاقَهُۥٓ أَحَدٌ\n" +
            "\n" +
            "Walaa yuutsiqu watsaaqahuu ahad(un)\n" +
            "26. \"dan tiada seorangpun yang mengikat seperti ikatan-Nya.\"\n" +
            "\n" +
            " يَٰٓأَيَّتُهَا ٱلنَّفۡسُ ٱلۡمُطۡمَئِنَّةُ\n" +
            "\n" +
            "Yaa ayyatuhaannafsul muthma-innh(tu)\n" +
            "27. \"Hai jiwa yang tenang.\"\n" +
            "\n" +
            "ٱرۡجِعِيٓ إِلَىٰ رَبِّكِ رَاضِيَةٗ مَّرۡضِيَّةً\n" +
            "\n" +
            "Irji'ii ilaa rabbiki raadhiyatan mardhii-yatan\n" +
            "28. \"Kembalilah kepada Tuhanmu dengan hati yang puas lagi diridhai-Nya.\"\n" +
            "\n" +
            "فَٱدۡخُلِي فِي عِبَٰدِي\n" +
            "\n" +
            "Faadkhulii fii 'ibaadii\n" +
            "29. \"Maka masuklah ke dalam jama'ah hamba-hamba-Ku,\"\n" +
            "\n" +
            "وَٱدۡخُلِي جَنَّتِي\n" +
            "\n" +
            "Waadkhulii jannatii\n" +
            "30. \"masuklah ke dalam syurga-Ku.\""
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "لَآ أُقْسِمُ بِهٰذَا الْبَلَدِ ١\n" +
            "1. Aku benar-benar bersumpah dengan kota ini, *1\n" +
            "\n" +
            "وَأَنْتَ حِلٌّ بِهٰذَا الْبَلَدِ ٢\n" +
            "2. dan kamu (Muhammad) bertempat di Kota Mekkah ini,\n" +
            "\n" +
            "وَوَالِدٍ وَّمَا وَلَدَ ٣\n" +
            "3. dan demi bapak dan anak-anaknya.\n" +
            "\n" +
            "لَقَدْ خَلَقْنَا الْاِنْسَانَ فِيْ كَبَدٍ ٤\n" +
            "4. Sesungguhnya Kami telah menciptakan manusia berada dalam susah payah.\n" +
            "\n" +
            "أَيَحْسَبُ أَنْ لَّنْ يَّقْدِرَ عَلَيْهِ أَحَدٌ ٥\n" +
            "5. Apakah manusia itu menyangka bahwa sekali-kali tidak ada seeorang pun yang berkuasa atasnya?\n" +
            "\n" +
            "يَقُوْلُ أَهْلَكْتُ مَالًا لُّبَدًا ٦\n" +
            "6. Dia mengatakan. \"Aku telah menghabiskan harta yang banyak.\"\n" +
            "\n" +
            "أَيَحْسَبُ أَنْ لَّمْ يَرَهُ أَحَدٌ ٧\n" +
            "7. Apakah dia menyangka bahwa tidak eorang pun yang melihatnya?\n" +
            "\n" +
            "أَلَمْ نَجْعَلْ لَّهُ عَيْنَيْنِ ٨\n" +
            "8. Bukankah Kami telah memberikan kepadanya dua buah mata,\n" +
            "\n" +
            "وَلِسَانًا وَّشَفَتَيْنِ ٩\n" +
            "9. lidah dan dua buah bibir.\n" +
            "\n" +
            "وَهَدَيْنٰهُ النَّجْدَيْنِ ١٠\n" +
            "10. Dan Kami telah menunjukkan kepadanya dua jalan, *2\n" +
            "\n" +
            "فَلَا اقْتَحَمَ الْعَقَبَةَ ١١\n" +
            "11. Maka tidakkah sebaiknya (dengan hartanya itu) ia menempuh jalan yang mendaki lagi sukar?\n" +
            "\n" +
            "وَمَآ أَدْرٰــــكَ مَا الْعَقَبَةُ ١٢\n" +
            "12. Tahukah kamu apakah jalan yang mendaki lagi sukar itu?\n" +
            "\n" +
            "فَكُّ رَقَبَةٍ ١٣\n" +
            "13. (Yaitu) melepaskan budak dari perbudakan,\n" +
            "\n" +
            "أَوْ إِطْعَامٌ فِيْ يَوْمٍ ذِيْ مَسْغَبَةٍ ١٤\n" +
            "14. atau memberi makan pada hari kelaparan,\n" +
            "\n" +
            "يَّتِيْمًا ذَا مَقْرَبَةٍ ١٥\n" +
            "15. (kepada) anak yatim yang ada hubungan kerabat,\n" +
            "\n" +
            "أَوْ مِسْكِيْنًا ذَا مَتْرَبَةٍ ١٦\n" +
            "16. atau kepada orang miskin yang sangat fakir.\n" +
            "\n" +
            "ثُمَّ كَانَ مِنَ الَّذِيْنَ اٰمَنُوْا وَتَوَاصَوْا بِالصَّبْرِ وَتَوَاصَوْا بِالْمَرْحَمَةِ ١٧\n" +
            "17. Dan dia termasuk orang-orang yang beriman dan saling berpesan untuk bersabar dan saling berpesan untuk berkasih sayang.\n" +
            "\n" +
            "أُولٰئِكَ أَصْحٰبُ الْمَيْمَنَةِ ١٨\n" +
            "18. Mereka (orang-orang yang beriman dan kerkaih sayang) adalah golongan kanan.\n" +
            "\n" +
            "وَالَّذِيْنَ كَفَرُوْا بِاٰيٰتِنَا هُمْ أَصْحٰبُ الْمَشْاَمَةِ ١٩\n" +
            "19. Dan orang-orang yang kafir kepada ayat Kami, mereka itu adalah golongan kiri.\n" +
            "\n" +
            "عَلَيْهِمْ نَارٌ مُّؤْصَدَةٌ ٢٠\n" +
            "20. Mereka berada dalam Neraka yang ditutup rapat.\n"
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "وَالشَّمْسِ وَضُحٰهَا ١\n" +
            "1. Demi matahari dan cahayanya di pagi hari,\n" +
            "\n" +
            "وَالْقَمَرِ إِذَا تَلٰهَا ٢\n" +
            "2. dan bulan apabila mengiringinya,\n" +
            "\n" +
            "وَالنَّهَارِ إِذَا جَلّٰهَا ٣\n" +
            "3. dan siang apabila menampakkannya,\n" +
            "\n" +
            "وَالَّيْلِ إِذَا يَغْشٰهَا ٤\n" +
            "4. dan malam apabila menutupinya, *1\n" +
            "\n" +
            "وَالسَّمَآءِ وَمَا بَنٰهَا ٥\n" +
            "5. dan langit serta pembinaannya,\n" +
            "\n" +
            "وَالْاَرْضِ وَمَا طَحٰهَا ٦\n" +
            "6. dan bumi serta penghamparannya,\n" +
            "\n" +
            "وَنَفْسٍ وَّمَا سَوّٰهَا ٧\n" +
            "7. dan jiwa serta penyempurnaannya (ciptaannya),\n" +
            "\n" +
            "فَأَلْهَمَهَا فُجُوْرَهَا وَتَقْوٰهَا ٨\n" +
            "8. maka Allah mengilhamkan kepada jiwa itu (jalan) kefasikan dan ketakwaan,\n" +
            "\n" +
            "قَدْ أَفْلَحَ مَنْ زَكّٰهَا ٩\n" +
            "9. sesungguhnya beruntunglah orang yang mensucikan jiwa itu,\n" +
            "\n" +
            "وَقَدْ خَابَ مَنْ دَسّٰهَا ١٠\n" +
            "10. dan sesungguhnya merugilah orang yang mengotorinya,\n" +
            "\n" +
            "كَذَّبَتْ ثَمُوْدُ بِطَغْوٰهَا ١١\n" +
            "11. (kaum) Tsamud telah mendustakan (Rasul mereka) karena melampui batas,\n" +
            "\n" +
            "إِذِ انْبَعَثَ أَشْقٰهَا ١٢\n" +
            "12. ketika bangkit orang yang paling celaka di antara mereka,\n" +
            "\n" +
            "فَقَالَ لَهُمْ رَسُولُ اللّٰهِ نَاقَةَ اللّٰهِ وَسُقْيٰهَا ١٣\n" +
            "13. lalu Rasul Allah (Shalih) berkata kepada mereka, \"(Biarkanlah) unta betina Allah itu meminumnya!\"\n" +
            "\n" +
            "فَكَذَّبُوْهُ فَعَقَرُوْهَا فَدَمْدَمَ عَلَيْهِمْ رَبُّهُمْ بِذَنْبِهِمْ فَسَوّٰهَا ١٤\n" +
            "14. lalu mereka mendustakannya dan menyembelih unta itu, maka Rabb mereka membinasakan mereka disebabkan dosa mereka, lalu Allah menyamaratakan mereka (dengan tanah).\n" +
            "\n" +
            "وَلَا يَخَافُ عُقْبٰهَا ١٥ \n" +
            "15. dan Allah tidak takut terhadap akibat tindakan-Nya itu."
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "وَالَّيْلِ إِذَا يَغْشٰى ١\n" +
            "1. Demi malam, apabila menutupi (cahaya siang),\n" +
            "\n" +
            "وَالنَّهَارِ إِذَا تَجَلّٰى ٢\n" +
            "2. dan siang apabila terang benderang,\n" +
            "\n" +
            "وَمَا خَلَقَ الذَّكَرَ وَالْاُنْثٰى ٣\n" +
            "3. dan penciptaan laki-laki dan perempuan,\n" +
            "\n" +
            "إِنَّ سَعْيَكُمْ لَشَتّٰى ٤\n" +
            "4. sesungguhnya usaha kamu memang berbeda-beda.\n" +
            "\n" +
            "فَأَمَّا مَنْ أَعْطٰى وَاتَّقٰى ٥\n" +
            "5. Adapun orang yang memberikan (hartanya di jalan Allah) dan bertakwa,\n" +
            "\n" +
            "وَصَدَّقَ بِالْحُسْنٰى ٦\n" +
            "6. dan membenarkan adanya pahala yang terbaik (surga),\n" +
            "\n" +
            "فَسَنُيَسِّرُهُ لِلْيُسْرٰى ٧\n" +
            "7. maka Kami kelak akan menyiapkan baginya jalan yang mudah.\n" +
            "\n" +
            "وَأَمَّا مَنْ بَخِلَ وَاسْتَغْنٰى ٨\n" +
            "8. Dan adapun orang-orang yang bakhil dan merasa dirinya cukup, *1\n" +
            "\n" +
            "وَكَذَّبَ بِالْحُسْنٰى ٩\n" +
            "9. serta mendustakan pahala yang terbaik,\n" +
            "\n" +
            "فَسَنُيَسِّرُهُ لِلْعُسْرٰى ١٠\n" +
            "10. maka kelak Kami akan menyiapkan baginya (jalan) yang sukar.\n" +
            "\n" +
            "وَمَا يُغْنِيْ عَنْهُ مَالُهُ إِذَا تَرَدّٰى ١١\n" +
            "11. Dan hartanya tidak bermanfaat baginya apabila ia telah binasa.\n" +
            "\n" +
            "إِنَّ عَلَيْنَا لَلْهُدٰى ١٢\n" +
            "12. Sesungguhnya kewajiban Kami-lah memberi petunjuk.\n" +
            "\n" +
            "وَإِنَّ لَنَا لَلْاٰخِرَةَ وَالْاُوْلٰى ١٣\n" +
            "13. Dan sesungguhnya kepunyaan Kami-lah akhirat dan dunia.\n" +
            "\n" +
            "فَأَنْذَرْتُكُمْ نَارًا تَلَظّٰى ١٤\n" +
            "14. Maka, Kami peringatkan kamu sekalian dengan Neraka yang menyala-nyala.\n" +
            "\n" +
            "لَا يَصْلٰهَآ اِلَّا الْاَشْقَى ١٥\n" +
            "15. Tidak ada yang masuk ke dalamnya kecuali orang yang paling celaka,\n" +
            "\n" +
            "الَّذِيْ كَذَّبَ وَتَوَلّٰى ١٦\n" +
            "16. yang mendustakan (kebenaran) dan berpaling (dari iman).\n" +
            "\n" +
            "وَسَيُجَنَّبُهَا الْاَتْقَى ١٧\n" +
            "17. Dan kelak akan dijauhkan orang yang paling takwa dari Neraka itu,\n" +
            "\n" +
            "الَّذِيْ يُؤْتِيْ مَالَهُ يَتَزَكّٰى ١٨\n" +
            "18. yang menafkahkan hartanya (di jalan Allah) untuk membersihkan,\n" +
            "\n" +
            "وَمَا لِاَحَدٍ عِنْدَهُ مِنْ نِّعْمَةٍ تُجْزٰى ١٩\n" +
            "19. padahal tidak ada seorang pun memberikan suatu nikmat kepadanya yang harus dibalasnya,\n" +
            "\n" +
            "اِلَّا ابْتِغَآءَ وَجْهِ رَبِّهِ الْاَعْلٰى ٢٠\n" +
            "20. tetapi (dia memberikan itu semata-mata) karena mencari keridhaan Rabb-nya yang Maha Tinggi. \n" +
            "\n" +
            "وَلَسَوْفَ يَرْضٰى ٢١\n" +
            "21. Dan kelak dia benar-benar mendapat kepuasan."
            ,"\n" +
            "1. Wadh-dhuha\n" +
            "Demi waktu matahari sepenggalahan naik,”\n" +
            "\n" +
            "وَاللَّيْلِ إِذَا سَجَى\n" +
            "\n" +
            "2. Wallaili idzaa saja\n" +
            "dan demi malam apabila telah sunyi (gelap),”\n" +
            "\n" +
            "مَا وَدَّعَكَ رَبُّكَ وَمَا قَلَى\n" +
            "\n" +
            "3. Maa wadda'aka rabbuka wamaa qala\n" +
            "Tuhanmu tiada meninggalkan kamu dan tiada (pula) benci” kepadamu.\n" +
            "\n" +
            "وَلَلآخِرَةُ خَيْرٌ لَكَ مِنَ الأولَى\n" +
            "\n" +
            "4. Walal-aakhiratu khairun laka minal aula\n" +
            "Dan sesungguhnya hari kemudian itu lebih baik bagimu daripada yang sekarang (permulaan).”\n" +
            "\n" +
            "وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَى\n" +
            "\n" +
            "5. Walasaufa yu'thiika rabbuka fatardha\n" +
            "Dan kelak Tuhanmu pasti memberikan karunia-Nya kepadamu , lalu (hati) kamu menjadi puas.\n" +
            "\n" +
            "أَلَمْ يَجِدْكَ يَتِيمًا فَآوَى\n" +
            "\n" +
            "6. Alam yajidka yatiiman fa-aawa\n" +
            "Bukankah Dia mendapatimu sebagai seorang yatim, lalu Dia melindungimu ?”\n" +
            "\n" +
            "وَوَجَدَكَ ضَالا فَهَدَى\n" +
            "\n" +
            "7. Wawajadaka dhaaalan fahada\n" +
            "Dan Dia mendapatimu sebagai seorang yang bingung, lalu Dia memberikan petunjuk.”\n" +
            "\n" +
            "وَوَجَدَكَ عَائِلا فَأَغْنَى\n" +
            "\n" +
            "8. Wawajadaka 'aa-ilaa fa-aghna\n" +
            "“Dan Dia mendapatimu sebagai seorang yang kekurangan, lalu Dia memberikan kecukupan.”\n" +
            "\n" +
            "فَأَمَّا الْيَتِيمَ فَلا تَقْهَرْ\n" +
            "\n" +
            "9. Fa-ammaal yatiima falaa taqhar\n" +
            "“Sebab itu, terhadap anak yatim janganlah kamu berlaku sewenang-wenang.”\n" +
            "\n" +
            "وَأَمَّا السَّائِلَ فَلا تَنْهَرْ\n" +
            "\n" +
            "10. Wa-ammaassaa-ila falaa tanhar\n" +
            "“Dan terhadap orang yang minta-minta, janganlah kamu menghardiknya.”\n" +
            "\n" +
            "وَأَمَّا بِنِعْمَةِ رَبِّكَ فَحَدِّثْ\n"
            ,"1. Alam nasyrah laka shadrak(a)\n" +
            "\"Bukankah Kami telah melapangkan untukmu (Muhammad) dadamu,\"\n" +
            "\n" +
            "\n" +
            "وَوَضَعْنَا عَنْكَ وِزْرَكَ\n" +
            "\n" +
            "\n" +
            "2. Wawadha'naa 'anka wizrak(a)\n" +
            "\"dan (bukankah) Kami telah menghilangkan darimu bebanmu,\" \n" +
            "\n" +
            "\n" +
            "الَّذِي أَنْقَضَ ظَهْرَكَ\n" +
            "\n" +
            "\n" +
            "3. Al-ladzii anqadha zhahrak(a)\n" +
            "\"yang memberatkan punggungmu.\" \n" +
            "\n" +
            "\n" +
            "وَرَفَعْنَا لَكَ ذِكْرَكَ\n" +
            "\n" +
            "4. Warafa'naa laka dzikrak(a)\n" +
            "\"Dan Kami tinggikan bagimu sebutan (nama)mu.\"\n" +
            "\n" +
            "\n" +
            "فَإِنَّ مَعَ الْعُسْرِ يُسْرًا\n" +
            "\n" +
            "5. Fa-inna ma'al 'usri yusran\n" +
            "\"Karena sesungguhnya, sesudah kesulitan itu ada kemudahan,\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "إِنَّ مَعَ الْعُسْرِ يُسْرًا\n" +
            "\n" +
            "\n" +
            "6. Inna ma'al 'usri yusran\n" +
            "\"Sesungguhnya, sesudah kesulitan itu ada kemudahan.\"\n" +
            "\n" +
            "\n" +
            "فَإِذَا فَرَغْتَ فَانْصَبْ\n" +
            "\n" +
            "\n" +
            "7. Fa-idzaa faraghta faanshab\n" +
            "\"Maka apabila kamu telah selesai (dari sesuatu urusan), kerjakanlah dengan sungguh-sungguh (urusan) yang lain,\"\n" +
            "\n" +
            "\n" +
            "وَإِلَى رَبِّكَ فَارْغَبْ\n" +
            "\n" +
            "\n" +
            "8. Wa-ila rabbika faarghab\n" +
            "\"dan hanya kepada Rabb-mulah hendaknya kamu berharap.\" \n"

            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah Yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "وَالتِّيْنِ وَالزَّيْتُوْنِ ١\n" +
            "1. Demi (buah) Tin dan (buah) Zaitun *1,\n" +
            "\n" +
            "وَطُوْرِ سِيْنِيْنَ ٢\n" +
            "2. dan demi Bukit Sinai *2,\n" +
            "\n" +
            "وَهٰذَا الْبَلَدِ الْاَمِيْنِ ٣\n" +
            "3. dan demi kota (Mekkah) ini yang aman,\n" +
            "\n" +
            "لَقَدْ خَلَقْنَا الْاِنْسَانَ فِيْ أَحْسَنِ تَقْوِيْمٍ ٤\n" +
            "4. sesungguhnya Kami telah ciptakan manusia dalam bentuk yang sebaik-baiknya.\n" +
            "\n" +
            "ثُمَّ رَدَدْنٰهُ اَسْفَلَ سَافِلِيْنَ ٥\n" +
            "5. Kemudian Kami kembalikan dia ke tempat yang serendah-rendahnya (Neraka),\n" +
            "\n" +
            "اِلَّا الَّذِيْنَ اٰمَنُوْا وَعَمِلُوا الصّٰلِحٰتِ فَلَهُمْ أَجْرٌ غَيْرُ مَمْنُوْنٍ ٦\n" +
            "6. kecuali orang-orang yang beriman dan mengerjakan amal shalih, maka bagi mereka pahala yang tidak putus-putusnya.\n" +
            "\n" +
            "فَمَا يُكَذِّبُكَ بَعْدُ بِالدِّيْنِ ٧\n" +
            "7. Maka apakah yang menyebabkan kamu mendustakan (hari) Pembalasan, sesudah (adanya keterangan-keterangan) itu?\n" +
            "\n" +
            "أَلَيْسَ اللّٰهُ بِاَحْكَمِ الْحٰكِمِيْنَ ٨\n" +
            "8. Bukankah Allah Hakim yang seadil-adilnya?"
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "اِقْرَأْ بِاسْمِ رَبِّكَ الَّذِيْ خَلَقَ ١\n" +
            "1. Bacalah dengan (menyebut) Nama Rabb-mu Yang Menciptakan.\n" +
            "\n" +
            "خَلَقَ الْاِنْسَانَ مِنْ عَلَقٍ ٢\n" +
            "2. Dia telah menciptakan manusia dari segumpal darah.\n" +
            "\n" +
            "اِقْرَأْ وَرَبُّكَ الْاَكْرَمُ ٣\n" +
            "3. Bacalah, dan Rabb-mu lah Yang Maha Pemurah.\n" +
            "\n" +
            "الَّذِيْ عَلَّمَ بِالْقَلَمِ ٤\n" +
            "4. Yang mengajar (manusia) dengan perantaraan kalam *1.\n" +
            "\n" +
            "عَلَّمَ الْاِنْسَانَ مَا لَمْ يَعْلَمْ ٥\n" +
            "5. Dia mengajarkan kepada manusia apa yang tidak diketahuinya.\n" +
            "\n" +
            "كَلَّآ إِنَّ الْاِنْسَانَ لَيَطْغٰى ٦\n" +
            "6. Ketahuilah! Sesungguhnya manusia benar-benar melampui batas,\n" +
            "\n" +
            "أَنْ رَّاٰهُ اسْتَغْنٰى ٧\n" +
            "7. karena dia melihat dirinya serba cukup.\n" +
            "\n" +
            "إِنَّ اِلٰى رَبِّكَ الرُّجْعٰى ٨\n" +
            "8. Sesungguhnya hanya kepada Rabb-mu lah kembali (mu).\n" +
            "\n" +
            "اَرَءَيْتَ الَّذِيْ يَنْهٰى ٩\n" +
            "9. Bagaimana pendapatmu tentang orang yang melarang,\n" +
            "\n" +
            "عَبْدًا إِذَا صَلّٰى ١٠\n" +
            "10. seorang hamba ketika dia mengerjakan shalat *2.\n" +
            "\n" +
            "اَرَءَيْتَ إِنْ كَانَ عَلَى الْهُدٰى ١١\n" +
            "11. bagaimana pendapatmu jika orang yang melarang itu berada di atas kebenaran,\n" +
            "\n" +
            "أَوْ أَمَرَ بِالتَّقْوٰى ١٢\n" +
            "12. atau dia menyuruh bertakwa (kepada Allah)?\n" +
            "\n" +
            "اَرَءَيْتَ إِنْ كَذَّبَ وَتَوَلّٰى ١٣\n" +
            "13. Bagaimana pendapatmu jika orang yang melarang itu mendustakan dan berpaling?\n" +
            "\n" +
            "اَلَمْ يَعْلَمْ بِأَنَّ اللّٰهَ يَرٰى ١٤\n" +
            "14. Tidakkah dia mengetahui bahwa sesungguhnya Allah melihat segala perbuatannya?\n" +
            "\n" +
            "كَلَّا لَئِنْ لَّمْ يَنْتَهِ لَنَسْفَعًا بِالنَّاصِيَةِ ١٥\n" +
            "15. Ketahuilah, sungguh jika dia berhenti (berbuat demikian) niscaya Kami tarik ubun-ubunnya *3.\n" +
            "\n" +
            "نَاصِيَةٍ كَاذِبَةٍ خَاطِئَةٍ ١٦\n" +
            "16. (yaitu) ubun-ubun orang yang mendustakan lagi durhaka.\n" +
            "\n" +
            "فَلْيَدْعُ نَادِيَهٗ ١٧\n" +
            "17. Maka biarlah dia memanggil golongannya (untuk menolongnya),\n" +
            "\n" +
            "سَنَدْعُ الزَّبَانِيَةَ ١٨\n" +
            "18. kelak Kami akan memanggil Malaikat Zabaniyah *4.\n" +
            "\n" +
            "كَلَّ لَا تُطِعْهُ وَاسْجُدْ وَاقْتَرِبْ ١٩\n" +
            "19. sekali-kali jangan, janganlah kamu patuh kepadanya, dan sujudlah dan dekatkanlah (dirimu kepada Allah)!"
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "إِنَّآ أَنْزَلْنٰهُ فِيْ لَيْلَةِ الْقَدْرِ ١\n" +
            "1. Sesungguhnya Kami telah menurunkan (Al-Quran) pada malam kemuliaan *1.\n" +
            "\n" +
            "وَمَآ أَدْرٰكَ مَا لَيْلَةُ الْقَدْرِ ٢\n" +
            "2. Dan tahukah kamu apakah malam kemuliaan itu?\n" +
            "\n" +
            "لَيْلَةُ الْقَدْرِ خَيْرٌ مِّنْ أَلْفِ شَهْرٍ ٣\n" +
            "3. Malam kemuliaan itu lebih baik dari seribu bulan.\n" +
            "\n" +
            "تَنَزَّلُ الْمَلٰئِكَةُ وَالرُّوْحُ فِيْهَا بِإِذْنِ رَبِّهِمْ مِنْ كُلِّ أَمْرٍ ٤\n" +
            "4. Pada malam itu turun Malaikat-Malaikat dan Malaikat Jibril dengan izin Rabb-nya untuk mengatur segala urusan.\n" +
            "\n" +
            "سَلٰمٌ هِيَ حَتّٰى مَطْلَعِ الْفَجْرِ  ٥\n" +
            "5. Malam itu (penuh) kesejahteraan sampai terbit fajar."
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah Yang Maha Pengasih lagi Maha Penyayang\n" +
            "\n" +
            "لَمْ يَكُنِ الَّذِيْنَ كَفَرُوْا مِنْ أَهْلِ الْكِتٰبِ وَالْمُشْرِكِيْنَ مُنْفَكِّيْنَ حَتّٰى تَأْتِيَهُمُ الْبَيِّنَةُ ١\n" +
            "Orang-orang kafir yakni Ahli Kitab dan orang-oran musyrik (mengatakan bahwa mereka) tidak akan meninggalkan (agamanya) sebelum datang kepada mereka bukti yang nyata,\n" +
            "\n" +
            "رَسُولٌ مِّنَ اللّٰهِ يَتْلُوْا صُحُفًا مُّطَهَّرَةً ٢\n" +
            "(yaitu) seorang Rasul dari Allah (Nabi Muhammad SAW) yang membacakan lembaran-lembaran yang disucikan (Al-Quran)\n" +
            "\n" +
            "فِيْهَا كُتُبٌ قَيِّمَةٌ ٣\n" +
            "di dalamnya terdapat (isi) Kitab-kitab yang lurus *1.\n" +
            "\n" +
            "وَمَا تَفَرَّقَ الَّذِيْنَ اُوْتُوا الْكِتٰبَ اِلَّا مِنْ بَعْدِ مَا جَآءَتْهُمُ الْبَيِّنَةُ ٤\n" +
            "Dan tidaklah terpecah belah orang-orang yang didatangkan al-Kitab (kepada mereka), melainkan setelah datang kepada mereka bukti yang nyata.\n" +
            "\n" +
            "وَمَآ اُمِرُوْآ اِلَّا لِيَعْبُدُوْا اللّٰهَ مُخْلِصِيْنَ لَهُ الدِّيْنَ حُنَفَآءَ وَيُقِيْمُوا الصَّلٰوةَ وَيُؤْتُوا الزَّكٰوةَ وَذٰلِكَ دِيْنُ الْقَيِّمَةِ ٥\n" +
            "Padahal nereka tidak diperintah, melainkan agar beribadah kepada Allah dengan memurnikan ketaatan kepada-Nya dalam (menjalankan) agama yang lurus *2, dan supaya mereka mendirikan shalat dan menunaikan zakat; dan yang demikian itulah agama yang lurus.\n" +
            "\n" +
            "إِنَّ الَّذِيْنَ كَفَرُوْا مِنْ أَهْلِ الْكِتٰبِ وَالْمُشْرِكِيْنَ فِيْ نَارِ جَهَنَّمَ خٰلِدِيْنَ فِيْهَآ اُلٰئِكَ هُمْ شَرُّ الْبَرِيَّةِ ٦\n" +
            "Sesungguhnya orang-orang kafir yakni Ahli Kitab dan orang-orang musyrik (akan masuk) ke neraka Jahannam, mereka kekal di dalamnya. Mereka itu adalah seburuk buruk makhluk.\n" +
            "\n" +
            "إِنَّ الَّذِيْنَ اٰمَنُوْا وَعَمِلُوا الصّٰلِحٰتِ اُولٰئِكَ هُمْ خَيْرُ الْبَرِيَّةِ ٧\n" +
            "Sesungguhnya orang-orang yang beriman dan mengerjakan amal shalih, mereka itu adalah sebaik-baik makhluk.\n" +
            "\n" +
            "جَزَآؤُهُمْ عِنْدَ رَبِّهِمْ جَنّٰتُ عَدْنٍ تَجْرِيْ مِنْ تَحْتِهَا الْاَنْهٰرُ خٰلِدِيْنَ فِيْهَآ اَبَدًا رَضِيَ اللّٰهُ عَنْهُمْ وَرَضُوْا عَنْهُ ذَلِكَ لِمَنْ خَشِيَ رَبَّهُ ٨\n" +
            "Balasan mereka di sisi Rabb mereka adalah Surga Adn yang mengalir di bawahnya sungai-sungai, mereka kekal di dalamnya selama-lamanya. Allah ridha kepada mereka, dan mereka pun ridha kepada-Nya. Yang demikian itu adalah (balasan) bagi orang yang takut kepada Rabb-Nya.\n"
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang\n" +
            "\n" +
            "إِذَا زُلْزِلَتِ اْلأَرْضُ زِلْزَالَهَا لا   ١\n" +
            "1. Apabila bumi diguncangkan dengan guncangan yang dahsyat,\n" +
            "\n" +
            "وَاَخْرَجَتِ اْلاَرْضُ أَثْقَالَهَا لا   ٢\n" +
            "2. dan bumi telah mengeluarkan beban-beban yang berat (yang dikandung)nya,\n" +
            "\n" +
            "وَقَالَ الْاِنْسَانُ مَا لَهَا ج   ٣\n" +
            "3. dan manusia bertanya, \"Apa yang terjadi pada bumi ini?\"\n" +
            "\n" +
            "يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا لا    ٤\n" +
            "4. Pada hari itu bumi menyampaikan beritanya,\n" +
            "\n" +
            "بِاَنَّ رَبَّكَ اَوْحٰى لَهَا قلى   ٥\n" +
            "5. karena sesungguhnya Tuhanmu telah memerintahkan (yang demikian itu) padanya.\n" +
            "\n" +
            "يَوْمَئِذٍ يَّصْدُرُ النَّاسُ اَشْتَاتًا.لا لِّيُرَوْا اَعْمَالَهُمْ قلى   ٦\n" +
            "6. Pada hari itu manusia keluar dari kuburnya dalam keadaan berkelompok-kelompok **, untuk diperlihatkan kepada mereka (balasan) semua perbuatannya.\n" +
            "\n" +
            "فَمَنْ يَّعْمَلْ مِثْقَالَ ذَرَّةٍ خَيْرًا يَّرَه ج   ٧\n" +
            "7. Maka barang siapa mengerjakan kebaikan seberat zarrah, niscaya dia akan melihat (balasan)nya.\n" +
            "\n" +
            "وَمَنْ يَّعْمَلْ مِثْقَالَ ذَرَّةٍ شَرًّا يَّرَه ع   ٨\n" +
            "8. Dan barang siapa mengerjakan kejahatan seberat zarrah, niscaya dia akan melihat (balasan)nya.\n" +
            "\n"
            ,"\n" +
            "ِبِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْم\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang\n" +
            "\n" +
            "وَالْعٰدِيٰتِ ضَبْحًا لا   ١\n" +
            "1. Demi kuda perang yang berlari kencang terengah-engah,\n" +
            "\n" +
            "فَالْمُوْرِيٰتِ قَدْحًا لا   ٢\n" +
            "2. dan kuda yang memercikkan bunga api (dengan pukulan kuku kakinya),\n" +
            "\n" +
            "فَالْمُغِيْرٰتِ صُبْحًا لا   ٣\n" +
            "3. dan kuda yang menyerang (dengan tiba-tiba) pada waktu pagi,\n" +
            "\n" +
            " فَأَثَرْنَ بِهِي نَقْعًا لا    ٤\n" +
            "4. sehingga menerbangkan debu,\n" +
            "\n" +
            "فَوَسَطْنَ بِهِ جَمْعًا لا   ٥\n" +
            "5. lalu menyerbu ke tengah-tengah kumpulan musuh,\n" +
            "\n" +
            "اِنَّ اْلإِنْسَانَ لِرَبِّه لَكَنُودٌ ج   ٦\n" +
            "6. sungguh, manusia itu sangat ingkar (tidak bersyukur) pada Tuhannya,\n" +
            "\n" +
            "وَاِنَّه عَلٰى ذٰلِكَ لَشَهِيْدٌ ج   ٧\n" +
            "7. dan sesungguhnya dia (manusia) menyaksikan (mengakui) keingkarannya,\n" +
            "\n" +
            "وَإِنَّه لِحُبِّ الْخَيْرِ لَشَدِيْدٌ قلى   ٨\n" +
            "8. dan sesungguhnya cintanya kepada harta benar-benar berlebihan.\n" +
            "\n" +
            "اَفَلاَ يَعْلَمُ إِذَا بُعْثِرَ مَا فِى الْقُبُوْرِ لا   ٩\n" +
            "9. Maka tidaklah dia mengetahui apabila apa yang ada di dalam kubur dikeluarkannya,\n" +
            "\n" +
            "وَحُصِّلَ مَا فِى الصُّدُوْرِ لا  ١٠\n" +
            "10. dan apa yang tersimpan di dalam dada dilahirkan?\n" +
            "\n" +
            "اِنَّ رَبَّهُمْ بِهِمْ يَوْمَئِذٍ لَّخَبِيْرٌ ع    ١١\n" +
            "11. sungguh, Tuhan mereka pada hari itu Maha teliiti terhadap keadaan mereka.\n"
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang\n" +
            "\n" +
            " اَلْقَارِعَةُ    ١\n" +
            "1. Al-Qaari'ah (hari kiamat).\n" +
            "\n" +
            "مَا الْقَارِعَةُ   ٢\n" +
            "2. Apakah Al-Qaari'ah itu?\n" +
            "\n" +
            "وَمَآأَدْرٰكَ مَا الْقَارِعَةُ    ٣\n" +
            "3. Tahukah engkau apakah Al-Qaari'ah itu?\n" +
            "\n" +
            "يَوْمَ يَكُوْنُ النَّاسُ كَالْفَرَاشِ الْمَبْثُوْثِ     ٤\n" +
            "4. Ialah pada hari keadaan manusia seperti laron bertebaran.\n" +
            "\n" +
            "وَتَكُوْنُ الْجِبَالُ كَالْعِهْنِ الْمَنْفُوْشِ    ٥\n" +
            "5. Dan gunung-gunung bagaikan bulu yang ditiup angin.\n" +
            "\n" +
            "فَاَمَّا مَنْ ثَقُلَتْ مَوَازِيْنُه    ٦\n" +
            "6. Adapun orang yang berat timbangan (kebaikannya).\n" +
            "\n" +
            "فَهُوَ فِى عِيْشَةٍ رَّاضِيَةٍ    ٧\n" +
            "7. Maka ia berada dalam kehidupan yang menyenangkan.\n" +
            "\n" +
            "وَاَمَّا مَنْ خَفَّتْ مَوَازِيْنُه    ٨\n" +
            "8. Dan adapun barang siapa yang ringan timbangan (kebaikan)nya.\n" +
            "\n" +
            "فَاُمُّه هَاوِيَةٌ    ٩\n" +
            "9. Maka tempat kembalinya adalah Hawiyah itu?\n" +
            "\n" +
            "وَمَآ أَدْرَاكَ مَا هِيَهْ    ١٠\n" +
            "10. Tahukah engkau apaah neraka Hawiyah itu?\n" +
            "\n" +
            "نَارٌ حَامِيَةٌ    ١١\n" +
            "11. Ialah api yang sangat panas."
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang\n" +
            "\n" +
            "أَلْهٰكُمُ التَّكَاثُرُ    ١\n" +
            "1. Kamu telah dilalaikan oleh bermegah-megahan. *1\n" +
            "\n" +
            "حَتّٰى زُرْتُمُ الْمَقَابِرَ   ٢\n" +
            "2. Sampai kamu mengunjungi kuburan (mati).\n" +
            "\n" +
            "كَلاَّ سَوْفَ تَعْلَمُوْنَ    ٣\n" +
            "3. Jangan begitu: nanti kamu akan mengetahui.\n" +
            "\n" +
            "ثُمَّ كَلاَّ سَوْفَ تَعْلَمُوْنَ     ٤\n" +
            "4. Dan janganlah begitu nanti kamu akan mengetahui.\n" +
            "\n" +
            "كَلاَّ لَوْ تَعْلَمُوْنَ عِلْمَ الْيَقِيْنِ    ٥\n" +
            "5. Jangan begitu: kalau kamu mengetahui dengan pengetahuan yang yakin,\n" +
            "\n" +
            "لَتَرَوُنَّ الْجَحِيْمَ    ٦\n" +
            "6. Tentu kamu benar-benar akan melihat neraka jahim.\n" +
            "\n" +
            "ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِيْنِ    ٧\n" +
            "7. Dan sesungguhnya kamu benar-benar akan melihatnya dengan 'ainul yakin. *2\n" +
            "\n" +
            "ثُمَّ لَتُسْــــءَـــلُنَّ يَوْمَئِذٍ عَنِ النَّعِيْمِ    ٨\n" +
            "8. Kemudian kamu pasti akan diperiksa dihari itu (hari kiamat) tentang semua nikmat itu (yang kamumegah-megahan di dunia)."
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yag Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "وَالْعَصْرِ\n" +
            "1. Demi masa (waktu \"ashar).\n" +
            "\n" +
            "إِنَّ اْلإنْسَانَ لَفِيْ خُسْرٍ\n" +
            "2. Sesungguhnya manusia itu benar-benar dalam kerugian.\n" +
            "\n" +
            "إِلاَّ الَّذِينَ اٰمَنُوْا وَعَمِلُوْا الصّٰلِحٰتِ وَتَوَاصَوْا بِالْحَقِّ لا وَتَوَاصَوْا بِالصَّبْرِ\n" +
            "3. Kecuali orang-orang yang beriman dan beramal sholeh dan saling menasehati dalam kebaikan dan mengajak dalam kesabaran.\n"
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah Yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "وَيْلٌ لِّكُلِّ هُمَزَةٍ لُّمَزَةٍ\n" +
            "1. Celakalah bagi setiap pengumpat atau pencela.\n" +
            "\n" +
            "الَّذِي جَمَعَ مَالاً وَّعَدَّدَه\n" +
            "2. Yang mengumpulkan harta dan menghitung-hitungnya. *1\n" +
            "\n" +
            "يَحْسَبُ أَنَّ مَالَه أَخْلَدَهُ\n" +
            "3. Dia mengira bahwa hartanya itu dapat mengekalkannya (di dunia).\n" +
            "\n" +
            "كَلاَّ لَيُنْبَذَنَّ فِي الْحُطَمَةِ\n" +
            "4. Tidak! Sekali-kali tidak! Sesungguhnya ia benar-benar akan dilemparkan ke dalam neraka Huthamah.\n" +
            "\n" +
            "5. وَمَآ أَدْرٰاكَ مَا الْحُطَمَةُ\n" +
            "Dan sudahkah kamu tahu apa Huthamah itu?\n" +
            "\n" +
            "نَارُ اللهِ الْمُوْقَدَةُ\n" +
            "6. (yaitu) Api Allah yang dinyalakan.\n" +
            "\n" +
            "الَّتِيْ تَطَّلِعُ عَلَى اْلأَفْئِدَةِ\n" +
            "7. Yang membakar hati manusia.\n" +
            "\n" +
            "إِنَّهَا عَلَيْهِمْ مُؤْصَدَةٌ\n" +
            "8. Sungguh hati itu ditutup rapat atas mereka.\n" +
            "\n" +
            "فِي عَمَدٍ مُّمَدَّدَةٍ\n" +
            "9. Sedang mereka dibelenggu di tiang panjang melintang."
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha pengasih lagi Maha penyayang.\n" +
            "\n" +
            "\n" +
            " أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحٰبِ الْفِيْلِ قلى\n" +
            "1. Tidakkah engkau (Muhammad) perhatikan bagaimana Tuhanmu telah bertindak terhadap pasukan bergajah? (*)\n" +
            "\n" +
            " أَلَمْ يَجْعَلْ كَيْدَهُمْ فِيْ تَضْلِيْلٍ لا\n" +
            "2. Bukankah Dia telah menjadikan tipu daya mereka itu sia-sia?\n" +
            "\n" +
            " وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيْلَ لا\n" +
            "3. dan Dia mengirimkan kepada mereka burung yang berbondong-bondong,\n" +
            "\n" +
            "تَرْمِيْهِمْ بِحِجَارَةٍ مِّنْ سِجِّيْلٍ لا\n" +
            "4. yang melempari mereka dengan batu dari tanah liat yang dibakar, \n" +
            "\n" +
            "فَجَعَلَهُمْ كَعَصْفٍ مَّأْكُوْلٍ  .ع\n" +
            "5. sehingga mereka dijadikan-Nya seperti daun-daun yang dimakan (ulat)."
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha pengasih lagi Maha penyayang.\n" +
            "\n" +
            " لِإِيْلٰفِ قُرَيْشٍ\n" +
            "1. Karena kebiasaan orang-orang Quraisy,\n" +
            "\n" +
            "إِيلٰفِهِمْ رِحْلَةَ الشِّتَآءِ وَالصَّيْفِ\n" +
            "2. (yaitu) kebiasaan mereka bepergian pada musim dingin dan musim panas. (*)\n" +
            "\n" +
            "فَلْيَعْبُدُوْا رَبَّ هٰذَا الْبَيْتِ\n" +
            "3. Maka hendaklah mereka menyebah Tuhan (pemilik) rumah ini (Ka'bah),\n" +
            "\n" +
            "الَّذِيْ أَطْعَمَهُمْ مِّنْ جُوْعٍ .لا وَّاٰمَنَهُمْ مِّنْ خَوْفٍ ع\n" +
            "4. Yang telah memberi makan kepada mereka untuk menghilangkan lapar dan mengamankan mereka dari rasa ketakutan."
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha pengasih lagi Maha penyayang.\n" +
            "\n" +
            "أَرَأَيْتَ الَّذِيْ يُكَذِّبُ بِالدِّيْنِ\n" +
            "1. Tahukah kamu (orang) yang mendustakan agama?\n" +
            "\n" +
            "فَذٰلِكَ الَّذِيْ يَدُعُّ الْيَتِيْمَ\n" +
            "2. Maka itulah orang yang menghardik anak yatim,\n" +
            "\n" +
            "وَلاَ يَحُضُّ عَلٰى طَعَامِ الْمِسْكِيْنِ\n" +
            "3. Dan tidak mendorong memberi makan orang miskin.\n" +
            "\n" +
            "فَوَيْلٌ لِّلْمُصَلِّيْنَ\n" +
            "4. Maka celakalah orang yang shalat,\n" +
            "\n" +
            "الَّذِيْنَ هُمْ عَنْ صَلاَتِهِمْ سَاهُوْنَ\n" +
            "5. (yaitu) orang-orang yang lalai terhadap shalatnya, (*)\n" +
            "\n" +
            " الَّذِيْنَ هُمْ يُرَآءُوْنَ\n" +
            "6. yang berbuat ria, (**)\n" +
            "\n" +
            "وَيَمْنَعُوْنَ الْمَاعُوْنَ\n" +
            "7. dan enggan (memberikan) bantuan. (***)"
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "\n" +
            "Dengan nama Allah yang Maha pengasih lagi Maha penyayang\n" +
            "\n" +
            " إِنَّآ أَعْطَيْنٰكَ الْكَوْثَرَ\n" +
            "1. Sungguh Kami telah memberimu (Muhammad) nikmat yang banyak.\n" +
            "\n" +
            "فَصَلِّ لِرَبِّكَ وَانْحَرْ\n" +
            "2. Maka laksanakanlah shalat karena Tuhanmu, dan berkurbanlah (sebagai ibadah dan mendekatkan diri kepada Allah).\n" +
            "\n" +
            " إِنَّ شَانِئَكَ هُوَ الْاَبْتَرُ\n" +
            "3. Sungguh, orang-orang yang membencimu dialah yang terputus (dari rahmat Allah)."
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "\n" +
            "Dengan nama Allah yang Maha pengasih lagi Maha penyayang\n" +
            "\n" +
            "قُلْ يٰآ أَيُّهَا الْكٰفِرُوْنَ\n" +
            "1. Katakanlah (Muhammad), \"Wahai orang-orang kafir!\n" +
            "لَآ أَعْبُدُ مَا تَعْبُدُوْنَ\n" +
            "2. aku tidak akan menyembah apa yang kamu sembah,\n" +
            "وَلَآ أَنْتُمْ عٰبِدُوْنَ مَآ أَعْبُدُ\n" +
            "3. dan kamu tidak akan menyembah apa yang aku sembah,\n" +
            "وَلَآ أَنَا عَابِدٌ مَا عَبَدْتُمْ\n" +
            "4. dan aku tidak akan pernah menyembah apa yang kamu sembah,\n" +
            "وَلَآ أَنْتُمْ عٰبِدُوْنَ مَآ أَعْبُدُ\n" +
            "5. dan kamu tidak pernah pula menyembah apa yang aku sembah.\n" +
            "لَكُمْ دِيْنُكُمْ وَلِيَ دِيْنِ\n" +
            "6. Bagimu agamamu, dan bagiku agamaku.\"\n"
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha pengasih lagi Maha penyayang\n" +
            "\n" +
            "إِذَا جَاءَ نَصْرُ اللهِ وَالْفَتْحُ\n" +
            "1. Apabila telah datang pertolongan Allah dan kemenangan,\n" +
            "\n" +
            "وَرَأَيْتَ النَّاسَ يَدْخُلُونَ فِيْ دِيْنِ اللهِ أَفْوَاجًا\n" +
            "2. dan engkau melihat manusia berbondong-bondong masuk agama Allah,\n" +
            "\n" +
            "فَسَبِّحْ بِحَمْدِ رَبِّكَ وَاسْتَغْفِرْهُ قلى إِنَّهُ كَانَ تَوَّابًا\n" +
            "3. maka bertasbihlah dengan memuji Tuhanmu dan mohonlah ampunan kepada-Nya. Sungguh, Dia Maha penerima taubat.\n"
            ,"\n" +
            "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "تَبَّتْ يَدَا اَبِيْ لَهَبٍ وَّتَبَّ ۗ١\n" +
            "1. Binasalah kedua tangan Abu Lahab dan benar binasa.\n" +
            "\n" +
            "مَا اَغْنٰى عَنْهُ مَا لُهٗ وَمَا كَسَبَ ۗ٢\n" +
            "2. Tidak memberi faidah baginya, harta bendanya dan apa yang diusahakan.\n" +
            "\n" +
            "سَيَصْلٰى نَارًاذَاتَ لَهَبٍ ۙ٣\n" +
            "3. Kelak dia akan masuk ke dalam api neraka yang menjilat (menyala-nyala).\n" +
            "\n" +
            "وَّامْرَاَتُهٗۗ حَمَّا لَةَ الْحَطَبِ ۚ٤\n" +
            "4.Dan begitu pula istrinya, pembawa kayu bakar. *1\n" +
            "\n" +
            "فِيْ جِيْدِهَا حَبْلٌ مِّنْ مَّسَدٍ ؑ٥\n" +
            "5. Yang di lehernya ada tali dari sabut.\n"
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "قُلْ هُوَاللّٰهُ اَحَدٌ (١\n" +
            "1. Katakanlah: \"Dialah Allah Yang Maha Esa\".\n" +
            "\n" +
            "اَللّٰهُ الصَّمَدُ (٢\n" +
            "2. Allah tempat kita (sekalian makhluk) bermohon.\n" +
            "\n" +
            "لَمْ يَلِدْ وَلَمْ يُلَدْ (٣\n" +
            "3. Ia tidak beranak dan tidak pula diperanakkan.\n" +
            "\n" +
            "وَلَمْ يَكُنْ لَهٗ كُفُوًا اَحَدٌ (٤\n" +
            "4. Dan tidak ada yang menyerupai-Nya."
            ,"بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "قُلْ اَعُوْذُ بِرَبِّ الْفَلَقِ ۙ١\n" +
            "1. Katakanlah, \"Aku berlindung kepada Tuhan yang menguasai subuh (fajar),\n" +
            "\n" +
            "مِنْ شَرِّمَا خَلَقَ ۙ٢\n" +
            "2. dari kejahatan (makhluk yang) Dia ciptakan,\n" +
            "\n" +
            "وَمِنْ شَرِّغَاسِقٍ اِذَا وَقَبَ ۙ٣\n" +
            "3. dan dari kejahatan malam apabila telah gelap gulita,\n" +
            "\n" +
            "وَمِنْ شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِ ۙ٤\n" +
            "4. dan dari kejahatan (perempuan-perempuan) penyihir yang meniup pada pada buhul-buhul (talinya), -*\n" +
            "\n" +
            "وَمِنْ شَرِّحَاسِدٍ اِذَا حَسَدَ ؑ٥\n" +
            "5. dan dari kejahatan orang yang dengki apabila dia dengki.\"\n"
            ," بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
            "Dengan nama Allah yang Maha Pengasih lagi Maha Penyayang.\n" +
            "\n" +
            "قُلْ أَعُوذُ بِرَبِّ النَّاسِ (١\n" +
            "1. Katakanlah: \"Aku berlindung kepada Tuhan (yang Memelihara dan Menguasai) manusia.\n" +
            "\n" +
            "مَلِكِ النَّاسِ (٢\n" +
            "2. Raja Manusia.\n" +
            "\n" +
            "إِلٰهِ النَّاسِ (٣\n" +
            "3. Sesembahan manusia.\n" +
            "\n" +
            "مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ (٤\n" +
            "4. Dari kejahatan (bisikan) setan yang biasa bersembunyi.\n" +
            "\n" +
            " الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِالنَّاسِ (٥\n" +
            "5. Yang membisikan kejahatan ke dalam dada manusia.\n" +
            "\n" +
            "مِنَ الْجِنَّةِ وَالنَّاسِ (٦\n" +
            "6. Dari (golongan) jin dan manusia.\n"


    };


}


