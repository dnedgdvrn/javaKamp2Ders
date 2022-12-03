public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"telefon","Apple",20000,5);
       /* product.set_id(3);
        product.setName("Bilgisayar");
        product.setDescription("Lenova Bilgisayar");
        product.setPrice(15000);
        product.setStockAmount(5);*/


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}