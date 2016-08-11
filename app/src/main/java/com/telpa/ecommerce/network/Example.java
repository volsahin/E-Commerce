package com.telpa.ecommerce.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by SAMSUNGNB on 11.08.2016.
 */
//TODO
    //********************************  Bu class test için oluşturulmuştur. Silinecektir.
    public class Example {

        @SerializedName("Status")
        @Expose
        private String status;

        /**
         *
         * @return
         * The status
         */
        public String getStatus() {
            return status;
        }

        /**
         *
         * @param status
         * The Status
         */
        public void setStatus(String status) {
            this.status = status;
        }

    }

