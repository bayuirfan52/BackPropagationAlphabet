# BackPropagation Alphabet

Aplikasi desktop Java Swing untuk mengenali pola huruf kapital A sampai Z menggunakan jaringan saraf tiruan backpropagation.

## Gambaran aplikasi

- Pola alfabet berukuran 7 kolom × 9 baris, sehingga setiap sampel memiliki 63 nilai input.
- Jaringan memakai satu hidden layer dengan 63 neuron dan 6 neuron output.
- Nilai kotak hitam adalah `1`; nilai kotak putih adalah `-1`.
- Data pola dan target alfabet berada di `AlphabetLibrary`.
- Bobot diinisialisasi acak saat training dimulai dan model hanya disimpan di memori.

## Menjalankan

### NetBeans 8.2

1. Buka folder proyek ini sebagai proyek Ant di NetBeans.
2. Pastikan platform Java/JDK proyek tersedia.
3. Jalankan proyek dengan **Run Project** (F6).

### Terminal

Dengan JDK dan Apache Ant terpasang, jalankan dari folder proyek:

```text
ant run
```

Proyek dikonfigurasi untuk source dan target Java 8.

## Cara menggunakan

### Training

1. Buka tab **Training**.
2. Isi **Alpha** (learning rate), **Epoch** (batas maksimum putaran penuh atas seluruh sampel), dan **Tolerance** (ambang MSE untuk berhenti lebih awal). Nilai awal form adalah `0.1`, `1000`, dan `0.1`.
3. Klik **Train**. Training berjalan di latar belakang agar jendela tetap responsif. Log menampilkan MSE setiap epoch dan bergerak otomatis ke baris terbaru.
4. Training berhenti saat MSE seluruh data training `<= Tolerance` atau saat mencapai batas Epoch. Log mencatat alasan dan epoch akhirnya.

Tolerance `0` praktis menonaktifkan penghentian lebih awal (kecuali MSE tepat `0`). MSE diukur pada seluruh pola setelah pembaruan bobot di akhir setiap epoch.

### Menguji pola

1. Buka tab **Testing**.
2. Klik tombol huruf untuk memuat pola contoh, atau gambar pola sendiri dengan klik-tahan lalu seret pada kotak grid. Klik memulai dengan warna kebalikan dari kotak pertama; kotak lain yang dilewati mengikuti warna tersebut.
3. Klik **TEST**. Hasil klasifikasi muncul di samping label hasil. Training harus dilakukan terlebih dahulu setelah aplikasi dibuka.
4. Gunakan **Clear** untuk mengosongkan grid.

Menu **Bantuan → Petunjuk & Credits** menampilkan petunjuk penggunaan di dalam aplikasi.

## Struktur kode

- `src/backpropagationalphabet/form/MainForm.java` — UI testing/training dan menu bantuan.
- `src/backpropagationalphabet/form/HintDialogForm.java` — jendela petunjuk dan credits.
- `src/backpropagationalphabet/lib/BackPropagationLibrary.java` — forward pass, training, dan klasifikasi.
- `src/backpropagationalphabet/lib/AlphabetLibrary.java` — pola input dan target huruf A–Z.
- `src/backpropagationalphabet/lib/CoreVariable.java` — nilai konfigurasi training.

## Catatan

- Inisialisasi bobot acak membuat hasil dapat sedikit berbeda pada setiap training.
- Bobot hasil training tidak disimpan ke file; menutup aplikasi berarti model perlu dilatih lagi.
- Klasifikasi memilih target yang jarak kuadratnya paling dekat dengan enam output jaringan. Aplikasi selalu memilih salah satu huruf, sehingga pola yang bukan huruf tetap dapat memperoleh tebakan alfabet.
