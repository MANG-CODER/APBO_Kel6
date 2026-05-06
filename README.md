# Tugas Analisis Perancangan Berorientasi Objek - A
Dosen: Adi Wahyu Pribadi, S.Si., M.Kom

---
##  Identitas Proyek

**Nama Proyek:** Analisis Usaha Digital Printing

**Narasumber:** Bapak Hasanudin (Pemilik Usaha)

** Anggota Kelompok 06:**
- Fadhil Pratama (4524210032)
- Indra Fadhillah Ahmad (4524210043)
- Ivan Wirahadi Permana (4524210045)
- Elsa Setia Marcsa (4524210030)
- Jihaan Hanifah (4524210047)

**Video Dokumentasi Wawancara** [![Video Wawancara](https://img.youtube.com/vi/odo_vrixBIw/0.jpg)](https://youtu.be/odo_vrixBIw?si=6FQiJDXBvE2JkQna)  
*(Klik gambar di atas untuk memutar video)*

---

##  Latar Belakang
Berdasarkan hasil wawancara yang telah dilakukan dengan Bapak Hasanudin selaku pemilik usaha digital printing, diketahui bahwa usaha ini telah berjalan kurang lebih selama 16 tahun. Selama itu pula, sistem operasional yang digunakan masih bersifat konvensional, baik dalam proses pemesanan, pencatatan, maupun promosi usaha.

Dalam praktiknya, pelanggan biasanya melakukan pemesanan melalui telepon yang terdapat pada kartu nama yang di peroleh dari narasumber atau langsung datang ke workshop milik narasumber. Setelah itu, teknisi akan datang langsung ke lokasi untuk melakukan perbaikan, dan proses diakhiri dengan pembayaran. Meskipun cara ini masih berjalan, namun terdapat beberapa kendala yang dirasakan, terutama dalam hal efisiensi dan jangkauan pasar.

Menurut narasumber, perubahan perilaku pelanggan setelah pandemi menjadi tantangan tersendiri. Saat ini, pelanggan cenderung mencari layanan melalui internet atau media sosial. Namun, usaha yang dijalankan belum memiliki platform digital seperti website atau media sosial aktif, sehingga proses pengenalan usaha kepada pelanggan baru menjadi lebih lambat dibandingkan kompetitor.

Selain itu, pencatatan pesanan yang masih dilakukan secara manual berpotensi menimbulkan kesalahan dan sulit untuk direkap dalam jangka panjang. Hal ini menunjukkan bahwa diperlukan suatu sistem yang dapat membantu proses bisnis menjadi lebih terstruktur dan terdokumentasi dengan baik.

Beberapa penelitian juga menyebutkan bahwa penerapan sistem informasi berbasis web dapat meningkatkan efisiensi operasional serta memperluas jangkauan pasar suatu usaha (Laudon & Laudon, 2020). Oleh karena itu, pengembangan sistem digital menjadi solusi yang relevan untuk permasalahan ini.

---

##  Sasaran Pengguna
Sistem yang dirancang ditujukan untuk dua jenis pengguna utama, yaitu admin dan customer.

** Admin (Pemilik & Pegawai Usaha)**
Admin merupakan pihak yang mengelola keseluruhan sistem. Berdasarkan hasil wawancara, admin membutuhkan sistem yang dapat membantu dalam mengelola data produk, menerima pesanan service, serta melihat laporan usaha secara terpusat.

**Customer (Pelanggan)**
Customer berasal dari berbagai kalangan, seperti retail, perkantoran, hingga instansi pemerintah. Mereka membutuhkan kemudahan dalam melihat produk, melakukan pemesanan service, serta berkonsultasi terkait kerusakan mesin tanpa harus datang langsung ke lokasi.

---

## Hasil Wawancara: Analisis Kebutuhan Sistem
Dari wawancara yang dilakukan, dapat disimpulkan beberapa poin penting terkait kondisi sistem yang sedang berjalan.

Pertama, dari sisi operasional, proses bisnis masih dilakukan secara manual. Pemesanan dilakukan melalui komunikasi langsung, sehingga sering kali tidak memiliki format yang jelas. Hal ini berpotensi menimbulkan miskomunikasi antara pelanggan dan teknisi.

Kedua, dari sisi promosi, usaha masih mengandalkan relasi atau pelanggan lama. Narasumber menyampaikan bahwa belum pernah menggunakan media digital sebagai sarana promosi, sehingga jangkauan pasar masih terbatas.

Ketiga, dari sisi pencatatan, semua data pesanan dan transaksi masih dicatat secara sederhana. Hal ini menyulitkan dalam pembuatan laporan dan analisis perkembangan usaha.

Berdasarkan kondisi tersebut, narasumber mengharapkan adanya sistem yang dapat:
1. Menampilkan katalog produk secara online
2. Memfasilitasi pemesanan service secara terstruktur
3. Menyediakan media konsultasi dengan pelanggan
4. Membantu dalam pembuatan laporan usaha

---

##  Bagian 1: Analisis Aktor

**Admin (Pemilik & Pegawai)**
Aktor utama yang memiliki kontrol penuh terhadap sistem manajemen katalog dan layanan.
*Tugas & Tanggung Jawab:*
* **Kelola Produk:** Menambah, mengedit, dan menghapus katalog mesin fotokopi dan *sparepart*.
* **Manajemen Pesanan:** Melihat dan mengelola jadwal pesanan servis dari *customer*.
* **Lihat Laporan:** Memantau rekapitulasi data penjualan dan histori servis.
* **Konsultasi:** Merespons pertanyaan atau keluhan pelanggan.

**Customer (Pelanggan)**
Aktor yang menggunakan layanan web untuk mencari produk dan jasa servis.
*Tugas & Tanggung Jawab:*
* Melihat katalog mesin fotokopi dan *sparepart*.
* **Pesan Service:** Mengisi formulir detail kerusakan mesin dan menentukan jadwal kedatangan teknisi.
* **Konsultasi:** Menggunakan fitur sistem atau *link* terintegrasi (WhatsApp) untuk bertanya terkait produk.

---

## Bagian 2: Analisis Perbandingan Sistem

| Kategori | Sistem Lama (Manual) | Sistem Baru (Digital Berbasis Web) |
| :--- | :--- | :--- |
| **Promosi & Jangkauan** | Mengandalkan *networking* pribadi dan pelanggan lama. Jangkauan terbatas. | Website online yang dapat diakses skala nasional, mencakup katalog dan profil usaha. |
| **Pemesanan Jasa** | Pelanggan menelepon/WA tanpa format baku, rawan miskomunikasi terkait kendala mesin. | Pelanggan mengisi Form Pesan Service (Kerusakan & Jadwal) secara terstruktur. |
| **Katalog Produk** | Tidak ada etalase fisik/digital. Pelanggan harus bertanya langsung ketersediaan barang. | Katalog digital (*sparepart* & mesin) yang selalu *up-to-date* dan bisa dilihat kapan saja. |
| **Pencatatan & Laporan** | Dicatat di buku/catatan biasa secara manual. | Dashboard khusus Admin untuk melihat laporan penjualan & servis secara otomatis. |

---

##  3. Skenario Sistem (Use Case)

**Use Case Description**

Kelola Produk → Admin dapat menambah, mengedit, dan menghapus produk

Pesan Service → Customer mengisi form kerusakan dan jadwal

Konsultasi → Customer bertanya via sistem / WhatsApp

Lihat Laporan → Admin melihat data penjualan & service

**Diagram Use Case:** <img width="800" alt="Use Case Diagram" src="https://github.com/user-attachments/assets/47ed1ef3-fd23-42f4-8a7d-12093a319c00" />

---

##  Rincian Alur Sistem (Proses Inti)

**1. Kelola Produk (Katalog Mesin & Sparepart)**
* **Aktor:** Admin
* **Alur:** Admin masuk ke sistem, memilih menu produk, lalu melakukan aksi *Create, Read, Update, Delete* (CRUD) pada data *sparepart* maupun unit mesin fotokopi. Data ini langsung ter-publikasi ke halaman *Customer*.

**2. Pesan Service (Penjadwalan Teknisi)**
* **Aktor:** Customer & Admin
* **Alur:** Customer memilih menu "Pesan Service", mengisi formulir berupa data diri, jenis mesin, deskripsi kerusakan, dan usulan jadwal perbaikan. Sistem mengirim pesanan ini ke *Dashboard* Admin. Admin memvalidasi dan mengirimkan teknisi sesuai jadwal.

**3. Konsultasi Pelanggan (Edukasi & Tanya Jawab)**
* **Aktor:** Customer & Admin
* **Alur:** Untuk pelanggan awam yang ingin membeli atau memperbaiki mesin, mereka dapat mengklik tombol "Konsultasi". Sistem akan mengarahkan pelanggan ke *Direct Link* WhatsApp ke Admin untuk edukasi produk.

**4. Lihat Laporan (Rekapitulasi Usaha)**
* **Aktor:** Admin
* **Alur:** Admin mengakses *Dashboard* Laporan. Sistem menampilkan rekapitulasi jumlah pesanan servis yang selesai, laporan penjualan produk/sparepart, dan statistik harian/bulanan.

---

##  Kesimpulan & Solusi yang Ditawarkan
Berdasarkan analisis, sistem operasional konvensional tidak lagi relevan untuk menghadapi tantangan era digital dan membatasi potensi ekspansi Bapak Hasanudin. 

Solusi yang ditawarkan adalah **membangun website bisnis digital printing berbasis web** dengan fitur utama:
- Katalog produk mesin fotokopi & *sparepart*.
- Pemesanan jasa *service online* terstruktur.
- Layanan konsultasi kerusakan mesin.
- *Dashboard* admin untuk kelola produk, pesanan, dan pelanggan.
- Sistem *tracking* laporan penjualan & *service*.

**Manfaat Sistem:**
1. Mempermudah dan memperluas promosi usaha hingga skala nasional.
2. Mempermudah pemesanan oleh *customer* baru maupun lama.
3. Mengedukasi pelanggan terkait produk yang dijual.
4. Meningkatkan profesionalitas dan efisiensi manajemen data usaha.

---
## 📌 WORKFLOW GIT (Internal Team)
1. `git clone` (Clone repo ke local)
2. `git checkout -b NAMAKALIAN` (Membuat branch dengan nama sendiri)
3. `git checkout branch_tujuan` (Pindah branch kalian atau main)
4. `git add .` (Menambah perubahan yang ingin dicommit)
5. `git commit -m "Pesan commit"` (Commit perubahan)
6. `git push -u origin BRANCHKALIAN` (Push ke branch masing-masing, **JANGAN LANGSUNG KE MAIN!**)
7. `git pull main` (Tarik pembaruan dari main jika sudah merge final)
8. `git merge main` (Gabungkan main ke branch sendiri untuk *update* terbaru)
