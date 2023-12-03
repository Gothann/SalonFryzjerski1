package projekt.Ok;

public class Paint {

        private String name;
        private double price;
        private double Vat=0.08;

        private String category;

        private int amount;

        public Paint(String name, Double price, String category, int amount) {
            this.name = name;
            this.price = price;
            this.category = category;
            this.amount = amount;
        }



    public String getName() {
            return name;
        }

        public Double getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }

        public int getAmount() {
            return amount;
        }

        public double getVat() {
            return Vat;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public static double countPrice(double price, double Vat) {
            Double brutto= (double) 0;

            brutto=price*(100+Vat)/100;

            return brutto;
        }



}
