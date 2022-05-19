package com.Day11_12;

public class Stock {
        public String stockName;
        public static int noOfShares;
        public static int sharePrize;

        public String getStockName() {
            return stockName;
        }

        public static int getNoOfShare() {
            return noOfShares;
        }

        public static int getSharePrize() {
            return sharePrize;
        }

        public void setStockName(String stockname) {
            this.stockName = stockname;
        }

        public void setNoOfShares(int noofshares) {
            this.noOfShares = noofshares;
        }

        public void setSharePrize(int SharePrize) {
            this.sharePrize = SharePrize;
        }
        public String toString() {
            return ("Stock Name IS " + stockName + " \n NoOfShares Is " + noOfShares + " \n sharePrize Is " + sharePrize + " \n ");
        }
    }


