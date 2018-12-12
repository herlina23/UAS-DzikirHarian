package com.herlina.utscoba2;

public class SinetronModel {
    private String nama;
    private String durasi;
    private String videoRawId;

    // Array nama sinetron di kategori drama
    public static final SinetronModel[] drama = {

            new SinetronModel("Belajar Qira'ah Bersama Taqy Malik",
                    "4:12",
                    "sample_video_1"),
            new SinetronModel("Macam-macam langgam qira'ah",
                    "3:22",
                    "sample_video_2"),
            new SinetronModel("Law kana bainalnal habib",
                    "10:11",
                    "sample_video_3")
    };

    // Setiap data punya nama, deskripsi, dan gambar
    private SinetronModel(String nama, String durasi, String videoRawId) {
        this.nama = nama;
        this.durasi = durasi;
        this.videoRawId = videoRawId;
    }
    public String getNama() {
        return nama;
    }
    public String getDurasi() {
        return durasi;
    }
    public String getVideoRawId() {
        return videoRawId;
    }
    public String toString() {
        return this.nama;
    }

}
