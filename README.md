# UTS-DzikirHarian
Tugas UTS Android Menggunakan Fragments, Image processing library &amp; Firebase Cloud Messaging Notification
Aplikasi ini memiliki 3 fitur,
1. Dzikir harian menggunakan fragment
2. Mood hari ini, kita daapt melihat quote islami hari ini dengan foto selfie kita (menggunakan library google vision)
3. Notifikasi pengingat dzikir menggunakan FCM
4. Media pemutar video islami
5. Todo list dzikir / mengaji
6. Kompas pencari kiblat
7. Widget penhitung dzikir

Nama Aplikasi		: Dzikir Harian
Anggota		: 
-	Ferdi Septarianto H	1541180202 /11
-	Herlina Prastiwi		1541180166 / 13
-	TI-4E

1.	Splashscreen : sebagai halaman awal pembuka aplikasi
2.	MainActivity99 : class ini berisi 3 button yang akan menyambungkan link ke halam lainnya
3.	Fragment : class yang mengatur fragment orientation yang dipengaruhi rotation dan juga memgatur fragment transaction
4.	DzikirMenuFragment :  Class Fragment berisi method untuk list view menu dzikir 
5.	DzikirDetailFragment :  Class Fragment berisi method untuk list view detail dzikir 
6.	Dzikir : Class yang berisi data yang akan ditampilkan pada fragment dzikir harian untuk list dan detail.
7.	Emoticon : class yang mengatur pengaturan camera utk capture gambar dan menyimpannya di file lokal
8.	Emojifier : class yang berisi tentang pengaturan pendeteksian wajah dan pemberian emoji yang cocok dengan ekspresi wajah
9.	BitmapUtils : class yang mengatur pengaturan gambar berupa ukuran dan format file dan penyimpanan
10.	Fbs : class yang akan menampilkan pesan berupa title dan body yang dikirim dengan notifikasi FCM
11.	MyFirebaseMessagingService : class yang mengatur request token dan menerima pesan dari FCM
12.	MyNotificationManager : class yang berfungsi untuk megatur notifikasi dari FCM

fitur yang dibuat setelah UTS

13. Media : set adapter untuk memutar video
14. sinetronModel : untuk mengakses video yang tersimpan dalam folder res/raw
15. compass activity : untuk menampilkan function yang berisi gps tracker lokasi kita dan kompas.
16. compass : mengolah perhitungan kompas untuk mencari kiblat
17. GPS Tracker : get latitude dan longitude
18. Main Activity : array list untuk menampilkan to do list
19. TaskDBHelper : berisi fungsi untuk membuat tabel untuk menyimpan to do list
20. TaskContract : memberi nama db dan tabel'
21. BroadcastWidget : menampilkan widget mini yang bisa digunakan sebagai penghitung dzikir


Spesifikasi perangkat :
Minimal menggunakan Android 6.0 (API Level 23)  Jelly Bean

///////////////////////////////////////////////////////////////////////////////////////////
MIT License
MIT license adalah lisensi perangkat lunak bebas guna yang berasal dari Massachusetts Institute of Technology (MIT). Lisensi ini ringkas dan to the point. Lisensi ini membolehkan pengguna untuk melakukan apapun pada kode program seperti pada Apache License. Lisensi ini hanya mewajibkan pengguna untuk menyertakan lisensi dan copyright si pembuat pada kode yang didistribusikan ulang dan tidak ada larangan untuk menggunakan trademark dari si pembuat asli. Selain itu pengguna juga tidak berhak untuk menuntut si pembuat ketika terjadi kerusakan pada perangkat lunak tersebut.

