package se.lexion.workshop_mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.lexion.workshop_mvc.dto.ProductDetailsDto;
import se.lexion.workshop_mvc.dto.ProductDto;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/admin/product")
public class ProductManagementController {

    private List<ProductDto> productDtoList;

    @PostConstruct
    public void init() {
        if(productDtoList == null) productDtoList = new ArrayList<>();
        ProductDto productDto= new ProductDto();
        productDto.setId(1);
        productDto.setPrice(20);
        productDto.setName("OCA Book");

        ProductDetailsDto productDetailsDto= new ProductDetailsDto();
        productDetailsDto.setId(1);
        productDetailsDto.setName("Test");
        productDetailsDto.setDescription("Test description");

        productDto.setProductDetailsDto(productDetailsDto);


        ProductDto productDto2 = new ProductDto();
        productDto2.setId(2);
        productDto2.setPrice(50);
        productDto2.setName("OCP Book");
        ProductDetailsDto productDetailsDto2= new ProductDetailsDto();
        productDetailsDto.setId(2);
        productDetailsDto.setName("Test 2");
        productDetailsDto.setDescription("Test description 2");
        productDto2.setProductDetailsDto(productDetailsDto);

        productDtoList.add(productDto);
        productDtoList.add(productDto2);
    }

    @GetMapping("/list")
    public String getAllProducts(Model model) {
        model.addAttribute("productDtoList", productDtoList);
        return "productManagement";
    }

}
