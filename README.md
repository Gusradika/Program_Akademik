# Program_Akademik

[Tugas Semester 2] Praktikum Pemrograman Dasar Universitas Dinamika

- ########################## DEV LOG ############################
- Stable a0.1
- -[v] Mengganti inputan user dari scanner menjadi Buffered Reader
- -[v] menambahkan Random text untuk tampilan awal login
- -[v] System Exit
- NOTE : Tambahkan USERNAME & PASSWORD salah jika LOGIN STATUS FAIL.

- Stable a0.2 -[v] memindahkan method [ERROMSG1] ke class [inputCheck] -[v] membuat USER&PASS salah. di cek melalui counter jika counter >=
  1 maka cetak error msg. hapus cache : method.backToLandingPage()
  NOTE: cari struktur data yang pas untuk menyelesaikan LOGIN DATA

stable a0.2.1sd
-merubah history.txt, dan main.javain

Stable a0.3

- [v] Membuat GetData sebagai cache awalsdds
- [v] membuat Cache Username dan Password untuk LOGIN. [STUDENT],[STAFF]
- [v] membuat Cek Access Username dan Password untuk LOGIN. [STUDENT],[STAFF]

NOTE : BUAT BG DAN STATUS CETAK [NO_ACCESS], [AVAILABLE] & ROLE SETIAP STAFF serta POSISI UNTUK PENGAJAR

    ON-GOING



    TODO :
    - BUAT ROLE dan DATA LOGIN
    - BUAT TAMPILAN UTK SETIAP ROLE
    - BUAT CACHE STATE UNTUK CHECKPOINT SEMISAL ERROR DI TENGAH (JIKA BISA MAKA SANGAT AVAILABLE UNTUK PUNYA 2 Cache
    DAN INPUT DATA DARI [USER: ADMIN])

############### IDE ##########################

1. nantinya ada beberapa role yaitu [BRANCH BARU dgn KODE_FITUR]

[ADMIN] = yang mengadministrasi STATUS_MHS(aktif/tidak aktif), SSKM, Edit data || Update News

            //SEMUANYA DI SETOR KE ARRAY yang sama seperti MSG PENGAJAR
            //ACCESS TO EVERYONEEEEEEEEEEEEEEEEEEE!!! :DDDD
            //(UTK MHS TAMPILKAN MELALUI VALIDATOR agar URUT dan dibuka berdasarkan ID_PESAN)

            TAMPILAN UNTUK DOSEN :
            <KMHS_INSTANSI>, <PENGUNGUMAN>
            <HEADER_PESAN>,
            <PESAN STRING 1>
            <PESAN STRING 2>
            <PESAN STRING 3>
            <PESAN STRING 4>
            <PESAN STRING ...>
                                    <AUTO GENERATED : KMHS>

        ### (setelahnya lakukan konfirmasi PENGIRIMAN dengan cara ketik 0 saja DAN BACK KE MENU) ###

[PENGAJAR & DOSWAL] = yang membuat TEST(Tugas) dan mengecek wali murid nya.
(seperti sistem DATABASE(Murid memiliki Doswal && Doswal memiliki Matkul))
Kolom perwalian : <NOMOR_BARIS>, <ID_MHS_BIMBINGAN>, <NM_MHS>, <KODETEST>, <NILAI>, <REMIDIAL>
inputkan > NOMOR baris
jika baris dipilih maka akan muncul menu seperti MESSAGE NM_MHS

            //SEMUANYA DI SETOR KE ARRAY
            //(WHO HAVE ACCESS?)
            //(UTK MHS TAMPILKAN MELALUI VALIDATOR agar URUT dan dibuka berdasarkan ID_PESAN)

            TAMPILAN UNTUK DOSEN :
            <NAMA_DOSEN>, <(DOSWAL)>, <to, NAMA_MHS>
            <HEADER_PESAN>,
            <PESAN STRING 1>
            <PESAN STRING 2>
            <PESAN STRING 3>
            <PESAN STRING 4>
            <PESAN STRING ...>
                                    <AUTO GENERATED : NAMA_DOSEN>

        ### (setelahnya lakukan konfirmasi PENGIRIMAN dengan cara ketik 0 saja DAN BACK KE MENU) ###

[Pelajar] = yang mengerjakan test. tetapi tugas dapat diakses jika
statusnya OPEN Controller dari Pengajar. dan Pelajar dapat mengecek Tabel Akadamik nya.
Kolom : <KODETEST>, <NILAI>, <STATUS_REMIDI>, <GRADE>

GUNAKAN VALIDATOR PADA KODE TEST AGAR DAPAT DI PRINT SESUAI URUTAN. if NO dont include. if yes INCLUDE dan PRINT

2. nantinya akan ada Posisi Dosen untuk beberapa Matkul (4 saja). (TUGAS defined by QUIZ.) (QUIZ MAKSIMAL 4)
   nah POSISI_DOSEN nantinya akan menjadi kunci utama untuk pembuatan TUGAS. nantinya TUGAS dan JAWABAN Tugas
   akan disetor melalui <STRING> untuk memungkinkan dan meminimalisir INPUTAN YG SALAH agar tidak ERROR

khusus soal matematika TAMBAHKAN GENERATE RANDOM QUIZ dgn jumlah sesuai INPUTAN dan RANGE random melalui INPUTAN
PENGURANGAN,
PEMBAGIAN,
PERKALIAN,
PENJUMLAHAN.
khusus SOAL matematika jawaban akan di KALKULASI secara otomatis. maka fungsi GENERATE RANDOM QUIZ MTK akan
memiliki jawaban yang sesuai, meskipun SOAL RANDOM (cek TUGAS p.teguh kmrn)

(kalau waktunya cukup buat KONTROL untuk 4 Operator ini)

\*3. BUAT FITUR2 YANG DI IDE KAN TAMPIL DI MENU. DAN TAMBAHKAN CATATAN COMING SOON agar memudahkan development
contoh :
[1] KERJAKAN TEST
[2] CEK ADMINISTRASI KEUANGAN - [COOMING SOON]
...

4. BUAT AGAR PROGRAM DAPAT DI RUN MELALUI BATCH FILE
