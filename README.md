# Tugas Analisis Perancangan Berorientasi Objek - A
Dosen: Adi Wahyu Pribadi, S.Si., M.Kom

---
## ✨ Identitas Proyek

**🖨️ Nama Proyek:** Analisis Usaha Digital Printing

**👤 Narasumber:** Bapak Hasanudin (Pemilik Usaha)

**👥 Anggota Kelompok 06:**
- Fadhil Pratama (4524210032)
- Indra Fadhillah Ahmad (4524210043)
- Ivan Wirahadi Permana (4524210045)
- Elsa Setia Marcsa (4524210030)
- Jihaan Hanifah (4524210047)

🎥 **Video Dokumentasi Wawancara** [![Video Wawancara](https://img.youtube.com/vi/odo_vrixBIw/0.jpg)](https://youtu.be/odo_vrixBIw?si=6FQiJDXBvE2JkQna)  
*(Klik gambar di atas untuk memutar video)*

---

## 📖 Latar Belakang
Usaha digital printing milik Bapak Hasanudin yang bergerak dalam penjualan *sparepart* printing, jasa perbaikan perangkat, serta penyediaan dan sewa mesin fotokopi telah berjalan selama kurang lebih 16 tahun secara konvensional. Selama ini, operasional dan promosi usaha sangat mengandalkan jaringan (*networking*) personal. Namun, semenjak pandemi dan pesatnya pergeseran ke era digital, cara pelanggan mencari jasa telah berubah drastis.

Ketiadaan platform digital seperti media sosial atau website membuat laju pengenalan usaha kepada pelanggan baru menjadi lambat dibandingkan kompetitor. Pencatatan pesanan yang masih manual dan pemesanan yang hanya mengandalkan telepon atau WhatsApp dirasa kurang efisien untuk rencana ekspansi. Oleh karena itu, diperlukan sebuah sistem informasi bisnis digital berbasis web untuk memperluas jangkauan pasar hingga skala nasional, mengedukasi pelanggan, serta mempermudah operasional mulai dari pemesanan jasa servis hingga pembelian produk.

---

## 🎯 Sasaran Pengguna
Sasaran Pengguna dari Sistem Web Usaha Digital Printing ini terdiri dari dua kelompok utama:

**👨‍💼 Admin (Pemilik & Pegawai Usaha)**
Pihak pengelola yang bertanggung jawab atas pembaruan stok mesin/sparepart, penerimaan jadwal servis, dan pemantauan kinerja bisnis. Mereka membutuhkan sistem yang dapat menyajikan data penjualan dan pesanan servis secara rapi dan terpusat.

**🧑‍💻 Customer (Pelanggan)**
Pelanggan yang terdiri dari sektor *retail*, perkantoran (*office*), hingga departemen pemerintah. Mereka membutuhkan kemudahan dalam melihat katalog produk, memesan teknisi untuk perbaikan (*service*), dan melakukan konsultasi terkait mesin fotokopi secara *online*.

---

## 💬 Hasil Wawancara: Analisis Kebutuhan Sistem
Berikut adalah rangkuman tanya jawab berdasarkan wawancara bersama Bapak Hasanudin:

* **Durasi & Alur Bisnis:** Usaha ini sudah berjalan kurang lebih 16 tahun. Alur pelayanannya masih konvensional, di mana pelanggan menelepon atau mengirim pesan, teknisi datang untuk mengerjakan servis, lalu diakhiri dengan pembayaran.
* **Demografi Pelanggan:** Pelanggan berasal dari berbagai kalangan mulai dari *retail*, *office*, hingga departemen pemerintah. Dalam sehari, usaha ini bisa menangani sekitar 20 panggilan servis di area Jabodetabek.
* **Kendala & Tantangan Utama:** Tantangan terbesar yang sangat berpengaruh saat ini adalah pergeseran ke era sosial media dan digital. Karena belum menggunakan platform digital, kendala utama yang sering terjadi adalah lambatnya pengenalan usaha kepada target pelanggan baru. Pencatatan pesanan pun masih dilakukan secara biasa/manual.
* **Harapan Sistem Digital:** Bapak Hasanudin belum pernah menggunakan media promosi digital. Jika platform dibangun, fitur yang paling dibutuhkan adalah etalase penjualan produk, pengenalan jasa servis, serta fitur edukasi untuk pelanggan awam terkait mesin yang dijual.
* **Dampak Proyeksi:** Jika platform digital berjalan, dampaknya akan sangat signifikan terhadap peningkatan penjualan produk dan perluasan jangkauan pasar hingga skala nasional (karena sudah didukung ekspedisi). Platform ini nantinya tidak hanya digunakan secara pribadi oleh pemilik, tetapi juga akan digunakan oleh para pegawai untuk bersama-sama membangun usaha.

---

## 📋 Bagian 1: Analisis Aktor

**👨‍💼 Admin (Pemilik & Pegawai)**
Aktor utama yang memiliki kontrol penuh terhadap sistem manajemen katalog dan layanan.
*Tugas & Tanggung Jawab:*
* **Kelola Produk:** Menambah, mengedit, dan menghapus katalog mesin fotokopi dan *sparepart*.
* **Manajemen Pesanan:** Melihat dan mengelola jadwal pesanan servis dari *customer*.
* **Lihat Laporan:** Memantau rekapitulasi data penjualan dan histori servis.
* **Konsultasi:** Merespons pertanyaan atau keluhan pelanggan.

**🧑‍💻 Customer (Pelanggan)**
Aktor yang menggunakan layanan web untuk mencari produk dan jasa servis.
*Tugas & Tanggung Jawab:*
* Melihat katalog mesin fotokopi dan *sparepart*.
* **Pesan Service:** Mengisi formulir detail kerusakan mesin dan menentukan jadwal kedatangan teknisi.
* **Konsultasi:** Menggunakan fitur sistem atau *link* terintegrasi (WhatsApp) untuk bertanya terkait produk.

---

## ⚖️ Bagian 2: Analisis Perbandingan Sistem

| Kategori | Sistem Lama (Manual) | Sistem Baru (Digital Berbasis Web) |
| :--- | :--- | :--- |
| **Promosi & Jangkauan** | Mengandalkan *networking* pribadi dan pelanggan lama. Jangkauan terbatas. | Website online yang dapat diakses skala nasional, mencakup katalog dan profil usaha. |
| **Pemesanan Jasa** | Pelanggan menelepon/WA tanpa format baku, rawan miskomunikasi terkait kendala mesin. | Pelanggan mengisi Form Pesan Service (Kerusakan & Jadwal) secara terstruktur. |
| **Katalog Produk** | Tidak ada etalase fisik/digital. Pelanggan harus bertanya langsung ketersediaan barang. | Katalog digital (*sparepart* & mesin) yang selalu *up-to-date* dan bisa dilihat kapan saja. |
| **Pencatatan & Laporan** | Dicatat di buku/catatan biasa secara manual. | Dashboard khusus Admin untuk melihat laporan penjualan & servis secara otomatis. |

---

## 📌 3. Skenario Sistem (Use Case)

**Diagram Use Case:** <img width="800" alt="Use Case Diagram" src="https://github.com/user-attachments/assets/47ed1ef3-fd23-42f4-8a7d-12093a319c00" />

---

## 📋 Rincian Alur Sistem (Proses Inti)

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

## 💡 Kesimpulan & Solusi yang Ditawarkan
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
