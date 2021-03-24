package se.lexion.workshop_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import se.lexion.workshop_mvc.dto.ProductDetailsDto;
import se.lexion.workshop_mvc.dto.ProductDto;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
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

        productDtoList.add(productDto);

        ProductDto productDto2 = new ProductDto();
        productDto2.setId(2);
        productDto2.setPrice(50);
        productDto2.setName("OCP Book");
        ProductDetailsDto productDetailsDto2= new ProductDetailsDto();
        productDetailsDto2.setId(1);
        productDetailsDto2.setName("Test 2");
        productDetailsDto2.setDescription("Test description 2");

        productDto2.setProductDetailsDto(productDetailsDto2);

        productDtoList.add(productDto2);

        ProductDto productDto3 = new ProductDto();
        productDto3.setId(3);
        productDto3.setPrice(50);
        productDto3.setName("OCX Book");
        ProductDetailsDto productDetailsDto3= new ProductDetailsDto();
        productDetailsDto3.setId(1);
        productDetailsDto3.setName("Test 3");
        productDetailsDto3.setDescription("Test description 3");

        productDto2.setProductDetailsDto(productDetailsDto2);

        productDtoList.add(productDto2);
    }

    @GetMapping("/")
    public String getAllProducts(Model model) {
        model.addAttribute("productDtoList", productDtoList);
        return "productManagement";
    }

    @GetMapping("/find/{id}")
    public String getProductById(@PathVariable("id") Integer id, Model model){
        model.addAttribute("getProduct",
                productDtoList.stream().filter(productDto -> productDto.getId() == id).findFirst().get());
        return "productDetails";
    }

}
