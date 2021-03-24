package se.lexion.workshop_mvc.dto;

public class ProductDto {
    private int id;
    private String name;
    private int price;
    private ProductDetailsDto productDetailsDto;

    public ProductDto() {
    }

    public ProductDto(int id, String name, int price, ProductDetailsDto productDetailsDto) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productDetailsDto = productDetailsDto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductDetailsDto getProductDetailsDto() {
        return productDetailsDto;
    }

    public void setProductDetailsDto(ProductDetailsDto productDetailsDto) {
        this.productDetailsDto = productDetailsDto;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productDetailsDto=" + productDetailsDto +
                '}';
    }
}
