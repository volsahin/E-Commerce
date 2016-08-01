package com.telpa.ecommerce;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */
    import java.util.ArrayList;
    import java.util.List;
    import javax.annotation.Generated;
    import com.google.gson.annotations.Expose;
    import com.google.gson.annotations.SerializedName;

    @Generated("org.jsonschema2pojo")
    public class People {

        @SerializedName("Musteri")
        @Expose
        private List<Musterus> musteri = new ArrayList<Musterus>();

        /**
         *
         * @return
         * The musteri
         */
        public List<Musterus> getMusteri() {
            return musteri;
        }

        /**
         *
         * @param musteri
         * The Musteri
         */
        public void setMusteri(List<Musterus> musteri) {
            this.musteri = musteri;
        }

    }

